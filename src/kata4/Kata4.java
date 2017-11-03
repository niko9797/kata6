/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4;

/**
 *
 * @author Entrar
 */
public class Kata4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Histogram histogram = new Histogram();
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("nikorodriguez.com");
        histogram.increment("nikorodriguez.com");
        histogram.increment("nikorodriguez.com");
        histogram.increment("nikorodriguez.com");
        HistogramDisplay histogramdisp = new HistogramDisplay (histogram);
        histogramdisp.execute();
        
    }
    
}
