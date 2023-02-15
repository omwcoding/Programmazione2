package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Inserisci il primo numero: ");
            int x= scanner.nextInt();
            System.out.println("Inserisci il secondo numero: ");
            int y= scanner.nextInt();

            int result = x/y;
            System.out.println("Il risultato è: " + result);
            scanner.close();
        }
        //se il programma trova un errore di tipo ArithmeticException
        catch(ArithmeticException e){
            scanner.close();
            System.out.println("Non puoi dividere per 0");
        }
        //se il programma trova un errore di tipo InputMismatchException
        catch(InputMismatchException e){
            scanner.close();
            System.out.println("Devi inserire un numero, non una stringa");
        }
        //se il programma trova un altro tipo di errore
        catch(Exception e){
            scanner.close();
            System.out.println("Errore generico");
        }
        finally{
            scanner.close();
            System.out.println("Programma eseguito correttamente");
        }
    }
}
