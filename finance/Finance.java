package finance;

import java.util.Scanner;

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
    this.count = sc.nextInt();
  }

  public int getPrice() {
    return this.price;
  }
  public int getCampa() {
    return this.campa;
  }

  public int getCount() {
    return this.count;
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