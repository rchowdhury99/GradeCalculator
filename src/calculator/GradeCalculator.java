package calculator;

import schoolStuff.Assignment;
import schoolStuff.Course;

/**
 * A class that represents a calculator that calculates a student's course mark
 * @author Reizwan Chowdhury
 */
public final class GradeCalculator {

  /**
   * Calculates the student's mark of a given course
   * @param course is a Course object
   * @return the mark that the student received in the course
   */
  public static double calculateCourseMark(Course course) {
    double studentMark = 
        GradeCalculator.getTotalStudentMarkOnAssignment(course);
    double totalMark = GradeCalculator.getTotalMarkOnAssignment(course);

    return studentMark / totalMark;
  }

  /**
   * Returns the sum of all the marks the student earned in the given course
   * @param course is a Course object
   * @return the total mark the student received in all the assignments of the
   * course
   */
  public static double getTotalStudentMarkOnAssignment(Course course) {
    double sum = 0;
    for(Assignment a : course) {
      double studentMark = a.getStudentMark();
      if(studentMark == -1)
        studentMark = 0;
      sum += studentMark * a.getWeight();
    }
    return sum;
  }

  /**
   * Returns the sum of all the total marks in the given course
   * @param course is a Course object
   * @return the total possible mark that can be received in the given course
   */
  public static double getTotalMarkOnAssignment(Course course) {
    double sum = 0;
    for(Assignment a : course) {
      double totalMark = a.getTotalMark();
      if(totalMark == -1)
        totalMark = 0;
      sum += totalMark * a.getWeight();
    }
    return sum;
  }

}
