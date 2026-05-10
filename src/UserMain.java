public class UserMain {


     // TODO TC-7: Generate Constructor: Delete the constructor below, place cursor on a blank line -> type '..' -> Generate Constructor
     // TODO TC-8: Generate Getters/Setters: Delete all methods below -> type '..' -> Generate Getters/Setters
     // TODO TC-9: Rename 'name' field and verify synchronization in methods below

    private String name;
    private int age;

    public UserMain(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}