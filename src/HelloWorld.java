public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        double weekday = (Math.random() * 7 ) +1;
        boolean isFriday = (Math.random() * 7 ) +1 <= 6;
        if (isFriday){
            System.out.println("Yay it's Friday!");
        } else  if (weekday == 7 || weekday ==1){
            System.out.println("It's the weekend!");
        }else{
            System.out.println("It's another day...");
        }


    }
}
