public abstract class Defense implements Techniques{

    protected String defense_type;
    protected String technique;

    @Override
    public String toString() {
        return "Defense{" +
                "defense_type='" + defense_type + '\'' +
                ", technique=" + technique +
                '}';
    }
}
