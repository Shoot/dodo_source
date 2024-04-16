package com.inappstory.sdk.stories.api.models;

import com.inappstory.sdk.stories.ui.list.FavoriteImage;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class ExceptionCache {
    private List<Story> favStories;
    private List<FavoriteImage> favoriteImages;
    private List<Story> stories;

    public ExceptionCache(List<Story> list, List<Story> list2, List<FavoriteImage> list3) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = new ArrayList();
        }
        this.stories = arrayList;
        if (list2 != null) {
            arrayList2 = new ArrayList(list2);
        } else {
            arrayList2 = new ArrayList();
        }
        this.favStories = arrayList2;
        if (list3 != null) {
            arrayList3 = new ArrayList(list3);
        } else {
            arrayList3 = new ArrayList();
        }
        this.favoriteImages = arrayList3;
    }

    public List<Story> getFavStories() {
        ArrayList arrayList = new ArrayList();
        List<Story> list = this.favStories;
        if (list == null) {
            return arrayList;
        }
        for (Story story : list) {
            if (story != null) {
                arrayList.add(story);
            }
        }
        return arrayList;
    }

    public List<FavoriteImage> getFavoriteImages() {
        ArrayList arrayList = new ArrayList();
        List<FavoriteImage> list = this.favoriteImages;
        if (list == null) {
            return arrayList;
        }
        for (FavoriteImage favoriteImage : list) {
            if (favoriteImage != null) {
                arrayList.add(favoriteImage);
            }
        }
        return arrayList;
    }

    public List<Story> getStories() {
        ArrayList arrayList = new ArrayList();
        List<Story> list = this.stories;
        if (list == null) {
            return arrayList;
        }
        for (Story story : list) {
            if (story != null) {
                arrayList.add(story);
            }
        }
        return arrayList;
    }
}
