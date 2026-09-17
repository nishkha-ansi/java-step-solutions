class CourseDetails {
    String code;
    String title;

    CourseDetails(String code, String title) {
        this.code = code;
        this.title = title;
    }
}

public class Course {
    public static void main(String[] args) {

        CourseDetails course =
                new CourseDetails("21CSC201J", "Data Structures");

        System.out.println(course.code + " - " + course.title);
    }
}
