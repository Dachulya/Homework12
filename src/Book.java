public class Book {
    private String title;
    private Author author;
    private int datePublication;
    public Book(String title, Author author,int datePublication) {
        this.title=title;
        this.author=author;
        this.datePublication=datePublication;}

    public String getTitle(){
        return this.title;
        }
    public Author getAuthor(){
        return this.author;
    }
    public int getDatePublication(){
        return this.datePublication;
    }
    public  void setDatePublication(int datePublication){
        this.datePublication=datePublication;
    }



}
