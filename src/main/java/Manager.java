public class Manager {

    private int defaultLength = 10;
    private int currentLength = defaultLength;
    private FilmConstruct[] films = new FilmConstruct[0];

    public Manager(int currentLength) {
        this.currentLength = currentLength;
    }

    public Manager() {
    }

    public void add(FilmConstruct film) {
        FilmConstruct[] tmp = new FilmConstruct[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public FilmConstruct[] findLast() {
        FilmConstruct[] main = findAll();
        if (findAll().length < currentLength) {
            FilmConstruct[] last = new FilmConstruct[findAll().length];
            for (int i = 0; i < findAll().length; i++) {
                last[i] = main[main.length - 1 - i];
            }
            return last;
        } else {
            FilmConstruct[] last = new FilmConstruct[currentLength];
            for (int i = 0; i < last.length; i++) {
                last[i] = main[main.length - 1 - i];
            }
            return last;
        }
    }

    public FilmConstruct[] findAll() {
        return films;
    }
}