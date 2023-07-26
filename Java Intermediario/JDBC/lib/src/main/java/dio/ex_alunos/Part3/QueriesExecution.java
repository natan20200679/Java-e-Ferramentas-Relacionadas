/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package part3;

import java.util.List;

public class QueriesExecution {
    public static void main(String[] args) {

        AlunoDAO alunoDAO = new AlunoDAO();

        // =========================== 1 - Consulta =================================================
        List<Aluno> alunos = alunoDAO.list();

        alunos.stream().forEach(System.out::println);

        // ======================= 1.1 - Consulta com filtro ========================================
        alunoDAO.getById(1);

        //System.out.println(alunoParaConsulta);

        // =========================== 2 - Inserção =================================================
        new Aluno("Matheus", 43, "SP");

        //alunoDAO.create(alunoParaInsercao);

        // =========================== 3 - Delete ===================================================
        //alunoDAO.delete(1);

        // =========================== 4 - Atualizar ================================================
        Aluno alunoParaAtualizar = alunoDAO.getById(3);

        alunoParaAtualizar.setNome("Joaquim");
        alunoParaAtualizar.setIdade(18);
        alunoParaAtualizar.setEstado("RS");

        //alunoDAO.update(alunoParaAtualizar);
    }

}