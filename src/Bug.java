public class Bug {

    String description;
    String testerEmail;
    int priority;
    boolean status = true;

    Bug(String description, String testerEmail, int priority) {
        this.description = description;
        this.testerEmail = testerEmail;
        this.priority = priority;
        this.status = false;
    }

    void showAllBugInfo() {
        System.out.println("Info about bug: " + description + " " + testerEmail + " " + priority + " " + status);
    }

    void showTesterEmail() {
        System.out.println("Email: " + testerEmail);
    }

    int showPriority() {
        System.out.println("Priority: " + priority);
        return priority;
    }

    void getBugStatus() {
        System.out.println("Bug status: " + status);
    }
}