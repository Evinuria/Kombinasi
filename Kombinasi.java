public class Kombinasi {
    int n;
    int r;
    int s;
    int fa,fb,fc; 
    int kombinasi;
    
    public Kombinasi(){   
}
    public void kombinasi(){
        fa=1; fb=1; fc=1; s=n-r;
        if(s<=0){System.out.println("Angka yang anda masukkan salah");
        }
        else{
        while(n>0){
            System.out.println(n);
            fa=fa*n;
            n=n-1;
            }
            while(r>0){
            System.out.println(r);
            fb=fb*r;
            r=r-1;
            }
            while (s>0){
            System.out.println(s);
            fc=fc*s;
            s=s-1;
            }
        kombinasi= fa/(fb*fc);
        System.out.println("Banyaknya kemungkinan \t:"+kombinasi);
    }
}
}