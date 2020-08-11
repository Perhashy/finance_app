package jp.hashy.finance_app;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Finance finance1 = new Finance(510, 40);
    Finance finance2 = new Finance(540, 140);


    System.out.print("会費納入口数を入力してください：");
    int count1 = sc.nextInt();
    finance1.printData(count1);

    System.out.println("-----------------------------------");
    System.out.print("追加納入口数を入力してください：");
    int count2 = sc.nextInt();
    finance2.printData(count2);

  }
}