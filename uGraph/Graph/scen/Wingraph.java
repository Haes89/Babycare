	

	// import javafx.scene.paint.*;


	import javafx.scene.Group;

	import javafx.scene.shape.Rectangle;



	public class Wingraph 
	{

		private Shape figur;

		
		private Group node;


		public void draw()
		{


			node.getChildren().clear();


			Rectangle fig1 = figur.rectangle(); 


			/* System.out.println( "\n" + "(debug) Wingraph draw" );*/

		
			node.getChildren().add( fig1 );

		}

		
		Wingraph( Group node )
		{


			figur = new Shape();


			this.node = node;
		}


	}

