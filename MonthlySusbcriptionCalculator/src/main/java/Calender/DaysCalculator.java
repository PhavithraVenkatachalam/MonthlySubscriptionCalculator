package Calender;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class DaysCalculator {

    Calendar calendar;

    public DaysCalculator() {
        calendar = Calendar.getInstance();
    }

    public int getDaysInAMonth(int year, int month) {
        calendar.set(year, month - 1, 1);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    public int getMondayCount(int year, int month) {
        return countDayOccurence(year, month, Calendar.MONDAY);
    }

    public int getTuesdayCount(int year, int month) {
        return countDayOccurence(year, month, Calendar.TUESDAY);
    }

    public int getWednesdayCount(int year, int month) {
        return countDayOccurence(year, month, Calendar.WEDNESDAY);
    }

    public int getThursdayCount(int year, int month) {
        return countDayOccurence(year, month, Calendar.THURSDAY);
    }

    public int getFridayCount(int year, int month) {
        return countDayOccurence(year, month, Calendar.FRIDAY);
    }

    public int getSaturdayCount(int year, int month) {
        return countDayOccurence(year, month, Calendar.SATURDAY);
    }

    public int getSundayCount(int year, int month) {
        return countDayOccurence(year, month, Calendar.SUNDAY);
    }

    public int getWeekdaysCount(int year, int month) {

        int weekdays = getDaysInAMonth(year, month) - (getSaturdayCount(year, month) + getSundayCount(year, month));

        return weekdays;

    }

    public int countDayOccurence(int year, int month, int dayToFindCount) {

        AtomicInteger count = new AtomicInteger();
        calendar.set(year, month, 1);
        int daysInMonth = getDaysInAMonth(year, month);

        IntStream.rangeClosed(1, daysInMonth).forEach(day -> {
            calendar.set(year, month - 1, day);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek == dayToFindCount) {
                count.getAndIncrement();
            }
        });

        return count.get();
    }
}
