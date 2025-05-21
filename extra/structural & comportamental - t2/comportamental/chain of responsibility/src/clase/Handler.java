package clase;

public abstract class Handler {
    private Handler next;
    public void setNextHandler(Handler next) {
        this.next = next;
    }
    public Handler getNextHandler() {
        return next;
    }
    public abstract void handle(TipReclamatie tipReclamatie);
}
