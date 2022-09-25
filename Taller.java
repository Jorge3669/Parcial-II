package parcial;
import java.util.Scanner;
public class Taller {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
            Vehículo carro[]= new Vehículo[5];
            int y=0;
            for(int i=0;i<5;i++){
                carro[i]=new Vehículo();
            }
            System.out.println("...Sistema de registro de vehículos...");
            System.out.println("ENTER para continuar...");
            
            while (y<5){
                leer.nextLine();
                System.out.println("No. de Registro"+(y+1));
                System.out.println("Marca del Carro");
                carro[y].setMarca(leer.nextLine());               
                System.out.println("Modelo del Carro");
                carro[y].setModelo(leer.nextLine());
                System.out.println("Color del Carro");
                carro[y].setColor(leer.nextLine());
                System.out.println("Año del Carro");
                carro[y].setAnio(leer.nextLine());
                System.out.println("Precio del Carro");
                carro[y].setPrecio(leer.nextInt());
                System.out.println("\n");
                y++;
            }
            y=0;
            while (y<5){
                System.out.println("Carro No."+(y+1));
                System.out.println("Marca: "+carro[y].getMarca());
                System.out.println("Modelo: "+carro[y].getModelo());
                System.out.println("Color: "+carro[y].getColor());
                System.out.println("Año: "+carro[y].getAnio());
                System.out.println("Marca: "+carro[y].getPrecio()+"\n");
            }
    }
}
