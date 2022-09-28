class billionariesRunner{
	
	public static void main(String[]fazl)
	{
		billionaries.save("Omkarsir");
		billionaries.save("Ambanni");
		billionaries.save("billgate");
		billionaries.save("virat");
		billionaries.save("sachin");
		billionaries.save("Dhoni");
		billionaries.save("Narandramodi");
		billionaries.save("RahulGhandhi");
		billionaries.save("SalmanKhan");
		billionaries.save("ShaharukhKhan");
		
		billionaries.display();
		
		billionaries.find("virat");
		
		billionaries.update("Fazlam","Rudresh");
		
		billionaries.update(1,"manju");
		billionaries.delete("sachin");
		billionaries.delete(4,"dhoni");
	}
}
