import java.util.ArrayList;
import java.util.List;

public class Admin {
    private List<Teacher> teachersList =new ArrayList<Teacher>();
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
    /////////////////////////////////////////////not sure ////////////////////////////////////////////////
    public void removeTeacher(String teacherId){
        teachersList.remove(teacherId);
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

    public void updateTeacherData(){

    }

    public void addStudent(){

    }

    public void removeStudent(){

    }

    public void viewAllStudents(){

    }

    public void viewStudentDetails(){

    }

    public void updateStudentData(){

    }

}
