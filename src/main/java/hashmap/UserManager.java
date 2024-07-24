package hashmap;

import java.util.HashMap;

public class UserManager {
    private HashMap<String, String> users;

    public UserManager() {
        users = new HashMap<>();
    }

    public void addUser(String username, String password) {
        if (!users.containsKey(username)) {
            users.put(username, password);
            System.out.println("User added successfully.");
        } else {
            System.out.println("Username already exists.");
        }
    }

    public void changePassword(String username, String oldPassword, String newPassword) {
        if (users.containsKey(username) && users.get(username).equals(oldPassword)) {
            users.put(username, newPassword);
            System.out.println("Password changed successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    public boolean validateUser(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }

    public void displayUsers() {
        System.out.println("Users:");
        for (String username : users.keySet()) {
            System.out.println(username);
        }
    }
}


