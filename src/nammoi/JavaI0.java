/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nammoi;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 *
 * @author Admin
 */ 
public class JavaI0 {
    public static void main(String[] args) {
        Locale locale = new Locale("en","US");
        ResourceBundle rb = ResourceBundle.getBundle("resource/lang", locale);
        System.out.println(rb.getString("hello"));//get theo key
        
        
    }
}
