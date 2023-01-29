package LDE;

public class ListaDuplaInt {

  private NoDuplaInt prim, ult;
  private int nElem;

  public ListaDuplaInt() {
    this.nElem = 0;
    this.prim = null;
    this.ult = null;
  }

  public NoDuplaInt getPrim() {
    return prim;

  }

  public void setPrim(NoDuplaInt prim) {
    this.prim = prim;
  }

  public NoDuplaInt getUlt() {
    return ult;
  }

  public void setUlt(NoDuplaInt ult) {
    this.ult = ult;
  }

  public int tamanho() {
    return nElem;
  }
  /*
   * Operações
   * eVazia: retorna true se a lista estiver vazia e false caso contrário
   * insereUltimo: insere um No no final da lista
   * insereInicio: insere um No no início da lista
   * pesquisa: retorna o nó que contém o valor a ser pesquisado
   *
   * ou Null se não encontrar
   * pesquisaAoContrario: faz a pesquisa do fim para o início
   * remove: remove o nó que contém o valor passado. Retorna true
   *
   * se a remoção foi bem sucedida e false caso contrário
   * toString
   */

  public boolean eVazia() {
    if (this.nElem == 0) {
      return true;
    } else {
      return false;
    }
  }

  public void insereFim(int numero) {
    NoDuplaInt novo = new NoDuplaInt(numero);
    if (this.eVazia()) {
      this.prim = novo;
    } else {
      this.ult.setProx(novo);
      novo.setAnt(this.ult);
    }
    this.ult = novo;
    this.nElem++;

  }

  public void insereInicio(int numero) {
    NoDuplaInt novo = new NoDuplaInt(numero);
    if (this.eVazia()) {
      this.ult = novo;
    } else {
      this.prim.setAnt(novo);
      novo.setProx(this.prim);
    }
    this.prim = novo;
    this.nElem++;

  }

  public NoDuplaInt pesquisa(int numero) {
    NoDuplaInt aux = this.prim;
    while (aux != null) {
      if (aux.getInfo() == numero) {
        return aux;
      }
      aux = aux.getProx();
    }
    return null;
  }

  public NoDuplaInt pesquisaAoContrario(int numero) {
    NoDuplaInt aux = this.prim;
    while (aux != null) {
      if (aux.getInfo() == numero) {
        return aux;
      }
      aux = aux.getProx();
    }
    return null;
  }
  /*
   * remove: remove o nó que contém o valor passado. Retorna true se a
   * remoção foi bem sucedida e false caso contrário
   */

  public boolean remove(int numero) {
    NoDuplaInt aux = this.pesquisa(numero);
    if (aux == null) {
      return false;
    } else if (aux == this.prim) {
      if (aux.getProx() == null) {// falar spbre isso
        this.ult = null;
      } else {
        aux.getProx().setAnt(null);
      }
      this.prim = aux.getProx();
    } else if (aux == this.ult) {
      aux.getAnt().setProx(null);
      this.ult = aux.getAnt();
    } else {
      aux.getAnt().setProx(aux.getProx());
      aux.getProx().setAnt(aux.getAnt());
    }
    this.nElem--;
    return true;
  }

  public String toString() {
    String str = "";
    NoDuplaInt aux = this.prim;
    while (aux != null) {
      str += aux.getInfo() + "";
      aux = aux.getProx();
    }
    return str;
  }

  public String toStringAoContrario() {
    String str = "";
    NoDuplaInt aux = this.ult;
    while (aux != null) {
      str += aux.getInfo() + "";
      aux = aux.getAnt();
    }
    return str;
  }

  /*
   * Escreva um metodo para retornar o no da k-esima posicao
   */
  public NoDuplaInt getPos(int pos) {
    NoDuplaInt aux;
    if (pos < 0 || pos >= nElem) {
      return null;
    } else {
      aux = prim;
      for (int i = 0; i < pos; i++) {
        aux = aux.getProx();
      }
      return aux;
    }
  }

  /**
   * Escreva um metodo para inserir um novo no na k-esima posicao
   */
  public boolean insere(int elem, int pos) {
    NoDuplaInt novoNo, aux, ant;
    if (pos < 0 || pos > this.nElem) {
      return false;
    } else {
      novoNo = new NoDuplaInt(elem);
      if (pos == 0) {
        insereInicio(elem);
      } else if (pos == nElem) {
        insereFim(elem);
      } else {
        novoNo = new NoDuplaInt(elem);
        aux = prim;
        for (int i = 0; i < pos; i++) {
          aux = aux.getProx();
        }
        ant = aux.getAnt();
        ant.setProx(novoNo);
        novoNo.setAnt(ant);
        novoNo.setProx(aux);
        aux.setAnt(novoNo);
        this.nElem++;
      }
    }
    return true;
  }

  /*
   * Escreva um método para remover o k-ésimo nó da lista
   */
  public boolean removePos(int pos) {
    NoDuplaInt ant, aux = getPos(pos);
    if (aux == null) {
      return false;
    } else {
      if (aux == prim) { // testa se for o primeiro
        prim = aux.getProx();
        if (prim == null) {// lsita so tem um elemento
          ult = null;
        } else {
          prim.setAnt(null);
        }
      } else if (aux == ult) {// testa se for o ultimo
        ult = aux.getAnt();
        ult.setProx(null);
      } else {
        ant = aux.getAnt();
        aux = aux.getProx();
        ant.setProx(aux);
        aux.setAnt(ant);
      }
    }
    this.nElem--;
    return true;
  }

  /**
   * Escreva um método que recebe uma Lista Duplamente Encadeada (L1)
   * e concatena esta lista no final da lista chamadora (objeto do método)
   */
  public void concatena(ListaDuplaInt L1) {
    if (!L1.eVazia()) {
      if (this.eVazia()) {
        this.prim = L1.prim;
        this.ult = L1.ult;
      } else {
        this.ult.setProx(L1.prim);
        L1.prim.setAnt(this.ult);
        this.ult = L1.ult;
      }
      L1.prim = null;
      L1.ult = null;
      this.nElem = this.nElem + L1.nElem;
    }
  }

}
