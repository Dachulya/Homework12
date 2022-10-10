public class Author {
    private String firstName;
    private String secondName;
    public Author(String firstName,String secondName){
        this.firstName=firstName;
        this.secondName=secondName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    @Override//переопределение что бы кракозябру не выводило
    public String toString(){
        return "Author name: "+firstName+" "+secondName;
    }

    /*public boolean equals(Author author){
      return
    }*/
    //hachcode  объясните
    }
