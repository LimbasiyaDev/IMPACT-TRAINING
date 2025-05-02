// import java.util.*;
// class day1{
//     public static void main(String[] args){
//         System.out.println("Hello");
//     }
// }

import java.util.Scanner;
public class day1{
    public static void main(String[] args){
        // int a;
        // a=10;
        // System.out.println(a);
         Scanner sc=new Scanner(System.in);
        // int b=sc.nextInt();
        // double x=sc.nextDouble();
        // System.out.println(x);
        // System.out.println(b);
        
        //decision making statement
        //age based voting checker
        int age;
        age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("Eligible for Vote");
        }
        else{
            System.out.println("Not Eligible for vote");
        }
    }
}
