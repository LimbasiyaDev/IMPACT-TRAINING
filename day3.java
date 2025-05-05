// import java.util.Scanner;

// public class day3 {
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n=sc.nextInt();
//     int count = 0;
//     for(int i=0; i<=n; i++){
//     count = count + i;
//     }
//     System.out.println(count);
// }  
// }

// import java.util.Scanner;

// public class day3 {
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int number,count = 0;
//     number=sc.nextInt();
//     while(number>0)
//     {
//         int x = number%10;
//         System.out.println(x);
//         number/=10;
//     }
// }
// }

//Armstrong Number
// import java.util.Scanner;

// public class day3{
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter Number");
//     int number = sc.nextInt();
//     int duplicate=number;
//     int count = 0;
//     while(number>0) 
//     {
//         count ++;
//         number/=10;
//     }
//     number=duplicate;
//     int z=0;
//     while(number>0)
//     {
//         int x = number%10;
//         int y = 1;
//         for(int i=1;i<count;i++)
//         {
//             y=y*x;
//         }
//         z+=y;
//         number /= 10;
//     }
// if(z==duplicate){
//     System.out.println("Armstrong");
// }
// else{
//     System.out.println("Not");
// }
// }
// }



// //Pattern Print 
// import java.util.Scanner;

// public class day3{
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//         System.out.print('*');
//         }
//         for(int z=1;z<=i-1;z++){
//         System.out.print('*');
//         }
//         System.out.println();
//     }
//     }
// }

// import java.util.Scanner;

// public class day3{
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//         for(int i=1;i<=n;i++)
//         {
//         for(int j=1;j<=i;j++)
//         {
//         System.out.print(j);
//         }
//         System.out.println();
//     }
//     }
// }


//HCF OF TWO NUMBERS

import java.util.Scanner;

public class day3{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hcf=1;
    int n = sc.nextInt();
    int m = sc.nextInt();
        for(int i=1;i<=n && i<=m;i++){
            if(n%i==0 && m%i==0){
            hcf=i;
            }
        }
            System.out.println(hcf);
    }
}