class BluetoothRunner{
	
	public static void main(String[] songs)
	
	{
		String name=songs[0];
		String price=songs[1];
		String type =songs[2];
		String quantity=songs[3];
		String quality =songs[4];
		

  System.out.println(name);
  System.out.println(price);
  System.out.println(type);
  System.out.println(quality);
  System.out.println(quantity);
  
    int convertedPrice=Integer.parseInt(price);
	
	if(convertedPrice>100)
	{
		System.out.println("it is costly..");
	}
		
		
		
		
		
		
		
	}
	
	
	
}