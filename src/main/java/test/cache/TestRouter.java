package test.cache;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicate;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class TestRouter {

	@Bean
	public RouterFunction<ServerResponse> route(TestHandler testHandler) {

		return RouterFunctions
			.route(RequestPredicates.GET("/hello").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), testHandler::hello);
//			.andRoute(RequestPredicates.GET("/user/{id}").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), testHandler::getUser);
	}
}