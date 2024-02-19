class MyMainEmployee {
    private int id;
    private String name;
    // Constructors
    public MyMainEmployee(){
        id = 1001;
        name = "your-name-here";
    }
    public MyMainEmployee(String myName){
        id = 1001;
        name = myName;
    }
    public MyMainEmployee(int myId, String myName){
        id = myId;
        name = myName;
    }

    public void setId(int i){
        id = i;
    }
    public void setName(String n){
        name = n;
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}

public class Constructors {
    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee();
        MyMainEmployee john = new MyMainEmployee("William John");
        MyMainEmployee ford = new MyMainEmployee(1003, "Ruther Ford");

//        harry.setId(1002);
        System.out.println("Constructor without arguments!");
        System.out.println("Id: "+ harry.getId());
//        harry.setName("CodeWithHarry");
        System.out.println("Name: "+ harry.getName());

        System.out.println("Constructor with one argument!");
        System.out.println("Id: "+ john.getId());
        System.out.println("Name: "+ john.getName());

        System.out.println("Constructor with two arguments");
        System.out.println("Id: "+ ford.getId());
        System.out.println("Name: "+ ford.getName());
    }
}
