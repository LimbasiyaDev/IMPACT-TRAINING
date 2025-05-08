//ARRAY

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
    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
}  
}
