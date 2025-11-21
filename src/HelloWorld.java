public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        boolean isFriday = (Math.random() * 7 ) +1 == 6;
        if (isFriday){
            System.out.println("Yay it's Friday!");
        } else {
            System.out.println("Can't wait for Friday");
        }


    }
}
