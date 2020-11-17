public class MainApp {

    public static void main(String[] args) {

        Bug bug1 = new Bug("Example_of_bug_description", "tester1@gmail.com", 2);
        bug1.showAllBugInfo();
        bug1.showTesterEmail();
        bug1.showPriority();
        bug1.getBugStatus();

    }

}
