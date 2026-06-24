//Singleton design pattern
public class Principal {
    private static Principal instance;
    //Instance variable to hold the single instance of the class
    private Principal() {
        // Private constructor to prevent instantiation
        System.out.println("Principal instance created.");
    }
    public static Principal getInstance() {
        if(instance==null) {
            instance = new Principal();
        }
        return instance;
    }
    public static void main(String[] args){
        Principal principal1 = Principal.getInstance();
        Principal principal2 = Principal.getInstance();
        if(principal1 == principal2){
            System.out.println("Both instances are the same.");
        } 
        else{
            System.out.println("Instances are different.");
        }
    }
}
