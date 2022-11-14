package Practise;

import java.util.Arrays;

public class Arraysorting {
 
	public static void main(String[] args) {
	int arr[]= {65432};
int length =arr.length;
for(int i=0; i<length-1; i++) {
	for(int j=0; j<length-1; j++) {
		int tempt =arr[j];
		
		
		if(arr[j]>arr[j+1]){
			tempt =arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=tempt;
		}
	}
	}
//System.out.println("array sorting "+arr);
System.out.print("array after sorting" + Arrays.toString(arr));

}
}