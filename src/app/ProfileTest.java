package app;

public class ProfileTest{
    public static void main (String[] args){
        Profile teacherProfile = new Teacher("Lulu",3425,"abcd");
        System.out.println("Teacher Profile:\n" + teacherProfile.toString());
        //teacherProfile.manageProfile();

        Profile studentProfile = new Student("Momo",1827,"efgh");
        System.out.println("Student Profile:\n" + studentProfile.toString());
        //studentProfile.manageProfile();
    }
    }
    