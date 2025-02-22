public class Semestre {
    private String nome;
    private boolean ativo;
    private List<Observer> observers = new ArrayList<>();

    public Semestre(String nome, boolean ativo) {
        this.nome = nome;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void addObserver (Observer observer)
    (
        observadores.add();
    )
    
   public void removerObservador (Observer observer){
    observadores.remover(Observer);
   }


    public void natifi (){
        for (int i = 0 ; < observadores.size); i++) {
            observadores.get(i).update(ativo); "observer"
        }
    }
}
