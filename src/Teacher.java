import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Teacher implements Person{
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

    public Teacher() {

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

    public static LocalDate dateInput(String userInput) {
        LocalDate date;
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
        try {
            date = LocalDate.parse(userInput, dateFormat);
        }catch (NumberFormatException e){
            System.out.println("Please enter valid date");
            return null;
        }

        return date ;
    }

    @Override
    public void personfun() {
        Admin Ad1 = new Admin("1", "Reda", "reda33@gmail.com", "01024051332");
        System.out.println("Hello Teacher");
        Scanner sc = new Scanner(System.in);

        Teacher teacher;
        {
            System.out.print("Please enter your ID\n");
            String id = sc.next();
            teacher = Ad1.getTeacherDetails(id);
            if (teacher == null) {
                System.out.print("No teacher with this ID\n");
            }
        }
        while (true) {

            System.out.print("To add new course 1\n" +
                    "To Add new assignment 2\n" +
                    "To view Students Assigned Courses 3\n" +
                    "To get Students In Course 4\n" +
                    "To get All Courses 5\n" +
                    "To get Student Data 6\n" +
                    "To submit Students Attendance 7 \n");
            int b = sc.nextInt();
            switch (b) {
                case 1: {
                    System.out.print("Please Enter course id\n");
                    String id = sc.next();
                    System.out.print("Please Enter course name\n");
                    String name = sc.next();
                    teacher.addCourse(new Courses(id, name));
                }
                break;
                case 2: {
                    System.out.print("Please Enter course id you want to add assignment to\n");
                    String courseId = sc.next();
                    System.out.print("Please Enter assignment id\n");
                    String assignmentId = sc.next();
                    System.out.print("Please Enter assignment description\n");
                    sc.nextLine();
                    String assignmentDescription = sc.nextLine();
                    teacher.addAssignment(courseId, new Assignment(assignmentId, assignmentDescription, courseId));
                }
                break;
                case 3: {
                    System.out.print("All Students Assigned Courses\n");
                    teacher.viewStudentsAssignedCourses();
                }
                break;
                case 4: {
                    System.out.print("Please Enter course id\n");
                    String courseId = sc.next();
                    teacher.getStudentsInCourse(courseId);
                }
                break;
                case 5: {
                    System.out.print("All Courses\n");
                    teacher.getAllCourses();
                }
                break;
                case 6: {
                    System.out.print("Please enter student ID\n");
                    String id = sc.next();
                    teacher.getStudentData(id);
                }
                break;
                case 7: {
                    //String courseId, String studentId, String status
                    System.out.print("Please Enter course Id\n");
                    String courseId = sc.next();
                    System.out.print("Please Enter student Id\n");
                    String studentId = sc.next();
                    System.out.print("Please Enter status[available/busy/done]\n");
                    String status = sc.next();
                    System.out.print("Enter a date (like 3/3/17): \n");
                    String datestring = sc.next();
                    LocalDate newDate = dateInput(datestring);
                    try {
                        teacher.submitStudentsAttendance(new CourseAttendence(courseId,studentId,status));
                    }catch (ArrayStoreException e){
                        System.out.println("can't submit Student Attendance");
                    }


                    System.out.print("Attendance Submitted Successfully\n");
                }
                break;
                default:
                    System.out.print("Please Enter valid number\n");
            }
            System.out.print("Want to SignIn as admin or student [y/n]:");
            String user = sc.next();
            if (user.equals("y")) {
                break;
            }
        }

    }
}
