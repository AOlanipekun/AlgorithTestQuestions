/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deeservices.coderbytetestquestions;

import java.util.Scanner;

/**
 *
 * @author ADEDOYIN
 */
public class MatchingCouple {

    public static int factorial(int n) {
        int temp = 1;
        for (int i = 1; i <= n; i++) {
            temp =temp * i;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Boys: ");
        int n = sc.nextInt();

        System.out.println("Enter Girls: ");
        int  m= sc.nextInt();

        System.out.println("Enter no of pair: ");
        int r = sc.nextInt();


        int n_Combination_r = factorial(n) / (factorial((n - (r/2))) * factorial(r/2));
        int m_Permutation_r = factorial(m) / (factorial((m - (r/2))));
        System.out.println(n_Combination_r *m_Permutation_r);

    }
}
