/*
 * Nathaniel Burnish
 * 9/10/2018
 * Repeat an existing array a number of times into a new array
 * RepeatArray.Java
 */
public class RepeatArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = repeat(a, 1);
		printArray(b);

	}
	public static int[] repeat(int[] array, int factor) {
		if (factor <= 0) {
			int empty[] = {};
			return empty;
		}
		int tmp = 0;
		int k = 0;
		int length = array.length * factor;
		int arrayRepeat[] = new int[length];
		for (int i = 0; i < length; i++) {
			if (k >= array.length)
				k = 0;

			tmp = array[k];
			arrayRepeat[i] = tmp;
			k++;
		}

		return arrayRepeat;
	}

	public static void printArray(int[] array) {
		System.out.print("The array is ---> {");

		for (int i = 0; i < array.length; i++)
			System.out.print(" " + array[i] + " ");
		System.out.println("}");
	}

}
