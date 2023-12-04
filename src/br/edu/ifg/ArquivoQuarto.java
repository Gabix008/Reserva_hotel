package br.edu.ifg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.Date;

public class ArquivoQuarto {
	private String path;

	public ArquivoQuarto(String path) {
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

	public void verificarDisponibilidade(SimpleDateFormat dataIncio, SimpleDateFormat dataFim, Hotel hotel,
			Quarto quarto) throws ParseException {
		Date data = new Date();
		Date dataInc = dataIncio.parse(dataIncio.format(data));
		Date dataF = dataFim.parse(dataFim.format(data));
		try {
			String caminho = System.getProperty("user.dir");

			FileReader fileReader = new FileReader(caminho + "/" + this.getPath());

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String linha;

			while ((linha = bufferedReader.readLine()) != null) {
				String[] dados = linha.split(",");
				SimpleDateFormat dataEntrada = new SimpleDateFormat(dados[2]);
				SimpleDateFormat dataSaida = new SimpleDateFormat(dados[3]);

				Date dataEnt = dataEntrada.parse(dataEntrada.format(data));
				Date dataSai = dataSaida.parse(dataFim.format(data));

				if (dataEnt.compareTo(dataInc) >= 0 && dataSai.compareTo(dataF) <= 0) {
					int id = Integer.parseInt(dados[0]);
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

	public void editar(int idQuarto, String conteudo) {
		ArrayList<String> linhas = new ArrayList<String>();
		try {
			String caminho = System.getProperty("user.dir");

			FileReader fileReader = new FileReader(caminho + "/" + this.getPath());

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String linha;

			while ((linha = bufferedReader.readLine()) != null) {
				String[] quarto = linha.split(",");
				if (Integer.parseInt(quarto[0]) == idQuarto) {
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
