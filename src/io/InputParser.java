package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import schoolStuff.Assignment;
import schoolStuff.Course;
import schoolStuff.CourseList;

/**
 * The InputParser class represents a class that parses through a given input
 * file
 * @author Reizwan Chowdhury
 *
 */
public final class InputParser {

  private static FileInputStream fStream;
  private static BufferedReader br;


  /**
   * A factory method that initiates (instantiates the file input stream and
   * the buffered reader
   * @param fileName
   * @throws FileNotFoundException
   */
  public static void initiateInputParser(String fileName) 
      throws FileNotFoundException {
    fStream = new FileInputStream(fileName);
    br = new BufferedReader(new InputStreamReader(fStream));
  }

  /**
   * Sets up and returns a Course object with assignments and grades
   * @return a Course object
   * @throws IOException
   */
  public static Course setUpCourse(String courseName) throws IOException {
    Course course = new Course(courseName);

    String line = br.readLine();
    while(line != null && !line.equals("")) {
      String[] assignmentInfo = line.split(" ");
      double weight = 
          InputParser.getAssignmentWeightFromLine(assignmentInfo[0]);
      course.addAssignment(new Assignment(weight, assignmentInfo[1]));

      line = br.readLine();
    }
    return course;
  }

  /**
   * Returns the weight of an assignment
   * @param line represents the string with the assignment weight
   * @return the assignment weight
   */
  public static double getAssignmentWeightFromLine(String line) {
    int indexOfLeftParanthesis = line.indexOf("(");
    int indexOfRightParanthesis = line.indexOf(")");
    String weight = line.substring(indexOfLeftParanthesis + 1,
        indexOfRightParanthesis);
    return Double.parseDouble(weight);
  }

  /**
   * Fills in the given CourseList object and returns it
   * @param cl the CourseList object that will append courses
   * @return a reference to a filled in CourseList object
   * @throws IOException
   */
  public static CourseList setUpCourseList(CourseList cl) throws IOException {
    String courseName;
    while((courseName = br.readLine()) != null) {
      cl.addCourse(InputParser.setUpCourse(courseName));
    }
    return cl;
  }

  /**
   * Closes the input file stream
   * @throws IOException
   */
  public static void closeInputParser() throws IOException {
    fStream.close();
  }
}
