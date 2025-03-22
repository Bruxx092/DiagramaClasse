public class CSR {
    private String name;
    private String extension;

    // Construtor
    public CSR(String name, String extension) {
        this.name = name;
        this.extension = extension;
    }

    // Métodos getters e setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
}