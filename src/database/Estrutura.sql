DROP DATABASE IF EXISTS save_the_capybara;
CREATE DATABASE save_the_capybara;
USE save_the_capybara;
CREATE TABLE gatos(
		id INTEGER PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(100),
    raca VARCHAR(150),
    pedigree BOOLEAN,
    sexo BOOLEAN,
    preguica VARCHAR(100),
    racao VARCHAR(100),
    castrado BOOLEAN,
    peso FLOAT,
    comprimento FLOAT,
    altura FLOAT,
    idade INTEGER,
    qtd_vidas INTEGER,
    qtd_pelos INTEGER,
    filhos BOOLEAN,
    cirurgia BOOLEAN,
    nome_do_dono VARCHAR(100),
    cor_olho_direito VARCHAR(200),
    cor_olho_esquerdo VARCHAR(200),
    cor_pata_direita_dianteira VARCHAR(100),
    cor_pata_direita_traseira VARCHAR(100),
    cor_pata_esquerda_dianteira VARCHAR(100),
    cor_pata_esquerda_traseira VARCHAR(100),
    tosa BOOLEAN
    
    
	);