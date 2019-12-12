import java.io.PrintStream;

public class Verse {
    public static void writeLyrics(PrintStream out) {
        for (int beers = 99; beers > -1; beers--) {
            out.print(bottle(beers) + " of beer on the wall,");
            out.println(bottle(beers) + " of beer,");
            out.print(actionAfterBeer(beers));
            out.println(bottle(beerLeft(beers)) + " of beer on the wall.\r\n");
        }
    }


    public static int beerLeft(int beers) {
        return (beers == 0) ? 99 : (beers - 1);
    }

    public static String actionAfterBeer(int beers) {
        return (beers == 0) ? "Go to the store, buy some more," : "Take one down, pass it around,";
    }

    public static String actionBottle(int beers) {
        return (beers == 1) ? " bottle" : " bottles";
    }

    public static String  bottle(int beers){
        return beers + actionBottle(beers);

    }

}
