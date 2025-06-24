import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<String> alunos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String nome;

        System.out.println("Digitr os nomes dos alunos (Digite fim para sair!):");
        while (true){
            System.out.println("Nome: ");
            nome = scanner.nextLine();;
            if (nome.equalsIgnoreCase("fim")){
                break;
            }
            alunos.add(nome);
        }

        if(alunos.isEmpty()){
            System.out.println("Nenhum aluno cadastrado.");
        }else {
            Random sorteio = new Random();
            int indiceSorteado = sorteio.nextInt(alunos.size());
            String alunoSorteado = alunos.get(indiceSorteado);

            System.out.println("Aluno sorteado: " + alunoSorteado);
        }

        scanner.close();
    }
}