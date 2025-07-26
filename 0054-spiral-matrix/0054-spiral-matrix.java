class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int top = 0, right = matrix[0].length - 1, bottom = matrix.length - 1, left = 0;
        // System.out.println(matrix[top][left]+" "+matrix[top][right]+" "+ matrix[bottom][right]+" "+
        // matrix[bottom][left]);
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
                // System.out.println(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
                // System.out.println(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                    // System.out.println(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                    // System.out.println(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}
