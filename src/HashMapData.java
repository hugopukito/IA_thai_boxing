public class HashMapData {

    private final Techniques[] first;
    private final Techniques[] second;

    public HashMapData(Techniques[] first, Techniques[] second) {
        this.first = first;
        this.second = second;
    }

    public String stringify () {
        String fs = "";
        for (Techniques i : first) {
           fs += i.toString();
        }

        String ss = "";
        for (Techniques i : first) {
            ss += i.toString();
        }
        return fs + ss;
    }
}
