package cse305;

public class ConfidentialDoc implements Document {
    private String extension;
    private String encryption;

    @Override
    public void setExtension() {
        this.extension = ".zip";
    }

    @Override
    public void setEncryption() {
        this.encryption = "AES";
    }

    @Override
    public Document buildDoc() {
        System.out.println("Confidential document created with extension " + this.extension + " and AES encryption.");
        return this;
    }

    public String getExtension() {
        return extension;
    }

    public String getEncryption() {
        return encryption;
    }
}
