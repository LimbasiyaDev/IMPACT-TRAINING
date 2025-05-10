//Jagged Array
import java.util.*;
public class day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [][];
        arr = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                int x=sc.nextInt();
                arr[i][j]=x;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
