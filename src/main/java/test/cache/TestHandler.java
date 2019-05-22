package test.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class TestHandler {

	@Autowired
	UserRepository userRepository;
	
	public Mono<ServerResponse> hello(ServerRequest request) {
		return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
			.body(BodyInserters.fromObject("Hello, Spring of the spraf!"));
	}
	
	public Mono<ServerResponse> getUser(ServerRequest userId) {
		return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
				.body(BodyInserters.fromObject("Hello, Spring of the spraf!"));
//		Object user = userRepository.findById(userId);
//		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
//			.body(BodyInserters.fromObject(user);
	}
}