

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseService implements  ICourseService {

    public List<Student> students = new ArrayList<>();
    public List<Course> courses = new ArrayList<>();
    
    CourseService myCourseService;
    CourseFileService courseFileService = new CourseFileService();

    @Override
    public List<Student> getStudents() {
        return students;
    }
   
    @Override
    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public Student getStudentByID(long studentId) {
        
        for (Student a : students) {
            if(a.getStudentId() == studentId) {
                return a;
            }
        }
        return null;
    }

    @Override
    public Course getCourseByID(long courseId) {
        
        for (Course c : courses) {
            if(c.getCourseId() == courseId) {
                return c;
            }
        }
        return null;
    }

    @Override
    public List<Course> getCoursesOfStudent(long studentId) {
        return myCourseService.getCoursesOfStudent(studentId);
    }

    @Override
    public boolean addStudentToCourse(long studentId, long courseId) {
        
        return false;
    }
    
    
}
