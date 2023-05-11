import pengguna.User;
import pengguna.Mhs;

class Main {
    public static void main(String[] args) {
        
        Mhs mhs = new Mhs("username", "password");

        mhs.setNama("Risiq Nur Rohmat");
        mhs.setNim("G.111.20.0011");
        mhs.setSmt(6);
// ss
        System.out.println("Nama Mahasiswa: " + mhs.getNama());
        System.out.println("Nim Mhs: " + mhs.getNim());
        System.out.println("Smt Mhs: " + mhs.getSmt());


        User sepeda = new User("Lazzor", "Akulali321");
    
    System.out.println("Username :" + sepeda.getUsername());
    System.out.println("Password :" + sepeda.getPassword());
    }
}