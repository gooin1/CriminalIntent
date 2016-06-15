package gooin.github.io.criminalintent;

import java.util.UUID;
/**
 * Created by gooin on 2016/6/15.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    public Crime() {
        mId = UUID.randomUUID();

    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }


}
