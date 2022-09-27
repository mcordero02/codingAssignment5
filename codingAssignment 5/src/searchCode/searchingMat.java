package searchCode;

public class searchingMat {
	public static void main(String[] args) {
		int[][] searchIndex = { {1,  2, 3, 4},
		        {5,  6, 7, 8},
		        {9, 10,11,12}};
		
		MatrixSearch(searchIndex, 4, 29);
	}
	
	static int[] MatrixSearch(int[][] arr, int key, int i){
		// this is the function you should compplete
		System.out.print(arr[1][0]); //arr[1][0] is 5
		System.out.print(MatrixSearch(arr, 5, i));
		
		return 1;
		
	
	}

}
