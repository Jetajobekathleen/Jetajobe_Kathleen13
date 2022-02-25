package com.RemoveWhiteSpace;
 
public class RemoveWhiteSpace {

  public static void main(String[] args) {
     
     String str = "  Jeta    jobe   Kath   leen   ";
     // removes spaces
     str = str.replaceAll("\\s", "");
      System.out.println(str); 
      
   
  }
}

