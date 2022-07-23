package com.dsa.sorting;

public class MergeTwoShortedArray 
{
	public static void main(String[] args) {
		int arr1[]= {1,3,5,7,9};
		int arr2[]= {1,2,3,4,5,6,7,8,9};
		int mergeArr[]=new int[arr1.length+arr2.length];
		int idxArr1=0;
		int idxArr2=0;

		for (int i = 0; i < mergeArr.length; i++) {
			if(idxArr1<arr1.length && idxArr2<arr2.length) {
				if(arr1[idxArr1]<arr2[idxArr2]) {
					mergeArr[i]=arr1[idxArr1];
					idxArr1++;
				}else {
					mergeArr[i]=arr2[idxArr2];
					idxArr2++;	
				}
			}else if(idxArr1<arr1.length) {
				mergeArr[i]=arr1[idxArr1];
				idxArr1++;
			}else {
				mergeArr[i]=arr2[idxArr2];
				idxArr2++;	
			}
		}
		
		for (int i : mergeArr) {
			System.out.print(i+" ");
		}



	}
}
