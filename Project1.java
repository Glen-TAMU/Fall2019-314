public class Project1 {
	public static void main(String[] args) 
	{
		// Instantiate Primes Class
		Primes p = new Primes();
		
		// Generate Primes and test.
		p.generatePrimes(21);
		p.printPrimes();
		
		// Generate and test Twin Primes
		Primes testtwo = new Primes();
		testtwo.generatePrimes(100);
		testtwo.generateTwinPrimes();
		testtwo.printTwins();
		
		// Generate and test Hexagonal crosses
		Primes testThree = new Primes();
		testThree.generatePrimes(2000);
		testThree.generateTwinPrimes();
		testThree.generateHexPrimes();
		testThree.printHexes();
	}
}
