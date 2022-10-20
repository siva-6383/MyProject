package Teleapps;

class Sample {
	public Sample(int arr[], int l, int r) {
		if (l < r) {

			int m = l + (r - l) / 2;

			new Sample(arr, l, m);
			new Sample(arr, m + 1, r);

			merge(arr, l, m, r);
		}

		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	void merge(int arr[], int l, int m, int r) {

		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		int i = 0, j = 0;

		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
}

public class MergeSort extends Sample {

	MergeSort(int arr[], int l, int len) {
		super(arr, l, len);
	}

	public static void main(String[] args) {

		int arr[] = { 15, 80, 30, 11, 24, 2 };
		int n = arr.length - 1;
		MergeSort m = new MergeSort(arr, 0, n);
				
	}
}
