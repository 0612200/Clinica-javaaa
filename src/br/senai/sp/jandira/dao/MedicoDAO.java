package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MedicoDAO {

       
    private Medico medico;
    private static ArrayList<Medico> medicos = new ArrayList();
    
    private final static String ARQUIVO = "C:\\Users\\22282122\\java-projetos\\Medicos.txt";
    private final static String ARQUIVO_TEMP = "C:\\Users\\22282122\\java-projetos\\Arquivo_temp.txt";
    private final static Path PATH = Paths.get(ARQUIVO);
    private final static Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);
     
    public MedicoDAO(Medico medicos){
        this.medicos.add(medico);
    }
    
    public MedicoDAO(){
        
    }
    public static void gravar(Medico medico){
        medicos.add(medico);
        
        try {
            BufferedWriter bw = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Houve um problema ao abrir o arquivo",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
              
    }
    
    
    
    public static boolean excluir(Integer codigo){
        for(Medico m : medicos){
            if (m.getCodigo().equals(codigo)){
                medicos.remove(m);
                break;
            }
                
        }
        atualizarArquivo();
        return false;
    }
    
    private static void atualizarArquivo(){
        //reconstruir um arquivo atualizado,ou seja
        //sem o plano que foi removido
        //primeiro passo - criar uma representaçao dos arquivod que serao manipulados
        File arquivoAtual = new File(ARQUIVO);
        File arquivoTemp = new File(ARQUIVO_TEMP);
        
        try{
            //arquivo temporario
            arquivoTemp.createNewFile();
            
            //abrir o arquivo temporario para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            for(Medico m : medicos){
                bwTemp.write(m.getMedicoSeparadorPorPontoEVirgula());
                bwTemp.newLine();
            }
            //fechar o arquivo temporario
           bwTemp.close();
           
           //excluir p especialidades.txt - o arquivo atual
           arquivoAtual.delete();
           
           //renomear o arquivo temporario
           arquivoTemp.renameTo(arquivoAtual);
           
           
           
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(null,
                   "Ocorreu um erro ao criar o arquivo",
                   "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static Medico getMedico(Integer codigo){
        for(Medico m : medicos){
            if(m.getCodigo().equals(codigo)){
                return m;
            }
        }
        return null;
    }
    public static void atualizar(Medico medico){
        for(Medico m : medicos){
            if(m.getCodigo().equals(medico.getCodigo())){
                medicos.set(medicos.indexOf(m),medico);
                break;
            }
        }
        atualizarArquivo();
    }
    
        public static void getListaMedico(){
        try {
           //abrir o aplicativo para leitura(leitor)
            BufferedReader br = Files.newBufferedReader(PATH);
            
            String linha = br.readLine();
            
            while(linha ! = null && !linha.isEmpty()){
            String[] linhaVetor = linha.split(";");
            Medico novoMedico = new Medico
                   
            
        }
            
        } catch (IOException ex) {
            Logger.getLogger(MedicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
    

                   

    
    
    
    

        
    
    
    

