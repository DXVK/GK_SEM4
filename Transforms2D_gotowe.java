import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Transforms2D extends JPanel {

	private class Display extends JPanel {
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D)g;
			g2.translate(300,300);  // Moves (0,0) to the center of the display.
			int whichTransform = transformSelect.getSelectedIndex();


            switch (whichTransform)
            {
                default:
                {
                    int[] x;
                    int[] y;
                    x = new int[5];
                    y = new int[5];
                    for (int i=0; i<5; i++)
                    {
                        double kat = Math.toRadians(i*360/5);
                        x[i] = (int) (150*Math.cos(kat));
                        y[i] = (int) (150*Math.sin(kat));
                    }
                     g2.rotate(-0.313);
                     g2.setColor(Color.blue);
                     g2.fillPolygon(x, y, 5);
                     g2.drawImage(pic, 0, 0, null); // Draw image with center at (0,0).
                } break;
                
                
                case 1:
                {
                    int[] x;
                    int[] y;
                    x = new int[5];
                    y = new int[5];
                    for (int i=0; i<5; i++)
                    {
                        double kat = Math.toRadians(i*360/5);
                        x[i] = (int) (150*Math.cos(kat));
                        y[i] = (int) (150*Math.sin(kat));
                    }
                     g2.rotate(-0.313);
                     g2.scale(0.5,0.5);      
                     g2.setColor(Color.blue);
                     g2.fillPolygon(x, y, 5);
                     g2.drawImage(pic, 0, 0, null); // Draw image with center at (0,0).

                } break;

                case 2:
                {
                    int[] x;
                    int[] y;
                    x = new int[5];
                    y = new int[5];
                    for (int i=0; i<5; i++)
                    {
                        double kat = Math.toRadians(i*360/5);
                        x[i] = (int) (150*Math.cos(kat));
                        y[i] = (int) (150*Math.sin(kat));
                    }
                     g2.rotate(0.3);
                     g2.setColor(Color.blue);
                     g2.fillPolygon(x, y, 5);
                     g2.drawImage(pic, 0, 0, null); // Draw image with center at (0,0).

                } break;

                case 3:
                {
                    int[] x;
                    int[] y;
                    x = new int[5];
                    y = new int[5];
                    for (int i=0; i<5; i++)
                    {
                        double kat = Math.toRadians(i*360/5);
                        x[i] = (int) (150*Math.cos(kat));
                        y[i] = (int) (150*Math.sin(kat));
                    }
                     g2.scale(0.6,1);
                     g2.rotate(-0.9385);
                     g2.setColor(Color.blue);
                     g2.fillPolygon(x, y, 5);
                     g2.drawImage(pic, 0, 0, null); // Draw image with center at (0,0).

                } break;

                case 4:
                {
                    int[] x;
                    int[] y;
                    x = new int[5];
                    y = new int[5];
                    for (int i=0; i<5; i++)
                    {
                        double kat = Math.toRadians(i*360/5);
                        x[i] = (int) (150*Math.cos(kat));
                        y[i] = (int) (150*Math.sin(kat));
                    }
                     g2.rotate(-0.313);
                     g2.shear(0.5,0);
                     g2.setColor(Color.blue);
                     g2.fillPolygon(x, y, 5);
                     g2.drawImage(pic, 0, 0, null); // Draw image with center at (0,0).

                } break;

                case 5:
                {
                    int[] x;
                    int[] y;
                    x = new int[5];
                    y = new int[5];
                    for (int i=0; i<5; i++)
                    {
                        double kat = Math.toRadians(i*360/5);
                        x[i] = (int) (150*Math.cos(kat));
                        y[i] = (int) (150*Math.sin(kat));
                    }
                     g2.scale(1.3,0.3);
                     g2.rotate(-0.313);
                     g2.translate(270,-800);
                     g2.setColor(Color.blue);
                     g2.fillPolygon(x, y, 5);
                     g2.drawImage(pic, 0, 0, null); // Draw image with center at (0,0).
                } break;

                case 6:
                {
                    int[] x;
                    int[] y;
                    x = new int[5];
                    y = new int[5];
                    for (int i=0; i<5; i++)
                    {
                        double kat = Math.toRadians(i*360/5);
                        x[i] = (int) (150*Math.cos(kat));
                        y[i] = (int) (150*Math.sin(kat));
                    }
                     g2.rotate(0.6);
                     g2.shear(0.5,0);
                     g2.setColor(Color.blue);
                     g2.fillPolygon(x, y, 5);
                     g2.drawImage(pic, 0, 0, null); // Draw image with center at (0,0).
                } break;

                case 7:
                {
                    int[] x;
                    int[] y;
                    x = new int[5];
                    y = new int[5];
                    for (int i=0; i<5; i++)
                    {
                        double kat = Math.toRadians(i*360/5);
                        x[i] = (int) (150*Math.cos(kat));
                        y[i] = (int) (150*Math.sin(kat));
                    }
                     g2.scale(0.6,1);
                     g2.rotate(-0.9385);
                     g2.setColor(Color.blue);
                     g2.fillPolygon(x, y, 5);
                     g2.drawImage(pic, 0, 0, null); // Draw image with center at (0,0).
                } break;

                case 8:
                {
                    int[] x;
                    int[] y;
                    x = new int[5];
                    y = new int[5];
                    for (int i=0; i<5; i++)
                    {
                        double kat = Math.toRadians(i*360/5);
                        x[i] = (int) (150*Math.cos(kat));
                        y[i] = (int) (150*Math.sin(kat));
                    }
                     g2.rotate(0.4);
                     g2.scale(1.3,0.3);
                     
                     g2.translate(-20,500);
                     g2.setColor(Color.blue);
                     g2.fillPolygon(x, y, 5);
                     g2.drawImage(pic, 0, 0, null); // Draw image with center at (0,0).
                } break;

                case 9:
                {
                    int[] x;
                    int[] y;
                    x = new int[5];
                    y = new int[5];
                    for (int i=0; i<5; i++)
                    {
                        double kat = Math.toRadians(i*360/5);
                        x[i] = (int) (150*Math.cos(kat));
                        y[i] = (int) (150*Math.sin(kat));
                    }
                     g2.rotate(-0.313);
                     g2.shear(0.6,-1);
                     g2.translate(80,100);
                     g2.setColor(Color.blue);
                     g2.fillPolygon(x, y, 5);
                     g2.drawImage(pic, 0, 0, null); // Draw image with center at (0,0).

                } break;

            }


        }
	}

	private Display display;
	private BufferedImage pic;
	private JComboBox<String> transformSelect;

	public Transforms2D() throws IOException {
		
		display = new Display();
		display.setBackground(Color.YELLOW);
		display.setPreferredSize(new Dimension(600,600));
		transformSelect = new JComboBox<String>();
		transformSelect.addItem("None");
		for (int i = 1; i < 10; i++) {
			transformSelect.addItem("No. " + i);
		}
		transformSelect.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.repaint();
			}
		});
		setLayout(new BorderLayout(3,3));
		setBackground(Color.GRAY);
		setBorder(BorderFactory.createLineBorder(Color.GRAY,10));
		JPanel top = new JPanel();
		top.setLayout(new FlowLayout(FlowLayout.CENTER));
		top.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
		top.add(new JLabel("Transform: "));
		top.add(transformSelect);
		add(display,BorderLayout.CENTER);
		add(top,BorderLayout.NORTH);
	}


	public static void main(String[] args) throws IOException {
		JFrame window = new JFrame("2D Transforms");
		window.setContentPane(new Transforms2D());
		window.pack();
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		window.setLocation( (screen.width - window.getWidth())/2, (screen.height - window.getHeight())/2 );
		window.setVisible(true);
	}

}