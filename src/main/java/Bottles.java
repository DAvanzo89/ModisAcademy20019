import java.io.PrintStream;

class Bottles {
    public static void main(String args[]) {
        writeLyrics(System.out);
    }

    public static void writeLyrics(PrintStream out) {
        for (int beers = 99; beers > -1; beers--) {

            out.print(beers + actionBottle(beers) + " of beer on the wall,");
            out.println(beers + actionBottle(beers) + " of beer,");
            out.print(actionAfterBeer(beers));
            out.println(beerLeft(beers) + actionBottle(beerLeft(beers)) + " of beer on the wall.\r\n");
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


}
