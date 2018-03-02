package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() {
		
		if(!wasFirstValCalled) {
			throw new IllegalStateException("firstValue method must be called at least once before this one.");
		}
		current = current * commonFactor; 
		return current;
	}
	
	@Override
	public String toString() {
		int f = (int) this.firstValue();
		int cF = (int) this.commonFactor;
		return "Geom(" +  f + "," + cF +")";
	}
	
	@Override 
	public double getTerm(int n) throws IndexOutOfBoundsException {
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 
		
		return this.firstValue() * Math.pow(this.commonFactor, n-1);
	}

}
