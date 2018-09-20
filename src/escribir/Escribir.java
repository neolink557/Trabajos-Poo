/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escribir;
import CrearScore.Score;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author Braya
 */
public class Escribir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        FileWriter escritor = new FileWriter("Scores.txt");
        ArrayList <String> scores = new ArrayList<String>();
        Score pu = new Score();
        for (int i = 0; i <pu.GenerarLargo(100); i++) {
            scores.add(pu.GenerarPuntaje(1, 10000));     
        }
        for (int i = 0; i < scores.size(); i++) {
            escritor.write(scores.get(i) + "\n");
            System.out.println(scores.get(i));
        }
        escritor.close();
    }
    
}
