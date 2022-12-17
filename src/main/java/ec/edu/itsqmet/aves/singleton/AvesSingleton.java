package ec.edu.itsqmet.aves.singleton;

import org.springframework.beans.factory.annotation.Autowired;

public final class AvesSingleton {
	private static AvesSingleton instance;
	private static List <AvesDTO> countries;
	@Autowired
	private static IAvesService countryService = new AvesServiceImpl();
	
	private AvesSingleton() {
	}
	
	public static  List<AvesDTO> getAves() {
		if (name == null) {
			name = nameService.getAll();
		}
		return countries;
	}
	public static AvesSingleton getInstance() {
		if (instance == null) {
			instance = new AvesSingleton();
		}
		return instance;
}
