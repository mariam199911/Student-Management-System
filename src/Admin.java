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
        return Database.getInstance().teachers;
    }

    public List<Student> getStudentsList() {
        return Database.getInstance().students;
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
        Database.getInstance().teachers.add(teacher);
    }


    public void removeTeacher(String teacherId){
        for (int i = 0; i < Database.getInstance().teachers.size(); i++) {
            if (teacherId.equals(Database.getInstance().teachers.get(i).getId()))
            {
                Database.getInstance().teachers.remove(i);
            }
        }
    }

    public void viewAllTeachers(){
        for (Teacher teacher: Database.getInstance().teachers) {
            System.out.println(teacher);
        }
    }

    public Teacher getTeacherDetails(String teacherId){
        for (int i = 0; i < Database.getInstance().teachers.size(); i++) {
            if (teacherId.equals(Database.getInstance().teachers.get(i).getId()))
            {
                System.out.println(Database.getInstance().teachers.get(i));
                return Database.getInstance().teachers.get(i);
            }else {
                System.out.println("No teacher with this ID");
                return null;
            }
        }
        return null;
    }

    public void updateTeacherData(Teacher newTeacherData){
        for (int i = 0; i < Database.getInstance().teachers.size(); i++) {
            if (newTeacherData.getId().equals(Database.getInstance().teachers.get(i).getId()))
            {
                Database.getInstance().teachers.remove(i);
                Database.getInstance().teachers.add(newTeacherData);
            }
        }
    }

    public void addStudent(Student std){
        Database.getInstance().students.add(std);
    }

    public void removeStudent(String studentId){
        for (int i = 0; i < Database.getInstance().students.size(); i++) {
            if (studentId.equals(Database.getInstance().students.get(i).getId()))
            {
                Database.getInstance().students.remove(i);
            }
        }
    }

    public void viewAllStudents(){
        for (Student student: Database.getInstance().students) {
            System.out.println(student);
        }
    }

    public Student getStudentDetails(String studentId){
        for (int i = 0; i < Database.getInstance().students.size(); i++) {
            if (studentId.equals(Database.getInstance().students.get(i).getId()))
            {
                System.out.println(Database.getInstance().students.get(i));
                return Database.getInstance().students.get(i);
            }else {
                System.out.println("No student with this ID");
                return null;
            }
        }
        return null;
    }

    public void updateStudentData(Student newStudentData){
        for (int i = 0; i < Database.getInstance().students.size(); i++) {
            if (newStudentData.getId() .equals( Database.getInstance().students.get(i).getId()))
            {
                Database.getInstance().students.remove(i);
                Database.getInstance().students.add(newStudentData);
            }
        }

    }

}
