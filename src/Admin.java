import java.util.ArrayList;
import java.util.List;

public class Admin {
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

}
