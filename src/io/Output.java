package io;

import calculator.GradeCalculator;
import schoolStuff.Course;
import schoolStuff.CourseList;

/**
 * This class prints all course grades of the given course list of a student
 * @author Reizwan Chowdhury
 */
public final class Output {

  /**
   * Prints all the course grades in cl
   * @param cl is a CourseList object with courses
   */
  public static void printCourseGrades(CourseList cl) {
    for(Course c : cl) {
      System.out.println(c.getCourseCode() + " mark: " + 
          GradeCalculator.calculateCourseMark(c));
    }
  }
}
