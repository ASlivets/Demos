package enums;

public enum DaysOfWeek {
    SUNDAY("Неділя"),
    MONDAY("Понеділок"),
    TUESDAY("Вівторок"),
    WEDNESDAY("Середа"),
    THURSDAY("Четвер"),
    FRIDAY("П'ятниця"),
    SATURDAY("Субота");

    private String ukrName;
    DaysOfWeek(String dayName) {
        this.ukrName = dayName;
    }

    public void printDay(){
        System.out.println(ukrName);
    }

}
