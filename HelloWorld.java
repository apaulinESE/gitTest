

public class HelloWorld
{
    public static void main(String[] args) {
        System.out.println("Now it does Work! Neat!");
        countToTen();
        System.out.println("Yolo");

    }

    /**
     * A method to print numbers from one to ten.
     */
    private static void countToTen(){

        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }
        return;
    }
}