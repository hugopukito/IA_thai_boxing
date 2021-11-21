public abstract class Attack implements Techniques{

    protected String body_part;
    protected String technique;

    @Override
    public String toString() {
        return "Attack{" +
                "body_part='" + body_part + '\'' +
                ", technique='" + technique + '\'' +
                '}';
    }
}
