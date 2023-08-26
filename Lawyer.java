class Lawyer extends Employee
{
    String NameLawyer;

    //Add this method only for lawyers
    public char getLawyerPosition()
    {
        return 'm';

    }

    @Override
    public int getSalary() {
        return super.getSalary() + 500;
    }

    public Lawyer(String newName)
    {
        this.NameLawyer=newName;
    }
}
