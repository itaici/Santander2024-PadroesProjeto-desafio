package dio.gof.singleton;

public class SingletonEage {

	private static SingletonEage instancia = new SingletonEage();

	private SingletonEage()  {

	}

	public static SingletonEage getInstancia() {
		return instancia;
	}
}
