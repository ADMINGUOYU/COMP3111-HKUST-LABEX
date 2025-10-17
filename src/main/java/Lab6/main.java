package Lab6;

// import system package
import java.lang.System;

/*
 * Lab6 assignment: DEBUG
 */
public class main
{
    // main - program entry
	public static void main(String[] args)
    {
        // create some animals
		Animal animals[] = new Animal[10];

        // initialize animals
        /*
        Reassigning the loop variable:
        If you reassign the loop variable to a new object,
        this will only change what the loop variable itself refers to,
        and it will not affect the original object in the array/collection.
        The original element will still point to the original object.
        So, we see this ("The value 'new Animal()' assigned to 'a' is never used") IntelliJ warning.
        So the following code will NOT work.
        */
		// for (Animal a : animals)
		//     a = new Animal();
        /* fixed version */
        for (int i = 0; i < animals.length; ++i)
            animals[i] = new Animal();

        // loop through all animals
		for (int index = 0; index < 10; ++index)
        {
			int step = 0;
			for (; step < 100 && animals[index].isAlive() ; ++step)
            {
				System.out.print(animals[index].getWeight() + " ");
				animals[index].eat();
                // if step mod3 == 0
				if (step % 3 == 0)
				    animals[index].poo();
			}
		}

        // end of main function
        System.exit(0);
	}
}