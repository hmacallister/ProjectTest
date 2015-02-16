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
@Table(name="eventCause")
public class EventCause implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="causeCode")
	private Integer causeCode;
	
	@Column(name="eventId")
	private Integer eventId;
	
	@Column(name="description")
	private String description;
	/*
	@OneToMany(mappedBy = "eCause", cascade = { CascadeType.MERGE,
			CascadeType.PERSIST })
	private List<BaseData> baseData = new ArrayList<BaseData>();
	

	 * @JoinColumn (name="tac", referencedColumnName="id", nullable = false)
	 * 
	 * @OneToOne private BaseData baseData;
	 */

	public EventCause() {
	}

	public EventCause(Integer causeCode, Integer eventId, String description) {
		this.causeCode = causeCode;
		this.eventId = eventId;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCauseCode() {
		return causeCode;
	}

	public void setCauseCode(Integer causeCode) {
		this.causeCode = causeCode;
	}

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
