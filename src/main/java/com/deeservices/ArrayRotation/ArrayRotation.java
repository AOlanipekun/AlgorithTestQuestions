/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.deeservices.ArrayRotation;

import java.util.*;
import java.io.*;

/**
 *
 * @author ADEDOYIN
 */
public class ArrayRotation {

    public static String ArrayRotation(int[] arr) {
        String outString = "";
        if (arr != null) {

            int rotateInt = arr[0];
            int arraylenght = arr.length;
            int[] newArr;
            // code goes here  
            outString = rotateByOne(arr, rotateInt, arraylenght);
        }

        return outString;
    }

    public static String rotateByOne(int[] arr, int rotateInt, int arraylenght) {
        String outString = "";
        for (int i = 0; i < rotateInt; i++) {
            int arrtemp = arr[0];
            for (int j = 0; j < arraylenght - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arraylenght - 1] = arrtemp;
        }
        for (int temp = 0; temp < arraylenght; temp++) {
            outString += arr[temp];
        }
        return outString;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        String temp = s.nextLine();
        //eg 4, 3, 4, 3, 1, 2 was received
        String[] temparr = temp.split(",");

        int[] arr = new int[temparr.length];
        for (int i = 0; i < temparr.length; i++) {
            String stemp = temparr[i].trim();

            arr[i] = Integer.parseInt(stemp);
        }
        System.out.print(ArrayRotation(arr));
    }

}
