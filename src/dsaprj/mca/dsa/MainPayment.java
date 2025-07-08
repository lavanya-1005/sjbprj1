package dsaprj.mca.dsa;

public class MainPayment extends Payment{

	@Override
	void pay() {
		System.out.println("Cash payment");
	}
	public static void main(String[] args) {
		MainPayment p=new MainPayment();
		p.pay();
		p.printbill();
	}
	

}
