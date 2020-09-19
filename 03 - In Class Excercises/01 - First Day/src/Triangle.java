
public class Triangle 
{
	// Create info about Triangle
		private int base;
		private int height;
		private static int INITIAL_BASE		= 1;
		private static int INITIAL_HEIGHT	= 1;
		
		
		// Create no argument constructor
		public Triangle()
		{
			this(INITIAL_BASE, INITIAL_HEIGHT);
		}
		// Create Constructor
		public Triangle(int base, int height) 
		{
			super();
			this.base 	= base;
			this.height = height;

	// Getters and Setters
		public int getBase() 
		{
			return base;
		}
		
		public void setBase(int base) 
		{
			this.base = base;
		}
		
		public int getHeight() 
		{
			return height;
		}
		
		public void setHeight(int height) 
		{
			this.height = height;

		}
		public int getArea() 
		{
			return area;
		}
		
		}
}
