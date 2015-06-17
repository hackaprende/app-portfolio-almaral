package com.almareng.appportfolio.Objects;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by almaral17@gmail.com on 6/17/2015.
 */
public class TrackItem extends MusicItem implements Parcelable {

    private String id;
    private String name;
    private String smallImageUrl;
    private String albumName;
    private String bigImageUrl;
    private String previewUrl;

    public TrackItem(String id, String name, String smallImageUrl, String bigImageUrl, String albumName, String previewUrl) {
        super(id, name, smallImageUrl);
        this.id = id;
        this.smallImageUrl = smallImageUrl;
        this.name = name;
        this.albumName = albumName;
        this.bigImageUrl = bigImageUrl;
        this.previewUrl = previewUrl;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getBigImageUrl() {
        return bigImageUrl;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    protected TrackItem(Parcel in) {
        id = in.readString();
        name = in.readString();
        smallImageUrl = in.readString();
        albumName = in.readString();
        bigImageUrl = in.readString();
        previewUrl = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(name);
        dest.writeString(smallImageUrl);
        dest.writeString(albumName);
        dest.writeString(bigImageUrl);
        dest.writeString(previewUrl);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<TrackItem> CREATOR = new Parcelable.Creator<TrackItem>() {
        @Override
        public TrackItem createFromParcel(Parcel in) {
            return new TrackItem(in);
        }

        @Override
        public TrackItem[] newArray(int size) {
            return new TrackItem[size];
        }
    };
}