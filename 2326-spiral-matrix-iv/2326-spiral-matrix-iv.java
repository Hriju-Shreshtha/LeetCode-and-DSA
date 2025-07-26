/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */



class Solution {

    static {
        ListNode toFill = new ListNode(1, new ListNode(2));
        for (int i = 0; i < 300; i++) spiralMatrix(1,2, toFill);
    }

    public static int[][] spiralMatrix(int m, int n, ListNode head) {
        int res[][] = new int[m][n];
        // int num=1;
        // List<Integer> res = new ArrayList<>();
        // int index=0;
        int top = 0, right = res[0].length - 1, bottom = res.length - 1, left = 0;
        // System.out.println(matrix[top][left]+" "+matrix[top][right]+" "+ matrix[bottom][right]+" "+
        // matrix[bottom][left]);
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                if (head!=null) {
                    res[top][i] = head.val;
                    head = head.next;
                    // num++;
                    // System.out.println(matrix[top][i]);
                    // index++;
                } else {
                    res[top][i] = -1;
                }

            }
            top++;
            for (int i = top; i <= bottom; i++) {
                if (head!=null) {
                    res[i][right] = head.val;
                    head = head.next;
                    // num++;
                    // System.out.println(matrix[i][right]);
                    // index++;
                } else {
                    res[i][right] = -1;
                }
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    if (head!=null) {
                        res[bottom][i] = head.val;
                        head = head.next;
                        // num++;
                        // System.out.println(matrix[bottom][i]);
                        // index++;
                    } else {
                        res[bottom][i] = -1;
                    }
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    if (head!=null) {
                        res[i][left] = head.val;
                        head = head.next;
                        // num++;
                        // System.out.println(matrix[i][left]);
                        // index++;
                    } else {
                        res[i][left] = -1;
                    }
                }
                left++;
            }
        }
        return res;
    }
}
