public class Grandfather
{
    int cash=50;
    int cars=10;
    String[] realestate={"H1","H2","H3"};


    public Grandfather()
    {

    }


    /**public Grandfather(int cash, int cars, String[] realestate)
    {
        this.cash=cash;
        this.cars=cars;
        this.realestate=realestate;

    }**/

    public int getCash() {
        return cash;
    }
    public int getCars()
    {
        return cars;
    }
    public String[] getRealestate()
    {
        return realestate;
    }

    public void setCash()
    {
        this.cash=cash;
    }

    public void setCars(int cars) {
            this.cars = cars;
    }

    public void setRealestate(String[] realestate) {
        this.realestate = realestate;
    }
}
