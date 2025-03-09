public class SwitchVersions {
    public static void main(String[] args) {
        // switch statement with break statement older version
        int num = 5;
        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Default");
        }

        // switch statement without break statement
        int version = 11;
        String codeName = switch (version) {
            case 1 -> "Tiger";
            case 5 -> "Lion";
            case 8 -> "Spider";
            case 11 -> "Zulu";
            default -> "Unknown";
        };
        System.out.println("Java " + version + " is called " + codeName);

        // switch return statement
        int result = switch (version) {
            case 1 -> {
                System.out.println("One");
                yield 1;
            }
            case 5 -> {
                System.out.println("Five");
                yield 5;
            }
            case 8 -> {
                System.out.println("Eight");
                yield 8;
            }
            case 11 -> {
                System.out.println("Eleven");
                yield 11;
            }
            default -> {
                System.out.println("Default");
                yield 0;
            }
        };
        System.out.println("Result: " + result);
    }
}
