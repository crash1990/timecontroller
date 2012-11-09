package org.jboss.tools.example.richfaces.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

@Entity
@DiscriminatorValue("monthly")
public class Monthly extends Daily {
	
	protected String dayOfMonth;
	
	private CriteriaQuery<Monthly> q ;
	
	private Root<Monthly> c;

	public String getDayOfMonth() {
		return dayOfMonth;
	}

	public void setDayOfMonth(String dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}
	
	
	public void queryBuilder(CriteriaBuilder cb, long start, long end){
		q = cb.createQuery(Monthly.class);
		c = q.from(Monthly.class);
		q.select(c);
		Path<Long> str= c.get("start");
		Path<Long> fin= c.get("finish");
		q.where(
			      cb.and(
			          cb.gt(str, start),
			          cb.lt(fin, end)
			      )
			  );
		
		
	}

}
