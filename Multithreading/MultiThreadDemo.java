
class CollegeThread extends Thread {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000); // Pause for 10 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("CollegeThread interrupted: " + e.getMessage());
        }
    }
}


class DepartmentThread extends Thread {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("CSE");
            }
        } catch (InterruptedException e) {
            System.out.println("DepartmentThread interrupted: " + e.getMessage());
        }
    }
}


public class MultiThreadDemo {
    public static void main(String[] args) {
        // Create and start the threads
        CollegeThread collegeThread = new CollegeThread();
        DepartmentThread departmentThread = new DepartmentThread();

        collegeThread.start();
        departmentThread.start();
    }
}
