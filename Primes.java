import java.util.ArrayList;
import java.util.Iterator;
import java.math.BigInteger;

/*
 *  Desc: This class generates primes, twin primes, and hexagon crosses using BigInteger data types.
 */
public class Primes {
	
	// Member variables for containing out lists of integers, twin primes, hexagon crosses, and the pairs of twin primes that make up the hex crosses.
	private ArrayList<BigInteger> primeList = new ArrayList<BigInteger>();
	private ArrayList<Pair<BigInteger>> twinPrimeList = new ArrayList<Pair<BigInteger>>();
	private ArrayList<Pair<BigInteger>> crossList = new ArrayList<Pair<BigInteger>>();
		

	// Add a prime to the prime list if and only iff it is not already in the list. (ignore duplicates)
	public void addPrime(BigInteger primeNumber)
	{
		if (!primeList.contains(primeNumber))
			primeList.add(primeNumber);
	}

	// Add a pair to the pair list 
	public void addPair(Pair<BigInteger> pair)
	{
			twinPrimeList.add(pair);
	}

	// Adds a pair of BigIntegers that represent a Hexagonal Cross.
	public void addCross(Pair<BigInteger> pair)
	{

	}
	
	// Empties the list of primes.
	public void clearPrimes()
	{
	
	}
	
	// Empties the list of crosses.
	public void clearCrosses()
	{

	}
	
	// Output the prime list. Each prime should be on a separate line and the total number of primes should be on the following line.
	public void printPrimes()
	{
		for(BigInteger p : primeList)
		{
			System.out.println(p);
		}
		System.out.println("Total Primes: " + primeList.size());
	}
		
	// Output the twin prime list. Each twin prime should be on a separate line with a comma separating them, and the total number of twin primes should be on the following line.
	public void printTwins()
	{
		for(Pair<BigInteger> p : twinPrimeList)
		{
			System.out.println(p.left() + ", " + p.right());
		}
		System.out.println("Total Twins: " + twinPrimeList.size());
	}
		
	// Output the hexagon cross list. Each should be on a separate line listing the two twin primes and the corresponding hexagon cross, with the total number on the following line.
	public void printHexes()
	{
		for(int i = 0; i< crossList.size(); i++)
		{
			System.out.println("Hexagon Cross: " + crossList.get(i).left() + ", " + crossList.get(i).right());
		}
		System.out.println("Total Hexes: " + crossList.size());
	}
	
//Generate and store a list of primes from a given starting point.
	public void generatePrimes(BigInteger candidate, int count)
	{
		primeList.clear();

		if (count < 1) return;
		
		for (int i=0; i < count; i++)
		{
			boolean found = false;
			while(!found)
			{
				if(NaiveTest.isPrime(candidate)) // You should implement a faster primality test!
				{
					primeList.add(candidate);
					found = true;
				}
				candidate = candidate.add(BigInteger.ONE);
			}
		}

	}
	
	// Generate and store a list of twin primes.
	public void generateTwinPrimes()
	{
		twinPrimeList.clear();
		for (int i = 0; i < primeList.size()-1; i++)
		{
			if (primeList.get(i+1).equals((primeList.get(i).add(BigInteger.TWO))) )
			{
				twinPrimeList.add(new Pair<BigInteger>(primeList.get(i), (primeList.get(i+1))));
			}
		}
	}
	
	// Generate and store the hexagon crosses, along with the two twin primes that generate the hexagon cross.
	public void generateHexPrimes()
	{
		crossList.clear();
		for (int i=0; i < twinPrimeList.size()-1; i++)
		{
			BigInteger n = twinPrimeList.get(i).left().add(BigInteger.ONE);
			
			for (int j=i+1; j < twinPrimeList.size(); j++)
			{
				BigInteger twoN = twinPrimeList.get(j).left().add(BigInteger.ONE);
				if (n.multiply(BigInteger.TWO).equals(twoN) )
				{
					crossList.add(new Pair<BigInteger>(n, twoN));				
				}		
			}
		}
	}

	// Count the number of digits in the last (and thus largest) prime.
	public int sizeofLastPrime()
	{
	}
	
	// Count the number of digits in the two entries in the last (and thus largest) hexagon cross
	public Pair<Integer> sizeofLastCross()
	{
	}
	
	// Return the number of primes
	public int primeCount()
	{
	}
	
	// Return the number of crosses.
	public int crossesCount()
	{
	}
	
	public class IterablePrimes implements Iterable<BigInteger>
	{		
	}
	
	public IterablePrimes iteratePrimes() { return new IterablePrimes();}

	public class IterableCrosses implements Iterable<BigInteger>
	{		
	}
	
	public IterableCrosses iterateCrosses() { return new IterablePrimes();}


}
