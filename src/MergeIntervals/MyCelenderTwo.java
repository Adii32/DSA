package MergeIntervals;

import java.util.*;

class MyCalendarTwo {
    Map<Integer, Integer> map;

    public MyCalendarTwo() {
        map = new TreeMap<>();
    }

    public boolean book(int startTime, int endTime) {

        map.put(startTime, map.getOrDefault(startTime, 0) + 1);
        map.put(endTime, map.getOrDefault(endTime, 0) - 1);

        int bookings = 0;

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {

            bookings += m.getValue();

            if (bookings > 2) {

                // Rollback startTime
                map.put(startTime, map.getOrDefault(startTime, 0) - 1);

                if (map.get(startTime) == 0) {
                    map.remove(startTime);
                }

                // Rollback endTime
                map.put(endTime, map.getOrDefault(endTime, 0) + 1);

                if (map.get(endTime) == 0) {
                    map.remove(endTime);
                }

                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        MyCalendarTwo obj = new MyCalendarTwo();

        System.out.println(obj.book(10, 20)); // true
        System.out.println(obj.book(50, 60)); // true
        System.out.println(obj.book(10, 40)); // true
        System.out.println(obj.book(5, 15));  // false
        System.out.println(obj.book(5, 10));  // true
        System.out.println(obj.book(25, 55)); // true
    }
}