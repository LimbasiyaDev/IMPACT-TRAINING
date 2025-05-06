//NUMBER 0,1 PATTERN
// import java.util.Scanner;
// public class day4 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++)
//             {
//             if((i+j)%2==0){
//             System.out.print("1");}
//             else{
//             System.out.print("0");}
//             } 
//             System.out.println();  
//         }
//     }
// }

//NUMBER PATTERN
import java.util.Scanner;

public class day4{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int number = 1;
        for(int i=1;i<=n;i++)
        {
        for(int j=1;j<=i;j++)
        {
        System.out.print(number+" ");
        number++;
        }
        System.out.println();
    }
    }
}




// import java.util.Scanner;

// public class day4{
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     for(int i=0;i<n;i++){
//         for(int j=0;j<n;j++){
//             if(i==0 || i==n-1 || j==0 || j==n-1){
//             System.out.print('*');
//             }
//             else{
//             System.out.print(" ");
//             }
//         }
//         System.out.println();
//     }
//     }
// }


    


    

