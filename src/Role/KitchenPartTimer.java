package Role;

import Food.Burger;
import drink.Drink;

public class KitchenPartTimer extends CookerRole {
    String name;
    int pay;

    @Override
    public void checkIn(String time) {
        System.out.println("파트타임 출근");
    }
    public void checkOut(String time) {
        System.out.println("파트타임 퇴근");
    }
    public Burger makeBurger(Burger burger) {
        System.out.println("파트타이머가  버거를 만듭니다");
        return burger;
    }
    public Drink makeDrink(Drink drink) {
        System.out.println("파트타이머가 음료를 만ㄷ듭니다");
        return drink;
    }

}
