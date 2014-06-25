package de.hsos.richwps.dsl.api.exceptions;

/**
 *
 * @author dalcacer
 * @version draft
 */
public class UnsupportedSyntaxException extends Exception{
 
    
    public UnsupportedSyntaxException(){
    }
    
    public UnsupportedSyntaxException(String message){
       super(message);
    }
    
    public UnsupportedSyntaxException(Throwable cause){
        super(cause);
    }
    
    public UnsupportedSyntaxException(String message, Throwable cause){
        super(message,cause);
    }
}
