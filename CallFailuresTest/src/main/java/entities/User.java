package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="username")
	private Integer username;
	
	@Column(name="password")
	private Integer password;
	
	@Column(name="userType")
	private Integer iduserType;

	public User() {
	}

	public User(Integer username, Integer password, Integer iduserType) {
		super();
		this.username = username;
		this.password = password;
		this.iduserType = iduserType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUsername() {
		return username;
	}

	public void setUsername(Integer username) {
		this.username = username;
	}

	public Integer getPassword() {
		return password;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}

	public Integer getIduserType() {
		return iduserType;
	}

	public void setIduserType(Integer iduserType) {
		this.iduserType = iduserType;
	}

}
