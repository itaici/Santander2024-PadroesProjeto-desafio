package dio.gof;

import dio.gof.facade.Facade;
import dio.gof.singleton.SingletonEage;
import dio.gof.singleton.SingletonLazy;
import dio.gof.singleton.SingletonLazyHolder;
import dio.gof.stratege.Comportamento;
import dio.gof.stratege.ComportamentoAgressivo;
import dio.gof.stratege.ComportamentoDefensivo;
import dio.gof.stratege.ComportamentoNormal;
import dio.gof.stratege.Robo;

public class Teste {
	
	public static void main(String[] args) {
		
		
		//Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEage eazer = SingletonEage.getInstancia();
		System.out.println(eazer);
		eazer = SingletonEage.getInstancia();
		System.out.println(eazer);
		
		SingletonLazyHolder lazyholder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyholder);
		lazyholder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyholder);
		
		
		//Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		
		robo.setComportamento(defensivo);
		robo.mover();
		
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		
		// Facade 
		
		Facade facade = new Facade();
		
		facade.migrarCliente("JUlio", "12345678");
		
	}

}
