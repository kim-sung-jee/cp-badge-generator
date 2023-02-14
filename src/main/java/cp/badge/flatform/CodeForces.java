package cp.badge.flatform;

import lombok.Data;

public class CodeForces extends FlatForm{
    private CodeForces(String handle,String rating,String color){
        this.name = "codeforces";
        this.handle = handle;
        this.rating = rating;
        this.color = color;
    }
    public static CodeForces of(String handle,String rating){
        int r = Integer.parseInt(rating);
        String color = "";
        if(r<1200) color += "cec8c1";
        else if(1200<=r&&r<1400) color += "43A217";
        else if(1400<=r&&r<1600) color += "22C4AE";
        else if(1600<=r&&r<1900) color += "1427B2";
        else if(1900<=r&&r<2100) color += "700CB0";
        else if(2100<=r&&r<2300) color += "F9A908";
        else if(2300<=r&&r<2400) color += "FBB948";
        else color += "FF0000";
        return new CodeForces(handle,rating,color);
    }
}
