/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author rpa09
 */
public class WordToPDF {

    final static String SCRIPTPATH = "src\\script\\ConvertWordToPDF.vbs";

    public static void main(String[] args) throws IOException {

        //String vbScriptPATH = "src\\script\\ConvertWordToPDF.vbs";
        String docPATH = "C:\\javaTest";
        Convert(docPATH);

    }

    private static String SRCIPTPATH() {
        return SCRIPTPATH;
    }

    public static void Convert(String pdocPATH) throws IOException {
        try {
            Runtime.getRuntime().exec("wscript " +"\""+SRCIPTPATH()+"\""+ " " +"\""+pdocPATH+"\"");
          
        } catch (IOException e) {
            System.out.println(e);
            System.exit(0);
        }

    }

 
}
