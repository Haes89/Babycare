	

	import javafx.application.Application;


	import javafx.stage.Stage;



	import javafx.scene.Group;



	public class Graph extends Application
	{



		public static void main( String[] args )
		{


			// System.out.println( "\n" + "(debug) Graph main" );


			launch( args );

		}



		public void start( Stage out )
		{
			

			Winplate view = new Winplate( out );


			// System.out.println( "\n" + "(debug) Graph start" );



			Group node = view.render();



			Wingraph graph = new Wingraph( node );


			graph.draw();


		}

	}