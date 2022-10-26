package teleapps;

import java.util.Arrays;

public class CommonNumbers {

	public static void main(String[] args) {
		int a[] = {10, 30, 20, 5, 4, 1};
		int b[] = {17, 1, 30, 2, 4, 8};
		int c[] = {10, 30, 10, 1,2, 5};
		
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				for (int k = 0; k < c.length; k++)
				{
					if(a[i] == b[j] && a[i] == c[k])
					{
						System.out.println("Common least number in 3 arrays : "+a[i]);
						System.exit(0);
					}
				}
			}


	}
	}
}

