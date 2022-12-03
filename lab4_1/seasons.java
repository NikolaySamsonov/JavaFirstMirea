package ru.mirea.lab4_1;

public class seasons {
    public enum Seasons {
        SPRING (16.3,false, "весна", "время года, между зимой и летом"),
        SUMMER (22,true,"лето", "время года, между весной и осенью"),
        AUTUMN (7, false,"осень", "время года, между летом и зимой"),
        WINTER (-10.5,false, "зима", "время года, между осенью и весной")
        ;
        public double temp ;
        public boolean favorite;
        public String title;
        public String info;

        private Seasons (double temp, boolean favorite,String title, String info){
            this.temp = temp;
            this.favorite = favorite;
            this.title = title;
            this.info = info;
        }
        public String FavoriteSeason (Seasons season){
            switch (season){
                case SPRING :
                    return ("я люблю "+SPRING.title);
                case AUTUMN :
                    return ("я люблю "+AUTUMN.title);
                case SUMMER :
                    return ("я люблю "+SUMMER.title);
                case WINTER :
                    return ("я люблю "+WINTER.title);
            }
            return "неизвестное время года";
        }
        public String GetDescription (Seasons seasons){
            if (seasons == SUMMER){
                return SUMMER.title+" теплое время года";
            }
            else return seasons.title + " холодное время года";
        }
        public String getInfo (Seasons Seasons){
            return "средняя температура " + Seasons.title +"м "+ temp+"\n"+ info;
        }

        public String toString (){
            return "\n"+title + " температура "+temp + "  "+info+"\n";
        }
    }
    public seasons (){};

}
