package sistema.service;

import java.util.ArrayList;
import java.util.List;
import sistema.modelos.Professor;

public class ProfessorService {

	private ArrayList <Professor> Professors = new ArrayList<Professor>();
	
	public ProfessorService()
	{

	}
	
	public void salvar(Professor Professor)
	{
	    Professors.add(Professor);
	}
	

	public List <Professor> getProfessors()
	{
		
		return Professors;
		
	}
	
	
}
