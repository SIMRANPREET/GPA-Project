public class CalculatedAverage {
	private double class1;
	private double class2;
	private double class3;
	private double class4;
	private double class5;
	private double class6;
	private double class7;
	private double class8;
	private double pgpa;
	//sets the pgpa to the average of the predicted values from the graph.
	public void calculateAverage(double one,double two,double three,double four,double five,double six,double seven,double eight){
		class1 = one;
		class2 = two;
		class3 = three;
		class4 = four;
		class5 = five;
		class6 = six;
		class7 = seven;
		class8 = eight;
		pgpa = (class1 + class2 + class3 + class4 + class5 + class6 + class7 + class8)/8;
	}
	//returns the pgpa so it can be displayed in a JLabel.
	public double getPredictedValue(){
		return pgpa;
	}
}
