import java.util.Arrays;
//SUJAL YADAV E21CSEU0636
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {2,5,3,2,6};
		bubbleSort(arr);

	}
	static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        System.out.println(Arrays.toString(arr));
    }
	

}