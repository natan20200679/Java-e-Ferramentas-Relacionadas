package junit3.user;

public class User {
    private String id;
    private String name;
    private String email;

    private User(final String anId, final String aname, final String anEmail) {
        this.id = anId;
        this.name = aname;
        this.email = anEmail;
        this.validate();
    }

    public static User builder(final String anId, final String aname, final String anEmail) {
        return new User(anId, aname, anEmail);
    }

    private void validate() {
        if (this.email.isEmpty()) {
            throw new RuntimeException("user email should not be blank");
        }
    }
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
    }

}
