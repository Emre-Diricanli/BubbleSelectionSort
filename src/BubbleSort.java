public class BubbleSort {
    public void swap(int[] A, int position1, int position2) {
        int temp = A[position1];
        A[position1] = A[position2];
        A[position2] = temp;
    }

    public void bubbleSort(int[] A) {
        int n = A.length;
        for (int i = n; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                if (A[j - 1] > A[j]) {
                    swap(A, j - 1, j);
                }
            }
        }
    }
}
