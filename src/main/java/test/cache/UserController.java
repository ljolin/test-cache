package test.cache;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class UserController {
	
    @Autowired
    private UserRepository UserRepository;
    
 
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Mono<User>> findById(@PathVariable("id") String id) {
        Optional<User> user = UserRepository.findById(id);
       
        HttpStatus status = user.isPresent() ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<Mono<User>>(Mono.just(user.get()), status);
    }
 
//    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
//    @ResponseBody
//    public Flux<Employee> findByName(@PathVariable("name") String name) {
//        return employeeService.findByName(name);
//    }
}
 