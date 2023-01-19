package day28exceptions;

import java.security.PublicKey;

public class Exception04 {
    public static void main(String[] args) {
        String arr[]={"A","G","M","L"};
        getelementFromArray(arr,1);
        getelementFromArray(arr,5);
        System.out.println("hi");

    }
    //Array'lerde olmayan bir index kullanildiginda Java ArrayIndexOutOfBoundsException atar.
    public  static void getelementFromArray(String [] s,int idx) {
        try {
            String el = s[idx];
            System.out.println(el);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
}
