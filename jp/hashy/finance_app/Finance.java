package jp.hashy.finance_app;

class  Finance {
  private int price;
  private int campa;

  Finance(int price, int campa) {
    this.price = price;
    this.campa = campa;
  }

  public int getPrice() {
    return this.price;
  }
  public int getCampa() {
    return this.campa;
  }

  public void printData(int count) {
    System.out.println("会費口数：" + count);
    System.out.println("金額：" + this.price * count + "円");
    System.out.println("カンパ：" + this.campa * count + "円");

  }
}