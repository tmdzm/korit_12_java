package ch12_inheritance.books;

public class EBook extends Book{
    private double fileSize;
    private String  format;

    public EBook(String author, String title, double fileSize, String format) {
        super(author, title);
        this.fileSize = fileSize;
        this.format = format;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("파일 크기 : "+fileSize);
        System.out.println("파일 형식 : "+format);
    }
}
