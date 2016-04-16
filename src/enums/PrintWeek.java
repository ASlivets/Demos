package enums;

public class PrintWeek {
    public void printDays() {
        for (DaysOfWeek day : DaysOfWeek.values()) {
            day.printDay();
        }
    }
}
