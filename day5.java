//ARRAY

// import java.util.Scanner;

// public class day5 {
//  public static void main(String[] args) {
//     int arr[];
//     Scanner sc = new Scanner(System.in);
//     int n;
//     n=sc.nextInt();
//     arr=new int[n];
//     for(int i=0;i<n;i++){
//         int x=sc.nextInt();
//         arr[i]=x;
//     }
//     for(int i=0;i<n;i++){
//         System.out.println(arr[i]);
//     }
// }  
// }

//LARGTEST NUMBER

// import java.util.Scanner;

// public class day5 {
//  public static void main(String[] args) {
//     int arr[];
//     Scanner sc = new Scanner(System.in);
//     int n;
//     n=sc.nextInt();
//     arr=new int[n];
//     for(int i=0;i<n;i++){
//         int x=sc.nextInt();
//         arr[i]=x;
//     }
//     int largest =arr[0];
//     for(int i=1;i<n;i++){
//         if(arr[i]>largest){
//             largest=arr[i];
//         }
//     }
//     System.out.println(largest);
// }  
// }



//SORTING OF AN ARRAY

import java.util.Scanner;

public class day5 {
 public static void main(String[] args) {
    int arr[];
    Scanner sc = new Scanner(System.in);
    int n;
    n=sc.nextInt();
    arr=new int[n];
    for(int i=0;i<n;i++){
        int x=sc.nextInt();
        arr[i]=x;
    }
    for(int i=0;i<n;i++)
    {
        int smallest =arr[0];
        int x=i;
        for(int j=i+1;j<n;j++){
        if(arr[j]<smallest){
            x=j;
        }
    }
    int temp = arr[i];
    arr[i] = arr[x];
    arr[x] = temp;

    }
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
} 
}



