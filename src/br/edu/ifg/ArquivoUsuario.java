package br.edu.ifg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ArquivoUsuario {
	private String path;

	public ArquivoUsuario(String path) {
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

	public void leitor() {
		try {
			// Pega o caminho do arquivo
			String caminho = System.getProperty("user.dir");

			// Cria o FileReader com o nome do arquivo//ler arquivos de forma assincrona//
			FileReader fileReader = new FileReader(caminho + "/" + this.getPath());

			// Cria o BufferedReader para leitura do arquivo
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String linha;

			// Lê cada linha do arquivo e imprime
			while ((linha = bufferedReader.readLine()) != null) {

			}

			// Fecha o BufferedReader
			bufferedReader.close();
		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
		}
	}

	public void editar(int idUsuario, String conteudo) {
		ArrayList<String> linhas = new ArrayList<String>();
		try {
			String caminho = System.getProperty("user.dir");

			FileReader fileReader = new FileReader(caminho + "/" + this.getPath());

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String linha;

			while ((linha = bufferedReader.readLine()) != null) {
				String[] usuario = linha.split(",");
				if (Integer.parseInt(usuario[0]) == idUsuario) {
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

	public void realizaLoginUsuario(Usuario user, String emailUsuaraio, String senhaUsuaraio) {
		try {
			String caminho = System.getProperty("user.dir");

			FileReader fileReader = new FileReader(caminho + "/" + this.getPath());

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String linha;
			while ((linha = bufferedReader.readLine()) != null) {
				String[] usuario = linha.split(",");
				if (usuario[10].equals(senhaUsuaraio) && emailUsuaraio.equals(usuario[6])) {
					user.setId(Integer.parseInt(usuario[0]));
					user.setNome(usuario[1]);
					user.setCpf(usuario[2]);
					user.setDataNasc(new SimpleDateFormat(usuario[3]));
					user.setEndereco(usuario[4]);
					user.setTelefone(usuario[5]);
					user.setEmail(usuario[6]);
					user.setSexo(usuario[7].equals("MASCULINO") ? Sexo.MASCULINO : Sexo.FEMININO);
					user.setPermissao(usuario[8].equals("CLIENTE") ? Permissao.CLIENTE : Permissao.PROPRIETARIO);
					user.setSenha(usuario[10]);
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
		return 0;
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