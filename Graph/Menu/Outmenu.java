


	import java.util.*;


	public class Outmenu extends Inall
	{

		private ArrayList<Item> rows;

			
		private String[] hello;



		public int rowCount()
		{ 


			return rows.size();
		}
		

		public ArrayList<Item> getrows()
		{ 


			return rows;
		}


		public String[] gethello()
		{ 


			return hello;
		}


		public Outmenu( String prompt, String key, String avslut  )
		{

			/* System.out.println( "\n" +"(debug) Outmenu Outmenu");*/



			this.hello = new String[3];


			hello[0] = prompt;


			hello[1] = key;


			hello[2] = avslut;


			rows = new ArrayList<Item>();

		}

		
		public void setRows()
		{

			/* System.out.println( "\n" +"(debug) Outmenu setRows"); */

			

			ArrayList<Item> in = Outline.rows( "head" );  //douser, dochild, dodata, dograph 


			for( int i =0; i < in.size(); i++ )
			{


				 rows.add( in.get( i ) );

			}

					
		}

		
	}



