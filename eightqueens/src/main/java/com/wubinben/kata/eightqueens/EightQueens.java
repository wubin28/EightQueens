package com.wubinben.kata.eightqueens;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Ben
 * Date: 13-7-15
 * Time: 下午9:45
 */
public class EightQueens {

  public static List<int[]> getSolutions(int numberOfQueens) {
    List<int[]> solutions = new ArrayList<int[]>();
    enumerate(numberOfQueens, solutions);
    return solutions;
  }

  private static void enumerate(int numberOfQueens, List<int[]> solutions) {
    int[] array = new int[numberOfQueens];
    enumerate(array, 0, solutions);
  }

  private static void enumerate(int[] array, int rowNumber, List<int[]> solutions) {
    int ARRAY_LENGTH = array.length;
    if (isLastQueenLocatedProperly(rowNumber, ARRAY_LENGTH)) {
      solutions.add(array.clone());
    } else {
      for (int i = 0; i < ARRAY_LENGTH; i++) {
        putQueenOnRowNumberToAColumnNumber(array, rowNumber, i);
        if (isConsistent(array, rowNumber)) enumerate(array, rowNumber + 1, solutions);
      }
    }
  }

  /**
   * Return true if queen placement array[rowNumber] does not conflict with
   * other queens array[0] through array[rowNumber-1]
   */
  private static boolean isConsistent(int[] array, int rowNumber) {
    for (int i = 0; i < rowNumber; i++) {
      if (array[i] == array[rowNumber])             return false;   // same column
      if ((array[i] - array[rowNumber]) == (rowNumber - i)) return false;   // same major diagonal
      if ((array[rowNumber] - array[i]) == (rowNumber - i)) return false;   // same minor diagonal
    }
    return true;
  }

  private static void putQueenOnRowNumberToAColumnNumber(int[] array, int rowNumber, int i) {
    array[rowNumber] = i;
  }

  private static boolean isLastQueenLocatedProperly(int rowNumber, int ARRAY_LENGTH) {
    return rowNumber == ARRAY_LENGTH;
  }

}
