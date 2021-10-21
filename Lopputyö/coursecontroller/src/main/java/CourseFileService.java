import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseFileService implements ICourseFileService{
   
    public List<Student> students = new ArrayList<>();
    public List<Course> courses = new ArrayList<>();

    String filePath1 = "./files/students.txt";
    String filePath2 = "./files/courses.txt";

    @Override
    public List<Student> readStudentsFromFile(String filePath1) throws FileNotFoundException {
        File f = new File(filePath1);
        Scanner sc = new Scanner(f);
        

        while(sc.hasNextLine()){
            String[] studentInfo = sc.nextLine().split("---");
            Student s = new Student(studentInfo[0], studentInfo[1], Integer.parseInt(studentInfo[2]));

            students.add(s);
        }
        sc.close();
        return students;
        
    }

    @Override
    public List<Course> readCoursesFromFile(String filePath2) throws FileNotFoundException {
        File f = new File(filePath2);
        Scanner sc = new Scanner(f);
        

        while(sc.hasNextLine()){
            String[] courseInfo = sc.nextLine().split("---");
            Course c = new Course(courseInfo[1], courseInfo[2], Integer.parseInt(courseInfo[2]));

            courses.add(c);
        }
        sc.close();
        return courses;
    }
    
}
