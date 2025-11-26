package basic;

 class Sensitiveinfoclass {
	private  int id;
	private String name; 
	private double salary;
	
	public int getid()
	{
		return id;
	}
	public void setid(int id) 
	{
		this.id=id;
	}
	
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
 }
	
	public class Assignment108_Employee {
	 public static void main(String[] args) {
		 Sensitiveinfoclass s1=new Sensitiveinfoclass();
		 s1.setid(10);
		 s1.setname("Jyothsna");
		 s1.setSalary(3000000.505);
		 System.out.println(s1.getid());
		 System.out.println(s1.getname());
		 System.out.println(s1.getSalary());
	 }
	

}
