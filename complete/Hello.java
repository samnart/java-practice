
class Hello {

    public static void main(String[] args) {
        
        try {
            Class.forName("yello");
        } 
        catch (Exception e) {
            System.out.println(e);
        }

    }

}