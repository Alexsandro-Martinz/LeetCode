package problems.easy.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import problems.easy.solutions.SumTwo;

class TestSumTwo {

	@Test
	void test1() {
		int target = 9;
		int[] nums = { 2, 7, 11, 15 };
		int[] expected = { 0, 1 };
		int[] output = SumTwo.sumTwo(nums, target);

		Arrays.sort(expected);
		Arrays.sort(output);
		assertArrayEquals(expected, output);
	}
	
	@Test
	void test2() {
		int target = 6;
		int[] nums = { 3, 2, 4};
		int[] expected = { 1, 2 };
		int[] output = SumTwo.sumTwo(nums, target);

		Arrays.sort(expected);
		Arrays.sort(output);
		assertArrayEquals(expected, output);
	}
	
	@Test
	void test3() {
		int target = 6;
		int[] nums = { 3, 3 };
		int[] expected = { 0, 1 };
		int[] output = SumTwo.sumTwo(nums, target);

		Arrays.sort(expected);
		Arrays.sort(output);
		assertArrayEquals(expected, output);
	}

}
