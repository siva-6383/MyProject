package Teleapps;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= " teleappps is the  growing company in the it field if the many branches";
		String[] str1=str.split("the");
		 int count=0;
		
		for(int i=1;i<str1.length;i++) {
			
						 count++;		}
		
                 System.out.println(count);
	}

}
