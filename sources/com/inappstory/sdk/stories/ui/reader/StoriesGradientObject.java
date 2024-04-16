package com.inappstory.sdk.stories.ui.reader;

import android.graphics.Color;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class StoriesGradientObject implements Serializable {
    public Integer csGradientHeight = 100;
    public List<Integer> csColors = new ArrayList();
    public List<Float> csLocations = new ArrayList();

    public StoriesGradientObject() {
        this.csColors.add(Integer.valueOf(Color.parseColor("#20000000")));
        this.csColors.add(Integer.valueOf(Color.parseColor("#00000000")));
        this.csLocations.add(Float.valueOf(0.0f));
        this.csLocations.add(Float.valueOf(1.0f));
    }

    public StoriesGradientObject csColors(List<Integer> list) {
        this.csColors = list;
        return this;
    }

    public StoriesGradientObject csGradientHeight(Integer num) {
        this.csGradientHeight = num;
        return this;
    }

    public StoriesGradientObject csLocations(List<Float> list) {
        this.csLocations = list;
        return this;
    }
}
