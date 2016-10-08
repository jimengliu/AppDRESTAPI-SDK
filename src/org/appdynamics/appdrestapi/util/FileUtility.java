/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.util;

import java.io.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author gilbert.solorzano
 */
public class FileUtility {
    private static Logger logger=Logger.getLogger(FileUtility.class.getName());
    
    /**
     * <p>
     *    This will read a file into a string so that it can be used by your
     * program.
     * </p>
     * @param filePath The full path to the file

     * 
     * @return {@link String} 

     */
    public static String readFileToString(String filePath){
        StringBuilder bud = new StringBuilder();
        try{
            java.io.BufferedReader br=new java.io.BufferedReader(new FileReader(filePath));
            
            String s;
            while((s= br.readLine()) != null){
                bud.append(s).append("\n");
            }
             return bud.toString();
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred while attempting to open the file ")
                    .append(filePath).append(" with ").append(e.getMessage()).toString());
        }
        
        return bud.toString();
    }
    
    /**
     * <p>
     *    This will read a file into a string so that it can be used by your
     * program.
     * </p>
     * @param filePath The full path to the file
     * @param separator The separator to use
     * @return {@link ArrayList}

     */
    public static ArrayList<ArrayList<String>> readFileToArray(String filePath, String separator){
        ArrayList<ArrayList<String>> info=new ArrayList<ArrayList<String>>();

        try{
            java.io.BufferedReader br=new java.io.BufferedReader(new FileReader(filePath));
            
            String s;
            while((s= br.readLine()) != null){
                String[] list = s.split(separator);
                ArrayList<String> _list =new ArrayList<String>();
                _list.addAll(Arrays.asList(list));
                info.add( _list);
            }
             return info;
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred while attempting to open the file ")
                    .append(filePath).append(" with ").append(e.getMessage()).toString());
        }
        
        return info;
    }
    
    /**
     * <p>
     *  This will write a string into a file
     * </p>
     * @param filePath The full path to the file
     * @param text The text that is to be written to the file
     */
    public static void writeStringToFile(String filePath, String text){
        try {
            
            BufferedWriter out = new BufferedWriter(new FileWriter(filePath));
            out.write(text);
            out.close();
        }
        catch (IOException e)
        {
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred while attempting to open the file ")
                    .append(filePath).append(" with ").append(e.getMessage()).toString());       
        }
    }
}
