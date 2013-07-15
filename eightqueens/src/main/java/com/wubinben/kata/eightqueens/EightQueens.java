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
    //To change body of created methods use File | Settings | File Templates.
  }
}
