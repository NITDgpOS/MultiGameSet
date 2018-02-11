package Commons;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class Table 
{
	private final JFrame chessFrame;
	private final BoardPanel chessPanel;
	BufferedImage buf = new BufferedImage(30, 30, BufferedImage.TYPE_INT_ARGB);
	Graphics2D graphics = (Graphics2D) buf.getGraphics();
	Table()
	{
		this.chessFrame=new JFrame("Jchess");
		this.chessFrame.setLayout(new BorderLayout());
		final JMenuBar tableMenuBar=createMenuBar();
		this.chessFrame.setSize(600,600);
		this.chessFrame.setJMenuBar(tableMenuBar);
		this.chessPanel=new BoardPanel();
		this.chessFrame.add(this.chessPanel,BorderLayout.CENTER);
		this.chessFrame.setVisible(true);
	}
	private JMenuBar createMenuBar() 
	{
		 final JMenuBar chessMenuBar=new JMenuBar();
		 chessMenuBar.add(createFileMenu());
		 return chessMenuBar;
	}
	private JMenu createFileMenu() 
	{
		final JMenu fileMenu=new JMenu("Menu");
		final JMenuItem exit=new JMenuItem("Exit");
		
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}});
		fileMenu.add(exit);
		return fileMenu;
	}
	
	
    public static void main(String[] args)
	{
		new Table();
	}

    private class BoardPanel extends JPanel
    {
    	    final List<TilePanel> boardTiles;
    	    BoardPanel()
    	    {
    	    	    super(new GridLayout(8,8));
    	    	    this.boardTiles=new ArrayList<>();
    	        for(int i=0;i<64;i++) 
    	        {
    	        	    final TilePanel tilePanel=new TilePanel(this, i);
    	        	    this.boardTiles.add(tilePanel);
    	        	    add(tilePanel);
    	        	}
    	        setSize(400,350);
    	        validate();
    	    	    
    	    }
    }
    private class TilePanel extends JPanel
    {
    	    private final int tileId;
    	    TilePanel(final BoardPanel boardPanel,final int tileId)
    	    {
    	    	    super(new GridBagLayout());
    	    	    this.tileId=tileId;
    	    	    setSize(10,10);
    	    	    TileColor();
    	    	    assignTilePieceIcon();
    	    	    validate();
    	    	}
    	    private void assignTilePieceIcon()
    	    {
    	    	   Pieces p=new Pieces();
    	    	   if(this.tileId==0||this.tileId==7)
    	    	   {
    	    		   ImageIcon i =new ImageIcon(p.getBRook());
    	    		   add (new JLabel(i));
    	    		   
    	    	   }
    	    	   if(this.tileId==56||this.tileId==63)
    	    	   {
    	    		   ImageIcon i =new ImageIcon(p.getWRook());
    	    		   add (new JLabel(i));
    	    	   }
    	    	   if(this.tileId>=8&&this.tileId<=15)
    	    	   {
    	    		   ImageIcon i =new ImageIcon(p.getBSoldier());
    	    		   add (new JLabel(i));
    	    	   }
    	    	   if(this.tileId>=48&&this.tileId<=55)
    	    	   {
    	    		   ImageIcon i =new ImageIcon(p.getWSoldier());
    	    		   add (new JLabel(i));
    	    		  
    	    	   }
    	    	   if(this.tileId==1||this.tileId==6)
    	    	   {
    	    		   ImageIcon i =new ImageIcon(p.getBKnight());
    	    		   add (new JLabel(i));
    	    		   
    	    	   }
    	    	   if(this.tileId==57||this.tileId==62)
    	    	   {
    	    		   ImageIcon i =new ImageIcon(p.getWKnight());
    	    		   add (new JLabel(i));
    	    	   }
    	    	   if(this.tileId==2||this.tileId==5)
    	    	   {
    	    		   ImageIcon i =new ImageIcon(p.getBBishop());
    	    		   add (new JLabel(i));
    	    	   }
    	    	   if(this.tileId==58||this.tileId==61)
    	    	   {
    	    		   ImageIcon i =new ImageIcon(p.getWBishop());
    	    		   add (new JLabel(i));
    	    	   }
    	    	   if(this.tileId==3)
    	    	   {
    	    		   ImageIcon i =new ImageIcon(p.getBKing());
    	    		   add (new JLabel(i));
    	    		   
    	    	   }
    	    	   if(this.tileId==4)
    	    	   {
    	    		   ImageIcon i =new ImageIcon(p.getBQueen());
    	    		   add (new JLabel(i));
    	    		   
    	    	   }
    	    	   if(this.tileId==59)
    	    	   {
    	    		   ImageIcon i =new ImageIcon(p.getWKing());
    	    		   add (new JLabel(i));
    	    	   }
    	    	   if(this.tileId==60)
    	    	   {
    	    		   ImageIcon i =new ImageIcon(p.getWQueen());
    	    		   add (new JLabel(i));
    	    	   }
    	    	   
    	    }
		private void TileColor() {
			if((this.tileId>=0&&this.tileId<=7)||(this.tileId>=16&&this.tileId<=23)||(this.tileId>=32&&this.tileId<=39)||(this.tileId>=48&&this.tileId<=55))
				setBackground(this.tileId%2==0?Color.WHITE : Color.GRAY);
			if((this.tileId>=8&&this.tileId<=15)||(this.tileId>=24&&this.tileId<=31)||(this.tileId>=40&&this.tileId<=47)||(this.tileId>=56&&this.tileId<=63))
				setBackground(this.tileId%2==0?Color.GRAY : Color.WHITE);
			}
				
					
	}
}


    	    
	
    

