package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void hasDuplicates_test1() {
		
		int[] arr = {1,2,3,4,5};
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));
		
	}
	@Test
	public void hasDuplicates_test2() {
		
		int[] arr = {1,1,3,4,5};
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasDuplicates(arr));
		
	}
	@Test
	public void hasDuplicates_test3() {
		
		int[] arr = {1,3,4,5,1};
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasDuplicates(arr));
		
	}
	@Test
	public void hasDuplicates_test4() {
		
		int[] arr = null;
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));
		
	}
	@Test
	public void hasDuplicates_test5() {
		
		int[] arr = {4,7,7,2};
		LatinSquare lq = new LatinSquare();
		
		assertArrayEquals(arr, new int[] {4,7,7,2});
		
	}
	@Test
	public void doesElementExist_Test1() {
		int[] arr = {1,3,4,5,1};
		int iValue = 3;
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.doesElementExist(arr,iValue));
	}
	@Test
	public void doesElementExist_Test2() {
		int[] arr = {1,3,4,5,1};
		int iValue = 6;
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.doesElementExist(arr,iValue));
	}
	@Test
	public void doesElementExist_Test3() {
		int[] arr = null;
		int iValue = 6;
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.doesElementExist(arr,iValue));
	}
	@Test
	public void hasAllValues_Test1() {
		int[] arr1 = {1,3,5};
		int[] arr2 = {3,1,5};
		
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasAllValues(arr1,arr2));
	}
	@Test
	public void hasAllValues_Test2() {
		int[] arr1 = {1,3,4};
		int[] arr2 = {3,1,5};
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasAllValues(arr1,arr2));
	}
	@Test
	public void hasAllValues_Test3() {
		int[] arr1 = null;
		int[] arr2 = null;
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasAllValues(arr1,arr2));
	}
	@Test
	public void getRow_Test1() {
		
		int[][] testLatinSquare = {{1,2,3},{2,3,1},{3,1,2}};
		
		LatinSquare lq = new LatinSquare(testLatinSquare);
		
		assertArrayEquals(lq.getRow(0), new int[] {1,2,3});
		
	}
	@Test
	public void getRow_Test2() {
		
		int[][] testLatinSquare = {{4,2,3},{2,8,1},{3,1,2}};
		
		LatinSquare lq = new LatinSquare(testLatinSquare);
		
		assertArrayEquals(lq.getRow(1), new int[] {2,8,1});
		
	}
	@Test
	public void getColumn_Test1() {
		
		int[][] testLatinSquare = {{1,2,3},{5,3,1},{3,1,2}};
		
		LatinSquare lq = new LatinSquare(testLatinSquare);
		
		assertArrayEquals(lq.getColumn(0), new int[] {1,5,3});
		
	}
	@Test
	public void getColumn_Test2() {
		
		int[][] testLatinSquare = {{1,2,3},{2,3,1},{3,1,2}};
		
		LatinSquare lq = new LatinSquare(testLatinSquare);
		
		assertArrayEquals(lq.getRow(2), new int[] {3,1,2});
		
	}
	@Test
	public void isLatinSquare_Test1() {
		
		int[][] testLatinSquare = {{1,2,3},{2,3,1},{3,1,2}};
		
		LatinSquare lq = new LatinSquare(testLatinSquare);
		
		assertTrue(lq.isLatinSquare());
		
	}
	@Test
	public void isLatinSquare_Test2() {
		
		int[][] testLatinSquare = {{1,2,3},{2,3,1},{3,5,2}};
		
		LatinSquare lq = new LatinSquare(testLatinSquare);
		
		assertFalse(lq.isLatinSquare());
		
	}
	@Test
	public void containsZero_Test1() {
		
		int[][] testLatinSquare = {{1,2,3},{2,3,1},{3,5,2}};
		
		LatinSquare lq = new LatinSquare(testLatinSquare);
		
		assertFalse(lq.containsZero());
	}
	@Test
	public void containsZero_Test2() {
		
		int[][] testLatinSquare = {{1,2,3},{0,3,1},{3,5,2}};
		
		LatinSquare lq = new LatinSquare(testLatinSquare);
		
		assertTrue(lq.containsZero());
	}
	@Test
	public void containsZero_Test3() {
		
		int[][] testLatinSquare = new int[3][3];
		
		LatinSquare lq = new LatinSquare(testLatinSquare);
		
		assertTrue(lq.containsZero());
	}
	
}
