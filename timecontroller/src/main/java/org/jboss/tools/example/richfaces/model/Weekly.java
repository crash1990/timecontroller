package org.jboss.tools.example.richfaces.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.jboss.tools.example.richfaces.data.QueryParametersInterface;


@Entity
@DiscriminatorValue("weekly")
public class Weekly extends Daily {
	
	protected String dayOfWeek;

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	
	
	public void queryBuilder(CriteriaBuilder cb){
		CriteriaQuery<Weekly> q = cb.createQuery(Weekly.class);
		Root<Weekly> c = q.from(Weekly.class);
		q.select(c);
		
		
	}
}
