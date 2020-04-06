package app;

class Student extends Profile{
	private int student_id;
    private String student_password;
    
    public Student(String n, int i, String p){
    super(n);
    student_id=i;
    student_password=p;
    }
	
    public int getId(){
        return student_id;
    }

    public String getPass(){
        return student_password;
    }

    @Override
    public String toString(){
        return super.toString() + "\nId:" + student_id + "\nPassword: " + student_password;
    }
}
