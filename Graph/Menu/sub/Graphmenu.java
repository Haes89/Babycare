


	import java.util.*;


	public class Graphmenu extends Outmenu
	{

		
		private ArrayList<Item> rows;

		/*
		private String[] hello;


		@Override
		public int rowCount()
		{ 


			return rows.size();
		}
		
		

		@Override
		public String[] gethello()
		{ 


			return hello;
		}
		*/


		@Override
		public ArrayList<Item> getrows()
		{ 


			return rows;
		}
			

		public Graphmenu( String prompt, String key, String avslut  )
		{

			/* System.out.println( "\n" +"(debug) Outmenu Outmenu");*/


			super( prompt, key, avslut );

			
			//super.rows=null;  //accessproblem


			rows = new ArrayList<Item>();


			/*
			this.hello = new String[3];


			hello[0] = prompt;


			hello[1] = key;


			hello[2] = avslut;


			
			*/
		}

		@Override
		public void setRows()
		{

			/* System.out.println( "\n" +"(debug) Graphmenu setRows");*/

			

			ArrayList<Item> in = Outline.rows( "graph" );  //user, child, data, graph 



			for( int i =0; i < in.size(); i++ )
			{


				 rows.add( in.get( i ) );

			}

				
		}

		
	}



