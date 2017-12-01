/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioexamples;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Isaac
 */
public class CustomTextFormatter implements TextFormatter {
    @Override
    public String encodeAndWrite(List<Map<String, String>> data){
        final String CR = "\n";
        String result = "";
        for(Map record : data){
            result += "Part No." + CR;
            result += record.get("Part No.") + CR;
        }
        return result;
    }
}
