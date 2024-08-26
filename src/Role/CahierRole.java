package Role;

public class CahierRole implements StaffRole {
    private String checkInTime;
    private String checkOutTime;
    private String orders;

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
    //주문을 받는 메서드
    //order에서 주문 받을 때 마다 add? 주문만? 가격까지?
    public void order(String order, double price){
        System.out.println("주문한 내용 : " + order + " 가격 : " + price );
    }



    //계산을 하는 메서드



}
