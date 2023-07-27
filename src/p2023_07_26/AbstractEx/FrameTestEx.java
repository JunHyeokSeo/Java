package p2023_07_26.AbstractEx;

import java.awt.*;
import java.awt.event.*;

public class FrameTestEx extends Frame {

    public FrameTestEx() {
		//	f = new Frame( "Frame Test" );
		super("Frame Test");
		setSize( 400, 300 );
		setLocation( 100, 100 );
		setBackground( Color.green );
		setVisible( true );
		addWindowListener(
			new WindowAdapter() {
			    public void windowClosing( WindowEvent e ) {
					System.exit( 0 );
				}
            }
		);
    }//생성자 end

    public static void main( String[] args ) {
		FrameTestEx ft = new FrameTestEx();
    }
}