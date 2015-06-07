package pl.pjatk.tpc.entity;

import java.io.Serializable;

import javax.persistence.*;


/**
 * Entity implementation class for Entity: Currency
 *
 */
@Entity
public class CurrencyValue implements Serializable {

		
	


	/**
	 * 
	 */
	private static final long serialVersionUID = -4690030601108168382L;


	@Id
	@GeneratedValue
	private Integer id;
	

	@Column(name="currency_id")
	private Integer currencyId;
	
	
	@Column(name = "avg_exchange_rate")
	private Double avgExchangeRate;
	
	
	/*@ManyToOne
	@JoinColumn(name = "currency_id")
	private Currency currencyValue;*/


	public Integer getCurrencyId() {
		return currencyId;
	}


	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}


	public Double getAvgExchangeRate() {
		return avgExchangeRate;
	}


	public void setAvgExchangeRate(Double avgExchangeRate) {
		this.avgExchangeRate = avgExchangeRate;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

/*
	public Currency getCurrencyValue() {
		return currencyValue;
	}


	public void setCurrencyValue(Currency currencyValue) {
		this.currencyValue = currencyValue;
	}*/
	
	
}
