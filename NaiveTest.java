import java.math.BigInteger;

public class NaiveTest
{
	public static boolean isPrime(BigInteger candidate)
	{
		if (!candidate.isProbablePrime((100))) return false; // Weed out the likely not primes.
		
		BigInteger loopStop = candidate.sqrt().add(BigInteger.ONE);
		for (BigInteger outerIndex = BigInteger.TWO; !outerIndex.equals(loopStop); outerIndex = outerIndex.add(BigInteger.ONE))
		{
			for (BigInteger innerIndex = outerIndex; !innerIndex.equals(loopStop); innerIndex = innerIndex.add(BigInteger.ONE))
			{
				if (candidate.equals(innerIndex.multiply(outerIndex))) return false;
			}
		}
		return true;
	}
}
