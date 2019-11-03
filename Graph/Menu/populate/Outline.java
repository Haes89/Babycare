


	import java.util.*;


	public class Outline 
	{


		private static ArrayList<Item> lines;

			
		public static ArrayList<Item> rows( String type )
		{

			/* System.out.println( "\n" +"(debug) Outline rows"); */



			setlines( type ) ;


			return lines;
		}

		
		private static void setlines( String type )
		{

			/* System.out.println( "\n" +"(debug) Outline setlines"); */

			

			if( type == "head" )
			{
			
			lines.add( new Item( "1." , "Create user" , "user"));


			lines.add( new Item( "2." , "Register child" , "child"));


			lines.add( new Item( "3." , "Register data" , "data"));


			lines.add( new Item( "4." , "Do Graph" , "graph"));

			}


			if( type == "graph" )
			{

			lines.clear();

			
			lines.add( new Item( "1." , "Create a graph for all values" , "allvalues"));


			lines.add( new Item( "2." , "Create a graph for some period" , "somevalues"));



			}

		}


		public Outline()
		{

			lines = new ArrayList<Item>();
		}
		
	}



