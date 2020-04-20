package content4;

public class PlainRect extends Rect {
	//startXºÍstartY
	private double startX;
	private double startY;
	
	public PlainRect (double width,double height,double startX,double startY) {
		super(width,height);
		this.startX=startX;
		this.startY=startY;
		
	}
	
	public PlainRect() {
		super();
		this.startX=0;
		this.startY=0;
	}

	public boolean isInside(double x, double y) {
		if(x<=this.startX)return false;
		if(x>=super.width+this.startX)return false;
		if(x<=this.startY)return false;
		if(x>=super.height+this.startY)return false;
		return true;
	}

	@Override
	public String toString() {
		return "PlainRect[width=" + width + ",height=" + height + ",startX=" + startX + ",startY=" + startY +  "]";
	}
	
	
}
