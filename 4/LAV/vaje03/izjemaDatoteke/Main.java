package vaje03.izjemaDatoteke;

import java.io.*;

public class Main {
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader("\\dat.txt\\"));
      br.readLine();
      br.close();
    } catch (IOException a) {
      System.out.println("IOException izjema");
    }
  }
}
