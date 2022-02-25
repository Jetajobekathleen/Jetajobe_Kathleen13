package com.anagram;

public class TwoStringAnagram {

    //Checks if the strings are anagram or not      
     public static boolean isAnagram(String str1, String str2)   
{  
     //converts string into char array      
    char[] characters = str1.toCharArray();  
    StringBuilder sb = new StringBuilder(str2);  
    
    for (char ch : characters)   
{  
         
    int index = sb.indexOf("" + ch);  
    if (index != -1)   
{  
    //delete character on the specified index      
   sb.deleteCharAt(index);  
}   
else   
{  
return false;  
}  
}  
    
   return sb.length() == 0 ? true : false;  
}  
  
   public static void main(String args[])   
{    
   
   System.out.println(isAnagram("parrot", "raptor"));    
   System.out.println(isAnagram("poodle", "looped"));   
}    
{    
  }
}
