FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/customlogin.jar customlogin.jar
ENTRYPOINT ["java","-jar","/customlogin.jar"]
EXPOSE 3000