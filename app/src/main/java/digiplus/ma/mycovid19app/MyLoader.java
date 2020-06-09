package digiplus.ma.mycovid19app;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

public class MyLoader extends AsyncTaskLoader<List<MyDATA>> {

    /** Tag for log messages */
    private static final String LOG_TAG = MyLoader.class.getName();

    /** Query URL */
    private String mUrl;


    /**
     * Constructs a new {@link NewsLoader}.
     *
     * @param context of the activity
     * @param url to load data from
     */
    public MyLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }


    @Override
    protected void onStartLoading() {
        forceLoad();
    }


    /**
     * This is on a background thread.
     */
    @Override
    public List<MyDATA> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of news.
        List<MyDATA> news = QueryUtils.fetchNewsData(mUrl);
        return news;
    }
}
