// public class day2 {
//     public static void main(String[] args) {
//         double x=5.0%2;
//         System.out.println(x);
//     }
    
// }

// Increment and decrement operator

// public class day2 {
//     public static void main(String[] args) {
//         int x=5;
//         int y=x++;
//         System.out.println(x+" "+y);
//     }
    
// }

// public class day2 {
//     public static void main(String[] args) {
//         int x=5;
//         int y=++x;
//         System.out.println(x+" "+y);
//     }
    
// }

// public class day2 {
//     public static void main(String[] args) {
//         int x=5;
//         int y=++x;
//         int z=x++;
//         System.out.println(x+" "+y+" "+z);
//     }
    
// }

// public class day2 {
//     public static void main(String[] args) {
//         int x=5;
//         int y=x++;
//         int z=x--;
//         System.out.println(x+" "+y+" "+z);
//     }
    
// }

//Bitwise OR

// public class day2 {
//     public static void main(String[] args) {
//         int x=(5|2);
//         System.out.println(x);
//     }
    
// }

//Bitwise AND

// public class day2 {
//     public static void main(String[] args) {
//         int x=(4&13);
//         System.out.println(x);
//     }
    
// }

// Bitwise XOR

// public class day2 {
//     public static void main(String[] args) {
//         int x=(8^16);
//         System.out.println(x);
//     }
    
// }

//Operators
// public class day2 {
//     public static void main(String[] args) {
//         boolean x=(5>4)&&(4<7);
//         System.out.println(x);
//     }
    
// }

// import java.util.Scanner;
// public class day2 {
//     public static void main(String[] args) {
     
//         Scanner sc = new Scanner(System.in);
//         int x=sc.nextInt();
//         if(x>=33 && x<45){
//             System.out.println("3rd Division");
//         }
//         else if(x>=60){
//             System.out.println("2nd Division");
//         }
//         else if(x<33){
//             System.out.println("Fail");
//         }
//         else if(x>=33){
//             System.out.println("Pass");
//         }       
//     }
// }





import java.util.Scanner;
public class day2 {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount Of Purchase");
        double x=sc.nextInt();
        if(x>0 && x<1000){
            System.out.println("5% Discount");
            System.out.println("Amount to Pay "+(x-(x*5/100)));
        }
        else if(x>1000 && x<5000){
            System.out.println("10% Discount");
            System.out.println("Amount to Pay "+(x-(x*10/100)));
        }
        else if(x>5000 && x<10000){
            System.out.println("15% Discount");
            System.out.println("Amount to Pay "+(x-(x*15/100)));
        }
        else if(x>10000){
            System.out.println("20% Discount");
            System.out.println("Amount to Pay "+(x-(x*20/100)));
        } 
    }
}