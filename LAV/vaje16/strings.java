package vaje16;

public class strings{
  public static void main(String[] args){
    String sa = "Test test";
    String sb = "Test test";
    
    System.out.println(sa.toLowerCase().charAt(0));
    System.out.println(sa.compareTo(sb));
    System.out.println(sa == sb);


    // StringBuffer se lahko spreminja
    StringBuffer stb = new StringBuffer("Test tests test");

    System.out.println(stb);
  }
}