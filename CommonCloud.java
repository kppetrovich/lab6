public class CommonCloud extends Cloud {
    {this.colour="голубой";}

    @Override
    public String toString() {
        return "CommonCloud{}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void setCoordinates(){
    this.x= (int) (Math.random()*100);
    this.y= (int) (Math.random()*100);
    this.z=(int) (Math.random()*100);

}}
