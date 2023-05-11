package pengguna;

 
    public class Mhs {
        private String Nama;
        private String Nim ;
        private int Smt;
    
        public Mhs(String Nama, String Nim, int Smt){
            this.Nama = Nama;
            this.Nim = Nim;
            this.Smt = Smt;
}
public Mhs(){

}

public void Nama(String Nama) {
    this.Nama = Nama;
}
public String getNama(){
    return this.Nama;
}


public void setNim(String Nim){
    this.Nim = Nim;
}
public String getNim(){
    return this.Nim;
}


public void setSmt(int Smt){
    this.Smt = Smt;
}
public int getSmt(){
    return this.Smt;
}

    }
