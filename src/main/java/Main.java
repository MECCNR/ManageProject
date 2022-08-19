public class Main {
    // это класс был создан для отладки
    public static void main(String[] args) {
        FilmConstruct film1 = new FilmConstruct(1, "Bloodshot", "Action");
        FilmConstruct film2 = new FilmConstruct(2, "Forward", "Adventure");
        FilmConstruct film3 = new FilmConstruct(3, "Hotel \"BELGRAD\"", "Comedy");

        ManagerClass manage = new ManagerClass();
        manage.add(film1);
        manage.add(film2);
        manage.add(film3);

        manage.findAll();
    }
}