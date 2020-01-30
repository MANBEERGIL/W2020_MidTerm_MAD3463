/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

/**
 *
 * @author Pritesh Patel
 */
public class LambtonStringTools 
{
    //1 - REVERSE STRING
    public static String reverse(String s)
    {


        return null;


    }

    public static void main(String[] args) {
        String s1 ="welcome";
        String reverse ="   ";
        for (int i =s1.length();i>=0;i--){
            reverse =reverse+s1.charAt(i);
            System.out.println(reverse);
        }
    }
    
    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s) 
    {

        return null;
    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static String mostFrequent(String s) 
    {
        if(s.equals(null)){
        return null;}
        int b=0;
        int c=0;
        char frequent;

        for(int i=0;i<s.length();i++){
            char a =s.charAt(i);
            for(int j=1+1;j<s.length();j++){
                if (a==s.charAt(i)){
                    c++;
                }
                else{
                    continue;
                }
            }

        }
     return null;

    }
    
    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s) 
    {
       return 0;
    }
     
    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString) 
    {
        return null;
    }
}
