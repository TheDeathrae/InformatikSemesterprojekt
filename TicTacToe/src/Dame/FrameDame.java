package Dame;

import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class FrameDame extends JFrame{
	
	//Objekt von gamelogik weil die logik auf aktionen im Frame reagieren
	GameLogic gl = new GameLogic();
	//Objekt vom Zeichner um maße des Feldes zu kennen
			Field fDame = new Field(Toolkit.getDefaultToolkit().getScreenSize().width,
					(Toolkit.getDefaultToolkit().getScreenSize().height - 30), gl);
	
	FrameDame() {
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Dame");
		setBounds(0, 0, Toolkit.getDefaultToolkit().getScreenSize().width,
				(Toolkit.getDefaultToolkit().getScreenSize().height - 30));
		
		gl.fillList();
		add(fDame);
		setVisible(true);
		
		addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {

				int x = getXCoordinate(arg0.getX());
				System.out.println(x);
				int y = getYCoordinate(arg0.getY());
				System.out.println(y);
				
				if(gl.chooseFigure(x, y)) {
					if(gl.proofMove(x, y)) {
						gl.makeMove(x, y);
						gl.changeQueen();
					}
				}
				
				repaint();
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// erstmal unnötig

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// erstmal unnötig

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// erstmal unnötig

			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// erstmal unnötig

			}

		});
	}
	
	public int getXCoordinate(int x) {
		if(x < (fDame.getBoardSizeX() / 8) + fDame.getPositionBoardX()) {
			return 0;
		}
		else if(x < (fDame.getBoardSizeX() / 8) * 2 + fDame.getPositionBoardX()) {
			return 1;
		}
		else if(x < (fDame.getBoardSizeX() / 8) * 3 + fDame.getPositionBoardX()) {
			return 2;
		}
		else if(x < (fDame.getBoardSizeX() / 8) * 4 + fDame.getPositionBoardX()) {
			return 3;
		}
		else if(x < (fDame.getBoardSizeX() / 8) * 5 + fDame.getPositionBoardX()) {
			return 4;
		}
		else if(x < (fDame.getBoardSizeX() / 8) * 6 + fDame.getPositionBoardX()) {
			return 5;
		}
		else if(x < (fDame.getBoardSizeX() / 8) * 7 + fDame.getPositionBoardX()) {
			return 6;
		}
		else {
			return 7;
		}
		
	}
	public int getYCoordinate(int x) {
		if(x < (fDame.getBoardSizeY() / 8) + fDame.getPositionBoardY()) {
			return 0;
		}
		else if(x < (fDame.getBoardSizeY() / 8) * 2 + fDame.getPositionBoardY()) {
			return 1;
		}
		else if(x < (fDame.getBoardSizeY() / 8) * 3 + fDame.getPositionBoardY()) {
			return 2;
		}
		else if(x < (fDame.getBoardSizeY() / 8) * 4 + fDame.getPositionBoardY()) {
			return 3;
		}
		else if(x < (fDame.getBoardSizeY() / 8) * 5 + fDame.getPositionBoardY()) {
			return 4;
		}
		else if(x < (fDame.getBoardSizeY() / 8) * 6 + fDame.getPositionBoardY()) {
			return 5;
		}
		else if(x < (fDame.getBoardSizeY() / 8) * 7 + fDame.getPositionBoardY()) {
			return 6;
		}
		else {
			return 7;
		}
				
	}

}

