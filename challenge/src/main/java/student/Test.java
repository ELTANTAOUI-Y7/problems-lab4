package student;

public class Test {
    public static void main(String[] args) {

        //a.Create majors
        Major cs=new Major("11", "Computer Science");
        Major math=new Major("22", "Statistics");

        //b.Create some students associated with these majors
        Student s1=new Student("Youssef", "Bennani", "0611223344", "youssef.bennani@gmail.com", "99110011", cs);
        Student s2=new Student("Sara", "El Amrani", "0677889900", "sara.elamrani@gmail.com", "99110022", cs);
        Student s3=new Student("Hajar", "Oukili", "0699887766", "hajar.oukili@gmail.com", "99220033", math);

        //c.Display Computer Science students
        System.out.println("The list of students in the computer science major is:");
        System.out.println(cs.getStudentListAsString());

        //6.Test findStudentByCNE
        System.out.println("\nSearching for student with CNE 99110022...");
        Student found=cs.findStudentByCNE("99110022");
        if (found != null) {
            System.out.println("Student found: " + found.getFullNameFormatted());
        } else {
            System.out.println("Student not found!");
        }

        //7.Count how many students are enrolled
        System.out.println("\nCurrent number of students in CS: " + cs.getStudentCount());

        //8.Test removeStudent
        System.out.println("\nRemoving student with CNE 99110011");
        boolean removed=cs.removeStudent("99110011");
        System.out.println("Removed: " + removed);

        System.out.println("\nUpdated list of Computer Science students:");
        System.out.println(cs.getStudentListAsString());

        //9.Display the occupancy rate
        System.out.printf("Occupancy rate: %.2f%%\n", cs.getOccupancyRate());

        //10.Show the formatted full name example
        System.out.println("\nFormatted name example:");
        System.out.println(s2.getFullNameFormatted());

        //Test Instructor
        Instructor instr1=new Instructor("INS-202");
        instr1.setFirstName(null);
        instr1.setSecondName("Latifi");

        Instructor instr2=new Instructor("INS-101");
        instr2.setFirstName("Karim");
        instr2.setSecondName(null);

        Instructor instr3=new Instructor("INS-303");
        instr3.setFirstName("Mouna");
        instr3.setSecondName("Tazi");


        System.out.println(" Instructor displayName()");
        System.out.println(instr1.displayName());
        System.out.println(instr2.displayName());
        System.out.println(instr3.displayName());
        //Test Subject
        Subject subj1=new Subject(306," SE-306", "introduction to java");
        Subject subj2=new Subject(500,"DS-500", "Data Structures");
        Subject subj3=new Subject(402,"AP-402", "Advanced Programming");

        System.out.println("\n Subject normalizedCode()");
        System.out.println(subj1.normalizedCode());
        System.out.println(subj2.normalizedCode());
        System.out.println(subj3.normalizedCode());

        System.out.println("\n Subject properTitle()");
        System.out.println(subj1.properTitle());
        System.out.println(subj2.properTitle());
        System.out.println(subj3.properTitle());

        System.out.println("\n Subject isIntroCourse()");
        System.out.println(subj1.isIntroCourse());
        System.out.println(subj2.isIntroCourse());
        System.out.println(subj3.isIntroCourse());

        System.out.println("\n Subject syllabusLine()");
        System.out.println(subj1.syllabusLine(instr1));
        System.out.println(subj2.syllabusLine(instr2));
        System.out.println(subj3.syllabusLine(instr3));


    }
}