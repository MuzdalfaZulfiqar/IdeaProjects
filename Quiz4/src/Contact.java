public class Contact {
    String firstName;
    String lastName;
    int phone;
    String email;
    Contact(){
        firstName = null;
        lastName = null;
        phone = 123;
        email = null;
    }
    Contact(String f, String l, String e, int p){
        firstName = f;
        lastName = l;
        phone = p;
        email = e;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void display(){
        System.out.println("Name : "+firstName);
        System.out.println("Phone : "+phone);
        System.out.println("Email : "+email);
    }
}
