/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capgemini;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author ediaz
 */
public class Capgemini {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        String fileName = "c://lines.txt";
        List<String> list = new ArrayList<>();
        List<Row> rows = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            boolean isRequest = false;
            String line;
            while ((line = br.readLine()) != null ) {
                if (line.equals("")  ) {
                    isRequest = true;

                } else if ( !isRequest){
                    System.out.println(line + "lines");
                    List<String> sectionTokens = getTokens(line," ");
                    Row r = new Row();
                    rows.add(r);
                    List<Section> sections = new ArrayList<>();
                    for(String str:sectionTokens){
                        Section s = new Section();
                        String newstr = new String(str);
                        System.out.println(">>"+str+"<<");
                        //s.setAvailable( Integer.parseInt(str.trim().toString() ) );
                        sections.add(s);
                    }
                    
                    
                } else {
                    System.out.println(line + "request");
                    List requestTokens = getTokens(line," ");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static  List<String> getTokens(String str,String delimiter) {
    List<String> tokens = new ArrayList<>();
    StringTokenizer tokenizer = new StringTokenizer(str, delimiter);
    while (tokenizer.hasMoreElements()) {
        tokens.add(tokenizer.nextToken());
    }
    return tokens;
}

    
}
