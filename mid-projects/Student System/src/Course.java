public class Course {
    private String courseId;
    private String courseName;
    private int courseCredits;
    private String courseSchedule;

    public Course(String courseId, String courseName) {
        this.courseName = courseName;
        this.courseId = courseId;
        courseCredits = 0;
        courseSchedule = null;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseCredits() {
        return courseCredits;
    }

    public void setCourseCredits(int courseCredits) {
        this.courseCredits = courseCredits;
    }

    public String getCourseSchedule() {
        return courseSchedule;
    }

    public void setCourseSchedule(String courseSchedule) {
        this.courseSchedule = courseSchedule;
    }
}
