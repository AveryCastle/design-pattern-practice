package chap5.singleton.exercise;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Created by seoungjuhyun on 7/5/16.
 */
public class TicketMakerTest {

    @Test
    public void createOnlyOneInstance() {
        TicketMaker ticketMaker1 = TicketMaker.getInstance();
        TicketMaker ticketMaker2 = TicketMaker.getInstance();

        assertTrue(ticketMaker1 == ticketMaker2);
        assertTrue(ticketMaker1.equals(ticketMaker2));
    }

    @Test
    public void validateTicketNumber() {
        TicketMaker ticketMaker1 = TicketMaker.getInstance();
        TicketMaker ticketMaker2 = TicketMaker.getInstance();

        assertTrue(ticketMaker1.getNextTicketNumber() !=
                ticketMaker2.getNextTicketNumber());
    }
}
