/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/AnnotationType.java to edit this template
 */

package src.psbc;

@interface Informacao {

    String autor();
    int aulaEADNumero();
    String website() default "https://www.proway.com.br";

}
