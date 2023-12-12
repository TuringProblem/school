/**
 * @author Override
 * @since   12/6/2023 22:31
 * @see  <a href="https://github.com/TuringProblem">GitHub Profile<a/>
 */
public class Hatch {
    String deck;
    boolean sealed, closed;

    //Constructor - initializes a Hatch with deck "unknown", open and unsealed
    Hatch() {
        this.deck = "null";
        this.sealed = false;
        this.closed = false;
    }

    //Constructor - initializes a Hatch with deck deckPassed, closed and sealed
    Hatch(String hatchPassed) {
        this.deck = hatchPassed;
        if (hatchPassed.equals("Main")) {
            this.sealed = false;
            this.closed = false;
        } else if (hatchPassed.equals("Upper")) {
            this.closed = true;
            this.sealed = true;
        } else if (hatchPassed.equals("Lower")) {
            this.sealed = true;
            this.closed = false;
        } else if (hatchPassed.equals("Poop")) {
            this.closed = true;
            this.sealed = false;
        }


    }


    //Returns true if the Hatch is closed, false if it is not
    public boolean isClosed() {
        return closed;

    }

    //Returns true if the Hatch is sealed, false if it is not
    public boolean isSealed() {
        return sealed;
    }


    //Opens a Hatch if it is closed and unsealed
    public void open() {
        closed = false;
    }

    //Closes a Hatch if it is open
    public void close() {
        closed = true;
    }

    //Seals a Hatch if it is unsealed
    public void seal() {
        sealed = true;
    }

    // Unseals a Hatch if it is sealed
    public void unseal() {
        sealed = false;
    }


}
