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
public class Contatore extends Thread{
    private String chisono;

    public Contatore(String chisono) {
        this.chisono = chisono;
    }
    public void run(){
        int conta=0;
        while(1==1){
            conta++;
            if(conta % 10==0){
                System.out.println("Thread #"+ chisono + ", conta"+ conta);
            }
        }
        
    
    }
}
    
    

