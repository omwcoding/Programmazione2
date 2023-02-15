package Hashmap;
//Ci permettono di salvare gli elementi come coppie chiave-valore

import java.util.HashMap;

public class Main {
    
    public static void main(String[] args){

        HashMap<String, String> capitali = new HashMap<String, String>();
        
        capitali.put("Italia", "Roma");
        capitali.put("Francia", "Parigi");
        capitali.put("Germania", "Berlino");
        capitali.put("Spagna", "Madrid");

        System.out.println(capitali.get("Italia"));
        capitali.remove("Spagna");
        System.out.println(capitali);

        capitali.clear();
        
        
    }
    
}
