package Innerclasses;

public class Hotel {

    private String name;
    private int totalRooms;
    private int reservedRoom;

    public Hotel(String name, int totalRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRoom = reservedRoom;
    }

    public void setReservedRoom(String guestName, int numOfRoom) {
       class ReservationValidator{
        boolean validate() {
            if (guestName == null || guestName.isBlank()) {
                System.out.println("Guest name can not be empty!");
                return false;
            }
            if (numOfRoom < 0){
                System.out.println("Number of rooms should be positive");
                return false;
            }
            if(reservedRoom + numOfRoom >totalRooms){

                System.out.println("Not enough rooms available.");
                return false;
            }
            return true;

        }
    }
}


}
