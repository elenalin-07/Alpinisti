/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package glialpinisti;

/**
 *
 * @author lin.elena
 */
import java.util.Random;
public class Alpinisti {
    Random r = new Random();
    private int cima = 7, n_tentativi = 0, p, np;
    public int CalcolaTentativi(){
        int passi = 0;
        p = r.nextInt(20, 81);
        while(passi >= 0 || passi == cima){
            np = r.nextInt(0,101);
            if(np < p){
                passi++;
            }
            else{
                if(passi != 0){
                    passi--;
                }
            }
            n_tentativi++;
        }
        return n_tentativi;
    }
}
