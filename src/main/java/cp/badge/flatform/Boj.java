package cp.badge.flatform;

public class Boj extends FlatForm{
    private Boj(String handle,String rating,String color){
        this.name = "solved.ac";
        this.handle = handle;
        this.rating = rating;
        this.color = color;
    }
    public static Boj of(String handle,String rating){
        int r = Integer.parseInt(rating);
        String color = "";String tier = "";
        if(r==0) color = "624637";
        else if(30<=r&&r<200){color = "ad5600";}
        else if(200<=r&&r<800) color = "435f7a";
        else if(800<=r&&r<1600) color = "ec9a00";
        else if(1600<=r&&r<2200) color = "27e2a4";
        else if(2200<=r&&r<2700) color = "00b4fc";
        else if(2700<=r&&r<3000) color = "ff0062";
        else color = "b300e0";
        return new Boj(handle,rating,color);
    }
}
