package Commons;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Pieces {
	BufferedImage buf = new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);
    Graphics2D g = (Graphics2D) buf.getGraphics();

	public BufferedImage getBRook()
	{
		g.setColor(Color.BLACK);
		g.fillRect(5,40,40,8);
		g.fillRect(15,10,20,30);
		g.fillRect(11,2,8,8);
		g.fillRect(21,2,8,8);
		g.fillRect(31,2,8,8);
		return buf;
	}
	public BufferedImage getWRook()
	{
		g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(2));
        g.drawRect(5,40,40,8);
		g.drawRect(15,10,20,30);
		g.drawRect(11,2,8,8);
		g.drawRect(21,2,8,8);
		g.drawRect(31,2,8,8);
		return buf;
	}
	public BufferedImage getBSoldier()
	{
		g.setColor(Color.BLACK);
	    g.fillPolygon(new int[] {5,25,45}, new int[] {45,10,45}, 3);
	    g.fillOval(15, 0, 20, 20);
		return buf;
	}
	public BufferedImage getWSoldier()
	{
		g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(2));
        g.drawPolygon(new int[] {5,25,45}, new int[] {45,12,45}, 3);
	    g.drawOval(15, 0, 20, 20);
		return buf;
	}
	public BufferedImage getBKing()
	{
		g.setColor(Color.BLACK);
		g.fillRect(5,40,40,8);
		g.fillPolygon(new int[] {5,11,17}, new int[] {40,25,40},3);
		g.fillPolygon(new int[] {19,25,31}, new int[] {40,25,40},3);
		g.fillPolygon(new int[] {34,40,45}, new int[] {40,25,40},3);
		g.fillOval(20,20,10,10);
		return buf;
	}
	public BufferedImage getWKing()
	{
		g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(2));
        g.drawRect(5,40,40,8);
		g.drawPolygon(new int[] {5,11,17}, new int[] {40,25,40},3);
		g.drawPolygon(new int[] {19,25,31}, new int[] {40,25,40},3);
		g.drawPolygon(new int[] {34,40,45}, new int[] {40,25,40},3);
		g.drawOval(20,20,10,10);
		return buf;
	}
	public BufferedImage getWQueen()
	{
		g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(2));
        g.drawRect(5,40,40,8);
		g.drawPolygon(new int[] {5,5,14}, new int[] {40,25,40},3);
		g.drawPolygon(new int[] {15,19,23}, new int[] {40,25,40},3);
		g.drawPolygon(new int[] {25,29,33}, new int[] {40,25,40},3);
		g.drawPolygon(new int[] {34,45,45}, new int[] {40,25,40},3);
	    return buf;
	}
	public BufferedImage getBQueen()
	{
		g.setColor(Color.BLACK);
        g.fillRect(5,40,40,8);
		g.fillPolygon(new int[] {5,5,14}, new int[] {40,25,40},3);
		g.fillPolygon(new int[] {15,19,23}, new int[] {40,25,40},3);
		g.fillPolygon(new int[] {25,29,33}, new int[] {40,25,40},3);
		g.fillPolygon(new int[] {34,45,45}, new int[] {40,25,40},3);
	    return buf;
	}
	public BufferedImage getBKnight()
	{
		g.setColor(Color.BLACK);
        g.fillPolygon(new int[] {5,5,45}, new int[] {45,5,45},3);
		g.fillPolygon(new int[] {5,5,45}, new int[] {5,25,15},3);
		return buf;
	}
	public BufferedImage getWKnight()
	{
		g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(2));
        g.drawPolygon(new int[] {5,5,45}, new int[] {45,5,45},3);
		g.drawPolygon(new int[] {5,5,45}, new int[] {5,25,15},3);
		return buf;
	}
	public BufferedImage getBBishop()
	{
		g.setColor(Color.BLACK);
        g.fillPolygon(new int[] {15,25,35}, new int[] {45,10,45},3);
        g.fillOval(15, 28, 20, 20);
        g.fillOval(20,10, 10, 10);
		return buf;

	}
	public BufferedImage getWBishop()
	{
        g.setStroke(new BasicStroke(2));
        g.setColor(Color.BLACK);
        g.drawPolygon(new int[] {15,25,35}, new int[] {45,10,45},3);
        g.drawOval(15, 28, 20, 20);
        g.drawOval(20,4, 10, 10);
		return buf;

	}
	
	

	
	

}
