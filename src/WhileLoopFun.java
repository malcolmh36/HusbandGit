public class WhileLoopFun {

    public WhileLoopFun() { }

    public void printDigits(int number) {
        int newNumber = number;
        while (newNumber > 0){
            System.out.println(newNumber % 10);
            newNumber = newNumber/10;
        }
    }

    public int countLetter(String word, String letter) {
        int occurrences = 0;
        int idx = 0;
        while (idx < word.length()){
        String nextLetter = word.substring(idx,idx+1);
            if (nextLetter.equals(letter)){
            occurrences++;
            }
            idx++;
        }
        return occurrences;
    }

    public int maxDoubles(int number, int threshold) {
        int doubled = -1;
        while (number > 0 && threshold > 0){
            number = number * 2;
            if (number <=  threshold){
                doubled++;
            }
        }
        return doubled;
    }

    public boolean isPrime(int number) {
        int divisor = 2;
        if (number == 1){
        return false;
    }
        while(divisor < number){
            if (number % divisor == 0){
                return false;
            }
            divisor++;
        }
        return true;
    }
}
