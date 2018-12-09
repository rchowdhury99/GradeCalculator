package schoolStuff;

/**
 * An Assignment object has a weight, a student mark (what the student got on
 * it), and a total mark (total possible mark a student can earn on it)
 * @author Reizwan Chowdhury
 */
public class Assignment {

  // eg. .04
  private double assignmentWeight;
  // eg. 9
  private double studentMark;
  // eg. 10
  private double totalMark;

  /**
   * Constructor for an Assignment Object
   * @param weight
   * @param mark
   */
  public Assignment(double weight, String mark) {
    this.assignmentWeight = weight;
    // splits mark into two elements: a student mark and a total mark
    String[] markArr = mark.split("/");
    // this assignment has a mark (it's graded)
    if(markArr.length == 2) {
      this.studentMark = Double.parseDouble(markArr[0]);
      this.totalMark = Double.parseDouble(markArr[1]);
    }
    // else the assignment doesn't have a mark (it's not graded)
    else {
      this.studentMark = -1;
      this.totalMark = -1;
    }
  }

  /**
   * The weight of this Assignment object
   * @return the weight
   */
  public double getWeight() {
    return this.assignmentWeight;
  }

  /**
   * The student's mark on this Assignment
   * @return the student's mark
   */
  public double getStudentMark() {
    return this.studentMark;
  }

  /**
   * The total mark of this Assignment object
   * @return the total mark
   */
  public double getTotalMark() {
    return this.totalMark;
  }
}
