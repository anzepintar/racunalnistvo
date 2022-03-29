public class Show {
  public static void main(String[] args) {

    var sum = new Sum("9+5");

    sum.display();
  }
}

class Sum {

  private String text;

  Sum(String text) {
    this.text = text;
  }

  public void display() {
    String num1 = "";
    String num2 = "";

    boolean check = true;
    for (char ch : this.text.toCharArray()) {
      if (check) {
        if (ch != '+') {
          num1 += ch;
        } else {
          check = false;
        }
      } else {
        num2 += ch;
      }
    }
    System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));
  }
}