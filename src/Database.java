import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Database {
    private static Database instance = new Database();

    private Database(){}

    public static Database getInstance(){
        return instance;
    }

    protected List<Student> students=new ArrayList<Student>();
    protected List<Teacher> teachers=new ArrayList<Teacher>();


    protected ArrayList<Courses> courses=new ArrayList<Courses>();

    protected ArrayList<AssignmentSubmission> assignment_submissions=new ArrayList<AssignmentSubmission>();

    protected ArrayList<CourseAttendence> courseAttendances=new ArrayList<CourseAttendence>();

    protected HashMap<String,ArrayList<Courses>> student_courses= new HashMap<>();

    protected HashMap<String,ArrayList<Assignment>> course_assignments = new HashMap<>();

    protected HashMap<String,ArrayList<Student>> course_students= new HashMap<>();

//    protected HashMap<Teacher,ArrayList<Courses>> teacher_courses= new HashMap<>();
}