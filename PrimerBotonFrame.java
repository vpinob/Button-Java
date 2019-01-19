import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PrimerBotonFrame extends JFrame
{
	private JButton btnClick;
	private JPanel pnlContainer;
	
	public PrimerBotonFrame()
	{
		initializeComponent();
	}
	
	private void initializeComponent()
	{
		btnClick = new JButton();
		btnClick.setText("Click");
		btnClick.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				btnClick_Click(e);
			}
		});
		
		pnlContainer = new JPanel();
		pnlContainer.setLayout(null);
		
		addComponents(pnlContainer, btnClick, 30, 30, 100, 27);
		
		this.add(pnlContainer);
		this.setVisible(true);
		this.setResizable(false);
		this.setTitle("Primer botón Java");
		this.setLocation(new Point(100,100));
		this.setSize(new Dimension(300,150));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}
		
		private void addComponents(Container container, Component c, int x, int y, int width, int height)
		{
			c.setBounds(x, y, width, height);
			container.add(c);
		}
		private void btnClick_Click(ActionEvent e)
		{
			JOptionPane.showMessageDialog(this, "Hola Mundo", "Primer botón Java", JOptionPane.INFORMATION_MESSAGE);
		}
}