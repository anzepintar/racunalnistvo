package obcan;

public class StudentFRI extends Student {
  private String baza;
  private String dostop;
  public StudentFRI(String emso, String naslov, String studentID, String fakulteta, String baza, String dostop){
    super(emso, naslov, studentID, fakulteta);
    this.baza = baza;
    this.dostop = dostop;
  }
}
