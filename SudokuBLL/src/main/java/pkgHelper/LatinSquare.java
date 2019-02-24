package pkgHelper;

import java.util.Arrays;

public class LatinSquare {

	private int[][] LatinSquare;
	
	public LatinSquare() {
		
	}
	
	public LatinSquare(int[][] latinSquare) {
		super();
		LatinSquare = latinSquare;
	}

	public int[][] getLatinSquare() {
		return LatinSquare;
	}

	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	}
	
	public boolean hasDuplicates(int [] arr) {
		
		boolean hasDuplicates = false;
		
		if(arr == null)
			return false;
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				hasDuplicates = true;
				break;
			}
		}
		
		return hasDuplicates;
		
	}
	
	public boolean doesElementExist(int[] arr, int iValue) {
		boolean doesElementExist = false;
		
		if(arr == null) return false;
		
		for(int i: arr) {
			if(i == iValue) { 
				doesElementExist = true;
				break;
			}
		}
		
		return doesElementExist;
	}
	
	public boolean hasAllValues(int[] arr1, int[] arr2) {
		boolean hasAllValues = true;
		if(arr1 == null || arr2 == null) return false;
		
		int val;
		
		for(int i = 0; i < arr1.length; i++) {
			val = arr1[i];
			if(doesElementExist(arr2, val) == false) return false;
		}
		
		return hasAllValues;
	}
	
	public int[] getColumn(int val) {
		int[][] LS = getLatinSquare();
		int[] Column = new int[LS.length];
		
		for(int i = 0; i < Column.length; i++) {
			Column[i] = LatinSquare[i][val];
		}
		
		return Column;
	}
	public int[] getRow(int val) {
		int[][] LS = getLatinSquare();
		int[] Row = new int[LS[val].length];
		
		for(int i = 0; i < Row.length; i++) {
			Row[i] = LatinSquare[val][i];
		}
		
		return Row;
	}
	public boolean isLatinSquare() {
		boolean isLatinSquare = false;
		
		int[][] LS = getLatinSquare();
		
		//check for duplicates
		for(int i = 0; i < LS.length; i++) {
			if(hasDuplicates(getRow(i)) == true) return false;
			if(hasDuplicates(getColumn(i)) == true) return false;
		}
		
		int[] firstRow = getRow(0);
		
		for(int i = 0; i < LS[0].length; i++) {
			if(hasAllValues(firstRow, getRow(i)) == false) return false;
		}
		
		isLatinSquare = true;
		
		return isLatinSquare;
	}
	public boolean CointainsZero() {
		
		boolean ContainsZero = false;
		
		return ContainsZero;
		
	}
	
}
