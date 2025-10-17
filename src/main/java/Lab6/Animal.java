package Lab6;

import java.util.Vector;

public class Animal
{
    // member variables
	private double weight;
	private boolean alive;

    // constructor
	public Animal()
    {
		weight = 5;
		alive = true;
	}

    // accessor
	public double getWeight() { return weight;}
	public boolean isAlive() { return alive; }

    // functional
	public void eat()
    {
		if (!alive) return; 
		    weight *= 1.05;
		if (weight > 100)
        {
			System.out.println("it dies because of overweight.");
			alive = false;
		}
	}
	public void poo()
    {
		if (!alive) return;
		    weight -= 1;
		if (weight < 0)
        {
			System.out.println("it dies because of underweight.");
			alive = false;
		}
	}

}