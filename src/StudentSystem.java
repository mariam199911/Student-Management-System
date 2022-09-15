//import java.util.ArrayList;
//import java.util.List;
//
//public class StudentSystem {
//    public static void main(String[] args) {
//        //#####################################  Admin  #######################################################
//        //Admin of the system
//        Admin Ad1 = new Admin("1","Reda","reda33@gmail.com","01024051332");
//
//        //make admin Ad1 add some students and teachers
//        Ad1.addStudent(new Student("1","mariam","mariammohammad390@gmail.com","01024051445","female","23","cairo,egypt"));
//        Ad1.addStudent(new Student("2","Mohamed","mohammad3@gmail.com","01341051445","male","15","cairo,egypt"));
//        Ad1.addTeacher(new Teacher("1","Hager","hager4@gmail.com","01023041776"));
//        Ad1.addTeacher(new Teacher("2","fatma","fatma234@gmail.com","01023001776"));
//        //view all Teachers added by admin Ad1
//        System.out.println("View All Teachers");
//        Ad1.viewAllTeachers();
//        System.out.println();
//        //view all students added by admin Ad1
//        System.out.println("View All Students");
//        Ad1.viewAllStudents();
//        System.out.println();
//        //remove Teacher with id = 1 and view the reminding teachers
//        Ad1.removeTeacher("1");
//        System.out.println("View All Teachers after removing teacher with id =1 ");
//        Ad1.viewAllTeachers();
//        System.out.println();
//
//        //update the data of student with id = 1
//        Ad1.updateStudentData(new Student("1","mariam","mariam22@gmail.com","01024051445","female","23","cairo,egypt"));
//        System.out.println("View All Students after updating data of student with id =1 change the email");
//        Ad1.viewAllStudents();
//        System.out.println();
//        //#####################################  Teacher  #######################################################
//        //get teacher with id =2
//        System.out.println("Details of Teacher with id = 2:");
//        Teacher t1 = Ad1.getTeacherDetails("2");
//        System.out.println();
//        //get details of student with id = 1
//        System.out.println("Details of student with id = 1:");
//        Student sid1 = t1.getStudentData("1");
//        System.out.println(sid1);
//        System.out.println();
//        // make teacher with ide = 1 add an assignment
////        t1.addAssignment(new Assignment("1" , "description1" , "1" ));
//        //view all assignment added by teacher with id =2
//        System.out.println("view all assignment:");
////        System.out.println(t1.getAssignments());
//
//        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        System.out.println();
//        System.out.println();
//
//
//        Student s1 = new Student("1","Mariam","mariammohammad390@gmail.com","01024051445","female","23","cairo,egypt");
//        Student s2 = new Student("2","Mohamed","mohammad3@gmail.com","01341051445","male","15","cairo,egypt");
//        CourseAttendence c1 = new CourseAttendence("1" , "10" , s1.getId() , "done");
//        CourseAttendence c2 = new CourseAttendence("2" , "20" , s1.getId() , "available");
//        CourseAttendence c3 = new CourseAttendence("3" , "30" , s1.getId()  , "busy");
//        CourseAttendence c4 = new CourseAttendence("4" , "40" , s1.getId()  , "available");
//        CourseAttendence c5 = new CourseAttendence("5" , "12" , s2.getId() , "available");
//        CourseAttendence c6 = new CourseAttendence("7" , "10" , s2.getId()  , "busy");
//        List<CourseAttendence> courses=new ArrayList<CourseAttendence>();
//        courses.add(c1);
//        courses.add(c2);
//        courses.add(c3);
//        courses.add(c4);
//        courses.add(c5);
//        courses.add(c6);
//        //only view the courses that student s1 Attended
//        s1.viewEnrolledCourses();
//
//        //////////////////////////// add some assignments to the courses ///////////////////////////////////////////////
//        Assignment a1 = new Assignment("1" , "description1" , "1" );
//        Assignment a2 = new Assignment("2" , "description2" , "1" );
//        Assignment a3 = new Assignment("22" , "description2" , "2" );
//        Assignment a4 = new Assignment("3" , "description3" , "12" );
//        Assignment a5 = new Assignment("4" , "description4" , "10" );
//        List<Assignment> assignments=new ArrayList<Assignment>();
//        assignments.add(a1);
//        assignments.add(a2);
//        assignments.add(a3);
//        assignments.add(a4);
//        assignments.add(a5);
//
//        ///////////////////////////// make students submit some assignments ////////////////////////////////////////////
//        s1.submitAssignment("1","1","assignment 1 content");
//        s1.submitAssignment("2","1","assignment 2 content");
//        s2.submitAssignment("3","12","assignment 3 content");
//        s2.submitAssignment("4","12","assignment 4 content");
//
//        //only view the assignment that student s2 submitted
//        s2.viewAssignments("12");
//
//    }
//}
