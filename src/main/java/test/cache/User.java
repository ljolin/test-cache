package test.cache;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User { 
    @Id
    @GeneratedValue
    @Column(name = "userid")
    private String id;
    
    @Column(name = "username")
    private String username;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
 
    // standard constructors
 
    // standard getters and setters
}