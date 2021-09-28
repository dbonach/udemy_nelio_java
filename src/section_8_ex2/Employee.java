package section_8_ex2;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public Employee() {
	}
	
	public Employee(String name, double grossSalary, double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary = grossSalary * (100 + percentage)/100;
	}
	
	@Override
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
}
