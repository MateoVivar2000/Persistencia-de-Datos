package modelo;

public class Productos_Modelo {
    int ID;
    String producto,material;
    Float tiempoDeImpresion;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Float getTiempoDeImpresion() {
        return tiempoDeImpresion;
    }

    public void setTiempoDeImpresion(Float tiempoDeImpresion) {
        this.tiempoDeImpresion = tiempoDeImpresion;
    }
    
}
