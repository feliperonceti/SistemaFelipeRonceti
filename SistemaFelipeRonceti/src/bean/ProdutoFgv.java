package bean;
// Generated 02/10/2023 15:05:44 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ProdutoFgv generated by hbm2java
 */
@Entity
@Table(name="produto_fgv"
    ,catalog="db_felipe_ronceti"
)
public class ProdutoFgv  implements java.io.Serializable {


     private int idprodutoFgv;
     private String nomeFgv;
     private String marcaFgv;
     private String corFgv;
     private String precoprodutoFgv;
     private String quantidadeFgv;

    public ProdutoFgv() {
    }

    public ProdutoFgv(int idprodutoFgv, String nomeFgv, String marcaFgv, String corFgv, String precoprodutoFgv, String quantidadeFgv) {
       this.idprodutoFgv = idprodutoFgv;
       this.nomeFgv = nomeFgv;
       this.marcaFgv = marcaFgv;
       this.corFgv = corFgv;
       this.precoprodutoFgv = precoprodutoFgv;
       this.quantidadeFgv = quantidadeFgv;
    }
   
     @Id 

    
    @Column(name="idproduto_fgv", unique=true, nullable=false)
    public int getIdprodutoFgv() {
        return this.idprodutoFgv;
    }
    
    public void setIdprodutoFgv(int idprodutoFgv) {
        this.idprodutoFgv = idprodutoFgv;
    }

    
    @Column(name="nome_fgv", nullable=false, length=20)
    public String getNomeFgv() {
        return this.nomeFgv;
    }
    
    public void setNomeFgv(String nomeFgv) {
        this.nomeFgv = nomeFgv;
    }

    
    @Column(name="marca_fgv", nullable=false, length=45)
    public String getMarcaFgv() {
        return this.marcaFgv;
    }
    
    public void setMarcaFgv(String marcaFgv) {
        this.marcaFgv = marcaFgv;
    }

    
    @Column(name="cor_fgv", nullable=false, length=45)
    public String getCorFgv() {
        return this.corFgv;
    }
    
    public void setCorFgv(String corFgv) {
        this.corFgv = corFgv;
    }

    
    @Column(name="precoproduto_fgv", nullable=false, precision=10)
    public String getPrecoprodutoFgv() {
        return this.precoprodutoFgv;
    }
    
    public void setPrecoprodutoFgv(String precoprodutoFgv) {
        this.precoprodutoFgv = precoprodutoFgv;
    }

    
    @Column(name="quantidade_fgv", nullable=false, length=20)
    public String getQuantidadeFgv() {
        return this.quantidadeFgv;
    }
    
    public void setQuantidadeFgv(String quantidadeFgv) {
        this.quantidadeFgv = quantidadeFgv;
    }




}


