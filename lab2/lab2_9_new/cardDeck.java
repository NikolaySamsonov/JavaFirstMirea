package ru.mirea.lab2_9_new;

public class cardDeck {
    private  int [][] Deck = new int[4][13];
    private int counter=0;
    public int mast;
    public int value;
    public String getvalue,getmast;
    private String[] masts = {"буби","крести","черви","пики"};
    private String[] values = {"туз","двойка","тройка","четверка","пятерка","шестерка","семерка","восьмерка","девятка","десятка","валет","дама","король"};
    public cardDeck (){}
    public void random(){
        this.mast=(int)(Math.random()*4);
        this.value=(int)(Math.random()*13);
    }
    private boolean check (int mast, int value){
        if(Deck[mast][value]==1){
            return false;
        }
        else{
            Deck[mast][value]++;
            return true;
        }
    }
    public String SetCard (){
        if (counter==52)return "карты кончились";
        while (check(mast,value)!=true){
            random();
        }
        counter++;
        return (values[value]+" "+masts[mast]);
    }
    public void stat() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(Deck[i][j]+" ");
            }
            System.out.print("\n");
        }

    }
}
