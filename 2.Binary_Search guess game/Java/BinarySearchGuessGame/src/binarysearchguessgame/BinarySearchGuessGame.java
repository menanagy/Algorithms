package binarysearchguessgame;

import java.util.Scanner;

public class BinarySearchGuessGame {

    public static void main(String[] args) {
        boolean state_play = true;
        while (state_play) {
            int min = 0;
            int max = 100;
            int mid = (min + max) / 2;
            boolean state_check = true;
            Scanner in = new Scanner(System.in);
            System.out.println("guess Number From 0 : 100");
            while (state_check) {
                System.out.println("if your Number Greater Than : " + (mid) + "  Press G");
                System.out.println("if your Number Small Than : " + (mid) + "  Press S");
                System.out.println("if your Number Equal : " + (mid) + "  Press E");
                char check = in.next().charAt(0);
                if (check == 'G' || check == 'g') {
                    min = mid;
                    mid = (min + max) / 2;
                } else if (check == 'S' || check == 's') {
                    max = mid;
                    mid = (min + max) / 2;
                } else if (check == 'E' || check == 'e') {
                    System.out.println("____________________________________");
                    System.out.println("\nYour Number is  " + mid);
                    System.out.println("____________________________________");
                    state_check = false;
                } else {
                    System.out.println("You Enter Invalid Input please Read Game Again : ");
                }
            }
            System.out.println("if Want play Again  Press : Y if wan't play press any button ");
            char check_play = in.next().charAt(0);
            if (check_play != 'y' && check_play != 'Y') {
                state_play = false;
            }
        }

    }
}
