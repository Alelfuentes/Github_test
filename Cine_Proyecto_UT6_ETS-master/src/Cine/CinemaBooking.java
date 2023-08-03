package Cine;

public class CinemaBooking {

    // VARIABLES PRIVADAS
    private int numAsientosFree;
    private final int numAsientosCinema;

    // METODOS PÚBLICOS
    public CinemaBooking(int asientos) {
        this.numAsientosCinema = asientos;
        this.numAsientosFree = this.numAsientosCinema;
    }

    // METODOS SETTER
    public void reservar(int asientos) {
        this.numAsientosFree -= asientos;
    }
    public void cancelar(int asientos) {
        this.numAsientosFree += asientos;
    }

    // METODOS GETTER
    public int consultar() {
        return this.numAsientosFree;
    }

}
