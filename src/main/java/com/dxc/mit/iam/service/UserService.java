package com.dxc.mit.iam.service;

import com.dxc.mit.iam.model.IdPUserResponse;
import com.dxc.mit.iam.model.IdPUserUpdate;
import com.dxc.mit.iam.model.msutenze.AggiornaDataUltimaConnessioneRequest;
import com.dxc.mit.iam.model.msutenze.DettaglioUtente;
import com.dxc.mit.iam.model.pcsi.utente.UtentePln;
import java.util.List;

/*
 * Questa interfaccia non implementa la logica, ma definisce i metodi che verranno implementati in una classe concreta per la gestione dell'utenza nel sistema IAM.
 */
public interface UserService {

    void updateIdPUser(String paramString, IdPUserUpdate paramIdPUserUpdate);

    IdPUserResponse getIdPUser(String paramString);

    List<DettaglioUtente> getSedeOperativaUtenteByCodiceFiscale(String paramString);

    void updateLastLogin(String paramString,
            AggiornaDataUltimaConnessioneRequest paramAggiornaDataUltimaConnessioneRequest);

    List<UtentePln> findUtentiByCodiceFiscale(UtentePln paramUtentePln);
}