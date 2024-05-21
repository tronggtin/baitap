package cse305;

public class NormalDoc implements Document {
    private String extension;
    private String encryption;

    @Override
    public void setExtension() {
        this.extension = ".txt";
    }

    @Override
    public void setEncryption() {
        this.encryption = "None";
    }

    @Override
    public Document buildDoc() {
        System.out.println("Normal document created with extension " + this.extension + " and no encryption.");
        return this;
    }

    public String getExtension() {
        return extension;
    }

    public String getEncryption() {
        return encryption;
    }
}
