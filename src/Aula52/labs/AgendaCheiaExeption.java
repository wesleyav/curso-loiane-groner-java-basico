package Aula52.labs;

public class AgendaCheiaExeption extends Exception {

	@Override
	public String getMessage() {
		return "Agenda j� est� cheia";
	}
}
