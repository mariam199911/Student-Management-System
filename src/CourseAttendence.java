import java.time.LocalDate;

public class CourseAttendence {

    private String id;
    private String courseId;
    private String studentId;
    private LocalDate attendanceDate;
    private String status;

    @Override
    public String toString() {
        return "CourseAttendence{" +
                "id='" + id + '\'' +
                ", courseId='" + courseId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", attendanceDate=" + attendanceDate +
                ", status='" + status + '\'' +
                '}';
    }

    public CourseAttendence(String id, String courseId, String studentId, String status) {
        this.id = id;
        this.courseId = courseId;
        this.studentId = studentId;
        this.status = status;
    }

    public String getID() {
        return id;
    }
    public String getStudentID() {
        return studentId;
    }
    public String getCorseID() {
        return courseId;
    }
    public String getStatus() {
        return status;
    }
    public LocalDate getAttendanceDate() {
        return attendanceDate;
    }
    public void setID(String attendanceID) {
        id=attendanceID;
    }
    public void setStudentID(String SID) {
        studentId =SID;
    }
    public void setCourseID(String id) {
        courseId =id;
    }
    public void setAttendanceDate(LocalDate Adate) {
        attendanceDate=Adate;
    }
    public void setStatus(String Astatus) {
        status=Astatus;
    }
//    public static void  main (String[] args) {
//        System.out.println("CourseAttendence Class");
//    }
}