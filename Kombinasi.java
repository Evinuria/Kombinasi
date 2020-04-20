public class Kombinasi {
    int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    int []pilih ={1,2,3};
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
            fa=fa*n;
            n=n-1;
            }
            while(r>0){
            fb=fb*r;
            r=r-1;
            }
            while (s>0){
            System.out.println(s);
            fc=fc*s;
            s=s-1;
            }
        kombinasi= fa/(fb*fc);
        System.out.println("Banyaknya cara \t:"+kombinasi);
    }
}
}