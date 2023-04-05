package src;

public class Fila {
    private static Fila instance;
    private Fila()
    {
    }

    public void ImprimeDocumento()
    {
    }
    public void RemoveDocumento()
    {}
    public void RemoveTodosDocumentos()
    {
    }

    public static Fila getInstance()
    {
        if(instance == null)
        {
            instance = new Fila();
        }

        return instance;
    }
}
