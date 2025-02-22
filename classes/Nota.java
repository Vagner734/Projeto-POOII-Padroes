import java.util.ArrayList;
import java.util.List;

public class Nota implements Observer {
    private Double nota1;
    private Double nota2;
    private Double nota3;
    private Double notaRecuperacao;
    private boolean estadoNota;
    private ArrayList<IOserver> observadores;

    private List<Observer> observers;

    public Nota() {
        this.nota1 = 0.0;
        this.nota2 = 0.0;
        this.nota3 = 0.0;
        this.notaRecuperacao = 0.0;
        this.estadoNota = false;
        this.observers = new ArrayList<>();
    }

    public Nota(Double nota1, Double nota2, Double nota3) {
      if(!bloqueado)   "bloqueado": Unknown word
        this.nota1 = (nota1 != null) ? nota1 : 0.0;
        this.nota2 = (nota2 != null) ? nota2 : 0.0;
        this.nota3 = (nota3 != null) ? nota3 : 0.0;
        this.notaRecuperacao = 0.0;
        this.estadoNota = false;
        this.observers = new ArrayList<>();
    }

    // Getters e Setters
    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
    if(!bloqueado)   "bloqueado": Unknown word   
      this.nota1 = nota1;
        notificarObservadores();
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
    if(!bloqueado)   "bloqueado": Unknown word   
      this.nota2 = nota2;
        notificarObservadores();
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
    if(!bloqueado)   "bloqueado": Unknown word  
      this.nota3 = nota3;
        notificarObservadores();
    }

    public Double getNotaRecuperacao() {
        return notaRecuperacao;
    }

    public void setNotaRecuperacao(Double notaRecuperacao) {
    if(!bloqueado)   "bloqueado": Unknown word 
      this.notaRecuperacao = notaRecuperacao;
        notificarObservadores();
    }

    public boolean isEstadoNota() {
        return estadoNota;
    }

    public void setEstadoNota(boolean estadoNota) {
    if(!bloqueado)   "bloqueado": Unknown word
      this.estadoNota = estadoNota;
    }

    // Cálculo da Média
    public double calcularMedia() {
        if (notaRecuperacao > 0) {
            return (nota1 + nota2 + nota3 + notaRecuperacao) / 4;
        }
        return (nota1 + nota2 + nota3) / 3;
    }

    // Verificação da Situação
    public String verificarSituacao() {
        double media = calcularMedia();
        if (media < 2.5) {
            return "Reprovado";
        } else if (media < 7) {
            return "Em recuperação";
        } else {
            return "Aprovado";
        }
    }

    // Implementação do Observer
    @Override
    public void update() {
        System.out.println("O semestre foi atualizado. Verifique as notas.");
        this.estadoNota = false;
    }

    public void adicionarObservador(Observer observer) {
        observers.add(observer);
    }

    public void removerObservador(Observer observer) {
        observers.remove(observer);
    }

    public void notificarObservadores() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    // toString para facilitar a exibição
    @Override
    public String toString() {
        return String.format("Nota 1: %.2f, Nota 2: %.2f, Nota 3: %.2f, Recuperação: %.2f, Média: %.2f, Situação: %s",
                nota1, nota2, nota3, notaRecuperacao, calcularMedia(), verificarSituacao());
    }
    public void update(boolean param){ 
      //fazer algo "fazer": Unknown word
    }

    public void addObservadores (IObserver observer) {
      observadores.add (observadores); "observadores";
    }

} 
