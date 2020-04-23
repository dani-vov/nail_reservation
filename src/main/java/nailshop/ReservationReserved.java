package nailshop;

public class ReservationReserved extends AbstractEvent {

    private Long reservationId;

    private String reservatorName;

    private String reservationDate;

    private String phoneNumber;

    public ReservationReserved(Reservation reservation) {
        super();
        this.reservationId = reservation.getId();
        this.reservatorName = reservation.getReservatorName();
        this.reservationDate = reservation.getReservationDate();
        this.phoneNumber = reservation.getPhoneNumber();
    }

    public Long getId() {
        return reservationId;
    }

    public void setId(Long id) {
        this.reservationId = id;
    }

    public String getReservatorName() {
        return reservatorName;
    }

    public void setReservatorName(String reservatorName) {
        this.reservatorName = reservatorName;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
