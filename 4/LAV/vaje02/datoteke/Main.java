package vaje02.datoteke;

import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    FileReader dat_obj = new FileReader(".\\datoteka.txt\\");
    BufferedReader datoteka = new BufferedReader(dat_obj);
    String a = datoteka.readLine();


    
    FileWriter dat = new FileWriter("4\\LAV\\vaje02\\datoteke\\datoteka.txt");
    PrintWriter datoteka1 = new PrintWriter(dat);
    datoteka1.println("aaaaaaaaaaa\naaaaaaaaaaaaaaa\naaaaaaaaaaa");
    datoteka1.println(a);
    datoteka1.close();

    while (datoteka.ready()) {
      System.out.println(datoteka.readLine());
    }
    datoteka.close();
  }

}
