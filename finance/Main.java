package finance;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Finance finance1 = new Finance(510, 40);
    Finance finance2 = new Finance(540, 140);


    System.out.print("会費納入口数を入力してください：");
    finance1.setCount();
    finance1.printData();

    System.out.println("-----------------------------------");
    System.out.print("追加納入口数を入力してください：");
    finance2.setCount();
    finance2.printData();

    System.out.println("===================================");
    int totalPrice = finance1.getPrice() + finance2.getPrice();
    int totalCampa = finance1.getCampa() + finance2.getCampa();
    System.out.println("納入金合計：" + totalPrice + "円");
    System.out.println("カンパ合計：" + totalCampa + "円");
    System.out.println("お預かり金合計：" + (totalPrice + totalCampa) + "円");

  }

}