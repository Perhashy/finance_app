package finance;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Finance {
  private int price;
  private int campa;
  private int count = 0;

  Finance(int price, int campa) {
    this.price = price;
    this.campa = campa;
  }

  public void setCount() {
    Scanner sc = new Scanner(System.in);
    try {
      this.count = sc.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("数値以外が入力されました、終了します");
      System.exit(0);
    }
  }

  public int getPrice() {
    return this.price;
  }
  public int getCampa() {
    return this.campa;
  }

  public void total() {
    this.price *= this.count;
    this.campa *= this.count;
  }

  public void printData() {
    this.total();
    System.out.println("会費口数：" + this.count);
    System.out.println("金額：" + this.price + "円");
    System.out.println("カンパ：" + this.campa + "円");
  }

}