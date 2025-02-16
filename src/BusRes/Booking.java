package BusRes;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
public class Booking {
    String PassengerName;
    int BusNo;
    Date date;

    Booking(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Name of the Passenger : ");
        PassengerName = in.next();
        System.out.println("Enter the Bus No : ");
        BusNo = in.nextInt();
        System.out.println("Enter the date in this format dd-mm-yyyy");
        String dateInp = in.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(dateInp);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int capacity = 0;
        for(Bus bus : buses){
            if(bus.getBusNo() == BusNo){
                capacity = bus.getCapacity();
            }
        }
        int booked = 0;
        for(Booking b : bookings){
            if(b.BusNo == BusNo && b.date.equals(date)){
                booked++;
            }
        }
        return (booked < capacity ? true : false);
    }
}
