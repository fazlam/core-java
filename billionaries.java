class billionaries{
	
	
	static String []billionaries={null,null,null,null,null,null,null,null,null,null};
	static int position=0;
	static void save(String name) 
	{
		if(position>=10)
		{
			System.out.println("ready");
			return;
		}
		if(billionaries!=null && name.length()>=4)
		{
			billionaries[position]=name;
			System.out.println("name:"+name+":"+position);
			position++;
		}
	}
	static void display()
	{
		for(int i=0;i<billionaries.length;i++)
		{
			String ref=billionaries[i];
			System.out.println(ref);
		}
	}
	static boolean find(String name)
	{
		if(billionaries!=null && name.length()>=4)
		{
			for(int j=0;j>billionaries.length;j++)
			{
				String ref=billionaries[j];
				if(ref==name)
				{
					System.out.println("name found:"+ref);
					return true;
				}
			}
		}
		return false;
	}
	static String update(String oldName,String newName)
	{
		if(oldName!=null && newName!=null)
		{
			if(oldName.length()>=4 && newName.length()>=4)
			{
				for(int point=0;point<billionaries.length;point++)
				{
					String ref=billionaries[point];
					if(ref==oldName)
					{
						System.out.println("old name:"+ref);
						billionaries[point]=newName;
						System.out.println("updated name:"+newName);
						return newName;
					}
				}
			}
			
		}return null;
		
	}
	   static String update1(int index,String newName)
	   {
		   if(newName!=null && newName.length()>=4)
		   {
			   System.out.println("old name :"+index);
			   billionaries[index]=newName;
			   System.out.println("new name :"+newName);
			   return newName;
			   
		   }return null;
	   }
	     static boolean delete(String name)
		 {
			 if(billionaries!=null && name.length()>=4)
			 {
				 for (int pet=0;pet<billionaries.length;pet++)
				 {
					 String ref=billionaries[pet];
					 if(ref==name)
					 {
						 System.out.println("enterd name:"+name);
						 ref=null;
						 System.out.println("name deleted:"+ref);
						 return true;
						 
					 }
				 }
			 }
			 return false;
		 }
		   static boolean delete(int index,String name)
		   {
			   if(name!=null && name.length()>=4)
			   {
				   System.out.println("index:"+index);
				   billionaries[index]=name;
				   name=null;
				   System.out.println("update name:"+name);
				   return true;
				   
			   }return false;
		   }
	

	
	
	
	
}