package app;


class Profile{

    private String name;

    public Profile(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Name:"+name;
    }
}

