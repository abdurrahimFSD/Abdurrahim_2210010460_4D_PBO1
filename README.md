# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data Toko Online menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa idToko dan namaToko dari Toko Online, dan memberikan output berupa informasi detail dari idToko tersebut seperti negara, tahun berdiri, kategori toko, dan nomor daftar.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `TokoOnline`, `TokoOnlineDetail`, dan `TokoOnlineBeraksi` adalah contoh dari class.

```bash
public class TokoOnline {
    ...
}

public class TokoOnlineDetail extends TokoOnline {
    ...
}

public class TokoOnlineBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `toko[i] = new TokoOnlineDetail(idToko, namaToko);` adalah contoh pembuatan object.

```bash
toko[i] = new TokoOnlineDetail(idToko, namaToko);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `idToko` dan `namaToko` adalah contoh atribut.

```bash
String idToko;
String namaToko;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `TokoOnline` dan `TokoOnlineDetail`.

```bash
public TokoOnline(String idToko, String namaToko) {
    this.idToko = idToko;
    this.namaToko = namaToko;
}

public TokoOnlineDetail(String idToko, String namaToko) {
    super(idToko, namaToko);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setIdToko` dan `setNamaToko` adalah contoh method mutator.

```bash
public void setIdToko(String idToko) {
    this.idToko = idToko;
}

public void setNamaToko(String namaToko) {
    this.namaToko = namaToko;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getIdToko`, `getNamaToko`, `getNegara`, `getTahunBerdiri`, `getKategori`, dan `getNoDaftar` adalah contoh method accessor.

```bash
public String getIdToko() {
    return idToko;
}

public String getNamaToko() {
    return namaToko;
}


public String getNegara() {
    String kodeNegara = getIdToko().substring(0, 3);
    if (!kodeNegara.matches("[a-zA-Z]+")) {
        throw new NumberFormatException("Kode negara tidak valid(" + kodeNegara + ")");
    } else {
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


public int getTahunBerdiri() {
    return Integer.parseInt(getIdToko().substring(3, 5)) + 2000;
}

public String getKategori() {
    String kodeKategori = getIdToko().substring(5, 7);
    try {
        Integer.parseInt(kodeKategori);
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

public int getNoDaftar() {
    return Integer.parseInt(getIdToko().substring(7, 11));
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `idToko` dan `namaToko` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String idToko;
private String namaToko;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `TokoOnlineDetail` mewarisi `TokoOnline` dengan sintaks `extends`.

```bash
public class TokoOnlineDetail extends TokoOnline {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tokoInfo(String)` di `TokoOnline` merupakan overloading method `tokoInfo` dan `tokoInfo` di `TokoOnlineDetail` merupakan override dari method `tokoInfo` di `TokoOnline`.

```bash
public String tokoInfo(String metodePembayaran) {
    return tokoInfo() + 
           "\nMetode Pembayaran: " + metodePembayaran;
}

@Override
public String tokoInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getNegara` dan seleksi `switch` dalam method `getKategori`.

```bash
public String getNegara() {
    String kodeNegara = getIdToko().substring(0, 3);
    if (!kodeNegara.matches("[a-zA-Z]+")) {
        throw new NumberFormatException("Kode negara tidak valid(" + kodeNegara + ")");
    } else {
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

public String getKategori() {
    String kodeKategori = getIdToko().substring(5, 7);
    try {
        Integer.parseInt(kodeKategori);
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i = 0; i < toko.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Id Toko " + (i+1) + "\t: ");
String idToko = scanner.nextLine();

System.out.println("================================");
System.out.println("DATA TOKO " + (i + 1));
System.out.println("================================");
System.out.println(toko[i].tokoInfo() + "\n");
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `TokoOnlineDetail[] toko = new TokoOnlineDetail[2];` adalah contoh penggunaan array.

```bash
TokoOnlineDetail[] toko = new TokoOnlineDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (NumberFormatException e) {
    System.out.println("Kesalahan Format Nomor: " + e.getMessage());
} catch (StringIndexOutOfBoundsException e) {
    System.out.println("Kesalahan Format Id Toko: " + e.getMessage());
} catch (Exception e) {
    System.out.println("Kesalahan Umum: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Abdurrahim
NPM: 2210010460
