# Versione del sistema operativo
FROM oraclelinux:9-slim

# Installa Java 17 OpenJDK
RUN microdnf -y update && \
    microdnf -y install java-17-openjdk java-17-openjdk-devel && \
    microdnf clean all

# Imposta la variabile d'ambiente JAVA_HOME
ENV JAVA_HOME=/usr/lib/jvm/java-17-openjdk

# Installa Tomcat 10.1.40
RUN microdnf -y install wget && \
    mkdir /opt/tomcat && \
    wget https://dlcdn.apache.org/tomcat/tomcat-10/v10.1.40/bin/apache-tomcat-10.1.40.tar.gz -O /tmp/apache-tomcat-10.1.40.tar.gz && \
    tar xvf /tmp/apache-tomcat-10.1.40.tar.gz -C /opt/tomcat --strip-components=1 && \
    rm /tmp/apache-tomcat-10.1.40.tar.gz && \
    microdnf clean all

# Copia il file .war della tua applicazione in Tomcat
COPY target/customlogin.war /opt/tomcat/webapps/customlogin.war

# Definisci la porta su cui Tomcat ascolta
EXPOSE 8081

# Comando per avviare Tomcat
CMD ["/opt/tomcat/bin/catalina.sh", "run"]
