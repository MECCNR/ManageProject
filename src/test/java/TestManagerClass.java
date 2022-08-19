import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestManagerClass {

    FilmConstruct film1 = new FilmConstruct(1, "Bloodshot", "Action");
    FilmConstruct film2 = new FilmConstruct(2, "Forward", "Adventure");
    FilmConstruct film3 = new FilmConstruct(3, "Hotel \"BELGRAD\"", "Comedy");

    FilmConstruct film4 = new FilmConstruct(4, "Cars", "Cartoon");

    FilmConstruct film5 = new FilmConstruct(5, "Gentelmens", "Action");

    FilmConstruct film6 = new FilmConstruct(6, "Invisibleman", "Horror");

    FilmConstruct film7 = new FilmConstruct(7, "Trolls", "Cartoon");

    FilmConstruct film8 = new FilmConstruct(8, "Number One", "Comedy");

    FilmConstruct film9 = new FilmConstruct(9, "Tron: Legacy", "Action");

    FilmConstruct film10 = new FilmConstruct(10, "Spider Man", "Action");


    @Test
    public void additionTest() {
        ManagerClass manage = new ManagerClass();
        manage.add(film1);
        manage.add(film2);
        manage.add(film3);

        FilmConstruct[] expected = {film1, film2, film3};
        FilmConstruct[] actual = manage.getFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void outputTest() {
        ManagerClass manage = new ManagerClass();
        manage.add(film1);
        manage.add(film2);
        manage.add(film3);

        // для тестирования этого модуля в "expected" вставьте 'film[номер фильма].toString() + "\n"'

        String expected = (film1.toString() + "\n" + film2.toString() + "\n" + film3.toString() + "\n");
        String actual = manage.findAll();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findLastTest() {
        ManagerClass manage = new ManagerClass();
        manage.add(film1);
        manage.add(film2);
        manage.add(film3);

        // для тестирования этого модуля в "expected" вставьте 'film[номер фильма].toString() + "\n"'
        // в обратном порядке

        String expected = (film3.toString() + "\n" + film2.toString() + "\n" + film1.toString() + "\n");
        String actual = (manage.findLast(3));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findLastDefaultTest() {
        ManagerClass manage = new ManagerClass();
        manage.add(film1);
        manage.add(film2);
        manage.add(film3);
        manage.add(film4);
        manage.add(film5);
        manage.add(film6);
        manage.add(film7);
        manage.add(film8);
        manage.add(film9);
        manage.add(film10);

        String expected = (film10.toString() + "\n" +
                film9.toString() + "\n" + film8.toString() + "\n" + film7.toString()
                + "\n" + film6.toString() + "\n" + film5.toString() + "\n" + film4.toString() +
                "\n" + film3.toString() + "\n" + film2.toString() + "\n" + film1.toString() + "\n");
        String actual = (manage.findLast());

        Assertions.assertEquals(expected, actual);
    }
}
