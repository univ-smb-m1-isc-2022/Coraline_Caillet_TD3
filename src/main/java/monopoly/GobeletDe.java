package monopoly;


public class GobeletDe {

    private De[] des;

    public GobeletDe(){
        this.des=new De[2];
        this.des[0]= new De();
        this.des[1]= new De();
    }

    public int[] lancerDes(){
        return new int []{this.des[0].lancer(),this.des[1].lancer()};
    }


}
