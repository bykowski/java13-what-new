import java.util.Random;

public class SwitchExpressions {

    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(6);
        String value = switch (randomNumber) {
            case 1 -> "jeden";
            case 2 -> "dwa";
            case 3 -> "trzy";
            case 4, 5 -> {
                System.out.println("albo 4, albo 5");
                yield "albo cztery, albo piec";
            }
            default -> throw new IllegalStateException("Unexpected value: " + randomNumber);
        };
        System.out.println(value);
    }
}
