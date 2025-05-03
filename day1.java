// import java.util.*;
// class day1{
//     public static void main(String[] args){
//         System.out.println("Hello");
//     }
// }

import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        // int a;
        // a=10;
        // System.out.println(a);
        Scanner sc = new Scanner(System.in);
        // int b=sc.nextInt();
        // double x=sc.nextDouble();
        // System.out.println(x);
        // System.out.println(b);

        // decision making statement
        // age based voting checker
        // int age;
        // age=sc.nextInt();
        // if(age>=18)
        // {
        // System.out.println("Eligible for Vote");
        // }
        // else{
        // System.out.println("Not Eligible for vote");
        // }
        // Even odd number checker
        // int number;
        // number=sc.nextInt();
        // if(number%2==0){
        // System.out.println("Even Number");
        // }
        // else{
        // System.out.println("Odd Number");
        // }
        // int number;
        // number=sc.nextInt();
        // if(number%3==0 && number%5==0)
        // {
        // System.out.println("Divisible by 3 and 5");
        // }
        // else if(number%5==0)
        // {
        // System.out.println("Divisible by 5");
        // }
        // else if(number%3==0){
        // System.out.println("Divisible by 3");
        // }

        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonent");
        }

    }
}
