import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin implements Person{
//    private List<Teacher> teachersList =new ArrayList<Teacher>();
//    private List<Student> studentsList =new ArrayList<Student>();
    private  String id;
    private String name;
    private String email;
    private String mobileNum;

    public Admin(String id, String name, String email, String mobileNum) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileNum = mobileNum;
    }
    public Admin() {

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

    public List<Teacher> getTeachersList() {
        return Database.getInstance().getTeachers();
    }

    public List<Student> getStudentsList() {
        return Database.getInstance().getStudents();
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileNum='" + mobileNum + '\'' +
                '}';
    }
    public void addTeacher(Teacher teacher){
        Database.getInstance().addTeacher(teacher);
    }


    public void removeTeacher(String teacherId){
        for (int i = 0; i < Database.getInstance().getTeachers().size(); i++) {
            if (teacherId.equals(Database.getInstance().getTeachers().get(i).getId()))
            {
                Database.getInstance().removeTeacherfromlit(i);
            }
        }
    }

    public void viewAllTeachers(){
        for (Teacher teacher: Database.getInstance().getTeachers()) {
            System.out.println(teacher);
        }
    }

    public Teacher getTeacherDetails(String teacherId){
        for (int i = 0; i < Database.getInstance().getTeachers().size(); i++) {
            if (teacherId.equals(Database.getInstance().getTeachers().get(i).getId()))
            {
                System.out.println(Database.getInstance().getTeachers().get(i));
                return Database.getInstance().getTeachers().get(i);
            }else {
                System.out.println("No teacher with this ID");
                return null;
            }
        }
        return null;
    }

    public void updateTeacherData(Teacher newTeacherData){
        for (int i = 0; i < Database.getInstance().getTeachers().size(); i++) {
            if (newTeacherData.getId().equals(Database.getInstance().getTeachers().get(i).getId()))
            {
                Database.getInstance().removeTeacherfromlit(i);
                Database.getInstance().addTeacher(newTeacherData);
            }
        }
    }

    public void addStudent(Student std){
        Database.getInstance().addStudent(std);
    }

    public void removeStudent(String studentId){
        for (int i = 0; i < Database.getInstance().getStudents().size(); i++) {
            if (studentId.equals(Database.getInstance().getStudents().get(i).getId()))
            {
                Database.getInstance().removeStudentfromlist(i);
            }
        }
    }

    public void viewAllStudents(){
        for (Student student: Database.getInstance().getStudents()) {
            System.out.println(student);
        }
    }

    public Student getStudentDetails(String studentId){
        for (int i = 0; i < Database.getInstance().getStudents().size(); i++) {
            if (studentId.equals(Database.getInstance().getStudents().get(i).getId()))
            {
                System.out.println(Database.getInstance().getStudents().get(i));
                return Database.getInstance().getStudents().get(i);
            }else {
                System.out.println("No student with this ID");
                return null;
            }
        }
        return null;
    }

    public void updateStudentData(Student newStudentData){
        for (int i = 0; i < Database.getInstance().getStudents().size(); i++) {
            if (newStudentData.getId() .equals( Database.getInstance().getStudents().get(i).getId()))
            {
                Database.getInstance().removeStudentfromlist(i);
                Database.getInstance().addStudent(newStudentData);
            }
        }

    }

    @Override
    public void personfun() {
        Scanner sc = new Scanner(System.in);
        Admin Ad1 = new Admin("1", "Reda", "reda33@gmail.com", "01024051332");
        while (true) {
            System.out.print("To add new teacher Enter 1\n" +
                    "To remove teacher Enter 2\n" +
                    "To view All Teachers Enter 3\n" +
                    "To view Teacher Details Enter 4\n" +
                    "To update Teacher Data Enter 5\n" +
                    "To add Student Enter 6\n" +
                    "To remove Student Enter 7\n" +
                    "To view All Students Enter 8\n" +
                    "To view Student Details Enter 9\n" +
                    "To update Student Data Enter 10\n");
            int b = sc.nextInt();
            switch (b) {
                case 1: {
                    System.out.print("Please Enter teacher id\n");
                    String id = sc.next();
                    System.out.print("Please Enter teacher name\n");
                    String name = sc.next();
                    System.out.print("Please Enter teacher email\n");
                    String email = sc.next();
                    System.out.print("Please Enter teacher mobile number\n");
                    String mobile = sc.next();
                    Ad1.addTeacher(new Teacher(id, name, email, mobile));
                    System.out.print("Teacher added successfully\n");
                }

                break;
                case 2: {
                    System.out.print("To remove teacher");
                    System.out.print("Please Enter teacher id\n");
                    String id = sc.next();
                    Ad1.removeTeacher(id);
                }
                break;
                case 3:
                    System.out.println("View All Teachers");
                    Ad1.viewAllTeachers();
                    System.out.println();
                    break;
                case 4: {
                    System.out.print("To view teacher details");
                    System.out.print("Please Enter teacher id\n");
                    String id = sc.next();
                    Ad1.getTeacherDetails(id);
                }
                break;
                case 5: {
                    System.out.print("To update teacher data");
                    System.out.print("Please Enter teacher id\n");
                    String id = sc.next();
                    System.out.print("Please Enter teacher new name\n");
                    String newName = sc.next();
                    System.out.print("Please Enter teacher new email\n");
                    String newEmail = sc.next();
                    System.out.print("Please Enter teacher new mobile number\n");
                    String newMobile = sc.next();
                    Ad1.updateTeacherData(new Teacher(id, newName, newEmail, newMobile));
                }
                // code block
                break;
                case 6: {
                    System.out.print("Please Enter student id\n");
                    String id = sc.next();
                    System.out.print("Please Enter student name\n");
                    String name = sc.next();
                    System.out.print("Please Enter student email\n");
                    String email = sc.next();
                    System.out.print("Please Enter student mobile number\n");
                    String mobile = sc.next();
                    System.out.print("Please Enter student age\n");
                    String age = sc.next();
                    System.out.print("Please Enter student address\n");
                    String address = sc.next();
                    System.out.print("Please Enter student gender\n");
                    String gender = sc.next();
                    Ad1.addStudent(new Student(id, name, email, mobile, age, address, gender));
                    System.out.print("Student added successfully\n");
                }
                // code block
                break;
                case 7: {
                    System.out.print("To remove student");
                    System.out.print("Please Enter student id\n");
                    String id = sc.next();
                    Ad1.removeStudent(id);
                    System.out.print("Student removed successfully\n");
                }
                // code block
                break;
                case 8: {
                    System.out.println("View All students");
                    Ad1.viewAllStudents();
                    System.out.println();
                }
                // code block
                break;
                case 9: {
                    System.out.print("To view student details");
                    System.out.print("Please Enter student id\n");
                    String id = sc.next();
                    Ad1.getStudentDetails(id);
                }
                // code block
                break;
                case 10: {
                    System.out.print("To update student data");
                    System.out.print("Please Enter student id you want to update her/his data\n");
                    String id = sc.next();
                    System.out.print("Please Enter student name\n");
                    String newName = sc.next();
                    System.out.print("Please Enter student email\n");
                    String newEmail = sc.next();
                    System.out.print("Please Enter student mobile number\n");
                    String newMobile = sc.next();
                    System.out.print("Please Enter student age\n");
                    String newage = sc.next();
                    System.out.print("Please Enter student address\n");
                    String newaddress = sc.next();
                    System.out.print("Please Enter student gender\n");
                    String gender = sc.next();
                    Ad1.updateStudentData(new Student(id, newName, newEmail, newMobile, newage, newaddress, gender));
                    System.out.print("Student data updated successfully\n");
                }
                break;
                default:
                    System.out.print("Please Enter valid number\n");
            }
            System.out.print("Want to Signin as teacher or student [y/n]:");
            String user = sc.next();
            if (user.equals("y")) {
                break;
            }
        }
    }
}
