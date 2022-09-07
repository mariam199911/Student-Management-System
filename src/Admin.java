import java.util.ArrayList;
import java.util.List;

public class Admin {
    private List<Teacher> teachersList =new ArrayList<Teacher>();
    private List<Student> studentsList =new ArrayList<Student>();
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
        return teachersList;
    }

    public List<Student> getStudentsList() {
        return studentsList;
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
        teachersList.add(teacher);
    }


    public void removeTeacher(String teacherId){
        for (int i = 0; i < teachersList.size(); i++) {
            if (teacherId == teachersList.get(i).getId())
            {
                teachersList.remove(i);
            }
        }
    }

    public void viewAllTeachers(){
        for (Teacher teacher: teachersList) {
            System.out.println(teacher);
        }
    }

    public void viewTeacherDetails(String teacherId){
        for (int i = 0; i < teachersList.size(); i++) {
            if (teacherId == teachersList.get(i).getId())
            {
                System.out.println(teachersList.get(i));
            }
        }
    }

    public void updateTeacherData(Teacher newTeacherData){
        for (int i = 0; i < teachersList.size(); i++) {
            if (newTeacherData.getId() == teachersList.get(i).getId())
            {
                teachersList.remove(i);
                teachersList.add(newTeacherData);
            }
        }
    }

    public void addStudent(Student std){
        studentsList.add(std);
    }

    public void removeStudent(String studentId){
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentId == studentsList.get(i).getId())
            {
                studentsList.remove(i);
            }
        }
    }

    public void viewAllStudents(){
        for (Student student: studentsList) {
            System.out.println(student);
        }
    }

    public void viewStudentDetails(String studentId){
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentId == studentsList.get(i).getId())
            {
                System.out.println(studentsList.get(i));
            }
        }
    }

    public void updateStudentData(Student newStudentData){
        for (int i = 0; i < studentsList.size(); i++) {
            if (newStudentData.getId() == studentsList.get(i).getId())
            {
                studentsList.remove(i);
                studentsList.add(newStudentData);
            }
        }

    }

}
