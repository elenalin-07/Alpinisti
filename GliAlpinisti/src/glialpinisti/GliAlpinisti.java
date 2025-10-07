/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package glialpinisti;

/**
 *
 * @author lin.elena
 */
public class GliAlpinisti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        /**
        Alpinisti a2 = new Alpinisti();
        Alpinisti a3 = new Alpinisti();
        
        int[] a = new int[3];
        a[0] = a1.CalcolaTentativi();
        a[1] = a2.CalcolaTentativi();
        a[2] = a3.CalcolaTentativi();
        
        int amin = 999 , apos = 999;
        boolean dead = true;
        for(int i = 0; i < a.length; i++){
            if(a[i] < amin && a[i] > 0){
                amin = a[i];
                apos = i;
                dead = false;
            }
        }
        apos++;
        
        if(dead == false){
           System.out.println("l'alpista " + apos + " ha impiegato il minor numero di tentativi: " + amin);
        }
        else{
            System.out.println("nessuno di tre alpinisti ha riuscito a scalare la montagna");
        }
        **/
        
        Alpinisti a1 = new Alpinisti(8, 70);
        int nt = a1.CalcolaTentativi();
        int cima = a1.getCima();
        int percentuale = a1.getPercentuale();
        if(nt != -1){
            System.out.println("ha fatto " + nt + " tentativi per scalare la montagna di " + cima + " passi");
            System.out.println("la percentuale di successo: " + percentuale + "%");
            a1.aumentaPercentuale();
            percentuale = a1.getPercentuale();
            a1.Reset(15, 0);
            nt = a1.CalcolaTentativi();
            cima = a1.getCima();
            if(nt != -1){
            System.out.println("ha fatto " + nt + " tentativi per scalare la montagna di " + cima + " passi");
            System.out.println("la percentuale di successo: " + percentuale + "%");
            }
            else{
                System.out.println("non e riuscito a scalare la montagna di " + cima + " passi");
            }
        }
        else{
            System.out.println("non e riuscito a scalare la montagna di " + cima + " passi");
        }
    }
    
}
