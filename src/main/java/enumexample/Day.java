package enumexample;

public enum Day {
    SUNDAY("یکشنبه"),
    MONDAY("ذوشنبه"),
    TUESDAY("سه شنبه"),
    WEDNESDAY("چهار شنبه"),
    THURSDAY("پنجشنبه"),
    FRIDAY("جمعه"),
    SATURDAY("شنبه");

    private String dayName;


    private Day(String dayName) {
        this.dayName = dayName;
    }


    public String getDayName() {
        return this.dayName;
    }
}
