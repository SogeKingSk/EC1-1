package pe.edu.idat.dsw1j19dias;

import jakarta.annotation.PostConstruct;

import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Dia;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class DiasRepository {

    private static final Map<String, Dia> dias = new HashMap<>();

    @PostConstruct
	public void initData() {
		Dia lunes = new Dia();
		lunes.setName("lunes");
		lunes.setNumero(1);
        lunes.setNameingles("monday");

		dias.put(lunes.getName(), lunes);

        Dia martes = new Dia();
		martes.setName("martes");
		martes.setNumero(2);
        martes.setNameingles("Tuesday ");

		dias.put(martes.getName(), martes);

        Dia miercoles = new Dia();
		miercoles.setName("miercoles");
		miercoles.setNumero(3);
        miercoles.setNameingles("Wednesday ");

		dias.put(miercoles.getName(), miercoles);

        Dia jueves = new Dia();
		jueves.setName("jueves");
		jueves.setNumero(4);
        jueves.setNameingles("Thursday ");

		dias.put(jueves.getName(), jueves);

        Dia viernes = new Dia();
		viernes.setName("viernes");
		viernes.setNumero(5);
        viernes.setNameingles("Friday ");

		dias.put(viernes.getName(), viernes);

        Dia sabado = new Dia();
		sabado.setName("sabado");
		sabado.setNumero(6);
        sabado.setNameingles("Saturday ");

		dias.put(sabado.getName(), sabado);

        Dia domingo = new Dia();
		domingo.setName("domingo");
		domingo.setNumero(7);
        domingo.setNameingles("Sunday ");

		dias.put(domingo.getName(), domingo);

	}

	public Dia findDia(String name) {
		Assert.notNull(name, "The dia's name must not be null");
		return dias.get(name);
	}

}
