package com.sda.di;

public class Cinema {
    private final CinemaReservation cinemaReservation;
    private final CinemaNotifier cinemaNotifier;

    //zle

    public Cinema (){
        this.cinemaReservation = new CinemaReservation();
        this.cinemaNotifier = new CinemaNotifier();
    }


    //dobrze

    public Cinema (CinemaReservation cinemaReservation, CinemaNotifier cinemaNotifier){
        this.cinemaReservation = cinemaReservation;
        this.cinemaNotifier = cinemaNotifier;
    }
}
