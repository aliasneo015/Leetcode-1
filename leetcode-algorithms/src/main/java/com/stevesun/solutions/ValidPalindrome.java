package com.stevesun.solutions;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        char[] chars = s.toCharArray();
        while(i < j){
            while(i < j && !Character.isLetterOrDigit(chars[i])) i++;
            while(i < j && !Character.isLetterOrDigit(chars[j])) j--;
            if(Character.toLowerCase(chars[i]) != Character.toLowerCase(chars[j])) return false;
            i++; j--;
        }
        return true;
    }

}
