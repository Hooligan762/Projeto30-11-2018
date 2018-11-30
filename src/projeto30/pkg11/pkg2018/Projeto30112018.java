/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto30.pkg11.pkg2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Aluno
 */
public class Projeto30112018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Aluno a1 = new Aluno("Maria", 31);
       Aluno a2 = new Aluno("Maria", 31);
       Aluno a3 = new Aluno("Maria", 31);
       
        List<Aluno> listaAluno = new ArrayList<>();
////        listaAluno.add(a1);
////        listaAluno.add(a2);
////        listaAluno.add(a3);
//       
//           listaAluno.addAll(Arrays.asList(a1,a2,a3));
//           
//           System.out.println(a3 + "\n" + a2 );
           
           for (Aluno listaAluno1 : listaAluno) {
           System.out.println(listaAluno1.getNome() + "\n" + listaAluno1.getIdade());
               
            
        }
           Set<Aluno> listaAlunoSet = new HashSet<>();
           listaAlunoSet.add(a1);
           listaAlunoSet.add(a2);
           listaAlunoSet.add(a3);
           
           for ( Aluno listaAlunoSet1 : listaAlunoSet) {
               System.out.println(listaAlunoSet1.getNome());
           }
           
           System.out.println(a1.equals(a3));
        }
            
        }
        

    

