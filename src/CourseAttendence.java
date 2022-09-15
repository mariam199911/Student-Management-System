import java.time.LocalDate;

public class CourseAttendence {

    private String courseId;
    private String studentId;
    private LocalDate attendanceDate;
    private String status;

    @Override
    public String toString() {
        return "Course Attendence{" +
                ", courseId='" + courseId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", attendanceDate=" + attendanceDate +
                ", status='" + status + '\'' +
                '}';
    }

    public CourseAttendence( String courseId, String studentId, String status) {
        this.courseId = courseId;
        this.studentId = studentId;
        this.status = status;
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

