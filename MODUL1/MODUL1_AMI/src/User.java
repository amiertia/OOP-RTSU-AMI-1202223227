public class User {

    // TODO: Create Private Attribute of User (Name and Phone Number) then Create Setter method for each attribute

        private String Username;
        private String PhoneNumber;
    
        public void setUsername(String username) {
            Username = username;
        }
        public void setPhoneNumber(String phoneNumber) {
            PhoneNumber = phoneNumber;
        }
    
        public String getUsername() {
            return Username;
        }
    
        public String getPhoneNumber() {
            return PhoneNumber;
        }
    
    // Register
        public void Register(String name, String PhoneNumber) {
            setUsername(name);
            setPhoneNumber(PhoneNumber);
        }
    



    // TODO: Create Method to Register User and Display User's Name and Phone Number and success message

}
