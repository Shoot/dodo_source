package com.inappstory.sdk.stories.ui.list;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
/* loaded from: classes3.dex */
public class FavoriteImage {
    public String backgroundColor;
    private Bitmap bitmap;
    private int id;
    private List<Image> image;

    public FavoriteImage(int i, List<Image> list, String str) {
        this.id = i;
        this.image = list;
        this.backgroundColor = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FavoriteImage) || ((FavoriteImage) obj).id != this.id) {
            return false;
        }
        return true;
    }

    public int getBackgroundColor() {
        try {
            return Color.parseColor(this.backgroundColor);
        } catch (Exception unused) {
            return -16777216;
        }
    }

    public int getId() {
        return this.id;
    }

    public Image getImage() {
        List<Image> list = this.image;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.image.get(0);
    }

    public String getUrl() {
        List<Image> list = this.image;
        if (list != null && !list.isEmpty()) {
            return this.image.get(0).getUrl();
        }
        return "";
    }

    public int hashCode() {
        int i = this.id;
        return ((((527 + i) * 31) + i) * 31) + i;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public Image getImage(int i) {
        List<Image> list = this.image;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String str = i != 2 ? Image.TYPE_MEDIUM : Image.TYPE_HIGH;
        for (Image image : this.image) {
            if (image.getType().equals(str)) {
                return image;
            }
        }
        return this.image.get(0);
    }
}
