package br.edu.ifpa.laboratorio;

import br.edu.ifpa.laboratorio.dao.EmprestimoDAO;
import br.edu.ifpa.laboratorio.model.Aluno;
import br.edu.ifpa.laboratorio.model.Emprestimo;
import br.edu.ifpa.laboratorio.model.Equipamento;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");


        System.out.println("    SISTEMA DE EMPRÉSTIMO INTERATIVO       \n");



        System.out.print("▶ Digite o ID do Aluno (Ex: 1, 2, 3...): ");
        int idAluno = teclado.nextInt();
        teclado.nextLine();

        System.out.print("▶ Digite o Nome do Aluno: ");
        String nomeAluno = teclado.nextLine();

        System.out.print("▶ Digite a Matrícula: ");
        String matricula = teclado.nextLine();

        System.out.println();


        System.out.print("▶ Digite o ID do Equipamento (Ex: 1 para Monitor): ");
        int idEquipamento = teclado.nextInt();
        teclado.nextLine();

        System.out.print("▶ Digite o Nome do Equipamento: ");
        String nomeEquipamento = teclado.nextLine();


        Aluno aluno = new Aluno(idAluno, nomeAluno, matricula);
        Equipamento equipamento = new Equipamento(idEquipamento, nomeEquipamento, true);

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setAluno(aluno);
        emprestimo.setEquipamento(equipamento);
        emprestimo.setDataEmprestimo(new Date());
        emprestimo.setStatus("ATIVO");


        System.out.println("\n⏳ Processando e salvando no Banco de Dados...");
        EmprestimoDAO dao = new EmprestimoDAO();
        dao.salvar(emprestimo);


        System.out.println("\n[ ✅ SUCESSO! EMPRÉSTIMO REGISTRADO ]");
        System.out.printf("Solicitante: %s\nItem: %s\nData: %s\n",
                aluno.getNome(), equipamento.getNome(), sdf.format(emprestimo.getDataEmprestimo()));
        System.out.println("===========================================");


        teclado.close();
    }
}