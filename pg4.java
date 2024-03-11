package package1;

enum Day {
    
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

public class EnumExample {
    Day day;

    EnumExample(Day day) {
        this.day = day;
    }

    public void dayIsLike() {
        switch (day) {
            case MONDAY:
                System.out.println("start of the week");
                break;
            case FRIDAY:
                System.out.println("better");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("weekend");
                break;
            default:
                System.out.println("week days");
                break;
        }
    }

    public static void main(String[] args) {
        String str = "MONDAY";
        EnumExample t1 = new EnumExample(Day.valueOf(str));

        t1.dayIsLike();
        for (Day d : Day.values()) {
            System.out.println(d + " at index " + d.ordinal());
        }
    }

}