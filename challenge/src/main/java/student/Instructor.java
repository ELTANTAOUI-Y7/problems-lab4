package student;

public class Instructor extends Person {
    String emplyoeeNumber;
    public Instructor(String emplyoeeNumber) {
        this.emplyoeeNumber = emplyoeeNumber;
    }
    public String getEmplyoeeNumber() {
        return emplyoeeNumber;
    }
    public void setEmplyoeeNumber(String emplyoeeNumber) {
        this.emplyoeeNumber = emplyoeeNumber;
    }
    String cleanEmployeeNumber(){
        return emplyoeeNumber.trim().replaceAll(" ", "");
    }
    String summaryLine(){
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",this.emplyoeeNumber,this.secondName,this.firstName);

    }
    String toCard(){
        StringBuilder card = new StringBuilder();
        card.append("Instructor\n").
                append("----------\n").
                append("Employee #: ").append(emplyoeeNumber).append("\n").
                append("Name      : ").append(secondName).append(", ").append(firstName).append("\n").
                append("Email     : ").append(email).append("\n").
                append("Phone     : ").append(phone).append("\n");
        return card.toString();
    }
    String displayName(){
        StringBuilder sb = new StringBuilder();

        if (secondName != null && !secondName.isEmpty()) {
            sb.append(secondName);
        }

        if (firstName != null && !firstName.isEmpty()) {
            if (!sb.isEmpty()) {
                sb.append(" ");
            }
            sb.append(firstName);
        }


        return sb.toString();
    }
}