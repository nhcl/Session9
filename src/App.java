import hcl.PaperCompany;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaperCompany hcl = new PaperCompany();
        hcl.receiveShipments();
        hcl.receiveOrders();
        hcl.processOrders();
        hcl.printSummary();

	}

}
