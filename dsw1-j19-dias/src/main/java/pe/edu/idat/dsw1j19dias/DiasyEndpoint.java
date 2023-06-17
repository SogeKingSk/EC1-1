package pe.edu.idat.dsw1j19dias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.GetDiasRequest;
import io.spring.guides.gs_producing_web_service.GetDiasResponse;

@Endpoint
public class DiasyEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	private DiasRepository diasRepository;

	@Autowired
	public DiasyEndpoint(DiasRepository diasRepository) {
		this.diasRepository = diasRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getDiasRequest")
	@ResponsePayload
	public GetDiasResponse getCountry(@RequestPayload GetDiasRequest request) {
		GetDiasResponse response = new GetDiasResponse();
		response.setDia(diasRepository.findDia(request.getName()));

		return response;
	}
}
