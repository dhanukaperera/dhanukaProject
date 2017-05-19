/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import java.io.IOException;

/**
 *
 * @author rpa09
 */
public class WordToPDF {
    
    public static void main(String[] args)
    {
        
        String vbScriptPATH = "src\\script\\ConvertWordToPDF.vbs";
        String docPATH="C:\\Users\\rpa09\\Desktop\\Output\\test";
        Convert(vbScriptPATH,docPATH);
        
    }
    
    public static void Convert(String pvbScriptPATH, String pdocPATH) {
        try {
            Runtime.getRuntime().exec("wscript " + pvbScriptPATH + " " + pdocPATH);
        } catch (IOException e) {
            System.out.println(e);
            System.exit(0);
        }

    }
}
