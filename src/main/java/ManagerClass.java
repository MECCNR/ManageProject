public class ManagerClass {

    private int defaultLength = 10;

    private FilmConstruct[] films = new FilmConstruct[0];

    public void add(FilmConstruct film) {
        FilmConstruct[] tmp = new FilmConstruct[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String findAll() {
        String resultie = "";
        for (int i = 0; i < films.length; i++) {
            String all = films[i].toString();
            System.out.println(all);
            resultie = resultie + all + "\n";
        }
        return resultie;
    }

    public String findLast(int yourLength) {
        if (yourLength > films.length) {
            if (yourLength < 0) {
                return null;
            }
            return null;
        } else {
            String resultie = "";
            FilmConstruct[] last = new FilmConstruct[films.length];
            for (int i = 0; i < yourLength; i++) {
                last[i] = films[films.length - 1 - i];
                String least = last[i].toString();
                resultie = resultie + least + "\n";
                System.out.println(least);
            }
            return resultie;
        }
    }

    public String findLast() {
        if (defaultLength > films.length) {
            if (defaultLength < 0) {
                return null;
            }
            return null;
        } else {
            String resultie = "";
            FilmConstruct[] last = new FilmConstruct[films.length];
            for (int i = 0; i < defaultLength; i++) {
                last[i] = films[films.length - 1 - i];
                String least = last[i].toString();
                resultie = resultie + least + "\n";
                System.out.println(least);
            }
            return resultie;
        }
    }

    public FilmConstruct[] getFilms() {
        return films;
    }
}