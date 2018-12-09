package schoolStuff;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * A Course object has a list of Assignment objects
 * @author Reizwan Chowdhury
 */
public class Course implements Iterable<Assignment>{
  
  private String courseCode;
  private ArrayList<Assignment> work;
  
  public Course(String courseCode) {
    this.courseCode = courseCode;
    this.work = new ArrayList<Assignment>();
  }
  
  public String getCourseCode() {
    return this.courseCode;
  }
  
  public void addAssignment(Assignment assignment) {
    this.work.add(assignment);
  }
  
  public ArrayList<Assignment> getWork(){
    return this.work;
  }

  @Override
  public Iterator<Assignment> iterator() {
    return this.work.iterator();
  }
  
}
