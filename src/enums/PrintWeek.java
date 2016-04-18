package enums;

class PrintWeek {
    void printDays() {
        for (DaysOfWeek day : DaysOfWeek.values()) {
            day.printDay();
        }
    }
}
