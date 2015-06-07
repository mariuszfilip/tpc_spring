package pl.pjatk.tpc.entity;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Integer;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Stopa
 *
 */
@Entity
public class Stopa implements Serializable {


	@Id
	@GeneratedValue
	private Integer id;
	
	private Double ref;
	private Double lom;
	private Double dep;
	private Double red;
	
	 @Column(name = "date_update")
	private Date dateUpdate;
	private static final long serialVersionUID = 1L;

	public Stopa() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Double getRef() {
		return this.ref;
	}

	public void setRef(Double ref) {
		this.ref = ref;
	}   
	public Double getLom() {
		return this.lom;
	}

	public void setLom(Double lom) {
		this.lom = lom;
	}   
	public Double getDep() {
		return this.dep;
	}

	public void setDep(Double dep) {
		this.dep = dep;
	}   
	public Double getRed() {
		return this.red;
	}

	public void setRed(Double red) {
		this.red = red;
	}   
	public Date getDateUpdate() {
		return dateUpdate;
	}
	public void setDateUpdate(Date dateUpdate) {
		this.dateUpdate = dateUpdate;
	}
	
   
}
