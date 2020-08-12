import java.time.LocalDate;
import java.time.LocalDateTime;

public class Screening {
    private int seat;
    final int sequence;
    final LocalDate whenScreened;

    public Screening(int sequence, LocalDate when, int seat) {
        this.sequence = sequence;
        this.whenScreened = when;
        this.seat = seat;
    }

    boolean hasSeat(int count) {
        return seat >= count;
    }

    void reserveSeat(int count) {
        if (hasSeat(count)) seat -= count;
        else throw new RuntimeException("no seat");
    }
}