import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) throws IOException {

    readStreamFnc();

  }//main

  private static void readStreamFnc() throws IOException {

    Scanner scanner = new Scanner(System.in);
    try {
      printFnc pf = new printFnc();

      String line;
      for(;scanner.hasNext();) {
          line=scanner.nextLine();
          pf.printFncA(Integer.parseInt(line.toUpperCase()));
      }
    } finally {
      scanner.close();
    }

  }//readStreamFnc

}//class

class printFnc {

  void printFncA(int data) {

    BigDecimal outNum = new BigDecimal("0");

    if (data % 2 != 0) {
      BigDecimal baseNum = new BigDecimal("1999999");
      BigDecimal towNum = new BigDecimal("2");
      BigDecimal dataNum = new BigDecimal(String.valueOf(data));
      BigDecimal mNum = baseNum.divide(dataNum,0 , BigDecimal.ROUND_DOWN);
      outNum =mNum.divide(towNum, 0, BigDecimal.ROUND_UP);
    }

    System.out.println(outNum);
  }//printFncA

}//class
