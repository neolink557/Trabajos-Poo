/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrearScore;
import java.util.Random;
/**
 *
 * @author Braya
 */
public class Score {
     private Random score = new Random();
     private String p;  
     
    public int GenerarLargo(int x)
    {
        int largo=1+score.nextInt(x);
        return largo;
    }
    public String GenerarPuntaje(int x,int y)
    {
        int puntaje = x + score.nextInt(y); 
        p= Integer.toString(puntaje);
        return p;
    }
 
    
   
     
     
     
}
