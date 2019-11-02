
package bean;
import java.util.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
@ManagedBean
@SessionScoped
public class LocaleBean {
    private final Locale ENGLISH=Locale.ENGLISH;
    private final Locale SPANISH=new Locale("es");
    private final Locale FRANCH=Locale.FRANCE;
    private final Locale BANGLA=new Locale("bn");
    private Locale locale=ENGLISH;
    public Locale getLocale(){
        return (locale);
    }
    public void setBangla(ActionEvent event){
        locale=BANGLA;
        updateViewLoclae();
    }
    public void setEnglish(ActionEvent event){
        locale=ENGLISH;
        updateViewLoclae();
    }
    public void setSpanish(ActionEvent event){
        locale=SPANISH;
        updateViewLoclae();
    }
    public void setFrench(ActionEvent event){
        locale=FRANCH;
        updateViewLoclae();
    }
    
    private void updateViewLoclae(){
        FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
    }
     
    
}
