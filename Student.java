class Student extends Person {
    private String studentId;
    private static int idCounter = 20251000;
    private String major;
    private double GPA;

    public Student(String name, int age, String address, String major, double GPA) {
        super(name, age, address);
        this.studentId = generateStudentId();
        this.major = major;
        this.GPA = GPA;
    }

    private static String generateStudentId() {
        return "S" + (idCounter++);
    }

    public String getStudentId() {
        return studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    void displayDetails() {
        System.out.println("\n------ Student Details ------");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress());
        System.out.println("Major: " + major);
        System.out.println("GPA: " + GPA);
        System.out.println("----------------------------");
    }
}
