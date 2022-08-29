public class FilmConstruct {

    private int id;
    private String filmName;
    private String genre;

    public FilmConstruct(int id, String filmName, String genre) {
        this.id = id;
        this.filmName = filmName;
        this.genre = genre;
    }

    public String toString() {
        return id + " " + filmName + " " + genre;
    }
}