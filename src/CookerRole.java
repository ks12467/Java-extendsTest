import javax.management.relation.Role;
import java.util.List;

public class CookerRole implements StaffRole {
    private String checkInTime;
    String checkOutTime;

    @Override
    public void checkIn(String time) {
        this.checkInTime = time;
        System.out.println("출근 시간 : " + checkInTime);
    }

    @Override
    public void checkOut(String time) {
        this.checkOutTime = time;
        System.out.println("퇴근 시간 : " + checkOutTime);

    }

    @Override
    public String getCheckIn() {
        return checkInTime;
    }

    @Override
    public String getCheckOut() {
        return checkOutTime;
    }

    public void makeBurger() {
        Whopper whopper = new Whopper(1, List.of("Lettuce"), List.of("Cheese"));
        whopper.recipe();
    }

    public void makeDrink(){
        Drink drink = new Drink();
        drink.Drink("콜라", "Large");

    }
}
