/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package respquestao;

import java.util.Date;
public class ProdutoPerecivel extends Produto{
    private Date dataFabricacao;
    private Date dataDeValidade;
    
    public ProdutoPerecivel(int codigo, String descricao) {
        super(codigo, descricao);
    }
    @Override
    public boolean MovEstoque(int codigo, int quantidade, int tipomove){
        Date hoje = new Date();
        if(dataDeValidade.compareTo(hoje)<0){
            return super.MovEstoque(codigo, quantidade, tipomove);
        }
         return false; 
    }
}
