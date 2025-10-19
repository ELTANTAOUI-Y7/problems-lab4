package student;


public class Subject {
    int  id;
    String code ;
    String title;

    public  Subject(int id, String code, String title) {
        this.id=id;
        this.code=code;
        this.title=title;
    }
    public int getId() {
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
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title=title;
    }
    public String normalizedCode(){
        return code.trim().toUpperCase();
    }
    public String properTitle(){
        String words[]=title.trim().split(" +");
        StringBuilder sb=new StringBuilder();
        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }

        return sb.toString().trim();
    }
    public boolean isIntroCourse() {
        return (this.title.trim().toLowerCase().contains("intro"))||(this.code.trim().startsWith("INTRO-"));
    }
    public String syllabusLine(Instructor instructor) {
        StringBuilder sb=new StringBuilder();

        sb.append(code)
                .append(" - ")
                .append(title)
                .append(" (Instructor: ");
        if(instructor.getSecondName()!=null){sb.append(instructor.getSecondName());};
        sb.append(" ");
        if(instructor.getFirstName()!=null){sb.append(instructor.getFirstName());};
        sb.append(")");

        return sb.toString();
    }
}