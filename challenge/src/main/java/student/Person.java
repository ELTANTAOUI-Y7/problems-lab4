package student;

public class Person {
    private static int nextId=1;
    protected int id;
    protected String firstName;
    protected String secondName;
    protected String phone;
    protected String email;

    public Person(String firstName, String secondName, String telephone, String email) {
        this.id=nextId++;
        this.firstName=firstName;
        //add others
        this.secondName=secondName;
        this.phone=telephone;
        this.email=email;

    }
    public Person(){
        this.id=nextId++;
        this.firstName="";
        this.secondName="";
        this.phone="";
        this.email="";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName=secondName;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone=phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email=email;
    }
    public String toString(){
        return  "First Name: "+ this.firstName + "\nLast Name: "+this.secondName+"\nId: "+this.id+ "\nPhone:  "+ this.phone +"\nEmail:  "+ this.email;
    }


}
