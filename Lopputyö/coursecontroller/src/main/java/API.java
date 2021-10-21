import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API {

    API courseFileService;

    @Autowired
    CourseService CourseService;

    String filePath1 = "./files/students.txt";
    String filePath2 = "./files/courses.txt";

    @GetMapping("/students")
    public List<Student> readStudentsFromFile(String filePath1)throws FileNotFoundException {
        
        courseFileService.readStudentsFromFile(filePath1);
        return CourseService.getStudents();
    }

    @GetMapping("/courses")
    public List<Course> readCoursesFromFile(String filePath2)throws FileNotFoundException {
        courseFileService.readCoursesFromFile(filePath2);
        return CourseService.getCourses();
    }

    //Palauttaa id:n perusteella opiskelijan tiedot ja myös kurssit, joissa opiskelija on. Voidaan palauttaa HTML-muodossa Stringinä
    @GetMapping("/students/{id}")
    public String studentInfo(@PathVariable String id){
        return null;
       // return CourseService.studentInfo(id);
    }

    //Palauttaa kurssin nimen ja siihen rekisteröityneet opiskelijat HTML muodossa
    @GetMapping("/courses/{id}")
    public String courseInfo(@PathVariable String id){
        return null;
        //return CourseService.courseInfo(id);
    }

    //Lisää POST-mappauksella opiskelija kurssille JSON-rakenteen perusteelle JSON annetaan
    //esim. muodossa {”sid”: ”0”, ”cid”: ”1”} . sid on opiskelijan id ja cid kurssin id. Testaa
    //toimintaa esim. Postmanilla tai Thunder Clientilla.
    @GetMapping("/add")
    public String course()
    {
        return null;
    }



}
