public class Teacher extends User {

    public Teacher(String name, int id) {
        super(name, id);
        
    }

    public void teachClass(String course) {
        System.out.println("Teaching course: " + course);
    }

    @Override
    public String GetUserDetails() {
        return super.GetUserDetails();
    }

    
    
}
