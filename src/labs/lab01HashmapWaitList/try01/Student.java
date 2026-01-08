package labs.lab01HashmapWaitList.try01;

public class Student {
    public int studentId;
    public String firstName, lastName;
    public String status; // enrolled, under-review, rejected

    public Student(int id, String fName, String lName, String status){
        this.studentId = id;
        this.firstName = fName;
        this.lastName = lName;
        this.status = status;
    }

    @Override
    public String toString(){
        String str = "ID:'" + this.studentId + "'";
        str +=  "\tName: '" + this.lastName + "'";
        str += this.firstName + "'";
        str += "\tSTATUS: '" + this.status +"'";
        return str;
    }
}
