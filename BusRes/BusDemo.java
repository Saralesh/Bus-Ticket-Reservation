package BusRes;

import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo {
    public static void main(String[] args) {
        ArrayList<Bus> Buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<>();
        Buses.add(new Bus(1,true,2));
        Buses.add(new Bus(2,true,45));
        Buses.add(new Bus(3,false,48));
        int UserOpt = 1;
        Scanner in = new Scanner(System.in);
        for(Bus b : Buses){
            b.displayBusInfo();
        }
        while(UserOpt == 1) {
            System.out.println("Enter 1 to Book and 2 to exit");
            UserOpt = in.nextInt();
            if(UserOpt == 1){
                Booking booking = new Booking();
                if(booking.isAvailable(bookings,Buses)){
                    bookings.add(booking);
                    System.out.println("Your Booking is confirmed");
                }
                else{
                    System.out.println("Sorry...... Bus is full.... Try Someother Bus or Date......");
                }
            }
        }
    }
}
