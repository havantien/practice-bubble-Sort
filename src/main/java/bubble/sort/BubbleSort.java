package bubble.sort;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter list size:");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.println("enter" + list.length + "values");
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        System.out.println("your input list:");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        BubbleSortByStep(list);
    }
        public static void BubbleSortByStep(int[] list){
            boolean neddNextPass = true;
            for (int k = 1; k < list.length; k++) {
                neddNextPass = false;
                for (int i = 0; i < list.length - k; i++) {
                    if ( list[i] > list[i+1]){
                        System.out.println("Swap" + list[i] + "with" + list[i+1]);
                        int temp = list[i];
                        list[i] = list[i+1];
                        list[i+1] = temp;

                        neddNextPass = true;
                    }
                }
                if (neddNextPass = false) {
                    System.out.println("Array may be sotred and next pass not needed");
                    break;
                }
                System.out.println("list after the " + k + "sort:");
                for(int j = 0; j < list.length; j++){
                    System.out.println(list[j] + "\t");
                }
                System.out.println();
            }

        }
}
