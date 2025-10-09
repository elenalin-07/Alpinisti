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
    private int cima, n_tentativi = 0, percentuale, n_casuale;
    
    public Alpinisti(int c, int perc){
        this.cima = c;
        this.percentuale = perc;
    }
    
    public void aumentaPercentuale(){
        percentuale += cima/2;
    }
    public void Reset(int c, int nt){
        this.cima = c;
        this.n_tentativi = nt;
    }
    
    public int getCima(){
        return cima;
    }
    
    public int getPercentuale(){
        return percentuale;
    }
    
    public int CalcolaTentativi(){
        int passi = 0;
        while(passi >= 0 && passi < cima){
            n_casuale = r.nextInt(0,101);
            if(n_casuale <= percentuale){
                if(n_casuale >= percentuale/2 && percentuale >= 60){
                    passi += 2;
                }
                else{
                    passi++;
                }
            }
            else{
                if(n_tentativi > 2){
                    if(percentuale >= 60){
                        if(n_casuale < percentuale/2){
                            passi -= percentuale/12;
                        }
                        else{
                            passi -= 3;
                        }
                    }
                    else{
                        passi--;
                    }
                }
            }
            n_tentativi++;
        }
        if(passi < 0){
            n_tentativi = -1;
        }
        return n_tentativi;
    }
}
