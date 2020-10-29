package ru.geekbrains.java23102020.lessontwo.homework;

import java.util.Arrays;

public class HomeworkTwo {
    public static void main(String[] args) {
//        task 1
        {
            int[] arr = {1, 0, 1, 1, 0, 1};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) arr[i]=1;
                else arr[i]=0;
            }
            System.out.println(Arrays.toString(arr));
        }
//        task 2
        {
            int[] arr = new int[8];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i]=index;
                index+=3;
            }
            System.out.println(Arrays.toString(arr));
        }
//        task 3
        {
            int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr.length; i++) {
                if ((arr[i])<6) arr[i]*=2;
            }
            System.out.println(Arrays.toString(arr));
        }
//        task 4
        {
            int[][] arr = new int[5][5];
            for (int i = 0; i < 5; i++) {
                for (int j = 0, k = arr[i].length; j < arr[i].length; j++, k--) {
                    if (i==j || i == (k - 1)) arr[i][j]=1;
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
//        task 5
        {
            int[] arr = {13, 8, -456, 65416, 0, 258};
            int max=arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i]>max) max=arr[i];
            }
            int min=arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i]<min) min=arr[i];
            }
            System.out.println(max);
            System.out.println(min);
        }
//        task 6
        int[] arr = {6, -12, 144, 76, 90234, -4564, 567, 0};
        System.out.println(parity(arr));

    }
    public static boolean parity(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int left = 0, right = 0;

        for (int i:arr) {
            right += i;
        }
        for (int i = 0; i < arr.length; i++) {
            if (right == left) {
                return true;
            }
            left+=arr[i];
            right-=arr[i];
        }
        return false;
    }
}
