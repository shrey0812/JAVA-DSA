package problems;

import java.util.Scanner;

public class SpiralFormMatrix {

    public void spiralPrint(int[][] arr, int r , int c){
        int i; int k=0;int l=0;
        while(k<r&&l<c){
            for(i =l;i<c;i++){
            System.out.print(arr[k][i]+" ");
            }
            k++;
            for (i = k; i < c; i++) {
            System.out.print(arr[i][c-1]+" ");
            }
            c--;
            if(k<r){
                for ( i =c-1; i >=l; i--) {
                System.out.print(arr[i][c-1]+" ");
            }
            r--;
            }
            if(l<c){
                for (i = r-1; i>=k; i--) {
                System.out.print(arr[r-1][k]+" ");
            }
            l++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of matrix");
        int n = sc.nextInt();
        int arr[][]= new int[n][n];
        System.out.println("Enter components of matrix");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        sc.close();
    }
}
