/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import database.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Gato;

/**
 *
 * @author 94616
 */
public class GatosDAO {

    public ArrayList<Gato> retornarTodos() {
        ArrayList<Gato> gatos = new ArrayList<>();
        String sql = "SELECT * FROM gatos;";
        Connection conexao = Conexao.conectar();
        if (conexao != null) {
            try {
                Statement statement = conexao.createStatement();
                statement.execute(sql);
                ResultSet resultado = statement.getResultSet();
                while (resultado.next()) {
                    Gato gato = new Gato();
                    gato.setId(resultado.getInt("id"));
                    gato.setAltura(resultado.getFloat("altura"));
                    gato.setCastrado(resultado.getBoolean("castrado"));
                    gato.setCirurgia(resultado.getBoolean("cirurgia"));
                    gato.setComprimento(resultado.getFloat("comprimento"));
                    gato.setCorOlhoDireito(resultado.getString("cor_olho_direito"));
                    gato.setCorOlhoEsquerdo(resultado.getString("cor_olho_esquerdo"));
                    gato.setCorPataDireitaDianteira(resultado.getString("cor_pata_direita_dianteira"));
                    gato.setCorPataDireitaTraseira(resultado.getString("cor_pata_direita_traseira"));
                    gato.setCorPataEsquerdaDianteira(resultado.getString("cor_pata_esquerda_dianteira"));
                    gato.setCorPataEsquerdaTraseira(resultado.getString("cor_pata_esquerda_traseira"));
                    gato.setFilhos(resultado.getBoolean("filhos"));
                    gato.setIdade(resultado.getInt("idade"));
                    gato.setNome(resultado.getString("nome"));
                    gato.setNomedoDono(resultado.getString("nome_do_dono"));
                    gato.setPedigree(resultado.getBoolean("pedigree"));
                    gato.setPeso(resultado.getFloat("peso"));
                    gato.setPreguica(resultado.getString("preguica"));
                    gato.setQtdPelos(resultado.getInt("qtd_de_ pelos"));
                    gato.setQtdVidas(resultado.getInt("qtd_de_vidas"));
                    gato.setRaca(resultado.getString("raca"));
                    gato.setRacao(resultado.getString("racao"));
                    gato.setSexo(resultado.getBoolean("sexo"));
                    gato.setTosa(resultado.getBoolean("tosa"));
                    gatos.add(gato);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Conexao.desconectar();
            }
        }
        return gatos;
    }
    public int inserir(Gato objeto) {
        String sql = "INSERT INTO gatos"
                + "\n(id,nome,raca,pedigree,sexo,preguica,racao,castrado,peso,comprimento,altura,idade,qtd_vidas,qtd_pelos,filhos,cirurgia,nome_do_dono,cor_olho_direito,cor_olho_esquerdo,cor_pata_direita_dianteira,cor_pata_direita_traseira,cor_pata_esquerda_dianteira,cor_pata_esquerda_traseira,tosa)"
                + "\nVALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        Connection conexao = Conexao.conectar();
        if (conexao != null) {
            try {
                PreparedStatement substituidor;
                substituidor = conexao
                        .prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                substituidor.setString(1, objeto.getNome());
                substituidor.setString(2, objeto.getTipo());
                substituidor.setFloat(3, objeto.getPeso());
                substituidor.setDate(4, objeto.getValidade());
                substituidor.setBoolean(5, objeto.isDisponivel());
                substituidor.execute();

                ResultSet resultado = substituidor.getGeneratedKeys();
                if (resultado.next()) {
                    return resultado.getInt(1);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Conexao.desconectar();
            }
        }
        return 0;
    }
    
    public int alterar(Gato objeto) {
        String sql = "UPDATE gatos SET"
                + "\nnome = ?,"
                + "\nraca = ?,"
                + "\npedigree = ?,"
                + "\nsexo = ?,"
                + "\npreguica = ?"
                + "\nracao = ?"
                + "\ncastrado = ?"
                + "\npeso = ?"
                + "\ncomprimento = ?"
                + "\naltura = ?"
                + "\nidade = ?"
                + "\nqtd_vidas = ?"
                + "\nqtd_pelos = ?"
                + "\nfilhos = ?"
                + "\ncirurgia = ?"
                + "\nnome_do_dono = ?"
                + "\ncor_olho_direito = ?"
                + "\ncor_olho_esquerdo = ?"
                + "\ncor_pata_direita_dianteira = ?"
                + "\ncor_pata_direita_traseira = ?"
                + "\ncor_pata_esquerda_dianteira = ?"
                + "\ncor_pata_esquerda_traseira = ?"
                + "\ntosa = ?"                
                + "\nWHERE id = ?";

        Connection conexao = Conexao.conectar();
        if (conexao != null) {
            try {
                PreparedStatement alterador = conexao.prepareStatement(sql);
                alterador.setString(1, objeto.getNome());
                alterador.setString(2, objeto.getRaca());
                alterador.setBoolean(3, objeto.isPedigree());
                alterador.setBoolean(4, objeto.isSexo());
                alterador.setString(5, objeto.getPreguica());
                alterador.setString(6, objeto.getRacao());
                alterador.setBoolean(7, objeto.isCastrado());
                alterador.setFloat(8, objeto.getPeso());
                alterador.setFloat(9, objeto.getComprimento());
                alterador.setFloat(10,objeto.getAltura());
                alterador.setInt(11, objeto.getIdade());
                alterador.setInt(12, objeto.getQtdVidas());
                alterador.setInt(13, objeto.getQtdPelos());
                alterador.setBoolean(14, objeto.isFilhos());
                alterador.setBoolean(15, objeto.isCirurgia());
                alterador.setString(16, objeto.getNomedoDono());
                alterador.setString(17, objeto.getCorOlhoDireito());
                alterador.setString(18, objeto.getCorOlhoEsquerdo());
                alterador.setString(19, objeto.getCorPataDireitaDianteira());
                alterador.setString(20, objeto.getCorPataDireitaTraseira());
                alterador.setString(21, objeto.getCorPataEsquerdaDianteira());
                alterador.setString(22, objeto.getCorPataEsquerdaTraseira());
                alterador.setBoolean(23, objeto.isTosa);
                alterador.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Conexao.desconectar();
            }

        }

        return 0;

        public int excluir(int id) {
        String sql = "DELETE FROM gatos WHERE id = ?";
        Connection conexao = Conexao.conectar();
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.desconectar();
        }

        return 0;
    }
        public Gato buscarPorId(int id) {
        Gato produto = null;
        String sql = "SELECT *FROM produtos WHERE id= ?";
        Connection conexao = Conexao.conectar();
        if (conexao != null) {
            try {
                PreparedStatement colocador = conexao.prepareStatement(sql);
                colocador.setInt(1, id);
                colocador.execute();
                ResultSet resultado = colocador.getResultSet();
                if (resultado.next()) {
                    Gato = new Gato();
                    Gato.setId(resultado.getInt("id"));
                    Gato.setNome(resultado.getString("nome"));
                    Gato.setRaca(resultado.getString("raca"));
                    Gato.setPedigree(resultado.getBoolean("pedigree"));
                    Gato.setSexo(resultado.getBoolean("sexo"));
                    Gato.setPreguica(resultado.getString("preguica"));
                    Gato.setRacao(resultado.getString("racao"));
                    
                    
                    
                    
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Conexao.desconectar();
            }

        }
        return produto;
    }
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    

