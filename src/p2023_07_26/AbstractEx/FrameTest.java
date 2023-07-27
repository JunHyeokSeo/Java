package p2023_07_26.AbstractEx;

import java.awt.*;
import java.awt.event.*;

//상속이 아닌 Frame 객체 생성 후 window 설정
public class FrameTest {
	
    private Frame f;

    public FrameTest() {	
		f = new Frame( "Frame Test" );
		f.setSize( 400, 300 );
		f.setLocation( 100, 100 );
		f.setBackground( Color.green );
		f.setVisible( true );
		f.setResizable(false);
		f.addWindowListener(
			new WindowAdapter() {
			    public void windowClosing( WindowEvent e ) {
					System.exit( 0 );
		        }
            }
		);
	}//생성자 end
	
    public static void main( String[] args ) {
		FrameTest ft = new FrameTest();
    }
}