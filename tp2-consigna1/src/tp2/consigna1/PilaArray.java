package tp2.consigna1;

public class PilaArray {
                
    private int[] array;
    private int cima;                
        
    public PilaArray(){    
        array = new int[10];
        cima = -1;
    }
    
    public boolean estaVacia() {
        return cima == -1;
    }
    
    public void apilarElemento(int x) {
        if(cima + 1 == array.length)
            duplicarArray();
        array[++cima] = x;
    }
    
    public int retirarElemento() {                
        return array[cima--];                       
    }
    
    private void duplicarArray() {
        
        int capacidad = array.length;
        int[] arrayOriginal = array;
        array = new int[capacidad*2];
        
        for(int i = 0; i < capacidad; i++)
            array[i] = arrayOriginal[i];
        
        arrayOriginal = null;
    }    
}