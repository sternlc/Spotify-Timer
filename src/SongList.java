/**
 * A list of 100 songs.
 *
 * @author Ben Stern
 * @date 5/13/18
 */
public enum SongList {

    SONG_01("Peacebone", 315173),
    SONG_02("Kites", 263346),
    SONG_03("Dark Days", 206786),
    SONG_04("South", 231468),
    SONG_05("Float On", 208466),
    SONG_06("Girls Just Want to Have Fun", 187853),
    SONG_07("Swing Tree", 158133),
    SONG_08("Next In Line", 239706),
    SONG_09("Guilt Trip", 200626),
    SONG_10("Out Of My League", 209386),
    SONG_11("Hollywood", 197466),
    SONG_12("Left Hand Free", 173630),
    SONG_13("San Francisco", 173093),
    SONG_14("In Fantasia", 429453),
    SONG_15("Nobody To Love", 204321),
    SONG_16("MoneyGrabber", 189226),
    SONG_17("Dreaming", 216560),
    SONG_18("Way It Goes", 245456),
    SONG_19("Your Graduation", 163760),
    SONG_20("My Girls", 340786),
    SONG_21("Forever", 245306),
    SONG_22("Lolly", 225506),
    SONG_23("Marvin & Chardonnay", 222866),
    SONG_24("Country Grammar (Hot Shit)", 287000),
    SONG_25("M.I.L.F. $", 162365),
    SONG_26("I Don't Mind", 251989),
    SONG_27("Work", 219320),
    SONG_28("Pop That", 303533),
    SONG_29("She Twerkin", 170933),
    SONG_30("Wannabe - Radio Edit", 173026),
    SONG_31("Hot In Herre", 228226),
    SONG_32("Got Money", 244626),
    SONG_33("Caroline", 209746),
    SONG_34("Low (feat T-Pain)", 231400),
    SONG_35("iSpy (feat. Lil Yachty)", 253106),
    SONG_36("Cyclone - Main", 221797),
    SONG_37("What Lovers Do (feat. SZA)", 199849),
    SONG_38("Jump (feat. Gizzle)", 274909),
    SONG_39("Fruit Punch", 221622),
    SONG_40("Dancing in the Moonlight", 181133),
    SONG_41("Drinking from the Bottle", 240346),
    SONG_42("Stereo", 346000),
    SONG_43("Never Be Like You (feat. Kai)", 233337),
    SONG_44("Right Now (feat. Njomza and Alex & Alex)", 200156),
    SONG_45("Be Together", 233010),
    SONG_46("1 Night", 207826),
    SONG_47("My Sweet Summer", 202632),
    SONG_48("Caskets", 184116),
    SONG_49("sad for you", 299890),
    SONG_50("Holdin On", 153640),
    SONG_51("Jumpin", 215588),
    SONG_52("Let Me Love You", 205946),
    SONG_53("Take You", 155474),
    SONG_54("Built To Roam - Audiotree Live Version", 294321),
    SONG_55("Lady Lie - Audiotree Live Version", 221288),
    SONG_56("Beachwood", 210000),
    SONG_57("I Wanna Get Better", 204520),
    SONG_58("Lightning - Audiotree Live Version", 219614),
    SONG_59("Matchbox", 172466),
    SONG_60("Rollin' Around", 217120),
    SONG_61("Late July - Audiotree Live Version", 363142),
    SONG_62("American Shoes - Audiotree Live Version", 266087),
    SONG_63("Devil Like Me - Audiotree Live Version", 191376),
    SONG_64("Mona Lisa", 209397),
    SONG_65("Modern Jesus", 194053),
    SONG_66("Still Beating", 181586),
    SONG_67("June", 244687),
    SONG_68("Seven - Audiotree Live Version", 254869),
    SONG_69("$ave Dat Money (feat. Fetty Wap & Rich Homie Quan)", 290835),
    SONG_70("Crazy Brazy", 188853),
    SONG_71("Too Bad", 193071),
    SONG_72("Doubt It", 218370),
    SONG_73("Burn Slow", 227998),
    SONG_74("DNA.", 185946),
    SONG_75("I Like Tuh", 187560),
    SONG_76("Paradise - Extended", 215440),
    SONG_77("Tiimmy Turner", 239853),
    SONG_78("Party Up", 268866),
    SONG_79("Little Bit of This (feat. Vince Staples)", 168254),
    SONG_80("Jump Around", 214946),
    SONG_81("REDMERCEDES", 169706),
    SONG_82("Mixtape (feat. Young Thug & Lil Yachty)", 292910),
    SONG_83("All Night (feat. Knox Fortune)", 141542),
    SONG_84("Waves", 181573),
    SONG_85("POWER", 292093),
    SONG_86("Trap Niggas", 183800),
    SONG_87("Outlet", 268813),
    SONG_88("Actin Crazy", 239466),
    SONG_89("Bandz A Make Her Dance", 278826),
    SONG_90("Empire State Of Mind", 276920),
    SONG_91("Out The Mud", 241186),
    SONG_92("Ali Bomaye", 372706),
    SONG_93("Let It Bang", 151306),
    SONG_94("P. Sherman (PS42WW$)", 147936),
    SONG_95("Loyal", 264946),
    SONG_96("Work REMIX", 283693),
    SONG_97("Lord Pretty Flacko Jodye 2 (LPFJ2)", 126960),
    SONG_98("Gilligan", 207800),
    SONG_99("Old English", 201960),
    SONG_100("Shabba", 275866);

    /**
     * The name of the song.
     */
    private String name;

    /**
     * The song duration. (In milliseconds).
     */
    private int duration;


    /**
     * The song list enum.
     *
     * @param name     The song name.
     * @param duration The song duration
     */
    SongList(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }


    /**
     * Gets the song name.
     *
     * @return The song name.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the song duration.
     *
     * @return The song duration.
     */
    public int getDuration() {
        return duration;
    }
}
