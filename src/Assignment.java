import java.time.LocalDate;

public class Assignment {

    private String assignmentId;
    private String description;
    private String courseId;
    private LocalDate dueDate;


    public Assignment(String assignmentId, String description, String courseId) {
        this.assignmentId = assignmentId;
        this.description = description;
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "assignmentId='" + assignmentId + '\'' +
                ", description='" + description + '\'' +
                ", courseId='" + courseId + '\'' +
                ", dueDate=" + dueDate +
                '}';
    }

    public String getID() {
        return assignmentId;
    }
    public String getDescription() {
        return description;
    }
    public String getCorseID() {
        return courseId;
    }
    public LocalDate getDueDate() {
        return dueDate;
    }
    public void setID(String id) {
        assignmentId=id;
    }
    public void setDescription(String des) {
        description=des;
    }
    public void setCourseID(String id) {
        courseId =id;
    }
    public void setdueDate(LocalDate Ddate) {
        dueDate =Ddate;
    }

//    public static void  main (String[] args) {
//        System.out.println("Assignment Class");
//    }
}
