package driver;

import java.io.IOException;
import java.util.Scanner;
import io.InputParser;
import io.Output;
import schoolStuff.CourseList;

/**
 * The driver class that has the main method
 * @author Reizwan Chowdhury
 *
 */
public class GradeCalculatorDriver {

  public static void main(String[] args) throws IOException {
    String fileName;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter name of file: ");
    fileName = sc.nextLine();
    sc.close();
    System.out.println();

    CourseList cl = new CourseList();
    InputParser.initiateInputParser(fileName);
    InputParser.setUpCourseList(cl);
    InputParser.closeInputParser();
    Output.printCourseGrades(cl);
  }

}
