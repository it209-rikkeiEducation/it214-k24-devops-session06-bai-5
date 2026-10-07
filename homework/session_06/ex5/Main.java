public class Main {
    public static void main(String[] args) {
        System.out.println("Java Spring Boot Application is running securely under systemd...");
        try {
            while (true) {
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            System.out.println("Application interrupted.");
        }
    }
}