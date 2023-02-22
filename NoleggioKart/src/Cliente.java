import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

@SuppressWarnings("serial")
public class Cliente implements Serializable{
    private String nome;
    private String codiceFiscale;
    private int numeroMassimoKart; //m numero da scegliere
    private String cognome;
    private String indirizzo;
    private String telefono;

    
    public Cliente(String nome, String cognome,  int numeroMassimoKart, String codiceFiscale, String indirizzo, String telefono) {
        this.nome = nome;
        this.codiceFiscale = codiceFiscale;
        this.numeroMassimoKart = numeroMassimoKart;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
    }

    //metodi getter e setter
    public String getNome() {
        return nome;
    }
    public String setNome(){
        return nome;
    }
    public String getCodiceFiscale() {
        return codiceFiscale;
    }
    public String setCodiceFiscale(){
        return codiceFiscale;
    }
    public int getNumeroMassimoKart() {
        return numeroMassimoKart;
    }
    public int setNumeroMassimoKart(){
        return numeroMassimoKart;
    }
    public String getCognome() {
        return cognome;
    }
    public String setCognome(){
        return cognome;
    }
    public String getIndirizzo() {
        return indirizzo;
    }
    public String setIndirizzo(){
        return indirizzo;
    }
    public String getTelefono() {
        return telefono;
    }
    public String setTelefono(){
        return telefono;
    }

    //metodo per registrare un cliente da tastiera  
    public static Cliente registraClienteDaTastiera(Scanner scanner) {

        System.out.print("Inserisci il nome del cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Inserisci il cognome del cliente: ");
        String cognome = scanner.nextLine();

        System.out.print("Inserisci il codice fiscale del cliente: ");
        String codiceFiscale = scanner.nextLine();

        System.out.print("Inserisci il numero massimo di kart che il cliente può noleggiare: ");
        int numeroMassimoKart = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Inserisci l'indirizzo del cliente: ");
        String indirizzo = scanner.nextLine();

        System.out.print("Inserisci il numero di telefono del cliente: ");
        String telefono = scanner.nextLine();
        return new Cliente(nome, cognome, numeroMassimoKart, codiceFiscale, indirizzo, telefono);
    }

    @Override
    public String toString() {
        return new StringBuffer("Nome: ").append(this.nome).append(" Cognome : ").append(this.cognome)
        .append(" Codice Fiscale : ").append(this.codiceFiscale).append(" Numero Massimo Kart : ")
        .append(this.numeroMassimoKart).append(" Indirizzo : ").append(this.indirizzo)
        .append(" Telefono : ").append(this.telefono).toString();
    }   
    

    public static List<Cliente> leggiClientiDaFile(String filePath) {
        Gson gson = new Gson();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            JsonElement jsonElement = JsonParser.parseReader(reader);
            if (jsonElement.isJsonObject()) {
                // Se il JSON è un oggetto, crea una lista contenente l'unico cliente nel JSON
                Cliente cliente = gson.fromJson(jsonElement, Cliente.class);
                List<Cliente> clienti = new ArrayList<>();
                clienti.add(cliente);
                return clienti;
            } else if (jsonElement.isJsonArray()) {
                // Se il JSON è un array, leggi e restituisci la lista di clienti
                TypeToken<List<Cliente>> typeToken = new TypeToken<List<Cliente>>(){};
                return gson.fromJson(jsonElement, typeToken.getType());
            }
        } catch (IOException e) {
            System.out.println("Errore nella lettura del file " + filePath + ".");
            e.printStackTrace();
        }
        return null;
    }
    

    public static void salvaClientiSuFile(Cliente nuovoCliente, String filePath) {
        Gson gson = new Gson();
        List<Cliente> clienti = leggiClientiDaFile(filePath);
        if (clienti == null) {
        clienti = new ArrayList<>();
        }
        clienti.add(nuovoCliente);

        
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(clienti, writer);

        } catch (IOException e) {
            System.out.println("Errore nel salvataggio dei clienti nel file " + filePath + ".");
            e.printStackTrace();
        }
    }
    
    
    public static void mostraClientiRegistrati() {
        List<Cliente> clientiLetti = leggiClientiDaFile("C:\\Users\\Omar\\Desktop\\Coding\\Programmazione2\\Clienti.json");
        System.out.println("## Elenco clienti registrati: ##\n");
        for (Cliente c : clientiLetti) {
            System.out.println(c);
        }
        System.out.println();
    }
}