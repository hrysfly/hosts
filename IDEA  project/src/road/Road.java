package road;

public abstract class Road {
    protected Style style;
    public void SetStyle(Style style){
        this.style=style;
    }
    public abstract void ride();
}

