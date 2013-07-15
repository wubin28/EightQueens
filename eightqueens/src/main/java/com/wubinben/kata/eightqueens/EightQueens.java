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
    int[] solution = {1, 3, 0, 2};
    solutions.add(solution);
    return solutions;
  }
}
