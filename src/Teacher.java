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
        Database.getInstance().courses.add(course);
    }

    public void addAssignment(String courseId,Assignment assignment){
        if(Database.getInstance().course_assignments.containsKey(courseId)){
            Database.getInstance().course_assignments.get(this.id).add(assignment);
        }else {
            ArrayList<Assignment> assignmentList= new ArrayList<Assignment>();
            assignmentList.add(assignment);
            Database.getInstance().course_assignments.put(courseId,assignmentList);
        }
    }

    public void viewStudentsAssignedCourses(){
        for (String it: Database.getInstance().course_students.keySet()) {
//            String key = ;
            System.out.println("Course id: "+"\n"+it);
            System.out.println("Course Students: "+"\n");
            List<Student> stList = Database.getInstance().course_students.get(it);
            for (Student s : stList){
                System.out.println(s);
            }
        }
    }

    public void getStudentsInCourse(String CourseID){
        if(Database.getInstance().course_students.containsKey(CourseID)){
            List<Student> stList = Database.getInstance().course_students.get(CourseID);
            for (Student s : stList){
                System.out.println(s);
            }
        }else {
            System.out.println("No course with this ID");
        }

    }
    public void getAllCourses(){
        for (Courses c: Database.getInstance().courses) {
            System.out.println(c);
        }
    }

    public Student getStudentData(String studentId){
        Student resStudent= new Student ("null" , "null" , "null" , "null", "null" , "null" , "null");
        for (int i = 0; i < Database.getInstance().students.size(); i++) {
            if (Database.getInstance().students.get(i).getId().equals(studentId) ) {
                resStudent = Database.getInstance().students.get(i);
                System.out.println(resStudent);
            }
        }
        return resStudent;
    }

    public void submitStudentsAttendance(CourseAttendence courseAttendence){
        Database.getInstance().courseAttendances.add(courseAttendence);
    }
}
