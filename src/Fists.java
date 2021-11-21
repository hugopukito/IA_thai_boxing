public class Fists extends Attack {

    private final static String techniques[] ={
            "Jab",
            "Cross",
            "Left-hook",
            "Right-hook",
            "Left-uppercut",
            "Right-uppercut",
            "Left-superman",
            "Right-superman",
            "Left-spinning-punch",
            "Right-spinning-punch"
    };

    public Fists(int technique_number) {
        this.body_part = getClass().getName();
        this.technique = techniques[technique_number-1];
    }

    public static void getTechniques() {
        for (int i = 1; i <= techniques.length; i++) {
            System.out.println(String.valueOf(i) + " " + techniques[i-1]);
        }
    }
}
