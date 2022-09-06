import java.util.ArrayList;
import java.util.List;

public class StudentSystem {
    public static void main(String[] args) {
        Student s1 = new Student("1","Mariam","mariammohammad390@gmail.com","01024051445","female","23","cairo,egypt");
        Student s2 = new Student("2","Mohamed","mohammad3@gmail.com","01341051445","male","15","cairo,egypt");
        CourseAttendence c1 = new CourseAttendence("1" , "10" , s1.getId() , "done");
        CourseAttendence c2 = new CourseAttendence("2" , "20" , s1.getId() , "available");
        CourseAttendence c3 = new CourseAttendence("3" , "30" , s1.getId()  , "busy");
        CourseAttendence c4 = new CourseAttendence("4" , "40" , s1.getId()  , "available");
        CourseAttendence c5 = new CourseAttendence("5" , "12" , s2.getId() , "available");
        CourseAttendence c6 = new CourseAttendence("7" , "10" , s2.getId()  , "busy");
        List<CourseAttendence> courses=new ArrayList<CourseAttendence>();
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        courses.add(c4);
        courses.add(c5);
        courses.add(c6);
        //only view the courses that student s1 Attended
        s1.viewEnrolledCourses(courses);

        //////////////////////////// add some assignments to the courses ///////////////////////////////////////////////
        Assignment a1 = new Assignment("1" , "description1" , "1" );
        Assignment a2 = new Assignment("2" , "description2" , "1" );
        Assignment a3 = new Assignment("22" , "description2" , "2" );
        Assignment a4 = new Assignment("3" , "description3" , "12" );
        Assignment a5 = new Assignment("4" , "description4" , "10" );
        List<Assignment> assignments=new ArrayList<Assignment>();
        assignments.add(a1);
        assignments.add(a2);
        assignments.add(a3);
        assignments.add(a4);
        assignments.add(a5);

        ///////////////////////////// make students submit some assignments ////////////////////////////////////////////
        s1.submitAssignment("1","1","assignment 1 content");
        s1.submitAssignment("2","1","assignment 2 content");
        s2.submitAssignment("3","12","assignment 3 content");
        s2.submitAssignment("4","12","assignment 4 content");

        //only view the assignment that student s2 submitted
        s2.viewAssignments("12");

    }
}
