package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() {
		
		if(!wasFirstValCalled) {
			throw new IllegalStateException("firstValue method must be called at least once before this one.");
		}
		current = current + commonDifference; 
		return current;
	}
	
	@Override
	public String toString() {
		int f = (int) this.firstValue();
		int cD = (int) this.commonDifference;
		return "Arith(" + f + "," + cD +")";
	}
	
	@Override 
	public double getTerm(int n) throws IndexOutOfBoundsException {
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 
		
		return this.firstValue() + this.commonDifference * (n - 1);
	}

}
