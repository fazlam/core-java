class FoodItemsDataOperator{
	
	
	static String[] FoodItemsName={null,null,null,null,null};
	
	static int postition=0;
	
	static void save(String name)
	{
		
		System.out.println("save:start the program");
		
		FoodItemsName[postition]=name;
		postition++;
		
		System.out.println("save  " + name + " postition " + postition);
		
		System.out.println("save:end the program");
		
	}
	static void DisplayDitails()
		{
			
			for (int index=0;index<FoodItemsName.length;index++)
			{
				String name=FoodItemsName[index];
		  System.out.println(name);
				
			}
		  
			
		}
	
	
	
	
	
	
	
	
	
}