package practice2.task1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Лев Толстой", "tolstoy@mail.ru", 'm');
        System.out.println(author);

        System.out.println("Имя: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Пол: " + author.getGender());

        author.setEmail("leo.tolstoy@yandex.ru");
        System.out.println("После смены email: " + author);
    }
}
