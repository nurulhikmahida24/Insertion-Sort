public class Insertion{
	public static void insertionSort(int[] array) {
		for (int i=1; i < array.length; i++){
			int temp = array[i];
			int k;
			
			for (k=i-1; k >= 0 && array[k] > temp; k--) {
				array[k+1] = array[k];
			}
			
			array[k+1] = temp;
			
		}
	}
	
	public static void main (String [] args) {
		int[] array = {0, -2, 3, 1, 4, -4, 8, -6};
		
		Insertion.insertionSort(array);
		for (int i=0; i< array.length; i++)
		{
			System.out.println("Elemen di Index " + i + " Sekarang adalah " + array[i]);
		}
	}
}