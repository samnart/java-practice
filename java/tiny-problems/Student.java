/**
 * Student
 */
class Student {
    int length;
    int width;

    void insert (int l, int w) {
        length = l;
        width = w;
        
    }

    void calculateRectangle () {
        System.out.println(length * width);
    }
    
}

/**
 * TestStudent
 */
class TestStudent {

    public static void main (String args []) {
        Student rectangle = new Student();

        rectangle.insert(11, 6);

        rectangle.calculateRectangle();
    }
    
}