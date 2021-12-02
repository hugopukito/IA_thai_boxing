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
        for (Techniques i : second) {
            ss += i.toString();
        }
        return fs + "1" + ss;
    }

    public String stringifyFirst () {

        String fs = "";
        for (Techniques i : first) {
            fs += i.toString();
        }

        return fs;
    }

    public String stringifySecond() {

        String ss = "";
        for (Techniques i : second) {
            ss += i.toString();
        }

        return ss;
    }
}
