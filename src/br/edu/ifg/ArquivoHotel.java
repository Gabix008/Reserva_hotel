package br.edu.ifg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArquivoHotel {
	private String path;

	public ArquivoHotel(String path) {
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

	public void editar(int idHotel, String conteudo) {
		ArrayList<String> linhas = new ArrayList<String>();
		try {
			String caminho = System.getProperty("user.dir");

			FileReader fileReader = new FileReader(caminho + "/" + this.getPath());

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String linha;

			while ((linha = bufferedReader.readLine()) != null) {
				String[] hotel = linha.split(",");
				if (Integer.parseInt(hotel[0]) == idHotel) {
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

	public Map<Integer, Hotel> buscarHoteisProprietario(int idUsuario) {
		Map<Integer, Hotel> hoteis = new HashMap<>();
		try {
			String caminho = System.getProperty("user.dir");

			FileReader fileReader = new FileReader(caminho + "/" + this.getPath());

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String linha;

			while ((linha = bufferedReader.readLine()) != null) {
				String[] dados = linha.split(",");
				if (Integer.parseInt(dados[7]) == idUsuario) {
					int id = Integer.parseInt(dados[0]);
					String nome = dados[1];
					String cidade = dados[2];
					String endereco = dados[3];
					String descricao = dados[4];
					boolean pagamentoAnte = Boolean.parseBoolean(dados[5]);
					Hotel hotel = new Hotel();
					hotel.setHotel(id, nome, endereco, descricao, cidade, pagamentoAnte, idUsuario);
					hoteis.put(id, hotel);
				}
			}
			bufferedReader.close();
		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
		}
		return hoteis;
	}

	public Map<Integer, Hotel> buscarHoteis(String cidade) {
		Map<Integer, Hotel> hoteis = new HashMap<>();
		try {
			String caminho = System.getProperty("user.dir");

			FileReader fileReader = new FileReader(caminho + "/" + this.getPath());

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String linha;

			while ((linha = bufferedReader.readLine()) != null) {
				String[] dados = linha.split(",");
				if (dados[2].equals(cidade.toLowerCase())) {
					int id = Integer.parseInt(dados[0]);
					String nome = dados[1];
					String endereco = dados[3];
					String descricao = dados[4];
					boolean pagamentoAnte = Boolean.parseBoolean(dados[5]);
					int idUsuario = Integer.parseInt(dados[6]);
					Hotel hotel = new Hotel();
					hotel.setHotel(id, nome, endereco, descricao, cidade, pagamentoAnte,
							idUsuario);
					hoteis.put(id, hotel);
				}
			}
			bufferedReader.close();
		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
		}
		return hoteis;
	}

	public void buscarHotel(int id, Hotel hotel) {
		try {
			String caminho = System.getProperty("user.dir");

			FileReader fileReader = new FileReader(caminho + "/" + this.getPath());

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String linha;

			while ((linha = bufferedReader.readLine()) != null) {
				String[] dados = linha.split(",");
				if (Integer.parseInt(dados[0]) == id) {
					String nome = dados[1];
					String cidade = dados[2];
					String endereco = dados[3];
					String descricao = dados[4];
					boolean pagamentoAnte = Boolean.parseBoolean(dados[5]);
					int idUsuario = Integer.parseInt(dados[6]);
					hotel.setHotel(id, nome, endereco, descricao, cidade, pagamentoAnte, idUsuario);
				}
			}
			bufferedReader.close();
		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
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
				String[] usuario = linha.split(",");
				id = Integer.parseInt(usuario[0]);

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
				String[] usuario = linha.split(",");
				if (Integer.parseInt(usuario[0]) != id) {
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
