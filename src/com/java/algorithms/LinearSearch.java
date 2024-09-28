package com.java.algorithms;

public class LinearSearch {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	int arr[] = { 22, 35, 48, 100, 45 };
	int x = 100;

	// Function call
	int result = search(arr, arr.length, x);
	if (result == -1)
	    System.out.print("Element is not present in array");
	else
	    System.out.print("Element is present at index " + result);

    }

    public static int search(int arr[], int N, int x) {
	for (int i = 0; i < N; i++) {
	    if (arr[i] == x)
		return i;
	}
	return -1;
    }

}
