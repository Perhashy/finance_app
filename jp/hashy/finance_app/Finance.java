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
}