package logic;

//! Le digo ami clase que puedo recibir un tipo de dato generic " <T> "
public class Box<T> {
    private T content;

    public void putSomething(T content) {
        this.content = content;
    }

    public T getSomething() {
        return this.content;
    }
}
