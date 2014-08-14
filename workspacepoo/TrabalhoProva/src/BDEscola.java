import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class BDEscola implements Serializable{
	
	private List<Aluno> alunos;
	private List<Professor> professor;
	private List<Disciplina> disciplina;
	Aluno aluno ;
	Professor prof;
    Disciplina dis;
	transient Scanner entrada = new Scanner(System.in);
	
	public BDEscola(){
		alunos = new LinkedList<Aluno>();
		professor = new LinkedList<Professor>();
		disciplina = new LinkedList<Disciplina>();
	}
	
	public void menu(){
		System.out.println("1 - CADASTRAR ALUNO");
		System.out.println("2 - CADASTRAR PROFESSOR");
		System.out.println("3 - CADASTRAR DISCIPLINA");
		System.out.println("4 - LISTAR TODOS OS ALUNOS");
		System.out.println("5 - LISTAR TODOS PROFESSORES");
		System.out.println("6 - VERIFICAR QUAL MATÉRIA ESTÁ CADASTRADO");
		System.out.println("7 - LISTAR QUANTIDADE DE PROFESSORES CADASTRADOS");
		System.out.println("8 - LISTAR QUANTIDADE DE ALUNOS CADASTRADOS");
		System.out.println("9 - LISTAR QUANTIDADE DE MATÉRIAS CADASTRADOS");
		System.out.println("10 - LISTAR QUANTIDADE DE MATÉRIAS O ALUNO ESTÁ CADASTRADOS");
		System.out.println("11 - MATÉRIAS MINISTRADAS");
		System.out.println("12 - IMPRIMIR ALUNOS MATRICULADOS POR DISCIPLINA");
		System.out.println("13 - RECUPERAR CADASTROS");
		System.out.println("14 - CADASTRAR NA MATÉRIA");
		System.out.println("15 - ATRIBUIR AULA");
		System.out.println("16 - SAIR");
		}
	
    public void addAluno(Aluno a){
    	alunos.add(a);
    }
    
    public void addProfessor(Professor p){
    	professor.add(p);
    }
    
    public void addDiciplina(Disciplina d){
    	disciplina.add(d);
    }
    public void cadastrarAluno(){
		if(entrada == null){
		 entrada = new Scanner(System.in);
		}
		String nome;
		String rg;
		String cpf;
		System.out.println("Digite o nome do Aluno: ");
		nome = entrada.next();
		System.out.println("Digite o RG do Aluno: ");
		rg = entrada.next();
		System.out.println("Digite o CPF do Aluno: ");
		cpf = entrada.next();
		aluno = new Aluno(nome,rg,cpf);
		addAluno(aluno);
		System.out.println("Aluno cadastrado com sucesso");
		System.out.println("");
	}
    public void cadastraProfessor(){
		if(entrada == null){
			 entrada = new Scanner(System.in);
			}
			String nome;
			String rg;
			String cpf;
			System.out.println("Digite o nome do Professor: ");
			nome = entrada.next();
			System.out.println("Digite o RG do Professor: ");
			rg = entrada.next();
			System.out.println("Digite o CPF do Professor: ");
			cpf = entrada.next();
			prof = new Professor(nome,rg,cpf);
			addProfessor(prof);
			System.out.println("Professor  cadastrado com sucesso");
			System.out.println("");
		
	}
    public void cadastrarDisciplina() {
		if(entrada == null){
			 entrada = new Scanner(System.in);
			}
		 String disciplina;
		 int qtHrs;
		 int qtAlunos;
		 System.out.println("Digite o nome da disciplina: ");
		 disciplina = entrada.next();
		 System.out.println("Digite a quantidade de horas: ");
		 qtHrs = entrada.nextInt();
		 System.out.println("Digite a quantidade máxima de alunos: ");
		 qtAlunos = entrada.nextInt();
		 dis = new Disciplina(disciplina, qtHrs, qtAlunos);
		 addDiciplina(dis);
		 System.out.println("Disciplina cadastrada com sucesso: ");	
		 System.out.println("");
		}
    
    public void imprimirAluno(){
    	    Collections.sort(alunos);
    	    System.out.println("Lista de Alunos cadastrados");
    	    for(Object i : alunos){
    		Aluno a =  (Aluno) i;
    		if(a != null){
    			System.out.println("Nome: "+a.getNome());
    			System.out.println("Cpf: "+a.getCpf());
    			System.out.println("RG: "+a.getRg());
    			System.out.println("Matricula: "+a.getNumeroMatricula());
    			System.out.println("----------------------------------");
    			}
  }     
    	    if(alunos.isEmpty()){
    	    	System.out.println("Não temos alunos cadastrados cadastrado");
    	    }
    	}
    	public void verificarDisciplinasMatriculada(){
    		String nMatricula;
    		if(entrada == null){
    			 entrada = new Scanner(System.in);
    			}
    		System.out.println("Digite o número da sua matricula");
    		nMatricula = entrada.next();
    		for(Object i : disciplina){
        		Disciplina d =  (Disciplina) i;
        		if(d != null){
        			if(d.verificarMatriculaCurso(nMatricula)){
        				System.out.println("Matriculado nas disciplinas "+d.getDisciplina());
        			}else{
        				System.out.println("Aluno não encontrado");
        			}
        		}
    		}	
    		
    		
    	}
    	public void imprimirProfessor(){
    		Collections.sort(professor);
    		 System.out.println("Lista de Professores cadastrados");
    		for(Object i : professor){
    			Professor p = (Professor) i;
    			if(p != null){
    				System.out.println("Nome: "+p.getNome());
        			System.out.println("Cpf: "+p.getCpf());
        			System.out.println("RG: "+p.getRg());
        			System.out.println("----------------------------------");
    			}
    		}
    		if(professor.isEmpty()){
    			System.out.println("Não temos professores cadastrados");
    		}
    		
    	}
    	
    
    public void sizeAluno(){
    	System.out.println("Quantidade de alunos matriculados: "+alunos.size());
    }
    public void sizeProfessor(){
    	System.out.println("Quantidade de professor cadastrados: "+professor.size());
    }
    public void sizeDiciplina(){
    	System.out.println("Quantidade de disciplinas cadastradas: "+disciplina.size());
    }
    
    public void verificarMateria(){
    	String nome;
    	if(entrada == null){
			 entrada = new Scanner(System.in);
			}
    	System.out.println("Digite o nome do professor: ");
    	nome = entrada.next();
    	for(Object i : disciplina){
    		Disciplina dis = (Disciplina) i;
    		if(dis != null){
    			if(dis.getProf().toString().equalsIgnoreCase(nome)){
    				System.out.println(dis.getDisciplina());
    			}
    		}
    	}
    }
    
    public void verificarQuantidadeMatriculada(){
    	String nMatricula;
    	if(entrada == null){
			 entrada = new Scanner(System.in);
			}
   	      System.out.println("Digite o número de sua matricula: ");
   	     nMatricula = entrada.next();

    	
    	int cont = 0;
    	StringBuilder nome = new StringBuilder();
		for(Object i : disciplina){
    		Disciplina d =  (Disciplina) i;
    		if(d != null){
    			if(d.verificarMatriculaCurso(nMatricula)){
    				cont++;
    			}
    		}
		}
		 for(Object i : alunos){
	    		Aluno a =  (Aluno) i;
	    		if(a != null){
	    			if(a.getNumeroMatricula() == Integer.parseInt(nMatricula) ){
	    				nome.append(a.getNome());
	    			}
	    				
	    			}
	    		}
		 System.out.println("O Aluno(a) :"+nome+ " está cadastrado em "+cont+" matérias");
		
	}
    public void matriculaPorDisciplina(){
    	String nDis;
    	if(entrada == null){
			 entrada = new Scanner(System.in);
			}
  	      System.out.println("Digite o nome da disciplina ");
  	      nDis = entrada.next();
  	      dis.matriculaPorDisciplina(nDis);
    }
    public void encerrar() throws Exception {
    	
    	String p = ".";
    	String encerrar = "Encerrando";
    	System.out.print(encerrar);
    	int tempo = 0;
    	for(int i = 0; i < 10; i++){
    		TimeUnit.SECONDS.sleep(1);
    		System.out.print(p);
    		
    		
    	}
    }
   public void matricularAluno(){
	       List dp = new LinkedList<Disciplina>();
	       String dpi ;
	       System.out.println("Digite o nome da diciplina");
	       dpi = entrada.next();
	       for(Object i : disciplina){
	    	  Disciplina di = (Disciplina) i;
	    	  if(di != null){
	    		  if(di.getDisciplina().toString().equalsIgnoreCase(dpi))dp.add(di);
	    	  }
	       }
	   
	       dis.addAlunoMatricula(dp);
   }
   
   public void atribuirDisciplina(){
	   String discip;
	   String nome;
	   	if(entrada == null){
				 entrada = new Scanner(System.in);
				}
	 	      System.out.println("Digite o nome da disciplina ");
	 	      discip = entrada.next();
	 	      System.out.println("Digite o nome do professor");
	 	      nome = entrada.next();
	   for(Object i : disciplina){
		   Disciplina d = (Disciplina) i;
		   if(d != null){
			   if(d.getDisciplina().toString().equalsIgnoreCase(discip)){
				   if(d.getProf()== null){
					   d.setProf(nome);
				   }else{
					   System.err.println("Essa disciplina ja tem professor cadastrado");
				   }
				  
			   }
		   }
		   
	   }
   }
}

