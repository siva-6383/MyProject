package Teleapps;

public class binary {
	public static void main(String [] args) {
		// TODO Auto-generated method stub
		int data[]= {12,24,25,26,27,28};
		int key=26;
    public static  int binarysearch(int[] data, int key){ 
		int start=0;
		int last=data.length-1;
		int mid;
		while(start<=last) {
			mid=(start+last)/2;
			if(key==data[mid]) {
				
				if(key<data[mid]) {
					last=mid-1;
				}
				
				else  {
					start=mid+1;
				}
			}
			return-1;
		
		}

	
		

	}

}
}
