public class SelectionSort {
    public void selectionSort(int[] B){
        int n = B.length;
        int iMin;
        for(int i = 0; i < n-1; i++){
            iMin = i;
            for(int j = i+1; j < n; j++){
                if(B[j] < B[iMin]){
                    iMin = j;
                }
            }
            int temp = B[iMin];
            B[iMin] = B[i];
            B[i] = temp;
        }
    }
}
