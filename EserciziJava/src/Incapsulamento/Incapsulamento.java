package Incapsulamento;
/*
 * Incapsulamento: processo in cui nascondiamo attributi di una classe
 * all'esterno mettendoli private. Diventano accessibili solo tramite
 * metodi pubblici (getters e setters)
 */
public class Incapsulamento {
    
    public static void main(String[] args){

        Persona persona = new Persona("Luca", "Rossi");
        //System.out.println(persona.nome); non funziona perchè nome è private
        System.out.println(persona.getNome());
        persona.setNome("Marco");
        System.out.println(persona.getNome());

        System.out.println(persona.getCognome());
        persona.setCognome("Bianchi");
        System.out.println(persona.getCognome());
    }
}
