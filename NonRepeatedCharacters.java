package com.Activity1B;

public class NonRepeatedCharacters {

  public static void main(String[] args) {
  
  // return the first non repeated characters 
   String string1 ="Kathleen Jetajobe";

        for(char i : string1.toCharArray()){
        if ( string1.indexOf(i) == string1.lastIndexOf(i)) {
            System.out.println("First non-repeating character is: "+i);
            break;
    
 }
 }
 }}
     
  

