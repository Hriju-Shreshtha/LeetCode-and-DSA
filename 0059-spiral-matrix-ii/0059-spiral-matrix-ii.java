// class Solution {
//     public int[][] generateMatrix(int n) {
        
//     }
// }


class Solution {
  public int[][] generateMatrix(int n) {
    int res [][] = new int [n][n];
    int num=1;
    // List<Integer> res = new ArrayList<>();
    // int index=0;
    int top = 0, right = res[0].length - 1, bottom = res.length - 1, left = 0;
    // System.out.println(matrix[top][left]+" "+matrix[top][right]+" "+ matrix[bottom][right]+" "+
    // matrix[bottom][left]);
    while (top <= bottom && left <= right) {
      for (int i = left; i <= right; i++) {
        res[top][i]=num;
        num++;
        // System.out.println(matrix[top][i]);
        // index++;
      }
      top++;
      for (int i = top; i <= bottom; i++) {
        res[i][right]=num;
        num++;
        // System.out.println(matrix[i][right]);
        // index++;
      }
      right--;
      if (top <= bottom) {
        for (int i = right; i >= left; i--) {
          res[bottom][i]=num;
          num++;
          // System.out.println(matrix[bottom][i]);
          // index++;
        }
        bottom--;
      }

      if (left <= right) {
        for (int i = bottom; i >= top; i--) {
          res[i][left]=num;
          num++;
          // System.out.println(matrix[i][left]);
          // index++;
        }
        left++;
      }
    }
    return res;
  }
}
