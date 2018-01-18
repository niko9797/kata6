/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6.controller;

import java.io.IOException;
import java.util.List;
import kata6.model.Histogram;
import kata6.model.Mail;
import kata6.view.HistogramDisplay;
import kata6.view.HistogramBuilder;
import kata6.view.MailListReader;

/**
 *
 * @author Entrar
 */
public class Kata6 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws Exception {
        Kata6 kata6 = new Kata6();
        kata6.execute();
        
    }
    
    private String nameFile;
    private List<Mail> mailList;
    private Histogram<String> histogram;
    private List<Mail> listMail;
    
    private Histogram<String> domains;
    private Histogram<Character> letters;
    private HistogramBuilder<Mail> builder;



    
    private void execute () throws Exception {
        input();
        process();
        output();
    }
    
    private void input() throws IOException {
        nameFile = "/home/niko/NetBeansProjects/Kata6/src/kata6/controller/emails.txt";
        listMail = MailListReader.read(nameFile); 
    }
    
    private void process() throws Exception {
        
            HistogramBuilder<Mail> builder = new HistogramBuilder<>(listMail);
            
                domains = builder.build(new Attribute<Mail, String>() {
            @Override
            public String get(Mail item) {
                return item.getMail().split("@")[1];
            }
        });
        
        letters = builder.build(new Attribute<Mail, Character>() {
            @Override
            public Character get(Mail item) {
                return item.getMail().charAt(0);
            }
});
    
    }
    
    private void output() {
    new HistogramDisplay(domains, "Domains").execute();
    new HistogramDisplay(letters, "First character").execute();
    
    
    }
    
}
