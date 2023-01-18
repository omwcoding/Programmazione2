## TRACCIA CASO DI STUDIO:

Realizzare un’applicazione che permetta ad un’azienda di noleggiare dei go kart (in breve kart). I kart
differiscono per marca e tipo. I tipi di kart sono i seguenti: base, medio, avanzato.

In particolare il tipo medio si caratterizza per avere, di diverso rispetto al modello base, il cambio automatico,
mentre il tipo avanzato per avere, in più rispetto al modello base, i freni a disco ed il contachilometri.

• Ogni noleggio dovrà riportare le informazioni sui kart noleggiati, data di inizio e data di fine noleggio,
costo del noleggio, penale per ritardo restituzione, cliente che effettua il noleggio, etc.

• Ogni cliente non potrà prendere a noleggio più di m kart al giorno (non c’è limite all’acquisto).

• Ogni kart, oltre ad essere definito dai propri attributi caratterizzanti, è dotato del proprio codice
identificativo denominato numero di serie rappresentato da una stringa di 8 caratteri in formato numerico

• Ogni cliente, oltre ad essere definito dai propri attributi caratterizzanti, è identificato univocamente
mediante il proprio codice fiscale.



• Tutti i dati devono essere acquisiti e visualizzati mediante delle interfacce grafiche
OPPURE mediante console (la scelta è libera).

• I dati acquisiti, opportunamente elaborati, devono essere resi persistenti su file
OPPURE su DBMS (la scelta è libera).

• L’applicazione permette di visualizzare l’elenco dei kart acquistati in un intervallo di
tempo specificato; l’elenco deve essere ordinato in base alla tipologia di kart (medio,
avanzato, base) e, in caso di stesso tipo, in base al costo del noleggio (dal costo più
alto).

• L’applicazione permette di ottenere la stampa su file dell’elenco dei kart noleggiati in
un intervallo di tempo specificato da un certo cliente. Tale elenco deve essere
ordinato per data di inizio noleggio. L’elenco riporterà tutte le informazioni disponibili.


• Documentare le specifiche semantiche di tutto il codice sorgente
(package, classi, metodi) servendosi dello strumento Javadoc.