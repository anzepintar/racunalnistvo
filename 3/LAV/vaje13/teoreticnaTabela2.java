package vaje13;
//Kaj izpiše program

public class teoreticnaTabela2 {
  public static void main(String[] args) {
    int a[] = { 1, 2, 3, 4, 3 };
    int b[][] = { { 1, 2, 4 }, { 2, 2, 1 }, { 0, 43, 2 } };
    System.out.print(a[3] == b[0][2]);
    System.out.print(" " + (a[4] == b[2][1])+ "\n");
  }

}
