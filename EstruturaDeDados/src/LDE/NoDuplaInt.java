package LDE;

public class NoDuplaInt {
    
    private int info;
    private NoDuplaInt ant, prox;
    /**
     * @param info
     */

     public NoDuplaInt(int info){
        this.info = info;
     }

     public int getInfo(){
        return info;
     }

     public void setInfo(int info){
        this.info = info;
     }
     public NoDuplaInt getAnt() {
        return ant;
     }
     
     public void setAnt(NoDuplaInt ant){
        this.ant = ant;
     }

     public NoDuplaInt getProx(){
        return prox;
     }

     public void setProx(NoDuplaInt prox){
        this.prox = prox;
     }

}
