import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter the number of array elements.");

        Scanner sc = new Scanner(System.in);
        BubbleSort b = new BubbleSort();
        SelectionSort s = new SelectionSort();
        Random r = new Random();

        long start, end, time;
        int loop = 0;
        int input = sc.nextInt();
        sc.nextLine();

        System.out.println("Press 1 for bubble sort, 2 for selection sort");
        int in = sc.nextInt();
        while (loop < 4){
            switch (in) {
                case 1:
                    start = System.nanoTime();
                    for (int counter = 0; counter <= 1000; counter++) {
                        int[] a = new int[input];
                        for (int i = 0; i < a.length; i++) {
                            a[i] = r.nextInt(50000);
                        }
                        b.bubbleSort(a);
                    }
                    end = System.nanoTime();
                    time = end - start;
                    System.out.println("\n" + "Execution time is: " + time + " nanoseconds");
                    break;
                case 2:
                    start = System.nanoTime();
                    for (int counter = 0; counter <= 1000; counter++) {
                        int[] a = new int[input];
                        for (int i = 0; i < a.length; i++) {
                            a[i] = r.nextInt(50000);
                        }
                        s.selectionSort(a);
                    }
                    end = System.nanoTime();
                    time = end - start;
                    System.out.println("\n" + "Execution time is: " + time + " nanoseconds");
                    break;
            }
            loop++;
        }
    }
}