package br.com.ryan.planilha;

import java.io.Serializable;
import java.time.ZoneId;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.DefaultScheduleModel;
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
    
	public ScheduleModel getEventModel() {
		return eventModel;
	}
	
	public void setEventModel(ScheduleModel eventModel) {
		this.eventModel = eventModel;
	}
	
	public String getServerTimeZone() {
		return serverTimeZone;
	}
	
	public void setServerTimeZone(String serverTimeZone) {
		this.serverTimeZone = serverTimeZone;
	}
}