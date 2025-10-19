package student;

public class Test {
    public static void main(String[] args) {

        //a.Create majors
        Major cs=new Major("23", "Computer Science");
        Major math=new Major("45", "Mathematics");

        //b.Create some students associated with these majors
        Student s1=new Student("Amal", "Safi", "0612345678", "amal.safi@gmail.com", "22885676", cs);
        Student s2=new Student("Samir", "Alami", "0622334455", "samir.alami@gmail.com", "23585976", cs);
        Student s3=new Student("Yahya", "EL-TANTAOUI", "0633445566", "Yahya.EL-TANTAOUI@gmail.com", "23566787", math);

        //c.Display Computer Science students
        System.out.println("The list of students in the computer science major is:");
        System.out.println(cs.getStudentListAsString());

        //6.Test findStudentByCNE
        System.out.println("\nSearching for student with CNE 23585976...");
        Student found=cs.findStudentByCNE("23585976");
        if (found != null) {
            System.out.println("Student found: " + found.getFullNameFormatted());
        } else {
            System.out.println("Student not found!");
        }

        //7.Count how many students are enrolled
        System.out.println("\nCurrent number of students in CS: " + cs.getStudentCount());

        //8.Test removeStudent
        System.out.println("\nRemoving student with CNE 22885");
        boolean removed=cs.removeStudent("22885676");
        System.out.println("Removed: " + removed);

        System.out.println("\nUpdated list of Computer Science students:");
        System.out.println(cs.getStudentListAsString());

        //9.Display the occupancy rate
        System.out.printf("Occupancy rate: %.2f%%\n", cs.getOccupancyRate());

        //10.Show the formatted full name example
        System.out.println("\nFormatted name example:");
        System.out.println(s2.getFullNameFormatted());

        //Test Instructor
        Instructor instr1=new Instructor("INS-101");
        instr1.setFirstName("Karim");
        instr1.setSecondName(null);

        Instructor instr2=new Instructor("INS-202");
        instr2.setFirstName(null);
        instr2.setSecondName("Latifi");

        Instructor instr3=new Instructor("INS-303");
        instr3.setFirstName("Mouna");
        instr3.setSecondName("Tazi");


        System.out.println(" Instructor displayName()");
        System.out.println(instr1.displayName());
        System.out.println(instr2.displayName());
        System.out.println(instr3.displayName());
        //Test Subject
        Subject subj1=new Subject(101," cs-101 ", "introduction to java");
        Subject subj2=new Subject(675,"DS-675", "Data Structures");
        Subject subj3=new Subject(107,"APG-107", "Advanced Programming");

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