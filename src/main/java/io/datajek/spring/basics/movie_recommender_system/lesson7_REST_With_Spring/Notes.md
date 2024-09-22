1. The @GetMapping annotation maps HTTP GET requests to controller methods. It is a shortcut for:
    @RequestMapping(method = RequestMethod.GET)

2. we will build a REST service that provides basic CRUD functionality. 
   The client sends an HTTP request to the REST service. 
   The request is mapped to a controller which calls service layer methods. The service layer delegates the call to 
   repository and returns the data as POJO. The MessageConverter converts the data to JSON and it is sent back to the client.

3. REST

C - POST | @RequestMapping(method = RequestMethod.POST) | @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player) {}

R - GET | @RequestMapping(method = RequestMethod.GET) | @GetMapping("/players")
    public Player getPlayers(@RequestBody Player player) {}

U - PUT | @RequestMapping(method = RequestMethod.PUT) | @PutMapping("/players/{id}") 
 
D - DELETE | @RequestMapping(method = RequestMethod.DELETE) | @DeleteMapping("/players/{id}")

Example:

package io.datajek.springrest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

	@Autowired
	PlayerService service;
	
	@GetMapping("/players")
	public List<Player> allPlayers() {
		return service.getAllPlayers();	    
	}

	@GetMapping("/players/{id}")
	public Player getPlayer(@PathVariable int id){
		return service.getPlayer(id);
	}
	
	@PostMapping("/players")
	public Player addPlayer(@RequestBody Player player) {
    		player.setId(0);
		return service.addPlayer(player);
	}

    @PutMapping("/players/{id}")
	public Player updatePlayer(@PathVariable int id, @RequestBody Player player) {
		return service.updatePlayer(id, player);
	}	
}


