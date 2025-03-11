class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int [] row : image){
            reverseArray(row);
            for (int i =0;i<row.length;i++){
                if (row[i]==1){
                    row[i] = 0;
                }
                else row[i] =1;
            }
        }
        return image;
    }

    public int [] reverseArray(int [] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }
        return arr;
    }
}