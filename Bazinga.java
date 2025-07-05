public class Bazinga {
    public static void main(String[] args){
        for (int i = 1; i < 100; i++){
            if ((i % 2 == 0) && (i % 5 == 0)){ // Number is even and divisible by 5
                System.out.println("Baz" + "inga!");
            } else if (i % 2 == 0) { // Number is even
                System.out.println("Baz");
            } else if (i % 5 == 0) { // Number divisible by 5
                System.out.println("inga!");
            } else {
                System.out.println(i);
            }
        }
    }
}
