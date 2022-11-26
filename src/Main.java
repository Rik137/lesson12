import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
        validateUser(getUserByLoginAndPassword(login, password));
        System.out.println("Доступ предоставлен");

    }

    public static User[] getUsers() {
        User user1 = new User("666", "Gorila", 24, "gorila@icloud.com");
        User user2 = new User("4444", "Boy12", 15, "boy12@icloud.com");
        User user3 = new User("3333", "Girl134", 30, "girl34@icloud.com");
        User user4 = new User("9999", "denn", 10, "den100@icloud.com");

        return new User[]{user1, user2, user3, user4};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassWord().equals(password)) {
              return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if(user.getAge() > 18){
            System.out.println("Welcome " + user.getLogin());
            return;
        }
         throw new AccessDeniedException("пользователю меньше 18 лет");
    }
}