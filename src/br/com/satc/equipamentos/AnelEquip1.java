/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.equipamentos;

/**
 *
 * @author Edutec
 */
public class AnelEquip1 extends Equipamento {
 private int vitalidade;
    private int lvl;
    
    public int getLvl(){
        return lvl;
    }
    public void setLvl(int lvl){
        this.lvl = lvl;
    }
    public int getVitalidade() {
        return vitalidade;
    }

    public void setVitalidade(int vitalidade) {
        this.vitalidade = vitalidade;
    }
    public AnelEquip1(int defesa, int defesaMagica, int peso, String descricao, String nome, int valorVenda, int valorCompra) {
        super(defesa, defesaMagica, peso, descricao, nome, valorVenda, valorCompra);
        this.setNome("Anel Quartzo Enriquecido");
        this.setDefesa(0);
        this.setDefesaMagica(3);
        this.setValorCompra(50);
        this.setValorVenda(25);
        this.setPeso(1);
        this.setDescricao("Foi forjado pelo habilidoso elfo ferreiro Oran Thôrtho com o objetivo de "
                + "neutralizar os magos invasores durante a guerra da Babilônia.");
        this.setLvl(1);
        this.setVitalidade(2);
        
    }



       
}
