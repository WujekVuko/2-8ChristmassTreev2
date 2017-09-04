package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {


	Scanner in = new Scanner(System.in);

	System.out.println("podaj wysokość choinki: ");
	int a = in.nextInt();
	for(int i = 0; i++ < a;){
	    for(int j =0; j < a - i; j++){
	        System.out.print(" ");
        }
        for(int k = 1; k < i * 2; k++){
	        System.out.print("*");
        }
        System.out.println();
    }
    }
}
