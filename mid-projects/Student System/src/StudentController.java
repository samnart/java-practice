public class StudentController {
    private static final int MAX_STUDENTS = 100;
    private Student[] students = new Student[MAX_STUDENTS];
    private int studentCount = 0;

    public void addStudents(Student student) {
        if (studentCount < MAX_STUDENTS) {
            students[studentCount++] = student;
            studentCount++;
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Students max capacity reached, try another class.");
        }
    }

    public void removeStudent(Student student) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].equals(student)) {
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[studentCount - 1] = null;
                studentCount--;
                break;
            }
        }
    }

    public void updateStudent(Student studentToUpdate) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i] != null && students[i].equalsIgnoreCase(studentToUpdate)) {
                // implementation of logic to do whatever necessary
                System.out.println("Student updated successfully.");
                break;
            }
        }
    }

    public void displayStudents() {
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]);
        }
    }

    public Student findByName(String name) {
        for (Student student : students) {
            if (student != null && student.getName().equalsIgnoreCase(name)){
                return student;
            }
        }
        return null;
    }
}
