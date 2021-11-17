package menschAergereDichNicht;


import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;



import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import src.org.eclipse.wb.swt.SWTResourceManager;

public class Mensch extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	int positionSelected;
	Button[] positionButtons = new Button[72];
	Label[] labels = new Label[4];
	
	
	public Mensch(Composite parent, int style) {
		
		super(parent, style);
		setLayout(new GridLayout(20, false));
		
		
		
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
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_63 = new Button(this, SWT.NONE);
		button_63.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 63;
			}
		});
		button_63.setText("63");
		
		Button button_62 = new Button(this, SWT.NONE);
		button_62.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 62;
			}
		});
		button_62.setText("62");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_18 = new Button(this, SWT.NONE);
		button_18.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 18;
			}
		});
		button_18.setText("18");
		
		Button button_19 = new Button(this, SWT.NONE);
		button_19.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 19;
			}
		});
		button_19.setText("19");
		
		Button button_20 = new Button(this, SWT.NONE);
		button_20.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 20;
			}
		});
		button_20.setText("20");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_67 = new Button(this, SWT.NONE);
		button_67.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 67;
			}
		});
		button_67.setText("67");
		
		Button button_66 = new Button(this, SWT.NONE);
		button_66.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 66;
			}
		});
		button_66.setText("66");
		new Label(this, SWT.NONE);
		
		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Label lblActiveplayer = new Label(composite, SWT.NONE);
		lblActiveplayer.setText("activePlayer");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Label lblTestimage = new Label(this, SWT.NONE);
		lblTestimage.setImage(SWTResourceManager.getImage("Images/MenschAergereDichNicht/Board.png"));
		lblTestimage.setText("testImage");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_61 = new Button(this, SWT.NONE);
		button_61.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 61;
			}
		});
		button_61.setText("61");
		
		Button button_60 = new Button(this, SWT.NONE);
		button_60.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 60;
			}
		});
		button_60.setText("60");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_17 = new Button(this, SWT.NONE);
		button_17.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 17;
			}
		});
		button_17.setText("17");
		
		Button button_48 = new Button(this, SWT.NONE);
		button_48.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 48;
			}
		});
		button_48.setText("48");
		
		
		Button button_21 = new Button(this, SWT.NONE);
		button_21.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 21;
			}
		});
		button_21.setText("21");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_65 = new Button(this, SWT.NONE);
		button_65.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 65;
			}
		});
		button_65.setText("65");
		
		Button button_64 = new Button(this, SWT.NONE);
		button_64.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 64;
			}
		});
		button_64.setText("64");
		new Label(this, SWT.NONE);
		
		Label lblActionrequired = new Label(this, SWT.NONE);
		lblActionrequired.setText("actionRequired");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button btnTestbutton = new Button(this, SWT.NONE);
		btnTestbutton.setText("testButton");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_16 = new Button(this, SWT.NONE);
		button_16.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 16;
			}
		});
		button_16.setText("16");
		
		Button button_49 = new Button(this, SWT.NONE);
		button_49.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 49;
			}
		});
		button_49.setText("49");
		
		Button button_22 = new Button(this, SWT.NONE);
		button_22.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 22;
			}
		});
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
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_15 = new Button(this, SWT.NONE);
		button_15.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 15;
			}
		});
		button_15.setText("15");
		
		Button button_50 = new Button(this, SWT.NONE);
		button_50.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 50;
			}
		});
		button_50.setText("50");
		
		Button button_23 = new Button(this, SWT.NONE);
		button_23.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 23;
			}
		});
		button_23.setText("23");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button btnEins = new Button(this, SWT.NONE);
		btnEins.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				playerSelectAction(1);
			}
		});
		btnEins.setText("eins");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_10 = new Button(this, SWT.NONE);
		button_10.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 10;
			}
		});
		button_10.setText("10");
		
		Button button_11 = new Button(this, SWT.NONE);
		button_11.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 11;
			}
		});
		button_11.setText("11");
		
		Button button_12 = new Button(this, SWT.NONE);
		button_12.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 12;
			}
		});
		button_12.setText("12");
		
		Button button_13 = new Button(this, SWT.NONE);
		button_13.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 13;
			}
		});
		button_13.setText("13");
		
		Button button_14 = new Button(this, SWT.NONE);
		button_14.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 14;
			}
		});
		button_14.setText("14");
		
		Button button_51 = new Button(this, SWT.NONE);
		button_51.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 51;
			}
		});
		button_51.setText("51");
		
		Button button_24 = new Button(this, SWT.NONE);
		button_24.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 24;
			}
		});
		button_24.setText("24");
		
		Button button_25 = new Button(this, SWT.NONE);
		button_25.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 25;
			}
		});
		button_25.setText("25");
		
		Button button_26 = new Button(this, SWT.NONE);
		button_26.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 26;
			}
		});
		button_26.setText("26");
		
		Button button_27 = new Button(this, SWT.NONE);
		button_27.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 27;
			}
		});
		button_27.setText("27");
		
		Button button_28 = new Button(this, SWT.NONE);
		button_28.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 28;
			}
		});
		button_28.setText("28");
		new Label(this, SWT.NONE);
		
		Button btnZwei = new Button(this, SWT.NONE);
		btnZwei.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				playerSelectAction(2);
			}
		});
		btnZwei.setText("zwei");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_9 = new Button(this, SWT.NONE);
		button_9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 9;
			}
		});
		button_9.setText("9");
		
		Button button_44 = new Button(this, SWT.NONE);
		button_44.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 44;
			}
		});
		button_44.setText("44");
		
		Button button_45 = new Button(this, SWT.NONE);
		button_45.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 45;
			}
		});
		button_45.setText("45");
		
		Button button_46 = new Button(this, SWT.NONE);
		button_46.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 46;
			}
		});
		button_46.setText("46");
		
		Button button_47 = new Button(this, SWT.NONE);
		button_47.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 47;
			}
		});
		button_47.setText("47");
		new Label(this, SWT.NONE);
		
		Button button_55 = new Button(this, SWT.NONE);
		button_55.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 55;
			}
		});
		button_55.setText("55");
		
		Button button_54 = new Button(this, SWT.NONE);
		button_54.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 54;
			}
		});
		button_54.setText("54");
		
		Button button_53 = new Button(this, SWT.NONE);
		button_53.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 53;
			}
		});
		button_53.setText("53");
		
		Button button_52 = new Button(this, SWT.NONE);
		button_52.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 52;
			}
		});
		button_52.setText("52");
		
		Button button_29 = new Button(this, SWT.NONE);
		button_29.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 29;
			}
		});
		button_29.setText("29");
		new Label(this, SWT.NONE);
		
		Button btnDrei = new Button(this, SWT.NONE);
		btnDrei.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				playerSelectAction(3);
			}
		});
		btnDrei.setText("drei");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_8 = new Button(this, SWT.NONE);
		button_8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 8;
			}
		});
		button_8.setText("8");
		
		Button button_7 = new Button(this, SWT.NONE);
		button_7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 7;
			}
		});
		button_7.setText("7");
		
		Button button_6 = new Button(this, SWT.NONE);
		button_6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 6;
			}
		});
		button_6.setText("6");
		
		Button button_5 = new Button(this, SWT.NONE);
		button_5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 5;
			}
		});
		button_5.setText("5");
		
		Button button_4 = new Button(this, SWT.NONE);
		button_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 4;
			}
		});
		button_4.setText("4");
		
		Button button_43 = new Button(this, SWT.NONE);
		button_43.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 43;
			}
		});
		button_43.setText("43");
		
		Button button_34 = new Button(this, SWT.NONE);
		button_34.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 34;
			}
		});
		button_34.setText("34");
		
		Button button_33 = new Button(this, SWT.NONE);
		button_33.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 33;
			}
		});
		button_33.setText("33");
		
		Button button_32 = new Button(this, SWT.NONE);
		button_32.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 32;
			}
		});
		button_32.setText("32");
		
		Button button_31 = new Button(this, SWT.NONE);
		button_31.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 31;
			}
		});
		button_31.setText("31");
		
		Button button_30 = new Button(this, SWT.NONE);
		button_30.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 30;
			}
		});
		button_30.setText("30");
		new Label(this, SWT.NONE);
		
		Button btnVier = new Button(this, SWT.NONE);
		btnVier.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				playerSelectAction(4);
			}
		});
		btnVier.setText("vier");
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
		
		Button button_3 = new Button(this, SWT.NONE);
		button_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 3;
			}
		});
		button_3.setText("3");
		
		Button button_42 = new Button(this, SWT.NONE);
		button_42.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 42;
			}
		});
		button_42.setText("42");
		
		Button button_35 = new Button(this, SWT.NONE);
		button_35.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 35;
			}
		});
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
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_2 = new Button(this, SWT.NONE);
		button_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 2;
			}
		});
		button_2.setText("2");
		
		Button button_41 = new Button(this, SWT.NONE);
		button_41.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 41;
			}
		});
		button_41.setText("41");
		
		Button button_36 = new Button(this, SWT.NONE);
		button_36.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 36;
			}
		});
		button_36.setText("36");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button btnBewegen = new Button(this, SWT.NONE);
		btnBewegen.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				moveAction();
			}
		});
		btnBewegen.setText("bewegen");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_59 = new Button(this, SWT.NONE);
		button_59.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 59;
			}
		});
		button_59.setText("59");
		
		Button button_58 = new Button(this, SWT.NONE);
		button_58.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 58;
			}
		});
		button_58.setText("58");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_1 = new Button(this, SWT.NONE);
		GridData gd_button_1 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_button_1.widthHint = 21;
		button_1.setLayoutData(gd_button_1);
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 1;
			}
		});
		button_1.setText("1");
		
		Button button_40 = new Button(this, SWT.NONE);
		button_40.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 40;
			}
		});
		button_40.setText("40");
		
		Button button_37 = new Button(this, SWT.NONE);
		button_37.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 37;
			}
		});
		button_37.setText("37");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_71 = new Button(this, SWT.NONE);
		button_71.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 71;
			}
		});
		button_71.setText("71");
		
		Button button_70 = new Button(this, SWT.NONE);
		button_70.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 70;
			}
		});
		button_70.setText("70");
		new Label(this, SWT.NONE);
		
		Label lblWuerfelwurf = new Label(this, SWT.NONE);
		lblWuerfelwurf.setText("wuerfelWurf");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_57 = new Button(this, SWT.NONE);
		button_57.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 57;
			}
		});
		button_57.setText("57");
		
		Button button_56 = new Button(this, SWT.NONE);
		button_56.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 56;
			}
		});
		button_56.setText("56");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button = new Button(this, SWT.NONE);
		GridData gd_button = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_button.widthHint = 22;
		button.setLayoutData(gd_button);
		
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 0;
				
			}
		});
		button.setText("0");
		
		Button button_39 = new Button(this, SWT.NONE);
		button_39.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 39;
			}
		});
		button_39.setText("39");
		
		Button button_38 = new Button(this, SWT.NONE);
		button_38.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 38;
			}
		});
		button_38.setText("38");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button button_69 = new Button(this, SWT.NONE);
		button_69.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 69;
			}
		});
		button_69.setText("69");
		
		Button button_68 = new Button(this, SWT.NONE);
		button_68.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				positionSelected = 68;
			}
		});
		button_68.setText("68");
		new Label(this, SWT.NONE);
		
		Button btnWrfeln = new Button(this, SWT.NONE);
		btnWrfeln.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				wuerfelnAction();
			}
		});
		btnWrfeln.setText("w\u00FCrfeln");
		
		
		
		positionButtons[0] = button;
		positionButtons[1] = button_1;
		positionButtons[2] = button_2;
		positionButtons[3] = button_3;
		positionButtons[4] = button_4;
		positionButtons[5] = button_5;
		positionButtons[6] = button_6;
		positionButtons[7] = button_7;
		positionButtons[8] = button_8;
		positionButtons[9] = button_9;
		positionButtons[10] = button_10;
		positionButtons[11] = button_11;
		positionButtons[12] = button_12;
		positionButtons[13] = button_13;
		positionButtons[14] = button_14;
		positionButtons[15] = button_15;
		positionButtons[16] = button_16;
		positionButtons[17] = button_17;
		positionButtons[18] = button_18;
		positionButtons[19] = button_19;
		positionButtons[20] = button_20;
		positionButtons[21] = button_21;
		positionButtons[22] = button_22;
		positionButtons[23] = button_23;
		positionButtons[24] = button_24;
		positionButtons[25] = button_25;
		positionButtons[26] = button_26;
		positionButtons[27] = button_27;
		positionButtons[28] = button_28;
		positionButtons[29] = button_29;
		positionButtons[30] = button_30;
		positionButtons[31] = button_31;
		positionButtons[32] = button_32;
		positionButtons[33] = button_33;
		positionButtons[34] = button_34;
		positionButtons[35] = button_35;
		positionButtons[36] = button_36;
		positionButtons[37] = button_37;
		positionButtons[38] = button_38;
		positionButtons[39] = button_39;
		positionButtons[40] = button_40;
		positionButtons[41] = button_41;
		positionButtons[42] = button_42;
		positionButtons[43] = button_43;
		positionButtons[44] = button_44;
		positionButtons[45] = button_45;
		positionButtons[46] = button_46;
		positionButtons[47] = button_47;
		positionButtons[48] = button_48;
		positionButtons[49] = button_49;
		positionButtons[50] = button_50;
		positionButtons[51] = button_51;
		positionButtons[52] = button_52;
		positionButtons[53] = button_53;
		positionButtons[54] = button_54;
		positionButtons[55] = button_55;
		positionButtons[56] = button_56;
		positionButtons[57] = button_57;
		positionButtons[58] = button_58;
		positionButtons[59] = button_59;
		positionButtons[60] = button_60;
		positionButtons[61] = button_61;
		positionButtons[62] = button_62;
		positionButtons[63] = button_63;
		positionButtons[64] = button_64;
		positionButtons[65] = button_65;
		positionButtons[66] = button_66;
		positionButtons[67] = button_67;
		positionButtons[68] = button_68;
		positionButtons[69] = button_69;
		positionButtons[70] = button_70;
		positionButtons[71] = button_71;
		
		labels[0] = lblActiveplayer;
		labels[1] = lblSpieleranzahl;
		labels[2] = lblWuerfelwurf;
		labels[3] = lblActionrequired;
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
	
	}

	

		public int getPositionSelected() {
		return positionSelected;
	}
	public void setPositionSelected(int positionSelected) {
		this.positionSelected = positionSelected;
	}
	public Button[] getPositionButtons() {
		return positionButtons;
	}
	public void setPositionButtons(Button[] positionButtons) {
		this.positionButtons = positionButtons;
	}
	
	// Logik startet hier
	// vor allem Logik wer wann am Zug ist
	// und Kontrolle der Farben 
	
	Board board = new Board();
	Dice dice = new Dice();
	
	boolean hatGewuerfelt = false;
	
	
	void draw() {
		
		int[] vorlage = board.getPositionen();
		
		for(int i=0; i <=71; i++) {
			if( vorlage[i] == 0) {
				positionButtons[i].setImage(SWTResourceManager.getImage(Mensch.class, "/Images/white.png"));			
			} else if(vorlage[i] == 1) {				
				positionButtons[i].setImage(SWTResourceManager.getImage(Mensch.class, "/Images/yellow.png"));	
			} else if(vorlage[i] == 2) {				
				positionButtons[i].setImage(SWTResourceManager.getImage(Mensch.class, "/Images/red.png"));		
			} else if(vorlage[i] == 3) {
				positionButtons[i].setImage(SWTResourceManager.getImage(Mensch.class, "/Images/blue.png"));	
			}else if(vorlage[i] == 4) {
				positionButtons[i].setImage(SWTResourceManager.getImage(Mensch.class, "/Images/green.png"));	
			}
		}	
	}
	
	boolean playerIsSelected = false;
	void playerSelectAction(int spieleranzahl) {
		if (!playerIsSelected) {
			board.setSpielerAnzahl(spieleranzahl);
			board.initialisieren();
			board.setAnDerReihe(1);
			displayActivePlayer();
			draw();
			playerIsSelected = true;
		}
	}
	int counter = 0;
	void moveAction() {
		int[] vorlage = board.getPositionen();
		if (vorlage[positionSelected] == board.getAnDerReihe() && hatGewuerfelt) {
			board.move(positionSelected, board.getAnDerReihe(), dice.getNumberRolled());
			checkWinning();
			if(board.isZugDurchgefuehrt()) {
				hatGewuerfelt = false;
				board.setZugDurchgefuehrt(false);
				draw();
				displayActionRequired();
				if(dice.getNumberRolled() != 6) {
					counter = 0;
					nextPlayer();
				}			
			} else if(board.isInBase(board.getAnDerReihe())) {
				hatGewuerfelt = false;
				counter ++; 
				displayActionRequired();
				if(counter == 3) {
					counter = 0;
					nextPlayer();
				}
			} 
		}
	}
		
	void wuerfelnAction(){
		if(!hatGewuerfelt) {
			dice.roll();
			int wurf = dice.getNumberRolled();
			System.out.println(String.valueOf(wurf));
			labels[2].setText(zahlZuWort(wurf));
			hatGewuerfelt = true;
			displayActionRequired();
		}
	}
	
	void nextPlayer() {
		int anDerReihe = board.getAnDerReihe();
		System.out.println(anDerReihe);
		if(anDerReihe!= board.getSpielerAnzahl()) {
			board.setAnDerReihe((anDerReihe+1));
			System.out.println(board.getAnDerReihe());
		} else {
			board.setAnDerReihe(1);
		}
		displayActivePlayer();
	}
	
	void displayActivePlayer(){
		String spieler;
		if (board.getAnDerReihe() == 1) {
			spieler = "gelb";
		} else if (board.getAnDerReihe() == 2) {
			spieler = "rot";
		} else if (board.getAnDerReihe() == 3) {
			spieler = "blau";
		} else {
			spieler = "gr�n";
		}
			
		labels[0].setText("aktiv: " + spieler);
	}
	
	String zahlZuWort(int zahl) {
		if(zahl == 1) {
			return "eins";
		} else if(zahl == 2) {
			return "zwei";
		} else if(zahl == 3) {
			return "drei";
		} else if(zahl == 4) {
			return "vier";
		} else if(zahl == 5) {
			return "f�nf";
		} else if(zahl == 6) {
			return "sechs";
		} else
			return "fehlerhafte Eingabe";
	}
	
	void displayActionRequired() {
		if(hatGewuerfelt) {
			labels[3].setText("bewegen");
		} else {
			labels[3].setText("w�rfeln");
		}
	}

	void checkWinning() {
		if(board.gewinnen()) {
			if(board.getSpielerGewonnen() == 1) {
				labels[1].setText("GELB HAT GEWONNEN");
			} else if(board.getSpielerGewonnen() == 1) {
				labels[1].setText("ROT HAT GEWONNEN");
			} else if(board.getSpielerGewonnen() == 1) {
				labels[1].setText("BLAU HAT GEWONNEN");
			} else {
				labels[1].setText("GR�N HAT GEWONNEN");
			}
			
		}
	}
	
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setLayout(new GridLayout(1, false));	
		
		Mensch frame = new Mensch(shell, SWT.NONE);
		
		shell.pack();
		shell.open();
		
		
		while(!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}
	
	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
