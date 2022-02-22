package com.activity1;

public class DuplicateCharacters {

String s= "ClassBody";

  public static void main(String[] args) {
   
   // Counting Duplicate Characters
   String string1= "Kathleen Joy Jetajobe";
   
   int count;
   
     //Converts given string into character array  
        char string[] = string1.toCharArray();  
        
        System.out.println("Duplicate characters in a given string: ");  
        //Counts every characters present in the string  
        for(int i = 0; i <string.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
    //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && string[i] != '0')  
                System.out.println(string[i]); }
        }
          }
            
  

