import java.util.List;
import java.util.ArrayList;

public class Teacher {
//    private List<Student> students = new ArrayList<Student>();

    private  String id;
    private String name;
    private String email;
    private String mobileNum;

    public Teacher(String id, String name, String email, String mobileNum) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileNum = mobileNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }



    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileNum='" + mobileNum + '\'' +
                '}';
    }
    public void addCourse(Courses course){
        Database.getInstance().addCours(course);
    }

    public void addAssignment(String courseId,Assignment assignment){
      Database.getInstance().addAssignmentinDatabase(courseId,assignment);
    }

    public void viewStudentsAssignedCourses(){
        if(Database.getInstance().getCourse_students().isEmpty()){
            System.out.println("No Students Assigned Courses to view");
        }else {
            for (String it: Database.getInstance().getCourse_students().keySet()) {
                System.out.println("Course id: "+it);
                System.out.println("Course Students: ");
                List<Student> stList = Database.getInstance().getCourse_students().get(it);
                for (Student s : stList){
                    System.out.println(s);
                }
            }
        }
    }

    public void getStudentsInCourse(String CourseID){
        if(Database.getInstance().getCourse_students().isEmpty()){
            System.out.println("No available data to show");
        }
        else if(Database.getInstance().getCourse_students().containsKey(CourseID)){
            List<Student> stList = Database.getInstance().getCourse_students().get(CourseID);
            for (Student s : stList){
                System.out.println(s);
            }
        }else {
            System.out.println("No course with this ID");
        }

    }
    public void getAllCourses(){
        for (Courses c: Database.getInstance().getCourses()) {
            System.out.println(c);
        }
    }

    public Student getStudentData(String studentId){
        Student resStudent= new Student ("null" , "null" , "null" , "null", "null" , "null" , "null");
        for (int i = 0; i < Database.getInstance().getStudents().size(); i++) {
            if (Database.getInstance().getStudents().get(i).getId().equals(studentId) ) {
                resStudent = Database.getInstance().getStudents().get(i);
                System.out.println(resStudent);
            }
        }
        return resStudent;
    }

    public void submitStudentsAttendance(CourseAttendence courseAttendence){
        Database.getInstance().addCourseAttendances(courseAttendence);
    }
}
