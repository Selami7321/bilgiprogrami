public class Main {
    public static void main(String[] args) {
Calisan c1= new Calisan("SELAMİ ÇETİN","babapro1907","35695770797");
c1.giris();
Akademisyen a1= new Akademisyen("MAHMUT HOCA ","mahmutgmail","8799986787","TARİH","PROF");
a1.cikis();
a1.derseGir();
Memur m1= new Memur("MEHMET BEY ","mehmet123","789448384","GÜVENLİK GÖREVLİSİ","09.00-12.00");
m1.calisma();
ÖgretimGorevlisi o1= new ÖgretimGorevlisi("SELAMİ ","selami9120","7383474","SOFTWARE","PROF,DÇ","123");
o1.derseGir();
o1.giris();
Asistan as1=new Asistan("SELAMİ ÇET","selami999","34789327","KİMYA","PROF");
as1.derseGir();
as1.quizyap();
LabAsistani l1= new LabAsistani("SELAMİ Lab","selami657","834098","SOFTWARE","PROF");
l1.derseGir();
l1.labaGir();
Bilgiİslem b1= new Bilgiİslem("VELİ","veli13","23898","güvenlik","09.00-23.59","network kurulumu");
b1.giris();
b1.networkKurulum();
GüvenlikGörevlisi g1=new GüvenlikGörevlisi("SELAMİ","selami123","67238","Güvenlik","09.00-10.00","YAKIŞIKLI GÜVENLİK BELGESİ");
g1.giris();
g1.nobetTutma();
g1.cikis();
    }
}