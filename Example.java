package Teleapps;

import java.util.Scanner;

public class Example {
	public static void binarysearch(int a[],int first,int last,int key) {
	int	mid=(first+last)/2;
		while(first<=last) {
			if(a[mid]<key) {
				first=mid+1;
			}
			else if(a[mid]==key) {
				
				System.out.println("the element find at the index position" + " " + mid);
				break;
				
			}
			else {
				last=mid-1;
				
			}
			mid=(first+last)/2;
		}
		
		if(first>last) {
			System.out.println("the element is not found");
		}
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the arrray ");
		int s=sc.nextInt();
		int a[]=new int[s];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();			
		}
		Scanner st=new Scanner(System.in);
		System.out.println("Enter the key values:");
		int key=st.nextInt();

		
		//int a[]= {10,20,30,40,50};
		int first=0;
		int last=a.length-1;
		//int key=40;
	
		 binarysearch(a,first, last,key);
		
	
	}
}

