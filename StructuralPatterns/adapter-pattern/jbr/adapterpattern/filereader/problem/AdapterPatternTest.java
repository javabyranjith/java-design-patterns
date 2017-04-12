package jbr.adapterpattern.filereader.problem;

import jbr.adapterpattern.problem.FileReader;

public class AdapterPatternTest {
  public static void main(String[] args) {

    FileReader fileReader = new FileReaderImpl();
    fileReader.readFile(".txt");

    System.out.println("\n");
    fileReader.readFile(".pdf");

    System.out.println("\n");
    fileReader.readFile(".doc");
  }
}
