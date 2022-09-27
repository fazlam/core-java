class DataOperator{
	
	static String[]templeName={null,null,null,null,null};
	
	static int postition=0;
	
	static void save(String name){
		
		System.out.println("save:start the program");
		templeName[postition]=name;
		postition++;
		
		System.out.println("save  " + name + "postition"+ postition);
		
		System.out.println("save:end the program");
	}	
	
	
	
	
	
	
}