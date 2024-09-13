import codandoSimples.dao.DespesaDAO;
import codandoSimples.model.Categoria;
import codandoSimples.model.Despesa;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {

       DespesaDAO dao = new DespesaDAO();

       /*
       Instruções para inserir novo registro no banco de dados
        */

//       Despesa despesa = dao.save(new Despesa(3L,"Hotifruti",LocalDate.of(2021,4,12),
//               80,Categoria.ALIMENTACAO));
//       dao.save(despesa);

       /*
       Instrução que excluem um registro do banco de dados através da informação do id
        */

//       dao.delete(13L);

       /*
       Instruções que buscam pelo id e atualizam informações relacionadas à este no banco de dados
        */

//       Optional<Despesa> despesaOptional = dao.findById(10L);
//       Despesa despesa = despesaOptional.get();
//       despesa.setDescricao("Viagem com Úber até o Aeroporto");
//       despesa.setData(LocalDate.of(2021, 4, 28));
//       despesa.setValor(110);
//       despesa.setCategoria(Categoria.TRANSPORTE);
//       dao.update(despesa);

       /*
       Instruções que mostram todos os resultados do banco de dados específico
        */

//       List<Despesa> despesas = dao.findAll();
//
//       for (Despesa despesa: despesas) {

//           System.out.println("ID: " + despesa.getId());
//           System.out.println("Descrição: " + despesa.getDescricao());
//           System.out.println("Valor: " + despesa.getValor());
//           System.out.println("===============================");

//       }

        /*
        Instruções de busca específica no banco de dados específico
         */

//        Optional<Despesa> despesaOptional = dao.findById(2L);
//        despesaOptional.ifPresent(despesa -> {
//            System.out.println("ID: " + despesa.getId());
//            System.out.println("Descrição: " + despesa.getDescricao());
//            System.out.println("Valor: " + despesa.getValor());
//            System.out.println("===============================");
//        });
//
        /*
        Instruções de busca específica no banco de dados específico
         */

//        List<Despesa> despesas = dao.findByCategoria(Categoria.TRANSPORTE);

//        for (Despesa despesa: despesas) {

//            System.out.println("ID: " + despesa.getId());
//            System.out.println("Descrição: " + despesa.getDescricao());
//            System.out.println("Categoria: " + despesa.getCategoria());
//            System.out.println("Valor: " + despesa.getValor());
//            System.out.println("===============================");

//        }

       /*
       As instruções abaixo podem ser usadas caso não se utilize o construtor da classe Despesa
        */

//       Despesa despesa = new Despesa();
//       despesa.setDescricao("Hortifruti");
//       despesa.setCategoria(Categoria.ALIMENTACAO);
//       despesa.setValor(80);
//       despesa.setData(LocalDate.of(2021, 4, 12));

//       Despesa despesaInserida = dao.save(despesa);

//       System.out.println("Foi inserida a despesa com id: " + despesaInserida.getId());
//       dao.save(despesa);
    
     }

}
