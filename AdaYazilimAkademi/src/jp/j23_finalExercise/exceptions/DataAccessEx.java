package jp.j23_finalExercise.exceptions;

public class DataAccessEx extends Exception{
    String mensaje;

    public DataAccessEx(String mensaje) {
        this.mensaje = mensaje;
    }
            
}
