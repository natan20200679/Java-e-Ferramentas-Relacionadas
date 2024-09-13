/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * MIT License
 *
 * Copyright (c) 2022 Willyan Guimarães Caetano
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

/*
"Hipotético" exemplo de uma classe que conecta com banco de dados. Não é um exemplo real/atual desse cenário, serve apenas 
como exemplo para os testes com JUnit
*/

import java.util.logging.Logger;

public class DatabaseConnectionManager {

    private static final Logger LOGGER = Logger.getLogger(DatabaseConnectionManager.class.getName());

    public static void iniciarConexao() {

        /* Fez algo */ 
        LOGGER.info("Iniciou conexao");
    
    }
    
    public static void finalizarConexao() {

        /* Fez algo */ 
        LOGGER.info("finalizou conexao");
    
    }
    
    public static void insereDados(Pessoa pessoa) {

        /* insere pessoa no DB */
        LOGGER.info("inseriu dados");
    
    }
    
    public static void removeDados(Pessoa pessoa) {
    
        /* Remove pessoa no DB */ 
        LOGGER.info("removeu dados");
    
    }

}
