package hcl.thingsthatcangowrong;

public class DeliveryUnavailableException extends RuntimeException{

	public DeliveryUnavailableException(String message) {
        super(message);
    }
}
