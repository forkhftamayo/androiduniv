package sv.edu.ucad.fundamentosjava;

/**
 * Created by htamayo on 08-18-15.
 * realiza operaciones entre numeros complejos
 */
public class Complejo {
    private double real, imaginario;

    public Complejo(double real, double imaginario){
        this.real = real;
        this.imaginario = imaginario;

    }//fin del constructor de la clase

    public String toCadena(){
        return real + "+"+imaginario+"i";
    }//fin del metodo toCadena

    /*
        *suma dos complejos envueltos(wrapper) en un objeto denominado Complejo
        *@param Complejo v
         */
    public void suma(Complejo v){
        real = real + v.real;
        imaginario = imaginario+v.imaginario;
    }//fin del método suma

}//fin de la clase Complejo
