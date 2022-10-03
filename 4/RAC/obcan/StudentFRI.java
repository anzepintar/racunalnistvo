package obcan;

public class StudentFRI extends Student {
  private String baza;
  public String getBaza() {
    return baza;
  }
  public void setBaza(String baza) {
    this.baza = baza;
  }
  private String dostop;
  public String getDostop() {
    return dostop;
  }
  public void setDostop(String dostop) {
    this.dostop = dostop;
  }
  public StudentFRI(String emso, String naslov, String studentID, String fakulteta, String baza, String dostop){
    super(emso, naslov, studentID, fakulteta);
    this.baza = baza;
    this.dostop = dostop;
  }
}
