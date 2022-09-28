class color{
	
	static String[] allColors={null,null,null,null,null,null,null};
	static int position=0;
	static void save(String colors)
	{
		if(position>=7)
		{
			System.out.println("main");
			return;
		}
		if(allColors!=null && colors.length()>=3)
		{
		  System.out.println("start");
		  allColors [position]=colors;
		  System.out.println(" position "+ position+":"+colors);
			position++;
		}
		
	}
	 static void display()
	{
		for(int info=0;info<allColors.length;info++)
		 {
			 String ref=allColors[info];
			System.out.println(ref); 
		 }
	}
	 static boolean check(String colors)
     {
		if(allColors!=null && allColors.length>=3) 
		{
			for(int find=0;find<allColors.length;find++)
				
				{
					String ref=allColors[find];
					if(ref==colors)
						System.out.println("end method");
						return true ;
				}
		}
		else
		{
			System.out.println("no color find");
		}
		return false; 
					
		
		 
	 }	
	 
	
	
	
}