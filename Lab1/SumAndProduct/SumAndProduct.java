//Created by Sai Rohith on 2021-06-28
//Copyright © 2021 Sai Rohith. All rights reserved.
//Sum and Product
package Lab1.SumAndProduct;
import java.util.*;
public class SumAndProduct{
    public static void main(String args[]) {
        System.out.println("Sai Rohith T - 190953059");
        int i, j, r1, c1, r2, c2, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimensions of arr1");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        System.out.println("Enter dimensions of arr2");
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        
        int arr1[][] = new int[r1][c1];
        int arr2[][] = new int[r2][c2];
        int sum[][] = new int[r1][c1];
        int mul[][] = new int[r1][c2];
        System.out.println("Enter elements of 1st matrix: ");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of 2nd matrix: ");
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        if (r1 == r2 && c1 == c2) {
            System.out.println("Sum: ");
            for (i = 0; i < r1; i++) {
                for (j = 0; j < c1; j++) {
                    sum[i][j] = arr1[i][j] + arr2[i][j];
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
        }
        else
            System.out.println("Enter same dimensions matrix for sum");
        
        
        if (c1 == r2){
            System.out.println("Product: ");
            for(i = 0; i < r1; i++){
                for(j = 0; j < c2; j++){
                    for(k = 0; k < r2; k++){
                        mul[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }
            for(i = 0; i < r1; i++){
                for(j = 0; j < r2; j++)
                    System.out.print(mul[i][j] + " ");
                System.out.println();
            }
        }
        else
            System.out.println("Enter correct dimensions for matrix multiplication");
    }
}