package com.mxk1;

import java.util.Arrays;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {5,4,6,3,2};
		function1(arr);
		System.out.println(Arrays.toString(arr));
	}
	/**
	 * function1：实现冒泡排序
	 */
	public static void function1(int [] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=arr.length-1;j>=i+1;j--) {
				if(arr[j-1]>arr[j])
					swap(arr,j-1,j);
			}
		}
	}
	/**
	 *function2实现简单选择排序
	 */
	
	
	/**
	 * swap:交换方法
	 */
	public static  void swap(int [] arr,int a,int b) {
		int temp=arr[b];
		arr[b]=arr[a];
		arr[a]=temp;
	}
	
	

}
