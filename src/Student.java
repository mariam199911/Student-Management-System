import java.util.ArrayList;
import java.util.List;

public class Student {
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

    @Override
    public String toString() {
        return "Student{" +

                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileNum='" + mobileNum + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public void enrollCourse (Courses course) {
        if(Database.getInstance().student_courses.containsKey(this.id)){
            Database.getInstance().student_courses.get(this.id).add(course);
        }else {
            ArrayList<Courses> coursesList= new ArrayList<Courses>();
            coursesList.add(course);
            Database.getInstance().student_courses.put(this.id,coursesList);
        }
        //////////////////////////////////////////////////////////////////////
        if(Database.getInstance().course_students.containsKey(course.getId())){
            Database.getInstance().course_students.get(course.getId()).add(this);
        }else {
            ArrayList<Student> studentsList= new ArrayList<Student>();
            studentsList.add(this);
            Database.getInstance().course_students.put(course.getId(),studentsList);
        }
    }

    public void viewEnrolledCourses () {
        if(Database.getInstance().student_courses.containsKey(this.id)){
            for (Courses c :Database.getInstance().student_courses.get(this.id)) {
            System.out.println(c);
        }
        }else {
            System.out.println("No Enrolled Courses");
        }
    }

    public void viewAssignments (String courseId) {
        if(Database.getInstance().course_assignments.containsKey(courseId)){
            for (Assignment c :Database.getInstance().course_assignments.get(courseId)) {
                System.out.println(c);
            }
        }else {
            System.out.println("No Assignments to show");
        }
        //return reqAssignments;
    }

    public void submitAssignment (AssignmentSubmission assignmentSubmission) {
        Database.getInstance().assignment_submissions.add(assignmentSubmission);
    }



}
