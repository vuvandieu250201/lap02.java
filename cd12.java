package lap01;

import java.util.Scanner;

public class cd12 {
  public static void main(String[]args){
    //tao 1 doi tuong va chuyen doi tuong vao vong dau
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the Number:");
    //them du lieu doi tuong cho nguoi su dung
    //so nguyen kieu int
    int intValue = s.nextInt();
    System.out.println("Enter a decimal number:");
    //kieu so thuc float
    float floatValue = s.nextFloat();
    //kieu string
    System.out.println("Enter a String value");
    String strValue =s.next();
    System.out.println("Values entered are: ");
    System.out.println(intValue + ""  + floatValue + "" + strValue);
  }
}
