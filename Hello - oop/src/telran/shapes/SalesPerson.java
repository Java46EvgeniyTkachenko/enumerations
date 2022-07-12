package telran.shapes;

public class SalesPerson extends Employee {
	private int sales;
	private int percentPay;

	public SalesPerson(long id, int birthYear, String email, int basicSalary, int sales, int percentPay) {
		super(id, birthYear, email, basicSalary);
		setSales(sales);
		setPercentPay(percentPay);
	}

	public void setPercentPay(int percentPay) {
		this.percentPay = percentPay;

	}

	public void setSales(int sales) {
		this.sales = sales;

	}

	public int computePay() {

		return (sales * percentPay) / 100;
	}
}
