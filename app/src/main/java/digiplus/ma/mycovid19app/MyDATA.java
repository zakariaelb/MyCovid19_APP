package digiplus.ma.mycovid19app;

public class MyDATA {

    // Information about news
    private String mSectionName;
    private String mAuthor;
    private String mTitle;
    private String mPublicationDate;
    private String mUrl;


    /**
     * Create the {@link News} object.
     * @param section is the news category name.
     * @param author is the name of news author.
     * @param title is the news title.
     * @param publicationDate is the news publication date.
     * @param url is the news url.
     */
    public MyDATA(String section, String author, String title, String publicationDate, String url) {
        mSectionName = section;
        mAuthor = author;
        mTitle = title;
        mPublicationDate = publicationDate;
        mUrl = url;
    }


    /**
     * Getter methods of {@link News} class.
     * @return the String objects.
     */
    public String getSectionName() {
        return mSectionName;
    }


    public String getAuthor() {
        return mAuthor;
    }


    public String getTitle() {
        return mTitle;
    }


    public String getPublicationDate() {
        return mPublicationDate;
    }


    public String getUrl() {
        return mUrl;
    }
}
