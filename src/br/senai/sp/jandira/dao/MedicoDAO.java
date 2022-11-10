package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.io.BufferedWriter;
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
     
    public MedicoDAO(Medico medico){
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
            JOptionPane.showMessageDialog(parentComponent, medico);
        }
              
    }
    
    
    
    }
    
    

