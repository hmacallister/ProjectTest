package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity 
@Table(name="failureClass")
public class FailureClass implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="failureClass")
	private Integer failureClass;
	
	@Column(name="description")
	private String description;


	/*	
	@OneToMany(mappedBy = "fClass", cascade = { CascadeType.MERGE,
			CascadeType.PERSIST })
	private List<BaseData> baseData = new ArrayList<BaseData>();
	
	 * @JoinColumn (name="tac", referencedColumnName="id", nullable = false)
	 * 
	 * @OneToOne private BaseData baseData;
	 */

	public FailureClass() {
	}

	public FailureClass(Integer failureClass, String description) {
		this.failureClass = failureClass;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getFailureClass() {
		return failureClass;
	}

	public void setFailureClass(Integer failureClass) {
		this.failureClass = failureClass;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
