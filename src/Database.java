import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Database {
    private static Database instance = new Database();

    private Database(){}

    public static Database getInstance(){
        return instance;
    }

    private List<Student> students=new ArrayList<Student>();
    private List<Teacher> teachers=new ArrayList<Teacher>();


    private ArrayList<Courses> courses=new ArrayList<Courses>();

    private ArrayList<AssignmentSubmission> assignment_submissions=new ArrayList<AssignmentSubmission>();

    private ArrayList<CourseAttendence> courseAttendances=new ArrayList<CourseAttendence>();

    private HashMap<String,ArrayList<Courses>> student_courses= new HashMap<>();

    private HashMap<String,ArrayList<Assignment>> course_assignments = new HashMap<>();

    private HashMap<String,ArrayList<Student>> course_students= new HashMap<>();

//    private HashMap<Teacher,ArrayList<Courses>> teacher_courses= new HashMap<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudentfromlist(int i){
        students.remove(i);
    }
    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void removeTeacherfromlit(int i){
        teachers.remove(i);
    }
    public ArrayList<Courses> getCourses() {
        return courses;
    }

    public void addCours(Courses course){
        courses.add(course);
    }

    public ArrayList<AssignmentSubmission> getAssignment_submissions() {
        return assignment_submissions;
    }

    public void addAssignmentsubmission(AssignmentSubmission assignmentSubmission){
        assignment_submissions.add(assignmentSubmission);
    }
    public ArrayList<CourseAttendence> getCourseAttendances() {
        return courseAttendances;
    }

    public void addCourseAttendances(CourseAttendence courseattendances){
        courseAttendances.add(courseattendances);
    }

    public HashMap<String, ArrayList<Courses>> getStudent_courses() {
        return student_courses;
    }

    public HashMap<String, ArrayList<Assignment>> getCourse_assignments() {
        return course_assignments;
    }

    public HashMap<String, ArrayList<Student>> getCourse_students() {
        return course_students;
    }
    public void enrollCourse (Courses course,Student student) {
        if(student_courses.containsKey(student.getId())){
            student_courses.get(student.getId()).add(course);
        }else {
            ArrayList<Courses> coursesList= new ArrayList<Courses>();
            coursesList.add(course);
            student_courses.put(student.getId(),coursesList);
        }
        //////////////////////////////////////////////////////////////////////
        if(course_students.containsKey(course.getId())){
            course_students.get(course.getId()).add(student);
        }else {
            ArrayList<Student> studentsList= new ArrayList<Student>();
            studentsList.add(student);
            course_students.put(course.getId(),studentsList);
        }
    }
    public void addAssignmentinDatabase(String courseId,Assignment assignment){
        if(course_assignments.containsKey(courseId)){
            Database.getInstance().course_assignments.get(courseId).add(assignment);
        }else {
            ArrayList<Assignment> assignmentList= new ArrayList<Assignment>();
            assignmentList.add(assignment);
            Database.getInstance().course_assignments.put(courseId,assignmentList);
        }
    }
}