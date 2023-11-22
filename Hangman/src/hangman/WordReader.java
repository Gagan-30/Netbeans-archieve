/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WordReader 
{
    private static final String filename = "words.txt";

    private ArrayList<String> words = new ArrayList<String>();

    public WordReader() 
    {
        try (InputStream in = getClass().getResourceAsStream(filename);
                BufferedReader bf = new BufferedReader(new InputStreamReader(in))) {

            String line = "";
            while ((line = bf.readLine()) != null)
                words.add(line);
        }
        catch (Exception e) 
        {
            System.out.println("Couldn't find/read file: " + filename);
            System.out.println("Error message: " + e.getMessage());
        }
    }

    public String getRandomWord() 
    {
        if (words.isEmpty())
        {
           return "EMPTY"; 
        }
        return words.get((int)(Math.random()*words.size()));
    }
}
