/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6.view;
import java.util.List;
import kata6.model.Histogram;
import kata6.model.Mail;

/**
 *
 * @author niko
 */
public class MailHistogramBuilder {
    
    public static Histogram<String> build (List<Mail> mail) {
        Histogram<String> histo = new Histogram<>();
        
        for (int i=0; i<mail.size(); i++) {
            histo.increment(mail.get(i).getdomain());
        }
        return histo;
    }
    
}
