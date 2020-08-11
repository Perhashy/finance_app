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

  public void setMultiplicationData(int count) {
    this.price *= count;
    this.campa *= count;
  }

  public void printData(int count) {
    System.out.println("会費口数：" + count);
    System.out.println("金額：" + this.price + "円");
    System.out.println("カンパ：" + this.campa + "円");
  }

}