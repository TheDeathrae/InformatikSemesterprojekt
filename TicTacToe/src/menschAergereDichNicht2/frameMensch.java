package menschAergereDichNicht2;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;

import java.awt.Toolkit;

import javax.swing.JFrame;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;

import Graphics.Draw;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;

public class frameMensch extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	int positionSelected;
	int spielerAnDerReihe;
	
	
	
	void draw(int[] array) {
		
	}
	
	
	public frameMensch(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(14, false));
		
		
		
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_63 = new Button(this, SWT.NONE);
		button_63.setText("63");
		
		Button button_62 = new Button(this, SWT.NONE);
		button_62.setText("62");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_18 = new Button(this, SWT.NONE);
		button_18.setText("18");
		
		Button button_19 = new Button(this, SWT.NONE);
		button_19.setText("19");
		
		Button button_20 = new Button(this, SWT.NONE);
		button_20.setText("20");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_67 = new Button(this, SWT.NONE);
		button_67.setText("67");
		
		Button button_66 = new Button(this, SWT.NONE);
		button_66.setText("66");
		new Label(this, SWT.NONE);
		
		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Label lblActiveplayer = new Label(composite, SWT.NONE);
		lblActiveplayer.setText("activePlayer");
		new Label(this, SWT.NONE);
		
		Button button_61 = new Button(this, SWT.NONE);
		button_61.setText("61");
		
		Button button_60 = new Button(this, SWT.NONE);
		button_60.setText("60");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_17 = new Button(this, SWT.NONE);
		button_17.setText("17");
		
		Button button_48 = new Button(this, SWT.NONE);
		button_48.setText("48");
		
		Button button_21 = new Button(this, SWT.NONE);
		button_21.setText("21");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_65 = new Button(this, SWT.NONE);
		button_65.setText("65");
		
		Button button_64 = new Button(this, SWT.NONE);
		button_64.setText("64");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_16 = new Button(this, SWT.NONE);
		button_16.setText("16");
		
		Button button_49 = new Button(this, SWT.NONE);
		button_49.setText("49");
		
		Button button_22 = new Button(this, SWT.NONE);
		button_22.setText("22");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Label lblSpieleranzahl = new Label(this, SWT.NONE);
		lblSpieleranzahl.setText("Spieleranzahl");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_15 = new Button(this, SWT.NONE);
		button_15.setText("15");
		
		Button button_50 = new Button(this, SWT.NONE);
		button_50.setText("50");
		
		Button button_23 = new Button(this, SWT.NONE);
		button_23.setText("23");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button btnEin = new Button(this, SWT.NONE);
		btnEin.setText("ein");
		new Label(this, SWT.NONE);
		
		Button button_10 = new Button(this, SWT.NONE);
		button_10.setText("10");
		
		Button button_11 = new Button(this, SWT.NONE);
		button_11.setText("11");
		
		Button button_12 = new Button(this, SWT.NONE);
		button_12.setText("12");
		
		Button button_13 = new Button(this, SWT.NONE);
		button_13.setText("13");
		
		Button button_14 = new Button(this, SWT.NONE);
		button_14.setText("14");
		
		Button button_51 = new Button(this, SWT.NONE);
		button_51.setText("51");
		
		Button button_24 = new Button(this, SWT.NONE);
		button_24.setText("24");
		
		Button button_25 = new Button(this, SWT.NONE);
		button_25.setText("25");
		
		Button button_26 = new Button(this, SWT.NONE);
		button_26.setText("26");
		
		Button button_27 = new Button(this, SWT.NONE);
		button_27.setText("27");
		
		Button button_28 = new Button(this, SWT.NONE);
		button_28.setText("28");
		new Label(this, SWT.NONE);
		
		Button btnZwei = new Button(this, SWT.NONE);
		btnZwei.setText("zwei");
		new Label(this, SWT.NONE);
		
		Button button_9 = new Button(this, SWT.NONE);
		button_9.setText("9");
		
		Button button_44 = new Button(this, SWT.NONE);
		button_44.setText("44");
		
		Button button_45 = new Button(this, SWT.NONE);
		button_45.setText("45");
		
		Button button_46 = new Button(this, SWT.NONE);
		button_46.setText("46");
		
		Button button_47 = new Button(this, SWT.NONE);
		button_47.setText("47");
		new Label(this, SWT.NONE);
		
		Button button_55 = new Button(this, SWT.NONE);
		button_55.setText("55");
		
		Button button_54 = new Button(this, SWT.NONE);
		button_54.setText("54");
		
		Button button_53 = new Button(this, SWT.NONE);
		button_53.setText("53");
		
		Button button_52 = new Button(this, SWT.NONE);
		button_52.setText("52");
		
		Button button_29 = new Button(this, SWT.NONE);
		button_29.setText("29");
		new Label(this, SWT.NONE);
		
		Button btnDrei = new Button(this, SWT.NONE);
		btnDrei.setText("drei");
		new Label(this, SWT.NONE);
		
		Button button_8 = new Button(this, SWT.NONE);
		button_8.setText("8");
		
		Button button_7 = new Button(this, SWT.NONE);
		button_7.setText("7");
		
		Button button_6 = new Button(this, SWT.NONE);
		button_6.setText("6");
		
		Button button_5 = new Button(this, SWT.NONE);
		button_5.setText("5");
		
		Button button_4 = new Button(this, SWT.NONE);
		button_4.setText("4");
		
		Button button_43 = new Button(this, SWT.NONE);
		button_43.setText("43");
		
		Button button_34 = new Button(this, SWT.NONE);
		button_34.setText("34");
		
		Button button_33 = new Button(this, SWT.NONE);
		button_33.setText("33");
		
		Button button_32 = new Button(this, SWT.NONE);
		button_32.setText("32");
		
		Button button_31 = new Button(this, SWT.NONE);
		button_31.setText("31");
		
		Button button_30 = new Button(this, SWT.NONE);
		button_30.setText("30");
		new Label(this, SWT.NONE);
		
		Button btnVier = new Button(this, SWT.NONE);
		btnVier.setText("vier");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_3 = new Button(this, SWT.NONE);
		button_3.setText("3");
		
		Button button_42 = new Button(this, SWT.NONE);
		button_42.setText("42");
		
		Button button_35 = new Button(this, SWT.NONE);
		button_35.setText("35");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_2 = new Button(this, SWT.NONE);
		button_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		button_2.setText("2");
		
		Button button_41 = new Button(this, SWT.NONE);
		button_41.setText("41");
		
		Button button_36 = new Button(this, SWT.NONE);
		button_36.setText("36");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_59 = new Button(this, SWT.NONE);
		button_59.setText("59");
		
		Button button_58 = new Button(this, SWT.NONE);
		button_58.setText("58");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_1 = new Button(this, SWT.NONE);
		button_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		button_1.setText("1");
		
		Button button_40 = new Button(this, SWT.NONE);
		button_40.setText("40");
		
		Button button_37 = new Button(this, SWT.NONE);
		button_37.setText("37");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_71 = new Button(this, SWT.NONE);
		button_71.setText("71");
		
		Button button_70 = new Button(this, SWT.NONE);
		button_70.setText("70");
		new Label(this, SWT.NONE);
		
		Label lblWuerfelwurf = new Label(this, SWT.NONE);
		lblWuerfelwurf.setText("wuerfelWurf");
		new Label(this, SWT.NONE);
		
		Button button_57 = new Button(this, SWT.NONE);
		button_57.setText("57");
		
		Button button_56 = new Button(this, SWT.NONE);
		button_56.setText("56");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button = new Button(this, SWT.NONE);
		button.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				positionSelected = 0;
			}
		});
		button.setText("0");
		
		Button button_39 = new Button(this, SWT.NONE);
		button_39.setText("39");
		
		Button button_38 = new Button(this, SWT.NONE);
		button_38.setText("38");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_69 = new Button(this, SWT.NONE);
		button_69.setText("69");
		
		Button button_68 = new Button(this, SWT.NONE);
		button_68.setText("68");
		new Label(this, SWT.NONE);
		
		Button btnWrfeln = new Button(this, SWT.NONE);
		btnWrfeln.setText("w\u00FCrfeln");
		
		

	}

	

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
