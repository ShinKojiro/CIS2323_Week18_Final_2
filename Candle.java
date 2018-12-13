public class Candle{
	protected String color;
	protected int height;
	protected int price;
	
	public Candle(String c, int h){
		height = h;
		color = c;
	}
	
	public void setColor(String c){
		color = c;
	}
	public String getColor(){
		return color;
	}
	public void setHeight(int h){
		height = h;
		price = height * 2;
	}
	public int getHeight(){
		return height;
	}
	public int getPrice(){
		return price;
	}
}