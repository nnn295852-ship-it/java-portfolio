interface Storable {
    void save();
}

interface Loadable {
    void load();
}

interface Displayable {
    void display();
}

class UserProfile implements Storable, Loadable, Displayable {

    String username;
    int age;

    UserProfile(String username, int age) {
        this.username = username;
        this.age = age;
    }

    @Override
    public void save() {
        System.out.println("User profile has been saved.");
    }

    @Override
    public void load() {
        System.out.println("User profile has been loaded.");
    }

    @Override
    public void display() {
        System.out.println("Username: " + username);
        System.out.println("Age: " + age);
    }
}

public class Interface5 {
    public static void main(String[] args) {

        UserProfile user = new UserProfile("Alice", 20);

        user.save();
        user.load();
        user.display();
    }
}