public class User {
   
   // TO DO: Create Private Attributes of User (nama, noHandphone)
          public String name;
          public String phone;
   
   // TO DO: Create Constructor of User
          
          public void setName(String name) {
              this.name = name;
          }
          public void setPhone(String phone) {
              this.phone = phone;
          }
   // TO DO: Create register Method to show information about name and phone number
          public String getName() {
              return name;
          }
          public String getPhone() {
              return phone;
          }
   // TO DO: Create method to return name and phone number
          public void register() {
              System.out.println("User registered");
              System.out.println("Nama: " + name + "\nPhone: " + phone);
          }
        
      
   

}






  