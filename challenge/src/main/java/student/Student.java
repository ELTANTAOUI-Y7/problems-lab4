package student;

public class Student extends Person {
    private String cne;
    private Major major;
    private static final Major DEFAULT_CS_MAJOR=new Major("23","Computer Science");

    public Student(String cne,Major major) {
        super();
        this.cne=cne;
        this.major=major;
        major.addStudent(this);
    }

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(prenom,nom,telephone,email);
        this.cne=cne;
        this.major=major;
        major.addStudent(this);

    }

    //}
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        this(nom,prenom,telephone,email,cne,DEFAULT_CS_MAJOR);

    }
    //}

    // Getters
    public String getCne() {
        return cne;
    }
    public Major getMajor() {
        return major;
    }


    // Setters
    public void setMajor(Major major) {
        this.major=major;
    }
    public void setCne(String cne) {
        this.cne=cne;
    }

    @Override
    public String toString() {
        return cne + " " + getFullNameFormatted();
    }
    public String getFullNameFormatted(){
        return String.format(" %s, %s", this.secondName.toUpperCase(), this.firstName);
    }


}