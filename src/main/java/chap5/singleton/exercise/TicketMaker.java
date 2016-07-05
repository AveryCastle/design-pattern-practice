package chap5.singleton.exercise;

/**
 * Created by seoungjuhyun on 7/5/16.
 */
public class TicketMaker {

    private int ticket = 1000;

    private static TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker() {
    }

    public static TicketMaker getInstance() {
        return ticketMaker;
    }

    public int getNextTicketNumber() {
        return ticket++;
    }
}
