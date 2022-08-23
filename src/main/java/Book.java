public class Book {
    private String idbook;
    private String namebook;
    private String nameAuthor;
    private String releaseDay;

    public Book(String idbook, String namebook, String nameAuthor,String releaseDay) {
        this.idbook=idbook;
        this.namebook=namebook;
        this.nameAuthor= nameAuthor;
        this.releaseDay=releaseDay;
    }

    public String getIdbook() {
        return idbook;
    }

    public void setIdbook(String idbook) {
        this.idbook = idbook;
    }

    public String getNamebook() {
        return namebook;
    }

    public void setNamebook(String namebook) {
        this.namebook = namebook;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getReleaseDay() {
        return releaseDay;
    }

    public void setReleaseDay(String releaseDay) {
        this.releaseDay = releaseDay;
    }

    @Override
    public String toString() {
        return "Book{" +
                "idbook='" + idbook + '\'' +
                ", namebook='" + namebook + '\'' +
                ", nameAuthor='" + nameAuthor + '\'' +
                ", releaseDay='" + releaseDay + '\'' +
                '}';
    }
}
