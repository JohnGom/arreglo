/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arreglo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrador
 */
public class Arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona estudiantes[]= new Persona[3];
     
        String sText = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         Persona persona;
         int edad=0;
        for (int i=0; i<estudiantes.length; i++){
            persona = new Persona();
            
         
            try{
                System.out.println("nombre: ");
                sText = br.readLine();
                persona.setNombre(sText);
                System.out.println("edad: ");
                sText = br.readLine();
                persona.setEdad(Integer.parseInt(sText));
                edad=edad+Integer.parseInt(sText);
                estudiantes[i]=persona;
                
            }catch(IOException e){
                
                e.printStackTrace();
                
            }
        }
        System.out.println("edad es: " +edad/3);
        
    }
    
}
