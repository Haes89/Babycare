	

	import javafx.scene.Scene;


	import javafx.scene.Group;


	import javafx.stage.StageStyle;


	import javafx.stage.Stage;



	public class Winplate 
	{



		private Stage plate;

		
		private Group node;


		private Scene root;



		public Group render()
		{


			// System.out.println( "\n" + "(debug) Winplate render" );




			plate.initStyle(StageStyle.DECORATED); 	/* plate.initStyle(StageStyle.UNDECORATED); */



			plate.setTitle("Child !");


			plate.setScene( root ); 


		
			root.getStylesheets().add("css/layout.css");

		
			plate.show();

			

			return node;


		}


		Winplate( Stage out )
		{

			plate = out;


			node = new Group();


			root = new Scene( node, 700, 450 );

		}

	}

