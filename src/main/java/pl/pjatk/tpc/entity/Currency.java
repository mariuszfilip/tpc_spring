package pl.pjatk.tpc.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Currency
 *
 */
@Entity
public class Currency implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue
	private Integer id;
	
	
	private String name;
	
	private String code;
	
	
/*	@OneToMany
	@JoinColumn(name="currency_id")
	private List<CurrencyValue> currencyValue;*/
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/*public List<CurrencyValue> getCurrencyValue() {
		return currencyValue;
	}

	public void setCurrencyValue(List<CurrencyValue> currencyValue) {
		this.currencyValue = currencyValue;
	}*/
	
	
}
