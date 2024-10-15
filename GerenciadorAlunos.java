import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GerenciadorAlunos {
    Scanner scan=new Scanner(System.in);
    List<Aluno> listaAlunos=new ArrayList<>();
    Random random=new Random();
    //GerenciadorAlunos alunos=new GerenciadorAlunos();

    public void increverAluno() {
        scan.nextLine();
        System.out.println("Nome do Aluno");
        String name=scan.nextLine();

        System.out.println("Idade do aluno");
        int age= scan.nextInt();


        String cpf="0";
        while (cpf.length()<11){
             scan.nextLine();
            System.out.println("CPF");
            cpf=scan.nextLine();

            if (cpf.length()<11) {
                System.out.println("CPF deve ter 11 Digitos!");
            }
        }


        int registration=random.nextInt(1000);
        System.out.println("Matricula do Aluno: "+registration);
        Aluno aluno=new Aluno(name,age,registration,cpf);
        listaAlunos.add(aluno);

            System.out.println("Aluno Adicionado");


    }
    public void buscarAluno(){
        System.out.println("Numero de Matricula do Aluno");
        int registrationNumber= scan.nextInt();
        boolean verificaAluno=false;
        for (Aluno listaAluno : listaAlunos) {
            if (registrationNumber==listaAluno.getRegistration()){
                System.out.println("Aluno encontrado");
                listaAluno.mostrarDados();
                verificaAluno=true;
            }

        }
        if (!verificaAluno){
            System.out.println("Aluno não encontrado!");
            verificaAluno=false;
        }
    }

    public void listaAluno(){
        for (Aluno listaAluno : listaAlunos) {
            if (listaAlunos.isEmpty()){
                System.out.println("Nenhum Aluno Adicionado");
            }else {
                listaAluno.mostrarDados();
            }

        }
    }
    public void iniciar()  {
        int iniciandoMenu;
        do {
            System.out.println("1.Inscrever\n2.Buscar Aluno\n3.Lista de Alunos\n4.Sair");
             iniciandoMenu= scan.nextInt();
            switch (iniciandoMenu){
                case 1:
                    increverAluno();
                    break;
                case 2:
                    buscarAluno();
                    break;
                case 3:
                    listaAluno();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;
            }
        }while (iniciandoMenu!=4);

    }

}
