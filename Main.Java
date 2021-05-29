public class Main {
    public static void main(String[] args){
        String nama[] = {"1102021 - Andri Hariadi - BANDUNG", "1102022 - Dewi Lestari - SURABAYA", "1102023 - Dewi Agustin - MALANG", "1102024 - Reni Indrayanti - MALANG", "1102025 - Toni Sukmawan - SURABAYA", "1102026 - Toni Gunawan - BANDUNG"};
        String cari = "Toni";
        String list[];
        for(int i=0;i<nama.length;i++){
            boolean found = false;
            String splitnama[] = nama[i].split(" ");
            for(int j=0;j<splitnama.length;j++){
             if(cari.equals(splitnama[j])){
                 System.out.println(nama[i] + " - Data nomor " +(i+1));
             } else{
                 System.out.println("Data yang anda cari tidak ditemukan");
             }
            }
        }
    }
}
