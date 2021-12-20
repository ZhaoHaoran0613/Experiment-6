package xuank;

public class People {
    private String name;
    int id;
    private String sex;

    public People(){ }

    public People(String name, int id){
        setId(id);
        setName(name);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getSex(){
        return sex;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

}
