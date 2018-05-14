/**
 * A utility class.
 *
 * @author Ben Stern
 * @date 5/13/18
 */
public class Utils {

    /**
     * A second, represented in milliseconds.
     */
    public static int second = 1000;

    /**
     * A minute, represented in milliseconds.
     */
    public static long minute = (second * 60);

    /**
     * A hour, represented in milliseconds.
     */
    public static long hour = (minute * 60);

    /**
     * Checks the desired time against the current time, with a leniency of +/-1 second.
     *
     * @param time        The current playlist time.
     * @param desiredTime The desired playlist time.
     * @return {@code True} if so.
     */
    public static boolean checkTime(long time, long desiredTime) {
        if (time >= (desiredTime - second) || time >= (desiredTime + second)) {
            return false;
        }
        return true;
    }
}
