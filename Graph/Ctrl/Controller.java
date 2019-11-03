
	import java.util.*;


	public class Controller
	{


		/* om det här attributet ändras kan alla metoder användas för en annan menu. */


		private Outmenu sort; // då sort är en menuklasss så borde den kunna hantera ärvda menuer. //


		private Scanner userKey; 



		private static Controller singel = null;

		
		private Inputcontroller input;



		private Outline init = new Outline();



		public void showRows( )
		{


			Item row;


			String[] out = sort.gethello();


			ArrayList<Item> option = sort.getrows();

			
			System.out.println( out[0] );

			
			for( int i =0; i < option.size(); i++ )
			{

				 row = option.get( i );


				System.out.println( "\n" + row.getnr() + " " + row.gettext() );
			}


			System.out.println("");

		}


		public void draw( )
		{


			/* System.out.println( "\n" +"(debug) Controller draw");*/


			sort.setRows();


			singel.showRows();


			int choose = singel.readmenu();


			/* System.out.println( "(debug) det skall visas ett valt tal. ( " + choose + " )" ); */


			//System.out.println( "\n" + "A Child routine is now activated." );

			
			input = Inputcontroller.getInstance(); 


			//singel.andra( choose );


			
			input.routin( choose );


		}

		public void setsort( Outmenu set)
		{
			sort = set;
		}


		private int readmenu(  )
		{


			int read = 10;

			
			boolean unvalid;


			do
			{

				unvalid = false;


				try 
				{

					read = userKey.nextInt();


					if( read < 1 || read > sort.rowCount())
					{


						unvalid = true;




						System.out.println( "\n" + "You have chosen an integer that does not lead to a routine." );

						
						System.out.println( "\n" + "To choose a routine please enter a selectable number." + "\n" );
					}

				}
				catch( Exception e ) 
				{



					/* det är viktigt att userkey brukas så att scannerns buffer inte använder ett gammalt värde.*/

					
					userKey.next();

					


					System.out.println( "\n" + "You have given a character that is not an integer." );


					System.out.println( "\n" + "To choose a routine please enter an integer this time." + "\n" );



					unvalid = true;
					
				}


			}while( unvalid );


			return read;

		}

		
		


		/* Den här start metoden tillhör kontrollern Controller och skall bara gå att använda en gång. */


		private Controller()
		{



				/* System.out.println( "\n" +"(debug) Controller Controller");*/

				
				/* i denna version får den overgripande menun ges texter har. */


				
				String prompt = ( "\n\n" + "In Child you can follow your children's development ! " );


				String key = ( "\n" + "You have selected the wrong character ( please try again ) !" );


				String avslut = ( "\n" + "You have chosen to end Child ( welcome again ) !" );



				sort = new Outmenu( prompt, key, avslut );



				userKey = new Scanner( System.in );	

		}


		/* Den här start metoden finns till för att klassen skall gå att implementera enligt singleton.*/


		public static Controller getInstance()
		{


			if ( singel == null )
			{



				singel = new Controller();

			}

			return singel;
		}



	}









