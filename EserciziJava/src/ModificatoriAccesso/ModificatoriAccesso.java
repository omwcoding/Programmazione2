package ModificatoriAccesso;
import ModificatoriAccesso2.*;
/* I modificatori di accesso servono per aggiungere un livello
 * di sicurezza alle classi e ai metodi.
 * 
 *              class   package    subclass    world
 * public       Y       Y           Y           Y
 * protected    Y       Y           Y           N
 * default      Y       Y           N           N
 * private      Y       N           N           N
 */


public class ModificatoriAccesso {
    public static void main(String[] args) {
        
        B prova = new B();
        A prova2 = new A();

        System.out.println(prova.nome);
        System.out.println(prova2.nome);
    }
    
}
