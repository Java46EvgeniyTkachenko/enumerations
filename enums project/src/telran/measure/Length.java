package telran.measure;



public class Length implements Comparable<Length> {
	private final float amount;
	private final LengthUnit unit;
	
	public Length(float amount, LengthUnit unit) {
		this.amount = amount;
		this.unit = unit;
	}

	@Override
	/**
	 * equals two Length objects according to LengthUnit
	 * 10m == 10000mm
	 */
	public boolean equals(Object obj) {
		//TODO
		Length o = (Length)	obj;
			
		return cal(this) == cal(o);
	}

	@Override
	public int compareTo(Length o) {
		//TODO
			return (int)(cal(this)-cal(o));
	}
	/**
	 * 
	 * @param unit
	 * @return new Length object with a given LengthUnit
	 * convert(LengthUnit.M) returns Length in meters 
	 */
	public Length convert(LengthUnit unit) {
		float newLenght = cal(this)/unit.value;
		return new Length(newLenght, unit);
	}
	@Override
	/**
	 * returns string with amount and length unit pinned to amount with no space
	 * Example: 20M (string expression of Length object designed 20 meters)
	 */
	public String toString() {
				
		return Integer.toString((int) this.getAmount()) + this.getUnit();
	}

	public float getAmount() {
		return amount;
	}

	public LengthUnit getUnit() {
		return unit;
	}
	
	public static float cal(Length o) {
		return o.getUnit().value*o.getAmount();
	}
	
	
	

}
