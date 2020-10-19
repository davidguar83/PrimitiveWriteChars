/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivewritechars;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author david
 */
public class PrimitiveWriteChars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String cadea = "o tempo esta xélido";
        String a = "";

        try {
            DataOutputStream escribir = new DataOutputStream(new FileOutputStream("C:/Users/david/Desktop/prueba clase file/text5.txt"));
            DataInputStream ler = new DataInputStream(new FileInputStream("C:/Users/david/Desktop/prueba clase file/text5.txt"));

            for (int i = 0; i < 2; i++) {

                System.out.println("escribindo: " + cadea);
                escribir.writeChars(cadea);
                System.out.println("a lonxitud de esta cdea e: " + cadea.length() + " caracteres");
                System.out.println("levanse escritos: " + escribir.size());

            }

            while (ler.available() != 0) {
                

                for (int j = 0; j < cadea.length(); j++) {

                    a = a + ler.readChar();

                }
                
                
                
                if(ler.available()==38){
                
                System.out.println("lemos a primeira cadea: " + a);
                System.out.println("restan por ler : " + ler.available() + " bytes");
                
                }else{
                        
                       System.out.println("lemos a segunda cadea: " + cadea); 
                        System.out.println("restan por ler : " + ler.available() + " bytes");
                        }
                
                
                
            }
            
            
            ler.close();
            escribir.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
        
     
        

    }

}
