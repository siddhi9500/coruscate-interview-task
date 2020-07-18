/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.util.Scanner;

/**
 *
 * @author Sid Patel
 */
public class Task1 {
public static void main(String[] args)
{
   int numberofplayers;
   int coinscount;
   int[] arrayofcoins;
    System.out.println("Enter Number of Player");
    Scanner sc = new Scanner(System.in);
    numberofplayers =sc.nextInt();
    System.out.println("Enter Total Number of Coins");
    coinscount  =sc.nextInt();
    if(numberofplayers > 0  && coinscount >0)
    {
        arrayofcoins=new int[coinscount];
        if (IsMultiplier(coinscount, numberofplayers))
         {
             for (int i = 0; i < coinscount; i++)
              {
                  arrayofcoins[i]=sc.nextInt() ;
              }
             
             if(arrayofcoins.length > 0){
                 CompareCoin(arrayofcoins,numberofplayers);
             }else{
                System.out.println("\n Empty array"); 
             }
         }
    }
}

   public static Boolean IsMultiplier(int x, int n)
   {
        return (x % n) == 0;
   }
     public static void CompareCoin(int[] array, int numberOfPlayers)
        {
            int[] playerArray = new int[numberOfPlayers];// created player array
            int k = array.length - 1;
            int j =0;
            for(int i=0; i != k+1; i++, j++){
                if (j == playerArray.length) // checking if player array isempty or not?
                {
                    j = 0;
                }
                if (array[i] > array[k])
                {
                    playerArray[j] += array[i]; // append the array with playerArray  
                }
                else
                {
                    playerArray[j] += array[k];
                    i--;
                    k--;
                }
            }

            int maximumValue = playerArray[0];
            int maximumValuedPlayer = 0;
            int c = 0;
            for (int z = 0; z < playerArray.length; z++)
            {
                if(playerArray[z]> maximumValue){
                    maximumValue = playerArray[z];
                    maximumValuedPlayer = z;
                }
                c++;
            }
            
            maximumValuedPlayer = maximumValuedPlayer + c;
            System.out.println("The Winner is " + maximumValuedPlayer );
            System.out.println( "Total Coins are " + maximumValue); 
        }
   
}
