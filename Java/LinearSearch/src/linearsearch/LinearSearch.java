/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;

import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
     
    int arr[] = new int[]{ 2, 3, 4, 10, 40 };
    int element = 0;
    Scanner in =new Scanner(System.in);
    System.out.println("Enter the Element you want to search for it :: ");
    element=in.nextInt();
    // Function call
    int result = search(arr,element);
    if(result == -1){
        System.out.println("Element is not present in array...");
    }
    else{
        System.out.println( "Yes it Here :) Element is present at index : "+result+"\n");
    }
}
public static int search(int arr[], int element)
{
    int index;
    for (index = 0; index < arr.length; index++)
        if (arr[index] == element)
            return index;
    return -1;
}
    
}
