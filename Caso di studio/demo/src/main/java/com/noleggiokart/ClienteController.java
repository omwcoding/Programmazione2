package com.noleggiokart;

import java.util.HashMap;

public class ClienteController {
    private HashMap<String, Cliente> clienti;

    public ClienteController() {
        this.clienti = new HashMap<>();
    }

    public void aggiungiCliente(Cliente cliente) {
        this.clienti.put(cliente.getCodiceFiscale(), cliente);
    }

    public Cliente trovaCliente(String codiceFiscale) {
        return this.clienti.get(codiceFiscale);
    }
}