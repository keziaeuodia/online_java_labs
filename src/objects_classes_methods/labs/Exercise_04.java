package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 4:
 *
 *      Demonstrate method overloading with at least three overloaded methods.
 *
 */

class Music{

    void preference(){
        System.out.println("Give me anything");
    }
    void preference(int year, String genre){
        System.out.println("You have selected " + genre + " songs from the year " + year);
    }
    void preference(String artist, String album){
        System.out.println("You want to listen to the album " + album + " by " + artist);
    }
    int preference(int duration){
        return duration/4;
    }
}

class Player{
    public static void main(String[] args) {
        Music songsnum = new Music();

        int noOfSongs = songsnum.preference(60);
        if(noOfSongs>1){
            System.out.println("You will listen to approximately " + noOfSongs + " songs");
        }else {
            System.out.println("You will listen to 1 song");
        }

        Music gen = new Music();
        gen.preference(2002, "rock" );

        Music singer = new Music();
        singer.preference("Red Hot Chili Pepper", "By The Way");

    }
}