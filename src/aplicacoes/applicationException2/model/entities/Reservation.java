package aplicacoes.applicationException2.model.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {

    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private static final DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public long duration(){
        Duration t1 = Duration.between(checkIn.atTime(0,0), checkOut.atTime(0,0));
        return t1.toDays();
    }

    public String updateDates(LocalDate checkIn, LocalDate checkOut){

        LocalDate dateNow = LocalDate.now();
        if (checkIn.isBefore(dateNow) || checkOut.isBefore(dateNow)){
            return "Reservation dates for update must be future dates";
        }
        if (!checkOut.isAfter(checkIn)){
            return "Check-out date must be after check-in date";
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        return null;
    }

    @Override
    public String toString() {
        return "Reservation: " +
                "roomNumber: " + roomNumber +
                ", check-In: " + checkIn.format(fmt1) +
                ", check-Out: " + checkOut.format(fmt1) +
                ", " + duration() + " nights";
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

}