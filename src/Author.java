public class Author {
    static String name;
    static String email;
    static char gender;

    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public static String getName(){
        return name;
    }

    public static String getEmail(){
        return email;
    }

    public static char getGender(){
        return gender;
    }

    public void setEmail(String Str){
        Author.email = Str;
    }

    public String toString(){
        return (Author.name + " (" + Author.gender + ") at " + Author.email);
    }

}
