import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {

    List<Integer> input = new ArrayList<Integer>();

    input = readStreamFnc();

    printFnc pf = new printFnc();

    for (int intData : input) {
      pf.printFncA(intData);
    }//for
  }//main

  private static List readStreamFnc() throws IOException {

    Scanner scanner = new Scanner(System.in);

    List<Integer> lInput = new ArrayList<Integer>();

    int icnt = 2;
    while (scanner.hasNextLine()) {
      String s = scanner.nextLine();
      if (icnt >= 1000) { // 文字列が空(長さゼロ)の場合
        break;
      }//if
      lInput.add(Integer.parseInt(s));
      icnt = icnt++;
    }//while

    return lInput;
  }//readStreamFnc

}//class

class printFnc {

  private static List<Long> cntList;

  {
    this.cntList = new ArrayList<Long>();
    int min = 1;
    int max = 1000000;

    for (int ii=min; ii<max; ii++)
    {
      this.cntList.add((ii * 2) + 1L);
    }//for

  }

  void printFncA(int data) {

    int count;

    count = 0;
    for (Long longData : this.cntList)
    {
      if (longData % data == 0) {
        count = count + 1;
      }//if
    }//for
    System.out.println(count);
  }//printFncA

}//class
