import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<AssignmentSubmission> submissionList =new ArrayList<AssignmentSubmission>();
    private String id;
    private String name;
    private String email;
    private String mobileNum;
    private String gender;
    private String age;
    private String address;

    public Student(String id, String name, String email, String mobileNum, String gender, String age, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileNum = mobileNum;
        this.gender = gender;
        this.age = age;
        this.address = address;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void viewEnrolledCourses (List<CourseAttendence> courses) {

        List<CourseAttendence> EnrolledCourses =new ArrayList<CourseAttendence>();
        for (int i = 0; i < courses.size(); i++) {
            if (id == courses.get(i).getStudentID())
            {
                EnrolledCourses.add(courses.get(i));
            }
        }
        for (CourseAttendence c :EnrolledCourses) {
            System.out.println(c);
        }
    }

    public void viewAssignments (String courseId) {

        List<AssignmentSubmission> reqAssignments=new ArrayList<AssignmentSubmission>();
        for (int i = 0; i < submissionList.size(); i++) {
            if (courseId == submissionList.get(i).getCorseID() && id == submissionList.get(i).getStdID() )
            {
                reqAssignments.add(submissionList.get(i));
            }
        }
        for (AssignmentSubmission c :reqAssignments) {
            System.out.println(c);
        }
        //return reqAssignments;
    }

    public void submitAssignment (String assignmentId,String courseId,String Content) {
        submissionList.add(new AssignmentSubmission(assignmentId ,id , courseId, Content));
    }



}
