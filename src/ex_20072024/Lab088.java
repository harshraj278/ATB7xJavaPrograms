package ex_20072024;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();

        if(num1>num2) {
            System.out.println(num1);
        } else if (num2>num1){
                System.out.println(num2);
            }else {
            System.out.println("Equal");

        }

            }
        }
