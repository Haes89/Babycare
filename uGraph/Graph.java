

	import javafx.application.Application;


	import javafx.stage.Stage;

	import javafx.scene.Group;


	public class Graph extends Application
	{


		private Controller option;



		public static void main( String[] args )
		{


			/* System.out.println( "\n" + "(debug) Graph main" );*/


			launch( args );
		}



		private void doStart()
		{
			
			/* System.out.println( "\n" +"(debug) Graph Init");*/


			option = Controller.getInstance();


			option.draw();
		}



		public void start( Stage out )
		{

			
			/* System.out.println( "\n" + "(debug) Graph start" );*/


			Graph run = new Graph();


			run.doStart();


			
			Winplate view = new Winplate( out );

			Group node = view.render();



			Wingraph graph = new Wingraph( node );

			graph.draw();

		}

	}