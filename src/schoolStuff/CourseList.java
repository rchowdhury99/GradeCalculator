package schoolStuff;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * A CourseList object has a list of Courses
 * @author Reizwan Chowdhury
 */
public class CourseList implements Iterable<Course>{
  private static ArrayList<Course> courseList = new ArrayList<Course>();

  public void addCourse(Course course) {
    courseList.add(course);
  }

  @Override
  public Iterator<Course> iterator() {
    return courseList.iterator();
  }
}
