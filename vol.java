package labassessment;
abstract class shape 
{
    abstract void computeVolume();
}
class cylinder extends shape {
    int width, height,bredth;
    cylinder(int width, int height,int bredth)
    {
       this.width = width;
       this.height = height;
       this.bredth= bredth;
    }
    public void computeVolume()
    {
        System.out.println("the volume of cylinder is "+(width*height*bredth));
       
    }
}
class cube extends shape {
    int length;
    cube(int l)
    {
        length = l;
    }
    public void computeVolume()
    {
        System.out.println("the volume of cube is "+(length*length*length));
    }
}
class sphere extends shape {
    int r;
    sphere(int r){
        this.r = r;
    }
    public void computeVolume()
    {
        System.out.println("the volume of sphere is "+((4/3)*3.14*r*r*r));
    }
}


public class vol {
    public static void main(String[] args)
    {
        shape s,q,r;
        s=new cylinder(2,3,4);
        s.computeVolume();
        q=new cube(4);
        q.computeVolume();
        r= new sphere(2);
        r.computeVolume();
        
    }
    
}
