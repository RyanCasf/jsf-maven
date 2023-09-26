package org.primefaces.test;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.event.timeline.TimelineAddEvent;
import org.primefaces.event.timeline.TimelineModificationEvent;
import org.primefaces.model.timeline.TimelineEvent;
import org.primefaces.model.timeline.TimelineModel;
import org.primefaces.util.CalendarioUtil;

import lombok.Data;

@Data @Named @ViewScoped
public class TestView implements Serializable {
	
	private TimelineModel timeline;
	private Date start = CalendarioUtil.dataOntem();
	private Date end = CalendarioUtil.dataAmanha();
	
	public TestView() {
		String[] names = new String[] { "User 1", "User 2", "User 3", "User 4", "User 5", "User 6" };
		timeline = new TimelineModel();
		
		for (String name : names) {
			LocalDateTime endDate = LocalDateTime.now().minusHours(12).withMinute(0).withSecond(0).withNano(0);

			for (int i = 0; i < 5; i++) {
				LocalDateTime startDate = endDate.plusHours(Math.round(Math.random() * 5));
				endDate = startDate.plusHours(4 + Math.round(Math.random() * 5));

				long r = Math.round(Math.random() * 2);
				String availability = (r == 0 ? "Unavailable" : (r == 1 ? "Available" : "Maybe"));

				TimelineEvent event = new TimelineEvent();
				event.setData(availability);
				event.setStartDate(Date.from(startDate.atZone(ZoneId.systemDefault()).toInstant()));
				event.setEndDate(Date.from(endDate.atZone(ZoneId.systemDefault()).toInstant()));
				event.setEditable(true);
				event.setGroup(name);
				event.setStyleClass(availability.toLowerCase());
				
				timeline.add(event);
			}
		}
	}
	
	public void onAdd(TimelineAddEvent timelineAddEvent) {
		System.out.println("Add");
	}
	
	public void onChange(TimelineModificationEvent timelineModificationEvent) {
		System.out.println("Change");
    }

    public void onChanged(TimelineModificationEvent timelineModificationEvent) {
    	System.out.println("Changed");
    }
	
	public void onEdit(TimelineModificationEvent timelineModificationEvent) {
		System.out.println("Edit");
	}
	
	public void onDelete(TimelineModificationEvent timelineModificationEvent) {
		System.out.println("Delete");
	}
}