/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
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

import org.junit.jupiter.api.*;
import java.time.LocalDateTime;

public class AfterBeforeTest {

    @BeforeAll
    static void configuraConexao() {
        
        DatabaseConnectionManager.iniciarConexao();
    
    }
    
    @BeforeEach
    void insereDadosParaTeste() {
    
        DatabaseConnectionManager.insereDados
        (new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }
    
    @AfterEach
    void removeDadosDoTeste() {
        DatabaseConnectionManager.removeDados
        (new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }
    
    @Test
    void validarDadosDeRetorno() {
    
        Assertions.assertTrue(true);
    
    }
    
    @Test
    void validarDadosDeRetorno2() {
    
        Assertions.assertNull(null);
    
    }
    
    @AfterAll
    static void finalizarConexao() {
    
        DatabaseConnectionManager.finalizarConexao();
    
    }

}
