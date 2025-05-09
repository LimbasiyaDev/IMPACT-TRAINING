// import java.util.Scanner;

// public class day6 {
//     public static void main(String[] args) {
//         int arr[];
//         int target = 8;
//         Scanner sc = new Scanner(System.in);
//         int n;
//         n = sc.nextInt();
//         arr = new int[n];

     
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int first = -1;
//         int last = -1;

       
//         for (int i = 0; i < n; i++) {
//             if (arr[i] == target) {
//                 first = i;
//                 break;
//             }
//         }

  
//         for (int i = n - 1; i >= 0; i--) {
//             if (arr[i] == target) {
//                 last = i;
//                 break;
//             }
//         }

//         System.out.println("First Occurrence: " + first);
//         System.out.println("Last Occurrence: " + last);
//     }
// }



import java.util.Scanner;

public class day6 {
    public static void main(String[] args) {
        int arr[];
        int target = 8;
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        arr = new int[n];

     
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int first = -1;
        int last = -1;

       
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                if(first==-1){
                first = i;
                last = i;
            }
            else{
                last = i;
            }
        }
            }
        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);
    }
}
