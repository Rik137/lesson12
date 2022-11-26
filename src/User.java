public class User {
    private String passWord;
    private String login;
    private int age;
    private String email;

    public User(String passWord, String login, int age, String email){
        this.passWord = passWord;
        this.login = login;
        this.age = age;
        this.email = email;
    }
    public String getLogin(){
        return login;
    }
    public String getPassWord(){
        return passWord;
    }
    public int getAge(){
        return age;
    }
}
