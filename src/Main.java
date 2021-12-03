import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*Attack f = new Fists(1);
        System.out.println(f.toString());

        Attack[] s = {new Fists(4), new Kicks(2)};
        for (Attack i : s)
        {
            System.out.println(i.toString());
        }*/

        Techniques[] t1 = {new Fists(4), new Kicks(2)};
        Techniques[] t2 = {new Fists(3), new Kicks(2)};
        Techniques[] t3 = {new Fists(1), new Kicks(2)};

        HashMapData h = new HashMapData(t1,t2);
        HashMapData h2 = new HashMapData(t1,t2);
        HashMapData h3 = new HashMapData(t1,t3);

        Learning l = new Learning();

        l.add(h);
        System.out.println(l.getValue(h.stringify()));
        l.add(h2);
        System.out.println(l.getValue(h.stringify()));
        l.add(h3);
        System.out.println(l.getValue(h.stringify()));

        System.out.println();

        l.getBestOptions(t1);
        /*System.out.println(l.getBestOptions(t2));
        System.out.println(l.getBestOptions(t3));*/
    }
}
