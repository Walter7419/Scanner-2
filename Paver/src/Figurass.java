public class Figurass {
	public int ID;
	

	
	public Figurass(int ID) {
			this.ID = ID;
	}
	
	public double cPCi() {
		return(double) (2*3.14*ID);
	}
	

	
	public double cACi() {
		return (double) ID * ID * 3.14;
	}
	

	public double cPCu() {
		return(double) ID*4;
}
	public double cACu() {
		return (double) ID*ID;
} 	
}