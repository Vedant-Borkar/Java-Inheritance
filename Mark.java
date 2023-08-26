public class Mark extends Employee
{

    //Only for marketer
    public boolean InsideMarket()
    {
        return true;
    }
    //The above method is Not anywhere other than this marketer
    /**it is type casted into the polymorphised object and then printed**/


    //What if i want marketer to work for more hours than others
    //Instead of 40 make it 50 using override

    public int getSalary() {
        return 50000;
    }

    public int getHours()
    {
        return 50;
    }
}
