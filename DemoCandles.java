public class DemoCandles{
	public static void main(String[] args){
		Candle aCandleOne = new Candle("", 0);
		Candle aCandleTwo = new Candle("", 0);
		ScentedCandle aScentCandleOne = new ScentedCandle("", "", 0);
		ScentedCandle aScentCandleTwo = new ScentedCandle("", "", 0);
		
		aCandleOne.setColor("White");
		aCandleOne.setHeight(3);
		aCandleTwo.setColor("Blue");
		aCandleTwo.setHeight(4);
		aScentCandleOne.setColor("Red");
		aScentCandleOne.setHeight(3);
		aScentCandleOne.setScent("Apple");
		aScentCandleTwo.setColor("Purple");
		aScentCandleTwo.setHeight(4);
		aScentCandleTwo.setScent("Lavender");
		
		System.out.println("The first candle is " + aCandleOne.getColor() + ", " + aCandleOne.getHeight() + "\" tall, and costs $" + aCandleOne.getPrice());
		System.out.println("\nThe second candle is " + aCandleTwo.getColor() + ", " + aCandleTwo.getHeight() + "\" tall, and costs $" + aCandleTwo.getPrice());
		System.out.println("\nThe first scented candle is " + aScentCandleOne.getColor() + ", " + aScentCandleOne.getHeight() + "\" tall, has a(n) " + aScentCandleOne.getScent() + " scent, and costs $" + aScentCandleOne.getPrice());
		System.out.println("\nThe second scented candle is " + aScentCandleTwo.getColor() + ", " + aScentCandleTwo.getHeight() + "\" tall, has a(n) " + aScentCandleTwo.getScent() + " scent, and costs $" + aScentCandleTwo.getPrice());
	}
}