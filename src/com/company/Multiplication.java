package com.company;
import java.util.Scanner;
public class Multiplication {

    public static void main(String[] args) {
        System.out.println("please enter the no. of rows for matrix 1");
        Scanner read= new Scanner (System.in);
        int x= read.nextInt();
        System.out.println("please enter the no. of col for matrix 1");

        int y= read.nextInt();
        System.out.println("please enter the no. of rows for matrix 2");

        int a= read.nextInt();
        if(y !=a){
            System.out.println("No of col. in mat1 must be equal no. of rows in mat2 please try again");
        }else{

        System.out.println("please enter the no. of col for matrix 2");

        int b= read.nextInt();

        int [][] Matrix1=new int [x][y];
        for(int i=0 ; i<x;i++){
            for(int j=0;j<y ; j++){
                System.out.println("enter the no. in row " +(i+1)+ "  col "+(j+1) +" for matrix 1");
                Matrix1 [i][j]  =read.nextInt();
            }
        }
        int [][] Matrix2=new int [x][y];
        for(int i=0 ; i<a;i++){
            for(int j=0;j<b ; j++){
                System.out.println("enter the no. in row " +(i+1)+ "  col "+(j+1)+" for matrix 2");
                Matrix2[i][j]  =read.nextInt();
            }
        }
        int [][] Result=new int [x][b];
        for(int i=0 ; i<x;i++){
            for(int j=0;j<b; j++) {
                for(int k=0 ; k<y ; k++){
                Result [i][j]+=   Matrix1[i][k] * Matrix2[k][j];}


            }}


        for(int i=0 ; i<x;i++){
            for(int j=0;j<b; j++){

        System.out.print(Result [i][j]);

                System.out.print(" ");

    }
            System.out.println();
        }
    }}
}
