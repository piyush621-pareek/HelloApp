public class HelloApp {
    public static void main(String[] args) {
        // Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        StringBuilder nameBuilder = new StringBuilder();

        // Enhanced for loop to append all names with a consistent delimiter
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Defensive check before using substring to remove the trailing ", "
        if (nameBuilder.length() > 0) {
            String combinedNames = nameBuilder.substring(0, nameBuilder.length() - 2);
            System.out.println("Hello, " + combinedNames + "!");
        }
    }
}
