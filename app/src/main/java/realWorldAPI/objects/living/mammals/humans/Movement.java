package realWorldAPI.objects.living.mammals.humans;

public class Movement {
    enum typeOfMovements {
        LEFT,
        RIGHT,
        FORWARD,
        BACKWARD
    }
    enum degreeOfMovement {
        FAST,
        SLOW
    }
    typeOfMovements move;
    degreeOfMovement howFast;
    public Movement() {
        this.move = typeOfMovements.FORWARD;
        this.howFast = degreeOfMovement.SLOW;
    }
}
