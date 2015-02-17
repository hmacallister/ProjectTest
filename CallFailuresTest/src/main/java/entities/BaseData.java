package entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "baseData")
public class BaseData implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "date")
	private Date date;

	@Column(name = "imsi")
	private String imsi;

	@Column(name = "cellId")
	private String cellId;

	@Column(name = "duration")
	private String duration;

	@Column(name = "neVersion")
	private String neVersion;

	@JoinColumn(name = "failureClass", referencedColumnName = "id", nullable = false)
	@ManyToOne
	private FailureClass fClass;

	@JoinColumn(name = "eventCause", referencedColumnName = "id", nullable = false)
	@ManyToOne
	private EventCause eCause;

	@JoinColumn(name = "tac", referencedColumnName = "id", nullable = false)
	@ManyToOne
	private UE ue;

	@JoinColumn(name = "marketOperator", referencedColumnName = "id", nullable = false)
	@ManyToOne
	private MccMnc mccMnc;

	/*
	 * 
	 * 
	 * @Column(name = "failureClass") private Integer failureClass;
	 * 
	 * 
	 * @Column(name="eventCause") private Integer eventCause;
	 * 
	 * 
	 * @Column(name="tac") private Integer tac;
	 * 
	 * 
	 * @Column(name="marketOperator") private Integer marketOperator;
	 */

	@Column(name = "hier3Id")
	private String hier3Id;

	@Column(name = "hier32Id")
	private String hier32Id;

	@Column(name = "hier321Id")
	private String hier321Id;

	public BaseData() {
	}

	/*
	 * public BaseData(Date date, String imsi, String cellId, String duration,
	 * String neVersion, Integer failureClass, Integer eventCause, Integer tac,
	 * Integer marketOperator, String hier3Id, String hier32Id, String
	 * hier321Id) { this.date = date; this.imsi = imsi; this.cellId = cellId;
	 * this.duration = duration; this.neVersion = neVersion; this.failureClass =
	 * failureClass; this.eventCause = eventCause; this.tac = tac;
	 * this.marketOperator = marketOperator; this.hier3Id = hier3Id;
	 * this.hier32Id = hier32Id; this.hier321Id = hier321Id; }
	 */

	public BaseData(Date date, String imsi, String cellId, String duration,
			String neVersion, FailureClass fClass, EventCause eCause, UE ue,
			Integer failureClass, MccMnc mccMnc, String hier3Id,
			String hier32Id, String hier321Id) {
		this.date = date;
		this.imsi = imsi;
		this.cellId = cellId;
		this.duration = duration;
		this.neVersion = neVersion;
		this.fClass = fClass;
		this.eCause = eCause;
		this.ue = ue;
		this.mccMnc = mccMnc;
		this.hier3Id = hier3Id;
		this.hier32Id = hier32Id;
		this.hier321Id = hier321Id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getCellId() {
		return cellId;
	}

	public void setCellId(String cellId) {
		this.cellId = cellId;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getNeVersion() {
		return neVersion;
	}

	public void setNeVersion(String neVersion) {
		this.neVersion = neVersion;
	}

	/*
	 * 
	 * 
	 * public Integer getFailureClass() { return failureClass; }
	 * 
	 * public void setFailureClass(Integer failureClass) { this.failureClass =
	 * failureClass; }
	 * 
	 * public Integer getEventCause() { return eventCause; }
	 * 
	 * public void setEventCause(Integer eventCause) { this.eventCause =
	 * eventCause; }
	 * 
	 * public Integer getTac() { return tac; }
	 * 
	 * public void setTac(Integer tac) { this.tac = tac; }
	 * 
	 * public Integer getMarketOperator() { return marketOperator; }
	 * 
	 * public void setMarketOperator(Integer marketOperator) {
	 * this.marketOperator = marketOperator; }
	 */
	public String getHier3Id() {
		return hier3Id;
	}

	public FailureClass getfClass() {
		return fClass;
	}

	public void setfClass(FailureClass fClass) {
		this.fClass = fClass;
	}

	public EventCause geteCause() {
		return eCause;
	}

	public void seteCause(EventCause eCause) {
		this.eCause = eCause;
	}

	public UE getUe() {
		return ue;
	}

	public void setUe(UE ue) {
		this.ue = ue;
	}

	public MccMnc getMccMnc() {
		return mccMnc;
	}

	public void setMccMnc(MccMnc mccMnc) {
		this.mccMnc = mccMnc;
	}

	public void setHier3Id(String hier3Id) {
		this.hier3Id = hier3Id;
	}

	public String getHier32Id() {
		return hier32Id;
	}

	public void setHier32Id(String hier32Id) {
		this.hier32Id = hier32Id;
	}

	public String getHier321Id() {
		return hier321Id;
	}

	public void setHier321Id(String hier321Id) {
		this.hier321Id = hier321Id;
	}

}
