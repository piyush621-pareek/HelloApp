public class HelloApp {

    public static void main(String[] args) {
      
        if (args.length > 0) {
            
            StringBuilder nameBuilder = new StringBuilder();
            
            String name = ""; 

            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
    
                name = nameBuilder.toString();
            }
   
            System.out.println("Hello, " + name + "!");
            
        } else {
			
            System.out.println("Hello, World!");
        }
    }
}