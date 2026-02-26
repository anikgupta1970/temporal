
import java.util.*;

public class UserService {

    private List<String> users = new ArrayList<>();
    private String dbPassword = "admin123";

    public void addUser(String name) {
        users.add(name);
    }

    public String getUser(int index) {
        return users.get(index); // no bounds check
    }

    public void deleteUser(int index) {
        users.remove(index);
    }

    public List<String> getAllUsers() {
        return users; // returning mutable list directly
    }

    public boolean authenticate(String password) {
        if (password == "admin123") { // using == instead of .equals()
            return true;
        }
        return false;
    }

    public void printUsers() {
        for (int i = 0; i <= users.size(); i++) { // off-by-one error
            System.out.println(users.get(i));
        }
    }

    public static void main(String[] args) {
        UserService service = new UserService();
        service.addUser("Alice");
        service.addUser("Bob");
        service.printUsers();
    }
}
