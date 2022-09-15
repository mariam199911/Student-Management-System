import java.time.LocalDate;

public class AssignmentSubmission {
    private String assignmentId;
    private String studentId;
    private String courseId;
    private LocalDate submissionDate = LocalDate.now();
    private String assignmentContentSubmitted;
    private float assignmentMarks = 0;

    public AssignmentSubmission(String assignmentId, String studentId, String courseId, String assignmentContentSubmitted,float assignmentMarks) {
        this.assignmentId = assignmentId;
        this.studentId = studentId;
        this.courseId = courseId;
        this.assignmentContentSubmitted = assignmentContentSubmitted;
        this.assignmentMarks=assignmentMarks;
    }

    @Override
    public String toString() {
        return "AssignmentSubmission{" +
                "assignmentId='" + assignmentId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", courseId='" + courseId + '\'' +
                ", submissionDate=" + submissionDate +
                ", assignmentContentSubmitted='" + assignmentContentSubmitted + '\'' +
                ", assignmentMarks=" + assignmentMarks +
                '}';
    }

    public String getID() {

        return assignmentId;
    }
    public String getStdID() {

        return studentId;
    }
    public String getCorseID() {

        return courseId;
    }
    public LocalDate getsumittionDate() {

        return submissionDate;
    }
    public String getContent() {

        return assignmentContentSubmitted;
    }
    public float getAssignmentMarks() {

        return assignmentMarks;
    }
    public void setID(String id) {

        assignmentId=id;
    }
    public void setStudentID(String id) {

        studentId =id;
    }
    public void setCourseID(String id) {

        courseId =id;
    }
    public void setSubmissionDate(LocalDate Ldate) {

        submissionDate=Ldate;
    }
    public void setAssignmentContentSubmitted(String assignment) {

        assignmentContentSubmitted =assignment;
    }
    public void setMarks(float marks) {

        assignmentMarks=marks;
    }
//    public static void  main (String[] args) {
//        System.out.println("AssignmentSubmittion Class");
//    }
}
