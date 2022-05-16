package day12.upStudentSystem;

public class user {
    private String name;
    private String password;
    private String Id;
    private String pNumber;
    public user(String name, String password, String id, String pNumber) {
        this.name = name;
        this.password = password;
        Id = id;
        this.pNumber = pNumber;
    }

    public user() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getpNumber() {
        return pNumber;
    }

    public void setpNumber(String pNumber) {
        this.pNumber = pNumber;
    }


}
