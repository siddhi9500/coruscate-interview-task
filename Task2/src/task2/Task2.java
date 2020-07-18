/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Scanner;

/**
 *
 * @author Sid Patel
 */
public class Task2 {

    public static void main(String args[]) throws Exception {
        System.out.println("Please Enter Number of Test case:");
        Scanner s = new Scanner(System.in);   //take input of user 
        int n = s.nextInt();
        int[] arrayOFTrial = new int[n];
        
        System.out.println("Please Enter Seat Number:");
        for(int j = 0; j<arrayOFTrial.length; j++){
            
            int t = s.nextInt();   //take input of seat number
            arrayOFTrial[j] = t;
        }
        // int n=Integer.parseInt(ns);
         
        for (int i = 0; i < arrayOFTrial.length; i++) {
            
        // int t=Integer.parseInt(ns);
            int l = arrayOFTrial[i] / 12;      //divide by 12 because of there is 12 seat in one cabin
            int m = arrayOFTrial[i] % 12;       //finding seat number is multiplier of 12 or not
            if (m != 0) {    
                int b = (12 * (l + 1)) - m + 1; //get value of seat and assign as image seat map
                System.out.print(b + " ");
                if (m == 1 || m == 6 || m == 7 || m == 12) {  //if value is in 1,6,7,12 then it is in Window seat
                   System.out.print("WS");
                }
                if (m == 2 || m == 5 || m == 8 || m == 11) { //if value is in 1,6,7,12 then it is in Middle seat
                    System.out.print("MS");
                }
                if (m == 3 || m == 4 || m == 9 || m == 10) { //if value is in 1,6,7,12 then it is in Asile seat
                    System.out.print("AS");
                }
                System.out.println();

            }
            if (m == 0) {               //otherwise it will be window seat
                int b = (12 * l) - 11;
                System.out.print(b + " ");
                System.out.print("WS");
                System.out.println();
            }
        }
    }
}
