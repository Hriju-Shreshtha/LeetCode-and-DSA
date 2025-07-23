class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    //     for(int i=0; i<n;i++){
    //         nums1[m+i]= nums2[i];
    //     }

    //     for(int i=0;i<nums1.length-1;i++){
    //         for(int j=i+1;j>0;j--){
    //              if (nums1[j] < nums1[j-1]) {
    //                 swap(nums1, j, j-1);
    //             } else {
    //                 break;
    //             }
    //         }
    //     }
    // }


    // public void swap(int [] num, int a, int b){
    //     int temp = num[a];
    //     num[a]= num[b];
    //     num[b]= temp;
    // }

    int mix[] =new int [m+n];
    int i=0;
    int j=0;
    int k=0;

    while(i<m && j<n){
        if(nums1[i]<nums2[j]){
            mix[k]=nums1[i];
            i++;k++;
        }
        else{
            mix[k]=nums2[j];
            k++; j++;
        }
    }
    while(i<m){
        mix[k]=nums1[i];
        i++; k++;
    }
    while (j<n){
        mix[k]=nums2[j];
        j++; k++;
    }

    for(int l=0;l<nums1.length;l++){
        nums1[l]=mix[l];
    }
    }
}