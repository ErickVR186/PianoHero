package clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringJoiner;

public class BaseDeDatos {
    String cancion;
    String nombreCancion;
    String puntuaje;
    public String titanicPuntuaje;
    public String perfectPuntuaje;
    public String wednesdayPuntuaje;
    
    /////
    Object[] Filas;
    String linea;
    String[] valores;
    
    
    
    public String getCancion(){
        return cancion;
    }
    public void setCancion(String cancion){
        this.cancion=cancion;
    }
    
    public String getNombreCancion(){
        return nombreCancion;
    }
    public void setNombreCancion(String nombreCancion){
        this.nombreCancion=nombreCancion;
    }
    
    public String getPuntuaje(){
        return puntuaje;
    }
    public void setPuntuaje(String puntuaje){
        this.puntuaje = puntuaje;
    }
    
    public void crearArchivo(){
        
        try{
            File directorios = new File("c:/PianoHero");
            if (!directorios.exists()) {
                if (directorios.mkdirs()) {
                    System.out.println("Multiples directorios fueron creados");
                    File objetoArchivo = new File ("c:/PianoHero/Jugador_1.txt");
                    if(objetoArchivo.createNewFile()){
                        System.out.println("Archivo Creado" + objetoArchivo.getName());
                        setCancion("1");
                        setNombreCancion("Titanic");
                        setPuntuaje("0");
                        agregarDatos();
                        setCancion("2");
                        setNombreCancion("Perfect");
                        setPuntuaje("0");
                        agregarDatos();
                        setCancion("3");
                        setNombreCancion("Wednesday");
                        setPuntuaje("0");
                        agregarDatos();
                    }else{
                        System.out.println("El Archivo ya existe");
                    }
                } else {
                    System.out.println("Error al crear directorios");
                }
            }
        }catch(Exception e){
            System.out.println("Ocurrio un error al crear el archivo");
        }
    }
    
    public void agregarDatos(){
        try{
            FileWriter escribir =new FileWriter("c:/PianoHero/Jugador_1.txt",true);
            escribir.write(getCancion());
            escribir.write(",");
            escribir.write(getNombreCancion());
            escribir.write(",");
            escribir.write(getPuntuaje());
            escribir.write("\n");
            escribir.close();    
        }catch(Exception e){
            System.out.println("Ocurrio un error al ingresar los datos al archivo");
        }
    }
    
    public void obtenerDatos(){
        String nombreArchivo = "c:/PianoHero/Jugador_1.txt";    //Nombre o ruta del archivo
        File file = new File(nombreArchivo);
        try{
            BufferedReader leer = new BufferedReader(new FileReader(file));
            //String primeraLinea = leer.readLine().trim();
            Filas = leer.lines().toArray();           
            linea = Filas[0].toString().trim();
            valores = linea.split(",");
            titanicPuntuaje=valores[2];
            System.out.println(titanicPuntuaje);
            linea = Filas[1].toString().trim();
            valores = linea.split(",");
            perfectPuntuaje=valores[2];
            System.out.println(perfectPuntuaje);
            linea = Filas[2].toString().trim();
            valores = linea.split(",");
            wednesdayPuntuaje=valores[2];
            System.out.println(wednesdayPuntuaje);
        }catch(Exception e){
            System.out.println("Ocurrio un error: " +e.toString());
        }
    }
    public String getTitanicPuntuaje(){
        return titanicPuntuaje;
    }
    public void setTitanicPuntuaje(String puntuaje){
        this.titanicPuntuaje = puntuaje;
    }
    
    public String getPerfectPuntuaje(){
        return perfectPuntuaje;
    }
    public void setPerfectPuntuaje(String puntuaje){
        this.perfectPuntuaje = puntuaje;
    }
    
    
    public String getWednesdayPuntuaje(){
        return wednesdayPuntuaje;
    }
    public void setWednesdayPuntuaje(String puntuaje){
        this.wednesdayPuntuaje = puntuaje;
    }
    
    
    public void actualizarDatos(){
        ////////////////
        String nombreArchivo = "c:/PianoHero/Jugador_1.txt";    //Nombre o ruta del archivo
        File file = new File(nombreArchivo);
        try{
            BufferedReader leer = new BufferedReader(new FileReader(file));
            //String primeraLinea = leer.readLine().trim();
            Filas = leer.lines().toArray();  
            for (int i = 0; i < Filas.length; i++) {
                linea = Filas[i].toString().trim();
                valores = linea.split(",");
            }
            //System.out.println(valores[1]);
        }catch(Exception e){
            System.out.println("Error al leer datos");
        }
        /*
        //Limpieza
        try{
            PrintWriter writer = new PrintWriter("Jugador_1.txt");
            writer.print("");
            writer.close();
        }catch(Exception e){
            System.out.println("Ocurrio un problema aal limpiar archivo");
        }
        */
        
        
        
        //Actualizando los datos
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File ("c:/PianoHero/Jugador_1.txt")))){
            Object obj;
            for (int row = 0; row < Filas.length; row++) {
                StringJoiner joiner = new StringJoiner(",");
                for (int col = 0; col < valores.length; col++) {
                    linea = Filas[row].toString().trim();
                    valores = linea.split(",");
                    //System.out.println(valores[col]);
                    if((row == 0)&&(col == 2)){
                        obj = titanicPuntuaje;
                    }else if((row == 1)&&(col == 2)){
                        obj = perfectPuntuaje;
                    }else if((row == 2)&&(col == 2)){
                        obj = wednesdayPuntuaje;
                    }else{
                        obj = valores[col];
                    }
                    
                    String value = obj.toString();
                    joiner.add(value);
                }
                System.out.println(joiner.toString());
                bw.write(joiner.toString());
                bw.newLine();
            }
        }catch(Exception e){
            System.out.println("Ocurrio un error al actulizar datos");
        }
    }
            
    
}
