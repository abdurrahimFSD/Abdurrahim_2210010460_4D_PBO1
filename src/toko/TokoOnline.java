package toko;

// class TokoOnline
public class TokoOnline {
    // Attributes dengan Encapsulation
    private String idToko;
    private String namaToko;
    
    // Constructor
    public TokoOnline(String idToko, String namaToko) {
        this.idToko = idToko;
        this.namaToko = namaToko;
    }
    
    // Setter atau Mutator
    public void setIdToko(String idToko) {
        this.idToko = idToko;
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }
    
    // Getter atau Accessor
    public String getIdToko() {
        return idToko;
    }

    public String getNamaToko() {
        return namaToko;
    }
    
    // Method tokoInfo()
    public String tokoInfo() {
        return "Id Toko\t\t: " + getIdToko() +
               "\nNama Toko\t: " + getNamaToko();
    }
    
    // Polymorphism Overloading
    public String tokoInfo(String metodePembayaran) {
        return tokoInfo() + 
               "\nMetode Pembayaran: " + metodePembayaran;
    }
    
}
