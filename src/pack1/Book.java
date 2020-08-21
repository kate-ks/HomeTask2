package pack1;

public class Book {
    public static void main(String[] args) {
        Author author=new Author();
        author.name="Hemingway";

        Title bookTitle= new Title();
        bookTitle.title="For Whom the Bell Tolls";

        Content bookContent= new Content();
        bookContent.content="It tells the story of Robert Jordan";

        author.show();
        bookContent.show();
        bookTitle.show();

    }
}
