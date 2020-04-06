package app;

class Teacher extends Profile{
	private int teacher_id;
    private String teacher_password;
    
    public Teacher(String n, int i, String p){
    super(n);
    teacher_id=i;
    teacher_password=p;
    }
	
    public int getId(){
        return teacher_id;
    }

    public String getPass(){
        return teacher_password;
    }

    @Override
    public String toString(){
        return super.toString() + "\nId:" + teacher_id + "\nPassword: " + teacher_password;
    }
}
