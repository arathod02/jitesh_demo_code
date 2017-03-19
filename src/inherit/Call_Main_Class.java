package inherit;

public class Call_Main_Class {
	
	public static void main ( String args[]){
		Contractor c1 = new Painter();
		((Painter) c1).paint_type();
		c1.paint_building();
		c1.make_building();
		c1.Time_approx();
		
		c1 =new Gardener();
		c1.garden_building(); 
		c1.paint_building();
		c1.Time_approx();
	}

}
