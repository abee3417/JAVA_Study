class Song{
    private String title, artist, country;
    private int year;
    public Song(){}
    public Song(String title, String artist, int year, String country){
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = country;
    }
    public void show(){
        System.out.println(this.title + " by " + this.artist + " from " + this.country + ", " + this.year);
    }
}

public class Q21{
    public static void main(String[] args){
        Song Dynamite = new Song("Dynamite", "BTS", 2021, "Korea");
        Dynamite.show();
    }
}