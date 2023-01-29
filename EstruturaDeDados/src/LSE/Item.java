package LSE;

public class Item {
     //tem varios atributos, dentre eles

     private int chave;
     /**
      * @param chave
      */

      public Item(int chave){
        this.chave = chave;

      }

      public int getChave(){
        return chave;

      }

      public void setChave(int chave){
          this.chave = chave;
      }

      @Override
      public String toString(){
        return "Item [chave" + chave + "]";
      }
      
}
