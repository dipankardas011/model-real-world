package realWorldAPI.objects.living.mammals.humans;

public class Brain {
    enum Level {
        DEPRESSED,
        FOCUSED,
        OKAY,
        JOY,
        ANGRY
    }
    private Level state;
    public Brain() {
        this.state = Level.OKAY;
        System.out.println("[INIT] BRAIN");
    }

    /**
     * @return Level
     */
    public String getState() {
        return this.state.toString();
    }

    private void setAngry() {
        this.state = Level.ANGRY;
    }

}