// Jagged Array
// import java.util.*;
// public class day7 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int arr [][];
//         arr = new int[3][];
//         arr[0] = new int[3];
//         arr[1] = new int[2];
//         arr[2] = new int[3];
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 int x=sc.nextInt();
//                 arr[i][j]=x;
//             }
//         }
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }



// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
//             return false;
//         }

//         int rows = matrix.length;
//         int cols = matrix[0].length;
//         int left = 0;
//         int right = rows * cols - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;
//             int row = mid / cols;
//             int col = mid % cols;

//             if (matrix[row][col] == target) {
//                 return true;
//             } else if (matrix[row][col] < target) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }

//         return false;
//     }
// }





class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}