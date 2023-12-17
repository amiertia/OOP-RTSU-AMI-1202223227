public class Admin extends User {

    public Admin(String name, int id) {
        super(name, id);
    }

    public void manageSystem(String course) {
        System.out.println("Managing system for course: " + course);
    }

    @Override
    public String GetUserDetails() {
        return super.GetUserDetails();
    }

    
}
