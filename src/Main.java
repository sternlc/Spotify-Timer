import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A prototype algorithm for sorting and adding items.
 *
 * @author Ben Stern
 * @date 5/13/18
 */
public class Main {

    /**
     * The desired time.
     *
     * This can be changed to any time.
     */
    private static int hours = 0, minutes = 25;

    /**
     * The current loop index.
     */
    private static int index;

    /**
     * A list of songs picked for the playlist.
     */
    private static List<SongList> toAdd = new ArrayList<>();

    /**
     * The main method.
     *
     * @param args The arguments to append.
     */
    public static void main(String[] args) {
        long desiredTime = (Utils.hour * hours) + (Utils.minute * minutes);
        List<SongList> songList = Arrays.asList(SongList.values());
        Collections.shuffle(songList);
        toAdd.clear();
        index = 0;
        while (true) {
            if (loop(desiredTime, songList) != desiredTime) {
                index++;
                if (index >= songList.size()) {
                    Collections.shuffle(songList);
                    index = 0;
                }
                if (!toAdd.isEmpty()) {
                    toAdd.clear();
                }
            } else {
                System.out.println("Playlist Songs:");
                long durationSum = 0;
                for (SongList list : toAdd) {
                    System.out.println(list.getName() + " [" + list.getDuration() + "ms]");
                    durationSum = durationSum + list.getDuration();
                }
                System.out.println("------");
                System.out.println("Total Time = " + ((durationSum / Utils.second) / 60) + " minutes");
                break;
            }
        }
    }

    /**
     * Loops through the playlist tracks and adds tracks to the
     *
     * @param desiredTime The desired time (in milliseconds) for the playlist.
     * @param list        The list of tracks.
     * @return The total time (in milliseconds).
     */
    private static long loop(long desiredTime, List<SongList> list) {
        long time = 0;
        for (int i = index; i < list.size(); i++) {
            if (!Utils.checkTime(time, desiredTime)) {
                break;
            }
            time = time + list.get(i).getDuration();
            toAdd.add(list.get(i));
        }
        return time;
    }
}
