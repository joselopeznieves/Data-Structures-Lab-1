package orderedStructures;

import interfaces.Combinable;

public class Arithmetic extends Progression implements Combinable {
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
	
	 
	public boolean equals(Object other) {
		if(other == null || !this.getClass().isAssignableFrom(other.getClass())) return false;
		
		Arithmetic castedObj = (Arithmetic) other;
		
		if(castedObj.firstValue() == this.firstValue() && castedObj.commonDifference == this.commonDifference) return true;
		
		return false;
	}
	
	public Arithmetic add(Arithmetic other) {
		return new Arithmetic(this.firstValue() + other.firstValue(), this.commonDifference + other.commonDifference);
	}
	
	public Arithmetic substract(Arithmetic other) {
		return new Arithmetic(this.firstValue() - other.firstValue(), this.commonDifference - other.commonDifference);
	}

}
