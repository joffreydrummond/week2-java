package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
      boolean isHotOutSide = false;
      boolean isWeekday = true;
      boolean hasMoneyInPocket = true;

      double costOfMilk = 2.50;
      double moneyInWallet = 75.25;
      int thirstLevel = 7;

      boolean shouldByIcecream = isHotOutSide && hasMoneyInPocket;
      boolean willGoSwimming = isHotOutSide && !isWeekday;
      boolean isAGoodDay = isHotOutSide && (isWeekday && !isWeekday);
      boolean willBuyMilk = isHotOutSide && (thirstLevel <= 3 && (moneyInWallet >= (costOfMilk * 2)));

      System.out.println(willGoSwimming);

    }
}
