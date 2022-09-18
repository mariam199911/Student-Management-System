import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student implements Person{
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
    public Student() {

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
    Database.getInstance().enrollCourse(course,this);
    }

    public void viewEnrolledCourses () {
        if(Database.getInstance().getStudent_courses().containsKey(this.id)){
            for (Courses c :Database.getInstance().getStudent_courses().get(this.id)) {
            System.out.println(c);
        }
        }else {
            System.out.println("No Enrolled Courses");
        }
    }

    public void viewAssignments (String courseId) {
        if(Database.getInstance().getCourse_assignments().containsKey(courseId)){
            for (Assignment c :Database.getInstance().getCourse_assignments().get(courseId)) {
                System.out.println(c);
            }
        }else {
            System.out.println("No Assignments to show");
        }
        //return reqAssignments;
    }

    public void submitAssignment (AssignmentSubmission assignmentSubmission) {
        Database.getInstance().addAssignmentsubmission(assignmentSubmission);
    }


    @Override
    public void personfun() {
        Admin Ad1 = new Admin("1", "Reda", "reda33@gmail.com", "01024051332");
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello Student");
        Student student;
        {
            System.out.print("Please enter your ID\n");
            String id = sc.next();
            student = Ad1.getStudentDetails(id);
            if (student == null) {
                System.out.print("No student with this ID\n");

            }
        }
        while (true) {
            System.out.print("To enroll course 1\n" +
                    "To view enrolled Courses 2\n" +
                    "To view enrolled assignments 3\n" +
                    "To submit assignment 4 \n");
            int b = sc.nextInt();
            switch (b) {
                case 1: {
                    System.out.print("Please Enter course id\n");
                    String id = sc.next();
                    System.out.print("Please Enter course name\n");
                    String name = sc.next();
                    student.enrollCourse(new Courses(id, name));
                }
                break;
                case 2: {
                    System.out.print("All enrolled Courses\n");
                    student.viewEnrolledCourses();
                }
                break;
                case 3: {
                    System.out.print("Please Enter course id\n");
                    String courseId = sc.next();
                    student.viewAssignments(courseId);
                }
                break;
                case 4: {
                    System.out.print("Please Enter assignment id\n");
                    String assignmentId = sc.next();
                    System.out.print("Please Enter course id\n");
                    String courseId = sc.next();
                    System.out.print("Please Enter assignment content\n");
                    sc.nextLine();
                    String content = sc.nextLine();
                    System.out.print("Please Enter assignment mark like [12.6]\n");
                    float mark = sc.nextFloat();
                    AssignmentSubmission assignmentSubmission = new AssignmentSubmission(assignmentId,student.getId(),courseId,content,mark);
                    student.submitAssignment(assignmentSubmission);
                    System.out.println(assignmentSubmission+"\n"+"submitted successfully"+"\n");
                }
                break;
                default:
                    System.out.print("Please Enter valid number\n");
            }
            System.out.print("Want to SignIn as admin or teacher [y/n]:");
            String user = sc.next();
            if (user.equals("y")) {
                break;
            }
        }
    }
    }

