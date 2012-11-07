package org.jboss.tools.example.richfaces.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class TimeDomain {

	@Id
	private String name;
	
	@OneToMany(cascade=CascadeType.REMOVE, fetch=FetchType.EAGER)
    @JoinColumn(name="TIMEDOMAIN_ID")
	private List<TimePeriod> tPeriods;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TimePeriod> gettPeriods() {
		return tPeriods;
	}

	public void settPeriods(List<TimePeriod> tPeriods) {
		this.tPeriods = tPeriods;
	}
}
