package l14sorting;

import java.util.Arrays;

public class FindMax {
	public int findMin(int[] list) {
		int min=list[0];
		for (int i = 1; i < list.length; i++) {
			if(list[i]<min){
				min=list[i];
			}
		}
		return min;
	}
	public int findMinArg(int[] list,int start) {
		int minArg=start;
		for (int i = start+1; i < list.length; i++) {
			if(list[i]<list[minArg]){
				minArg=i;
			}
		}
		return minArg;
	}
	//assume list is of size 2 or more 
	public int find2Max(int[] list) {
		int max=list[0];
		int max2=list[1];
		if(max2>max) {
			int temp=max;
			max=max2;
			max2=temp;
		}
		for (int i = 2; i < list.length; i++) {
			if(list[i]>max) {
				max2=max;
				max=list[i];
			}
			else {
				if(list[i]>max2) {
					max2=list[i];
				}
			}
		}
		return max2;
	}
	private void swap(int i,int j,int[] list) {
		int temp=list[i];
		list[i]=list[j];
		list[j]=temp;
	}
	
	
	public void selectionSort(int[] list) {
		for (int i = 0; i < list.length; i++) {
			int arg=findMinArg(list,i);
			swap(arg,i,list);
		}
		
	}
	public void insertSort(int[] list) {
		for (int i = 1; i < list.length; i++) {
			int j=i;
			while(j>0&&list[j-1]>list[j] ){
				swap(j,j-1,list);
				j--;
			}
		}
	}
	public static void main(String[] args) {
		int[] list= {1000,789,42,9989,7000,8,10};
		FindMax find=new FindMax();
		find.insertSort(list);
		System.out.println(Arrays.toString(list));
		System.out.println(find.find2Max(list));
	}
}
	

