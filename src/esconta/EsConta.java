/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esconta;

/**
 *
 * @author Utente
 */
public class EsConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Contatore("t1");
        Thread t2= new Contatore ("t2");
        Thread t3 = new Contatore("t3");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(5000);
        t1.stop();
        t2.stop();
        t3.stop();
       
    }
    
}
  