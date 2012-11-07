package org.jboss.tools.example.richfaces.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Entity
@DiscriminatorValue("monthly")
public class Monthly extends Daily {
	
	protected String dayOfMonth;

	public String getDayOfMonth() {
		return dayOfMonth;
	}

	public void setDayOfMonth(String dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}
	
	
	public void queryBuilder(CriteriaBuilder cb){
		CriteriaQuery<Monthly> q = cb.createQuery(Monthly.class);
		Root<Monthly> c = q.from(Monthly.class);
		q.select(c);
		
		
	}

}
