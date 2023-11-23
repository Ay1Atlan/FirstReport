package day10;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    Random random = new Random();
    Scanner scan = new Scanner(System.in);
    System.out.println("Please input number between 1 and 100");{
    int input = scan.nextInt();
    int num = random.nextInt(1, 100);
    while (input != num) {
        if(num > input) {
            System.out.println("The number is too low");
        }else {
            System.out.println("The number is too high");
        }
        input = scan.nextInt();
    }
    System.out.println("The input of " + input + ". Is the same as " + num);
    scan.close();}
    


    
