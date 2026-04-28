/**
 * Problem: Time Conversion
 * Link: https://www.hackerrank.com/challenges/time-conversion/problem
 *
 * Description:
 * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 */

package easy;

public class TimeConversion {
    public static String timeConversion(String s) {
        String period = s.substring(s.length() - 2);
        String timeWithoutPeriod = s.substring(0, s.length() - 2);

        String[] timeParts = timeWithoutPeriod.split(":");

        int hour = Integer.parseInt(timeParts[0]);
        String minutes = timeParts[1];
        String seconds = timeParts[2];

        if (period.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else {
            if (hour != 12) {
                hour += 12;
            }
        }

        String formattedHour = String.format("%02d", hour);

        return formattedHour + ":" + minutes + ":" + seconds;
    }
}
