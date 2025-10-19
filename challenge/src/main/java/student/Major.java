package student;

public class Major {
    private static int nextId=1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;

    public Major(String code, String name) {
        this.id=nextId++;
        this.code=code;
        this.name=name;
        this.students=new Student[50];

    }

    //Method to add a student
    public void addStudent(Student s) {
        if(studentCount <50){
            this.students[studentCount]=s;
            studentCount++;
        }
        else{
            System.out.println("Cannot add more than 50 students to major: " + name);
        }
    }

    //Getters

    public int  getId() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code=code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public Student[] getStudents() {
        return students;
    }
    public void setStudents(Student[] students) {
        this.students=students;
    }

    //Display all students in the major
    public void displayStudents() {
        for(int i=0; i<studentCount; i++){
            System.out.println(i+1+". "+students[i]);
        }

    }
    public Student findStudentByCNE(String cne){
        for(int i=0; i<studentCount; i++){
            if(students[i].getCne().equals(cne)){
                return students[i];
            }
        }
        return null;
    }
    public int getStudentCount() {
        return studentCount;
    }
    public boolean removeStudent(String cne){
        Student student=findStudentByCNE(cne);
        if(student!=null){
            for (int i=0; i<studentCount; i++){
                if(students[i].getCne()==cne){
                    for(int j=i; j<studentCount-1; j++){
                        students[j]=students[j+1];
                    }

                }
            }
            students[studentCount-1]=null;
            studentCount--;
            return true;
        }
        else{
            return false;
        }
    }
    public double getOccupancyRate(){
        return ((double) studentCount/(double) students.length)*100;
    }
    public String getStudentListAsString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Students in ").append(name).append(" Major:\n");

        for(int i=0; i<studentCount; i++){
            sb.append(i+1+". ").append(students[i].getCne()).append(students[i].getFullNameFormatted()).append("\n");
        }
        return sb.toString();
    }
}