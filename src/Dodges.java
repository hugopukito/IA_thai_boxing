public class Dodges extends Defense {

    private final static String techniques[] ={
            "Low-kick-dodge",
            "Middle-kick-dodge",
            "High-kick-dodge",
            "Circular-movement",
            "Backward-movement",
            "Punch-dodge",
            "Hook-dodge",
            "Uppercut-dodge",
            "Low-kick-block",
            "Middle-kick-block",
            "High-kick-block"
    };

    public Dodges(int technique_number) {
        this.defense_type = getClass().getName();
        this.technique = techniques[technique_number-1];
    }

    public static void getTechniques() {
        for (int i = 1; i <= techniques.length; i++) {
            System.out.println(String.valueOf(i) + " " + techniques[i-1]);
        }
    }
}
