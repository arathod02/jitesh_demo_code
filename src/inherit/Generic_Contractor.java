package inherit;

public abstract  class Generic_Contractor implements Contractor {
		
	public void  make_building()		{
		 System.out.println(" This is a generic  make_building method  ");
		} 
	 
	public void paint_building()	 {
		 System.out.println(" This is a generic  paint_building method and so painting it White by default " );
	 }
	 
	public void garden_building() {
		 System.out.println(" This is a generic  garden_building method  and so by default rose " );
	 
	 }
	 

}
