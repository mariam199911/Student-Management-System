import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
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



// Main method must be refactored to apply the simple factory design pattern here
//



    public static void main(String[] args) {
        Database db = Database.getInstance();

        Admin Ad1 = new Admin("1", "Reda", "reda33@gmail.com", "01024051332");
        Teacher t = new Teacher("1","mariam","m@m.com","01024051445");
        Student s = new Student("1","hager","h@h.com","01024051446","female","21","efef");
        Ad1.addTeacher(t);
        Ad1.addStudent(s);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Welcome to student management system\n");
            System.out.print("Enter 1 if you are an admin\nEnter 2 if you are a teacher\nEnter 3 if you are a student\n");
            int a = sc.nextInt();
            if (a == 1) {
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

// Should be extracted to a method  will be used here and in update block


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
                          
// You should define a class responsible for dealing with admin data
// This class will provide you with the data
// Should create another class th display tat content  , as util functionality

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

            } else if (a == 2) {
                Teacher teacher;
                {
                    System.out.print("Please enter your ID\n");
                    String id = sc.next();
                    teacher = Ad1.getTeacherDetails(id);
                    if (teacher == null) {
                        System.out.print("No teacher with this ID\n");
                        break;
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
            }else if (a == 3) {
                Student student;
                {
                    System.out.print("Please enter your ID\n");
                    String id = sc.next();
                    student = Ad1.getStudentDetails(id);
                    if (student == null) {
                        System.out.print("No student with this ID\n");
                        break;
                    }
                }
                while (true) {
                    System.out.print("To enroll course 1\n" +
                            "To view enrolled Courses 2\n" +
                            "To view enrolled assignments 3\n" +
                            "To submit assignment 4 \n");
                    int b = sc.nextInt();
                    switch (b) {
                        case 1: {
                            System.out.print("Please Enter course id\n");
                            String id = sc.next();
                            System.out.print("Please Enter course name\n");
                            String name = sc.next();
                            student.enrollCourse(new Courses(id, name));
                        }
                        break;
                        case 2: {
                            System.out.print("All enrolled Courses\n");
                            student.viewEnrolledCourses();
                        }
                        break;
                        case 3: {
                            System.out.print("Please Enter course id\n");
                            String courseId = sc.next();
                            student.viewAssignments(courseId);
                        }
                        break;
                        case 4: {
                            System.out.print("Please Enter assignment id\n");
                            String assignmentId = sc.next();
                            System.out.print("Please Enter course id\n");
                            String courseId = sc.next();
                            System.out.print("Please Enter assignment content\n");
                            sc.nextLine();
                            String content = sc.nextLine();
                            System.out.print("Please Enter assignment mark like [12.6]\n");
                            float mark = sc.nextFloat();
                            AssignmentSubmission assignmentSubmission = new AssignmentSubmission(assignmentId,student.getId(),courseId,content,mark);
                            student.submitAssignment(assignmentSubmission);
                            System.out.println(assignmentSubmission+"\n"+"submitted successfully"+"\n");
                        }
                        break;
                        default:
                            System.out.print("Please Enter valid number\n");
                    }
                    System.out.print("Want to SignIn as admin or teacher [y/n]:");
                    String user = sc.next();
                    if (user.equals("y")) {
                        break;
                    }
                }
            }
        }
    }
}
