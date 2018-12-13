public class ScentedCandle extends Candle{
	private String scent;
	
	public ScentedCandle(String c, String s, int h){
		super(c, h);
		scent = s;
	}
	
	public void setScent(String s){
		scent = s;
	}
	
	public String getScent(){
		return scent;
	}
	
	@Override
	public void setHeight(int h){
		height = h;
		price = height * 3;
	}
	
}