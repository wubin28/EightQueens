package com.wubinben.kata.eightqueens;


import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * User: Ben
 * Date: 13-7-15
 * Time: 下午9:05
 */
public class DesignTest {

  @Test
  public void testElementIndexOfArrayIsRowNumberOfQueen() {
    List<int[]> solutions = EightQueens.getSolutions(4);
    assertEquals("failure - element index of array is not the row number of the queen", solutions.get(0).length, 4);
  }

  @Test
  public void testElementValueOfArrayIsColumnNumberOfQueen() {

    List<int[]> solutions = EightQueens.getSolutions(4);
    int sumOfAllElementValues = 0;

    for (int columnNumber : solutions.get(0)) {
      sumOfAllElementValues += columnNumber;
    }
    assertEquals("failure - element value of array is not the column number of the queen", sumOfAllElementValues, 6);

  }

}
