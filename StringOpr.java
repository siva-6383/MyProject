package Teleapps;

public class StringOpr {
	public static void main(String[] args) {
		String words = "Hello, this this is java program. this is very nice. ";
		String s = "this";
		int count = 0;
		
		String arr[] = words.split(" ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(s))
			{
				count++;
			}
		}
		System.out.println("Repeated words count in a given string : "+count);
	}
}
