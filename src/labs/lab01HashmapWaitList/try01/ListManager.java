package labs.lab01HashmapWaitList.try01;

// TODO 1: Import HashMap, Map, and Set types
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ListManager {

    // TODO 2: Create a new hash map named studentsMap //
    HashMap studentsMap = new HashMap<>();

    public ListManager(Student [] students){
        /* TODO 3:  Iterate through the studentsArray and add the
                    data to the studentsMap. Use the students'
                    last names as the keys and the student
                    objects as the values  */
        for (Student student: students){
            studentsMap.put(student.lastName, student);
        }
    }


    public void listStudents( ){

        // TODO 4: Check if studentsMap is empty.
        if (studentsMap.isEmpty()){
            // TODO 5: If studentsMap is empty, print an alert saying that
            System.out.println("The student-system is empty");
        } else
        /* TODO 6: If the studentMap is not empty, print a list of all
                   student  */
        {
            Set entries = studentsMap.entrySet();
            for (Object entry : entries){
                Map.Entry mapEntry = (Map.Entry) entry;
                Student student = (Student) mapEntry.getValue();
                System.out.println(student);
            }
        }
    }

    public void findStudent(String lastName){
        // TODO 8: Check if studentsMap contains the last name.
        if (studentsMap.containsKey(lastName)){
            // If not, print: "Student with name 'X' does not exist." and return.
            // TODO 9: If the key exists, get a reference to the Student object using studentsMap.get(lastName)
            Student student = (Student) studentsMap.get(lastName);
            // TODO 10: If the student exists, print the Student object
            System.out.println(student);
        } else {
            // TODO 11: If the student doesn’t exist, print an error message
            System.out.println("Student with name " + lastName + " does not exist.");
        }

    }


    public void updateStudentStatus(String lastName, String newStatus) {
       /* TODO 13: use the get() method on studentMap to obtain a
        reference to the Student object */
        Student student = (Student) studentsMap.get(lastName);
    /* TODO 14: if the student exists, change the status to
        newStatus, and print a confirmation message. */
        if (student != null){
            student.status = "newStatus";
            System.out.println("Status updated to \"" + student.status + "\".");
        } else
        // TODO 15: Print an error message if the student doesn't exist.
        {
            System.out.println("Student " + lastName + " not found.");
        }
    }

    public void removeStudent(String lastName){
        /* TODO 17: using the lastName parameter, attempt to remove
        a student from the studentsMap */
        Student studentRemoved = (Student)studentsMap.remove(lastName);
    /* TODO 18: print a message confirmation and student
        information if the student was successfully removed. */
        if (!studentsMap.containsKey(lastName)){
            System.out.println("Student successfully removed:");
            System.out.println(studentRemoved);
        }else

    /* TODO 19: if the student is not removed, print
        a statement that the student was not removed. */
        {
            System.out.println("Student was not removed.");
        }
    }
}