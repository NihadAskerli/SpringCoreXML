package beans;

public class Student {
    private Teacher teacher;
    private String name;
    public  Student(){
        System.out.println("constructor ");
    }
    public  Student(Teacher teacher){

        this.teacher=teacher;
    }
    public void setName(String name){

        this.name=name;
        System.out.println("name");
    }
    public Student(String name,Teacher teacher){
        this.name=name;
        this.teacher=teacher;
        System.out.println("constructor 2");
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
        System.out.println("set teacher");
    }

    @Override
    public String toString() {
        return "Student{" +
                "teacher=" + teacher +
                ", name='" + name + '\'' +
                '}';
    }
}
