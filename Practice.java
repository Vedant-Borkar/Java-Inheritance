
class Practice
{
    private String name="john";
    private int age=18;
    private char sex='m';

    public void Studying()
    {
        System.out.println("Studying");
    }
    public void Playing()
    {
        System.out.println("Playing");
    }
    public void Eating()
    {
        System.out.println("Eating");
    }
    public Practice(String Newname,int Newage,char Newsex)
    {
        this.name=Newname;
        this.age=Newage;
        this.sex=Newsex;
    }

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public char getSex()
    {
        return sex;
    }
    public void setName(String newname)
    {
        this.name=newname;
    }



}