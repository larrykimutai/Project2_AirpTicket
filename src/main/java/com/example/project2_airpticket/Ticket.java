package com.example.project2_airpticket;

public class Ticket extends Airplane{

  private String Name, Snack, SeatClass;
  private int Price;

  //default constructor
  public Ticket(){
    super();
    Name = null;
    Snack = "Cookie";
    SeatClass = "Business";
    Price = 300;
  }

  //constructor
  public Ticket(String airline, String cityDeparture,
                String cityDestination, String dateDeparture,
                String timeDeparture, int flightNum, int numSeatsE, int numSeatsB){

    super(airline, cityDeparture, cityDestination,
            dateDeparture, timeDeparture, flightNum, numSeatsE, numSeatsB);
  }



  //mutators
  public void setName(String name){Name = name;}
  public void setSnack(String snack) {Snack = snack;}
  public void setSeatClass(String seatClass) {SeatClass =seatClass;}
  public void setPrice(int price){Price = price;}

  //accessors
  public String getName(){return Name;}
  public String getSnack(){return Snack;}
  public String getSeatClass(){return SeatClass;}
  public int getPrice(){return Price;}

}
