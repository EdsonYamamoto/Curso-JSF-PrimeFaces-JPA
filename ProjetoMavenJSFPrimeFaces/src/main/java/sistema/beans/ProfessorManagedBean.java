package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import sistema.modelos.Professor;
import sistema.service.ProfessorService;

@ManagedBean
@SessionScoped
public class ProfessorManagedBean {
	
	private Professor Professor = new Professor();
	private ProfessorService service = new ProfessorService();
	
	
	public void salvar()
	{
		service.salvar(Professor);
		Professor = new Professor();
		
	}

	public Professor getProfessor() {
		return Professor;
	}

	public void setProfessor(Professor Professor) {
		this.Professor = Professor;
	}

	public List<Professor> getProfessors() {
		return service.getProfessors();
	}

	
	
	

}
