public class Aluno {
    private String name;
    private int age;
    private int registration;
    private String cpf;

    public Aluno(String name, int age, int registration, String cpf) {
        this.name = name;
        this.age = age;
        this.registration = registration;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRegistration() {
        return registration;
    }

    public String getCpf() {
        return cpf;
    }
    public void mostrarDados(){
        System.out.println("||||||||||||||||||||");
        System.out.println("Nome: "+name);
        System.out.println("Matricula: "+registration);
        System.out.println("CPF: "+cpf);
        System.out.println("Idade: "+age);
        System.out.println("||||||||||||||||||||");
    }
}
