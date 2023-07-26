package br.com.ryan.planilha;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.ScheduleEntryMoveEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.DefaultScheduleModel;
import org.primefaces.model.ScheduleEvent;
import org.primefaces.model.ScheduleModel;

@ManagedBean @ViewScoped
public class PlanilhaManager implements Serializable {
	private static final long serialVersionUID = -1667407689362206819L;
	
	private ScheduleModel eventModel;
    private String serverTimeZone = ZoneId.systemDefault().toString();
    
    @PostConstruct
    public void init() {
        eventModel = new DefaultScheduleModel();
    }
    
    public void onDateSelect(SelectEvent<LocalDateTime> selectEvent) {
    	eventModel = (ScheduleModel) DefaultScheduleEvent.builder()
                .startDate(selectEvent.getObject())
                .endDate(selectEvent.getObject().plusHours(1))
                .build();
    }
    
    public void onEventSelect(SelectEvent<ScheduleEvent<?>> selectEvent) {
    	eventModel = (ScheduleModel) selectEvent.getObject();
    }
    
    public void onEventMove(ScheduleEntryMoveEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Event moved",
                "Delta:" + event.getDeltaAsDuration());

        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
	public ScheduleModel getEventModel() {
		return eventModel;
	}
	
	public void setEventModel(ScheduleModel eventModel) {
		this.eventModel = eventModel;
	}
	
	public String getServerTimeZone() {
		System.out.println(serverTimeZone);
		return serverTimeZone;
	}
	
	public void setServerTimeZone(String serverTimeZone) {
		this.serverTimeZone = serverTimeZone;
	}
}