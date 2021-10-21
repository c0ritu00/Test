import java.util.List;

public interface ICourseService {
   
    //Gets list of students
    List<Student> getStudents();

    //Gets list of courses
    List<Course> getCourses();

    //Gets student by ID. Returns null if student not found
    Student getStudentByID(long studentId);

    //Gets course by ID. Returns null if course not found.
    Course getCourseByID(long courseId);

    //Gets list of courses that the student is registered in
    List<Course> getCoursesOfStudent(long studentId);

    //Registers the student in the course @return true if the registration was successful
    boolean addStudentToCourse(long studentId, long courseId);

}
