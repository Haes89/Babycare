

	import java.util.*;

	public class Outmenu extends Inall
	{

		private ArrayList<Item> rows;


		public void setRows()
		{
			/* System.out.println( "\n" +"(debug) Outmenu Outmenu");*/


			rows.add( new Item( "1." , "Create user" , "doUser()"));


			rows.add( new Item( "2." , "Register child" , "doChild()"));

			rows.add( new Item( "3." , "Register data" , "doData()"));

			rows.add( new Item( "4." , "Do Graph" , "doGraph()"));
		}


		public void showRows()
		{

			for( int i =0; i<rows.size(); i++ )
			{

				System.out.println("\n" + "Den position som menu får");
			}

		}

		public Outmenu()
		{

			/* System.out.println( "\n" +"(debug) Outmenu Outmenu");*/

			rows = new ArrayList<Item>();

		}

	}