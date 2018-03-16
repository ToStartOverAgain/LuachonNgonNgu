/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nammoi;

import java.io.File;
import java.io.FileWriter;

/**
 
 * @author Admin
 */
public class Thiep {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\anh.txt");
            FileWriter stt = new FileWriter(file);
            stt.write("trăm năm hạnh phúc");
            stt.close();
        } catch (Exception e) {
            System.out.println(" Loi ghi ");
        }
    }
}
