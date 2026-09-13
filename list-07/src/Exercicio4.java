import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Musica {
    private String titulo;
    private String artista;
    private int duracaoSegundos;

    public Musica(String titulo, String artista, int duracaoSegundos) {
        setTitulo(titulo);
        setArtista(artista);
        setDuracaoSegundos(duracaoSegundos);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public void setDuracaoSegundos(int duracaoSegundos) {
        this.duracaoSegundos = duracaoSegundos;
    }
}

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Musica> playlist = new ArrayList<>();
        int option;

        do {
            System.out.println("\nMENU DA PLAYLIST");
            System.out.println("1 - Adicionar música");
            System.out.println("2 - Buscar música por título");
            System.out.println("3 - Remover música por título");
            System.out.println("4 - Listar playlist e tempo total");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1: {
                    System.out.print("Informe o título da música: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Informe o artista: ");
                    String artista = scanner.nextLine();

                    System.out.print("Informe a duração em segundos: ");
                    int duracaoSegundos = Integer.parseInt(scanner.nextLine());

                    Musica musica = new Musica(titulo, artista, duracaoSegundos);
                    playlist.add(musica);

                    System.out.println("Música adicionada com sucesso.");
                    break;
                }
                case 2: {
                    System.out.print("Informe o título da música que deseja buscar: ");
                    String titulo = scanner.nextLine();
                    boolean encontrada = false;

                    for (Musica musica : playlist) {
                        if (musica.getTitulo().equals(titulo)) {
                            System.out.println("Título: " + musica.getTitulo());
                            System.out.println("Artista: " + musica.getArtista());
                            System.out.println("Duração: " + musica.getDuracaoSegundos() + " segundos");
                            encontrada = true;
                            break;
                        }
                    }

                    if (!encontrada) {
                        System.out.println("A música não está na playlist.");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Informe o título da música que deseja remover: ");
                    String titulo = scanner.nextLine();
                    boolean removida = false;

                    for (int i = 0; i < playlist.size(); i++) {
                        if (playlist.get(i).getTitulo().equals(titulo)) {
                            playlist.remove(i);
                            removida = true;
                            break;
                        }
                    }

                    if (removida) {
                        System.out.println("Música removida com sucesso.");
                    } else {
                        System.out.println("A música não está na playlist.");
                    }
                    break;
                }
                case 4: {
                    int tempoTotal = 0;

                    if (playlist.isEmpty()) {
                        System.out.println("A playlist está vazia.");
                    } else {
                        System.out.println("\nPLAYLIST");

                        for (Musica musica : playlist) {
                            System.out.println("Título: " + musica.getTitulo());
                            System.out.println("Artista: " + musica.getArtista());
                            System.out.println("Duração: " + musica.getDuracaoSegundos() + " segundos");
                            System.out.println("----------------------");
                            tempoTotal += musica.getDuracaoSegundos();
                        }
                    }

                    int minutos = tempoTotal / 60;
                    int segundos = tempoTotal % 60;

                    System.out.println("Tempo total da playlist: " + minutos + " minutos e " + segundos + " segundos");
                    break;
                }
                case 5: {
                    System.out.println("Programa encerrado.");
                    break;
                }
                default: {
                    System.out.println("Opção inválida.");
                    break;
                }
            }
        } while (option != 5);

        scanner.close();
    }
}
