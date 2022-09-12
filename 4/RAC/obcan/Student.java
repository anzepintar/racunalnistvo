package obcan;

public class Student extends Obcan {
  private String studentID;
  private String fakulteta;

  public Student(String emso, String naslov, String studentID, String fakulteta) {
    super(emso, naslov);
    this.studentID = studentID;
    this.fakulteta = fakulteta;
  }

  public void izpis() {
    super.izpis();
    System.out.println("Študentski ID: " + studentID + "\nFakulteta: " + fakulteta);
  }

}
