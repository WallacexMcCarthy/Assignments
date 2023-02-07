
/**
 * This is the first assignment in CS1420. Here there is a input where a user can onput their UUID,
 * and it will convert to that amount of seconds which will then be converted to days, hours, minutes and seconds.
 *
 * @Author Wallace Z. McCarthy
 * @UUID u0838487
 * @Version January 10, 2023
 **/

package assignment01;

public class TimeCalculation
{
    public static void main(String[] args)
    {
        // uID excluding the initial 0s
        int uID = 838487;
        System.out.print("My uID number is u");
        System.out.print(uID);  // Print does not move on to the next line.  Use println to move on to the next line when done.
        System.out.println(".");
        /**
         * Finds the hours by dividing the seconds by 60 to find minutes then 60 again to find hours.
         */
        int hours = uID / 3600;
        /**
         * Finds the minutes by subtracting the amount of hours from the total seconds. This results in the remaining
         * seconds which will be converted to minutes by dividing by 60.
         */
        int minutes = (uID - (hours * 3600)) / 60;
        /**
         * Finds the seconds by subtracting the original amount of seconds by the seconds in the hours that we
         * obtained as well as the minutes that we obtained this gives us the amount of seconds that we have including
         * the seconds in the hours. We then % divide by 60 to find the remainder which gives us the seconds.
         */
        int seconds = (uID - (hours * 3600) - (minutes / 60)) % 60 ;
        System.out.println(uID + " seconds is " + hours + " hour(s), " + minutes + " minute(s), and " + seconds + " second(s).");
    }
}
