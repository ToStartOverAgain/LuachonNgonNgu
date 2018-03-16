/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nammoi;

import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Admin
 */
public class CountryLang {

    private static HashMap<String, String> mapCountryLang;

    private static void generateMap() {
        mapCountryLang = new HashMap<>();
        try {
            List<String> listLine = Files.readAllLines(paths.get("lang.txt"));// doc tat ca file ghi
            for (String string : listLine) {
                String[] clArray = String.split("\\|");
                if (clArray.length > 1) {
                    mapCountryLang.put(clArray[0], clArray[1]);// lay key va valuse ve

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static String getCountryLanguage(String lang) {
        if (mapCountryLang == null){
            generateMap();
        }
        return mapCountryLang.get(lang);
    }
    public static void main(String[] args) {
        System.out.println(CountryLang.getCountryLanguage("ja"));
    }
}

