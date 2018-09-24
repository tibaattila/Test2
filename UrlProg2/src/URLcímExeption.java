/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tiba
 */
public class URLcímExeption extends Exception{
    
    
    int hibakód;

    public URLcímExeption(int hibakód, String message) {
        super(message);
        this.hibakód = hibakód;
    }

    public int getHibakód() {
        return hibakód;
    }
    
    
    
}
