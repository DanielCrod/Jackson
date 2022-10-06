/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jackson;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.List;
/**
 *
 * @author danie
 */
public class Jackson {
    

    public static void main(String[] args) throws URISyntaxException, IOException {

       Jackson lector = new Jackson();
       ObjectMapper mapper = new ObjectMapper();
       Persona p = new Persona("juan", "lopez", 20, true);
       try {
           File fichero = new File("C:\\Users\\danie\\Downloads\\persona3.json");
           fichero.createNewFile();
           mapper.writeValue(fichero, p);
       } catch (IOException e) {
           e.printStackTrace();
       }
       
       
       FileReader fr = new FileReader ("C:\\Users\\danie\\Downloads\\persona3.json");
       BufferedReader br = new BufferedReader(fr);

       String linea = br.readLine();
       
       System.out.println(linea);
   }


    }

    
    
   
    


    

