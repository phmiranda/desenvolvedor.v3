/*
 * Author: Pedro
 * Project: desenvolvedor-oracle-se
 * User Story: HUXXX - TITLE OF USER HISTORY
 * Description: N/A
 * Date: 21/07/2021
 */

package br.com.phmiranda.oracle.oo.banco.herdadoconta;

public class SeguroVida implements Tributavel {
    @Override
    public double getValorImposto() {
        return 42;
    }
}
