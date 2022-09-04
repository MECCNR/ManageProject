import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdditionalTests {
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

    FilmConstruct film11 = new FilmConstruct(11, "Mega Man", "Action");

    @Test
    public void lessThanLimitTest() {
        Manager manage = new Manager(5);
        manage.add(film1);
        manage.add(film2);
        manage.add(film3);
        manage.add(film4);

        FilmConstruct[] expected = {film4, film3, film2, film1};
        FilmConstruct[] actual = manage.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void moreThanLimitTest() {
        Manager manage = new Manager(3);
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

        FilmConstruct[] expected = {film10, film9, film8};
        FilmConstruct[] actual = manage.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sameLimitTest() {
        Manager manage = new Manager(5);
        manage.add(film1);
        manage.add(film2);
        manage.add(film3);
        manage.add(film4);
        manage.add(film5);

        FilmConstruct[] expected = {film5, film4, film3, film2, film1};
        FilmConstruct[] actual = manage.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
