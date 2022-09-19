class SpiceJet{
	
	static void flightsNos(String[]Flights)
	{
		System.out.println("Flights ready");
		System.out.println("no of Flights:="+Flights.lenght);
		for(int index=0;index<Flights.lenght;index++)
		{
			String ref=Flights[index];
			System.out.println("Flights no;"+ref);
		}
		System.out.println("Flight takeup");
	}
}