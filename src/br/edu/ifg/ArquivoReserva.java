package br.edu.ifg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ArquivoReserva {
    private String path;

    public ArquivoReserva(String path) {
        super();
        this.path = path;
    }

    public void cadastrar(String linha) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(this.getPath(), true))) {
            bw.write(linha);
            bw.newLine();

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo: " + e.getMessage());
        }
    }

    public void buscarTodos(Hotel hotel, int idHotel) {
        ArrayList<String> linhas = new ArrayList<String>();
        Map<Integer, Quarto> quartos = new HashMap<>();
        try {

            String caminho = System.getProperty("user.dir");

            FileReader fileReader = new FileReader(caminho + "/" + this.getPath());

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha;

            while ((linha = bufferedReader.readLine()) != null) {
                String[] dados = linha.split(",");
                if (Integer.parseInt(dados[6]) == idHotel) {
                    int id = Integer.parseInt(dados[0]);
                    String descricao = dados[1];
                    int qtdCamaCsal = Integer.parseInt(dados[2]);
                    int qtdCamaSolteiro = Integer.parseInt(dados[3]);
                    boolean disponivel = Boolean.parseBoolean(dados[4]);
                    double preco = Double.parseDouble(dados[5]);
                    Quarto quarto = new Quarto();
                    quarto.setQuarto(id, preco, descricao, disponivel, qtdCamaCsal, qtdCamaSolteiro, idHotel);
                    quartos.put(id, quarto);
                }

            }
            hotel.setQuartos(quartos);
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public void buscarQuartosDisponiveis(String cidade, String dataEntrada, String dataSaida) {

    }

    public boolean verificarDisponibilidade(SimpleDateFormat dataIncio, SimpleDateFormat dataFim, Hotel hotel,
            Quarto quarto) throws ParseException {
        Date data = new Date();
        boolean status = true;
        Date dataInc = dataIncio.parse(dataIncio.format(data));
        Date dataF = dataFim.parse(dataFim.format(data));
        try {
            String caminho = System.getProperty("user.dir");

            FileReader fileReader = new FileReader(caminho + "/" + this.getPath());

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha;

            while ((linha = bufferedReader.readLine()) != null) {
                String[] dados = linha.split(",");
                System.out.println(dados[2]);
                SimpleDateFormat dataEntrada = new SimpleDateFormat(dados[2]);
                SimpleDateFormat dataSaida = new SimpleDateFormat(dados[3]);

                Date dataEnt = dataEntrada.parse(dataEntrada.format(data));
                Date dataSai = dataSaida.parse(dataFim.format(data));
                System.out.println(dataEnt);

                if (dataEnt.compareTo(dataInc) >= 0 && dataSai.compareTo(dataF) <= 0
                        && quarto.getId() == Integer.parseInt(dados[6])) {
                    status = false;
                }

            }
            bufferedReader.close();

            return status;
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }
        return true;
    }

    public void buscarQuarto(Quarto quarto, int id) {
        ArrayList<String> linhas = new ArrayList<String>();
        try {
            String caminho = System.getProperty("user.dir");

            FileReader fileReader = new FileReader(caminho + "/" + this.getPath());

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha;

            while ((linha = bufferedReader.readLine()) != null) {
                String[] dados = linha.split(",");
                if (Integer.parseInt(dados[0]) == id) {
                    String descricao = dados[1];
                    int qtdCamaCsal = Integer.parseInt(dados[2]);
                    int qtdCamaSolteiro = Integer.parseInt(dados[3]);
                    boolean disponivel = Boolean.parseBoolean(dados[4]);
                    double preco = Double.parseDouble(dados[5]);
                    int idHotel = Integer.parseInt(dados[6]);
                    quarto.setQuarto(id, preco, descricao, disponivel, qtdCamaCsal, qtdCamaSolteiro, idHotel);
                }

            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public void editar(int idReserva, String conteudo) {
        ArrayList<String> linhas = new ArrayList<String>();
        try {
            String caminho = System.getProperty("user.dir");

            FileReader fileReader = new FileReader(caminho + "/" + this.getPath());

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha;

            while ((linha = bufferedReader.readLine()) != null) {
                String[] quarto = linha.split(",");
                if (Integer.parseInt(quarto[0]) == idReserva) {
                    String novaLinha = conteudo;
                    linhas.add(novaLinha);
                } else {
                    linhas.add(linha);
                }

            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(this.getPath()))) {
            for (String linha : linhas) {
                bw.write(linha);
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo: " + e.getMessage());
        }
    }

    public int novoID() {
        try {
            int id = 0;

            String caminho = System.getProperty("user.dir");
            FileReader fileReader = new FileReader(caminho + "/" + this.getPath());
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha;

            while ((linha = bufferedReader.readLine()) != null) {
                String[] quarto = linha.split(",");
                id = Integer.parseInt(quarto[0]);

            }

            bufferedReader.close();
            return (id + 1);
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }
        return 1;
    }

    public Map<Integer, Reserva> getReservas(int idUsuario, Usuario usuario) {
        Map<Integer, Reserva> reservas = new HashMap<Integer, Reserva>();

        try {
            String caminho = System.getProperty("user.dir");

            FileReader fileReader = new FileReader(caminho + "/" + this.getPath());

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha;

            while ((linha = bufferedReader.readLine()) != null) {
                String[] dados = linha.split(",");
                if (Integer.parseInt(dados[5]) == idUsuario) {
                    int id = Integer.parseInt(dados[0]);
                    double valor = Double.parseDouble(dados[1]);
                    SimpleDateFormat dataInicio = new SimpleDateFormat(dados[2]);
                    SimpleDateFormat dataFim = new SimpleDateFormat(dados[3]);
                    boolean pago = Boolean.parseBoolean(dados[4]);
                    int idHotel = Integer.parseInt(dados[6]);
                    int idQuarto = Integer.parseInt(dados[7]);
                    Hotel hotel = new Hotel();
                    hotel.buscarHotel(idHotel);
                    Quarto quarto = new Quarto();
                    quarto.buscar(idQuarto);
                    Reserva reserva = new Reserva();
                    reserva.setReserva(id, dataInicio, dataFim, valor, usuario, hotel, quarto);
                }

            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }

        return reservas;
    }

    public void excluir(int id) {
        ArrayList<String> linhas = new ArrayList<String>();
        try {
            String caminho = System.getProperty("user.dir");

            FileReader fileReader = new FileReader(caminho + "/" + this.getPath());

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha;

            while ((linha = bufferedReader.readLine()) != null) {
                String[] quarto = linha.split(",");
                if (Integer.parseInt(quarto[0]) != id) {
                    linhas.add(linha);
                }

            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(this.getPath()))) {
            for (String linha : linhas) {
                bw.write(linha);
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo: " + e.getMessage());
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
