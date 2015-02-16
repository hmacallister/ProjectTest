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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name="mcc_mnc")
public class MccMnc implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="mcc")
	private Integer mcc;
	
	@Column(name="mnc")
	private Integer mnc;
	
	@Column(name="country")
	private String country;
	
	@Column(name="operator")
	private String operator;
	/*

	@OneToMany(mappedBy="mccMnc", cascade={CascadeType.MERGE, CascadeType.PERSIST})
   //@OneToMany(mappedBy="mccMnc",targetEntity=BaseData.class)
	//@OneToOne(optional = false, cascade = CascadeType.ALL, mappedBy = "mccMnc", targetEntity = BaseData.class)
	private List<BaseData> baseData = new ArrayList<BaseData>();
	//private Collection baseData;
	

	 * @JoinColumn (name="tac", referencedColumnName="id", nullable = false)
	 * 
	 * @OneToOne private BaseData baseData;
	 */
	
	public MccMnc() {
	}

	public MccMnc(Integer mcc, Integer mnc, String country, String operator) {
		super();
		this.mcc = mcc;
		this.mnc = mnc;
		this.country = country;
		this.operator = operator;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMcc() {
		return mcc;
	}

	public void setMcc(Integer mcc) {
		this.mcc = mcc;
	}

	public Integer getMnc() {
		return mnc;
	}

	public void setMnc(Integer mnc) {
		this.mnc = mnc;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	
}
