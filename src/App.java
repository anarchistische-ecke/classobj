public class App {
    public static void main(String[] args) {
        Author kurtVonnegut = new Author("Kurt", "Vonnegut");
        Author scottFitzgerald = new Author("Scott", "Fitzgerald");

        Book catsCradle = new Book("Cat's Cradle", kurtVonnegut, 1963);
        Book greatGatsby = new Book("The Great Gatsby", scottFitzgerald, 1925);

        catsCradle.setYear(1999);
    }
}
