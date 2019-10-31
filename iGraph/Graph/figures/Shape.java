
	import javafx.scene.shape.Line; 

	import javafx.scene.shape.Polyline;


	import javafx.scene.shape.Circle; 

	import javafx.scene.shape.Rectangle;


	public class Shape
	{


		public Rectangle rectangle()
		{

			/* System.out.println( "\n" + "(debug) Shape rectangle" ); */



			Rectangle test = new Rectangle();

			test.setX( 50.0f ); test.setY( 50.0f ); test.setWidth( 50.0f ); test.setHeight( 50.0f );  


			test.getStyleClass().add( "orange-rect" );


			return test;

		}

	}