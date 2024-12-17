class Car30
{
    private int num;
    private double gas;

    public Car30()
    {
        num = 0;
        gas = 0.0;

        System.out.println("已生產汽車");
    }

    public void setCar(int n, double g) throws CarException
    {
        if(g < 0)
        {
            CarException e = new CarException();
            throw e;
        } else 
        {
            num = n;
            gas = g;

            System.out.println("將車號設為"+num+"汽油量設為"+gas);
        }
        
    }

    public void show()
    {
        System.out.println("車號是"+num);
        System.out.println("汽油量是"+gas);
    }
} 