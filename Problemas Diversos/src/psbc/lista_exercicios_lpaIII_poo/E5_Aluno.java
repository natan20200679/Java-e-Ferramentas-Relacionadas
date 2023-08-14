/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psbc.lista_exercicios_lpaIII_poo;

public class E5_Aluno {

    String nome;
    String matricula;
    double notaProva1;
    double notaProva2;
    double notaTrabalho;
    double provaFinal;
    double media;
    double mediaFinal = 5;

    public double media() {

        media = ((2.5 * (notaProva1 + notaProva2)) + (2 * notaTrabalho)) / 7;

        return media;

    }

    public double Final() {

        if (media >= 7) {

            return 0;

        } else {

            provaFinal = (2 * mediaFinal) - media;

            return provaFinal;

        }

    }

    public String getNome() {

        return nome;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public String getMatricula() {

        return matricula;

    }

    public void setMatricula(String matricula) {

        this.matricula = matricula;

    }

    public double getNotaProva1() {

        return notaProva1;

    }

    public void setNotaProva1(double notaProva1) {

        this.notaProva1 = notaProva1;

    }

    public double getNotaProva2() {

        return notaProva2;

    }

    public void setNotaProva2(double notaProva2) {

        this.notaProva2 = notaProva2;

    }

    public double getNotaTrabalho() {

        return notaTrabalho;

    }

    public void setNotaTrabalho(double notaTrabalho) {

        this.notaTrabalho = notaTrabalho;

    }

    public double getProvaFinal() {

        return provaFinal;

    }

    public void setProvaFinal(double provaFinal) {

        this.provaFinal = provaFinal;

    }

//    public double getMedia() {
//        return media;
//    }
//
//    public void setMedia(double media) {
//        this.media = media;
//    }
//
//    public double getMediaFinal() {
//        return mediaFinal;
//    }
//
//    public void setMediaFinal(double mediaFinal) {
//        this.mediaFinal = mediaFinal;
//    }
    
    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", media=" + media + ", mediaFinal=" + 
                mediaFinal + ", nome=" + nome + ", notaProva1=" + notaProva1 + ", notaProva2=" + 
                notaProva2 + ", notaTrabalho=" + notaTrabalho + ", provaFinal=" + provaFinal + "]";
    
    }

}
