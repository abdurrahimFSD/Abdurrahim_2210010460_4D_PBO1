package toko;

// Inheritance atau subclass TokoOnlineDetail dari superclass TokoOnline 
public class TokoOnlineDetail extends TokoOnline {

    // Constructor
    public TokoOnlineDetail(String idToko, String namaToko) {
        // Memanggil constructor dari superclass TokoOnline
        super(idToko, namaToko);
    }
    
    // Method Getter untuk mendapatkan negara berdasarkan idToko
    public String getNegara() {
        
        // Mengambil tiga karakter pertama dari idToko sebagai kodeNegara
        String kodeNegara = getIdToko().substring(0, 3);
        
        // Validasi kodeNegara
        if (!kodeNegara.matches("[a-zA-Z]+")) {
            throw new NumberFormatException("Kode negara tidak valid(" + kodeNegara + ")");
        } else {
            // Seleksi if else
            if (kodeNegara.equals("IND")) {
                return "Indonesia";
            } else if (kodeNegara.equals("MAS")) {
                return "Malaysia";
            } else if (kodeNegara.equals("SIN")) {
                return "Singapore";
            } else if (kodeNegara.equals("VIE")) {
                return "Vietnam";
            } else if (kodeNegara.equals("BRU")) {
                return "Brunei Darussalama";
            } else {
                return "Negara Lain";
            }
        }
    }

    // Method Getter untuk mendapatkan tahun berdiri toko dari idToko
    public int getTahunBerdiri() {
        // Mengambil dua karakter setelah kodeNegara dan menambahkan 2000 untuk mendapatkan tahun berdiri
        return Integer.parseInt(getIdToko().substring(3, 5)) + 2000;
    }
    
    // Method Getter untuk mendapatkan kategori toko berdasarkan idToko
    public String getKategori() {
        
        // Mengambil dua karakter setelah tahun berdiri sebagai kodeKategori
        String kodeKategori = getIdToko().substring(5, 7);
        
        // Error Handling untuk memastikan kodeKategori adalah angka
        try {
            Integer.parseInt(kodeKategori);
            // Seleksi switch
            switch(kodeKategori) {
                case "01":
                    return "Elektronik";
                case "02":
                    return "Fashion";
                case "03":
                    return "Buku";
                case "04":
                    return "Olahraga";
                default:
                    return "Kategori Lain";
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Kode kategori tidak valid(" + kodeKategori + ")");
        }
    }
    
    // Method Getter untuk mendapatkan noDaftar dari idToko
    public int getNoDaftar() {
        // Mengambil empat karakter terakhir dari idToko sebagai noDaftar
        return Integer.parseInt(getIdToko().substring(7, 11));
    }
    
    // Polymorphism Overriding
    @Override
    public String tokoInfo() {
        return super.tokoInfo() +
                "\nNegara\t\t: " + getNegara() +
                "\nTahun Berdiri\t: " + getTahunBerdiri() +
                "\nKategori Toko\t: " + getKategori()+
                "\nNomor Daftar\t: " + getNoDaftar();
    }
}
