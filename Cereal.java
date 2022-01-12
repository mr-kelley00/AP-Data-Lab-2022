// Ryan Kelley, 01/12/22, AP Data Lab 2022, v0.5

public class Cereal 
{

    private String name; 
    private double fiber0;
    private double cups0; 
    private double FPC; 

    public Cereal(String cerealName, double fiber, double cups, double fiberPerCup)

    {
     name = cerealName;
     fiber0 = fiber;
     cups0 = cups;
     FPC = fiberPerCup;

    }

    public Cereal() 
    {
        name = "";
        fiber0 = 0.0;
        cups0 = 0.0;
        FPC = 0.0; 

    }

    // Getters
    
    public String getName() 
    {
        return name; 
    }

    public double getFiber()
    {
        return fiber0; 
    }

    public double getCups()
    {
        return cups0; 
    }

    public double getFPC()
    {
        return FPC; 
    }

    // toString Method 

    public String toString()
    {
        return "Cereal: " + name + "\nFiber Content: " + fiber0 + "\nServing Size (in cups): " + cups0 + "\nFiber Per Cup: " + FPC;
    }


    public static void main(String[] args) 
    {

        Cereal food1 = new Cereal(); 
        System.out.println(food1.toString());

        // Create three additional foods, using the data from the chart, and the constructor above. 
        // Print them using the toString() method.  

        Cereal food2 = new Cereal("Cap'n Crunch", 1.25, 0.33, 0.0);
        System.out.println(food2.toString());



    }


    

}