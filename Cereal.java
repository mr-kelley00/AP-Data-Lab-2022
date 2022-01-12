// Ryan Kelley, 01/12/22, AP Data Lab 2022, v0.5

public class Cereal 
{

    private String name; 
    private double fiber;
    private double cups; 
    private double FPC; 

    public Cereal(String cerealName, double fiber, double cups, double fiberPerCup)

    {
     name = cerealName;
     fiber = fiber;
     cups = cups;
     FPC = fiberPerCup;

    }

    public Cereal() 
    {
        name = "";
        fiber = 0.0;
        cups = 0.0;
        FPC = 0.0; 

    }

    // Getters
    
    public String getName() 
    {
        return name; 
    }

    public double getFiber()
    {
        return fiber; 
    }

    public double getCups()
    {
        return cups; 
    }

    public double getFPC()
    {
        return FPC; 
    }

    // toString Method 

    public String toString()
    {
        return "Cereal: " + name + "\nFiber Content: " + fiber + "\nServing Size (in cups): " + cups + "\nFiber Per Cup: " + FPC;
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