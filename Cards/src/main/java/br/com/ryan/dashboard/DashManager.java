package br.com.ryan.dashboard;

import java.io.Serializable;

import javax.faces.application.Application;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.context.FacesContext;
import javax.swing.JOptionPane;

import org.primefaces.component.dashboard.Dashboard;
import org.primefaces.component.panel.Panel;
import org.primefaces.event.DashboardReorderEvent;
import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;

@ManagedBean @ViewScoped
public class DashManager implements Serializable {
	private static final long serialVersionUID = -3639372702849016278L;
	
	private Dashboard dashboard;
	
	public DashManager() {
		FacesContext fc = FacesContext.getCurrentInstance();
		Application application = fc.getApplication();

		dashboard = (Dashboard) application.createComponent(fc, "org.primefaces.component.Dashboard", "org.primefaces.component.DashboardRenderer");
		dashboard.setId("dashboard");

		DashboardModel model = new DefaultDashboardModel();
		for( int i = 0, n = 4; i < n; i++ ) {
			DashboardColumn column = new DefaultDashboardColumn();
			model.addColumn(column);
		}
		dashboard.setModel(model);

		for( int i = 0, n = 4; i < n; i++ ) {
			Panel panel = (Panel) application.createComponent(fc, "org.primefaces.component.Panel", "org.primefaces.component.PanelRenderer");
			panel.setId("measure_" + i);
			panel.setHeader("Dashboard Component " + i);
			panel.setClosable(false);
			panel.setToggleable(false);

			getDashboard().getChildren().add(panel);
			DashboardColumn column = model.getColumn(i%4);
			column.addWidget(panel.getId());
			HtmlOutputText text = new HtmlOutputText();
			text.setValue("Dashboard widget bits!" );

			panel.getChildren().add(text);
		}
	}
	
	public void handleReorder(DashboardReorderEvent event) {
		JOptionPane.showMessageDialog(null, event);
	}
	
	public Dashboard getDashboard() {
		return dashboard;
	}

	public void setDashboard(Dashboard dashboard) {
		this.dashboard = dashboard;
	}
}