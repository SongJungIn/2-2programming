import java.util.Scanner;

class Student {
    private int studentId;
    private String name;
    private String major;
    private long phoneNumber;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        System.out.println("학생 정보 입력을 시작합니다.");

        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + "번째 학생 정보 입력 (학번 이름 전공 전화번호): ");
            String input = scanner.nextLine();
            String[] info = input.split(" ");

            students[i] = new Student();
            students[i].setStudentId(Integer.parseInt(info[0]));
            students[i].setName(info[1]);
            students[i].setMajor(info[2]);
            students[i].setPhoneNumber(Long.parseLong(info[3]));
        }

        System.out.println("\n<입력된 학생 정보>");

        for (int i = 0; i < 3; i++) {
            System.out.println("학생 " + (i + 1));
            System.out.println("학번: " + students[i].getStudentId());
            System.out.println("이름: " + students[i].getName());
            System.out.println("전공: " + students[i].getMajor());

            String phoneStr = Long.toString(students[i].getPhoneNumber());
            String formattedPhone = "0" + phoneStr.substring(0, 3) + "-" + phoneStr.substring(3, 7) + "-" + phoneStr.substring(7);
            System.out.println("전화번호: " + formattedPhone);
            System.out.println("--------------------");
        }

        scanner.close();
    }
}