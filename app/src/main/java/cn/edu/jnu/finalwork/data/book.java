package cn.edu.jnu.finalwork.data;

public class book {


    public book(int resourceId, String book_title, String book_jianjie) {
        this.resourceId = resourceId;
        this.book_title = book_title;
        this.book_jianjie = book_jianjie;
    }

    public String getBook_jianjie() {
        return book_jianjie;
    }

    public void setBook_jianjie(String book_jianjie) {
        this.book_jianjie = book_jianjie;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    private int resourceId;
    private String book_title;
    private String book_jianjie;
}
