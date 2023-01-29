package LSE;

public class No {
    private  Item info;
    private No prox;

    /**
     * @param info
     */

     public No(Item info){
        this.info = info;
        this.prox = null; //essa linha e facultativa pq
                          // ponteiro inicializa com null
                          //automaticamente
        
     }

    public Item getInfo(){
        return info;

    }

    public void setInfo(Item info){
        this.info = info;

    }

    public No getProx(){
        return prox;
    }

    public void setProx(No prox){
        this.prox = prox;
    }

    @Override
    public String  toString(){
        return "No[info=" + info + "]";
    }

}
