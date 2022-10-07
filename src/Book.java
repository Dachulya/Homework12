public class Book {
    private String title;
    private String author;
    private int datePublication;
    public Book(String title,String author,int datePublication) {
        this.title=title;
        this.author=author;
        this.datePublication=datePublication;}

    public String getTitle(){
        return this.title;
        }
    public String getAuthor(){
        return this.author;
    }
    public int getDatePublication(){
        return this.datePublication;
    }
    public  void setDatePublication(int datePublication){
        this.datePublication=datePublication;
    }
}
