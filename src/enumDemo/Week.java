package enumDemo;

import java.sql.SQLOutput;

public class Week {

    Day day;

    public Week() {
    }

    public Week(Day day) {
        this.day = day;
    }

    public void taskToDo(){
        switch (day) {
            case MONDAY:
                System.out.println("Work Codelab");
                break;
            case TUESDAY:
                System.out.println("Work Homework");
                break;
            case WEDNESDAY:
                System.out.println("Read books");
                break;
            case THURSDAY:
                System.out.println("Group meeting");
                break;
            case FRIDAY:
                System.out.println("Joining mentoring");
            case SATURDAY:
                System.out.println("First class");
                break;
            case SUNDAY:
                System.out.println("Second class");
                break;
            default:
                System.out.println("No more days!");
                break;
        }
    }
}
