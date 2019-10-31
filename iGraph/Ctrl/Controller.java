

	public class Controller
	{

		private static Controller singel = null;


		private Outmenu all;

		public void draw()
		{

			/* System.out.println( "\n" +"(debug) Controller draw");*/

			all.setRows();


			all.showRows();
			
		}


		/* Den här start metoden tillhör kontrollern Controller och skall bara gå att använda en gång. */


		private Controller()
		{

				/* System.out.println( "\n" +"(debug) Controller Controller");*/


				all = new Outmenu();	

		}


		/* Den här start metoden finns till för att klassen skall gå att implementera enligt singleton.*/


		public static Controller getInstance( )
		{


			if ( singel == null )
			{


				singel = new Controller();

	
			}

			return singel;

		}



	}









