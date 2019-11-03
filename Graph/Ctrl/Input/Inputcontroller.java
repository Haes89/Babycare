
	import java.util.*;


	public class Inputcontroller
	{


		private Controller ctrl;


		private static Inputcontroller inctrl = null;

		
		private Outmenu local;


		public void routin( int type )
		{

				/*

				String prompt = ( "\n" + "In Child you can follow your children's development ! " );


				String key = ( "\n" + "You have selected the wrong character ( please try again ) !" );


				String avslut = ( "\n" + "You have chosen to end Child ( welcome again ) !" );


				sort = new Outmenu( prompt, key, avslut );
				*/



				if( type == 1 )
				{

					System.out.println( "" + "The ( Create user ) routine is now activated." );


				}


				
				else if( type == 2 )
				{

					System.out.println( "" + "The ( Register child ) routine is now activated." );

				}


				else if( type == 3 )
				{

					System.out.println( "" + "The ( Register data ) routine is now activated." );


				}

				else if( type == 4 )
				{




					String prompt = ( "\n" + "In the ( Do Graph ) routine you can draw a graph ! " );


					String key = ( "\n" + "You have selected the wrong character ( please try again ) !" );


					String avslut = ( "\n" + "You have chosen to end the ( Do Graph ) routine. !" );


				



					local = new Graphmenu( prompt, key, avslut );



					local.setRows();


					ctrl.setsort( local );


					
					


					ctrl.showRows();


					System.out.println( "\n" + "Since it is possible to display a sub-menu i stop program." );
				}


				
		}


		private Inputcontroller()
		{
			
			ctrl = Controller.getInstance(); 


		}


		public static Inputcontroller getInstance()
		{


			if ( inctrl == null )
			{



				inctrl = new Inputcontroller();

			}

			return inctrl;
		}



	}









