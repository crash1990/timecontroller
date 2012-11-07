package org.jboss.tools.example.richfaces.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.jboss.tools.example.richfaces.data.QueryParametersInterface;

@Entity
@DiscriminatorValue("daily")
public class Daily extends TimePeriod implements QueryParametersInterface{

	protected String hour;

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}
	
	public void queryBuilder(CriteriaBuilder cb){
		CriteriaQuery<Daily> q = cb.createQuery(Daily.class);
		Root<Daily> c = q.from(Daily.class);
		q.select(c);
		
		
	}
}
