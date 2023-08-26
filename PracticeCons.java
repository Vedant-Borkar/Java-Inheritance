class PracticeCons
{
    public static void main(String args[])
    {
        Practice prac=new Practice("Vedant",19,'m');
        //Getter for age
        System.out.println(prac.getAge());

        //Setter for name
        prac.setName("Vedu");
        System.out.println(prac.getName());
    }
}