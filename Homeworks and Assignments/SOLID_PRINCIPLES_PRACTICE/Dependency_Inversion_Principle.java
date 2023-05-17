// Before applying Dependency Inversion Principle-DIP


// Let's See an example of Notification Services in School Management System
// The class Notification Service is directly dependent on the 'Student' Class
// the student class is a low-level class in this regard
// so this violets the DIP principle


public class Student {
    private String name;
    private String email;

    // Constructor, getters, and setters omitted for brevity

    public void sendNotification(String message) {
        // Code to send email notification to the student
        System.out.println("Sending email notification to " + email + ": " + message);
    }
}

public class NotificationService {
    private List<Student> students;

    public NotificationService(List<Student> students) {
        this.students = students;
    }

    public void sendNotifications(String message) {
        for (Student student : students) {
            student.sendNotification(message);
        }
    }
}




// After Applying Dependency Inversion Principle-DIP

// We can exclude the 'sendNotificaton() ' from the 'student' class and decouple them 
// and in order to use the this method, we declare an interface name 'Notifier'
// we can now decoule the dependency between 'student ' and the 'notification' class 


// here is the solution code after applying DIP

// DIP Adherence

public interface Notifier {
    void sendNotification(String email, String message);
}

public class Student {
    private String name;
    private String email;

    // Constructor, getters, and setters omitted for brevity
}

public class EmailNotifier implements Notifier {
    @Override
    public void sendNotification(String email, String message) {
        // Code to send email notification to the student
        System.out.println("Sending email notification to " + email + ": " + message);
    }
}

public class NotificationService {
    private List<Student> students;
    private Notifier notifier;

    public NotificationService(List<Student> students, Notifier notifier) {
        this.students = students;
        this.notifier = notifier;
    }

    public void sendNotifications(String message) {
        for (Student student : students) {
            notifier.sendNotification(student.getEmail(), message);
        }
    }
}

