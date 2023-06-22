public class Student {
    private int studnetid;
    private String Studentname;
    private String Studentage;
    private String Studentphone;
    private String Studentcity;

    public int getStudentid(){
        return studnetid;
    }
    public void studentid(int sid){
        this.studnetid = sid;
    }

    public String getStudentname(){
        return Studentname;
    }
    public void setstudentname(String name){
        this.Studentname = name;
    }

    public String getStudentage(){
        return Studentage;
    }
    public void setstudentage(String age){
        this.Studentage = age;
    }

    public String getstudentphone(){
        return Studentphone;
    }

    public void setstudentphone(String phone){
        this.Studentphone = phone;
    }

    public String getstudentcity(){
        return Studentcity;
    }
    public void setstudentcity(String city){
        this.Studentcity = city;
    }

    public Student(int sid,String name,String age,String phone,String city){
        super();
        this.studnetid = sid;
        this.Studentname = name;
        this.Studentage = age;
        this.Studentphone = phone;
        this.Studentcity = city;
    }

    public Student(String name,String age,String phone,String city){
        super();
        this.Studentname = name;
        this.Studentage = age;
        this.Studentphone = phone;
        this.Studentcity = city;
        
    }

    public Student(){
        
    }
    @Override
    public String toString() {
        return "Student [studnetid=" + studnetid + ", Studentname=" + Studentname + ", Studentage=" + Studentage
                + ", Studentphone=" + Studentphone + ", Studentcity=" + Studentcity + "]";
    }
    
}
