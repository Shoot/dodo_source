package com.inappstory.sdk;

import android.content.Context;
import com.inappstory.sdk.network.Ignore;
import com.inappstory.sdk.network.JsonParser;
import com.inappstory.sdk.stories.statistic.SharedPreferencesAPI;
/* loaded from: classes3.dex */
public class WidgetAppearance {
    @Ignore
    Context context;
    Integer corners;
    Float ratio;
    boolean sandbox;
    Integer textColor;
    @Ignore
    Class widgetClass;

    public Context getContext() {
        return this.context;
    }

    public Integer getCorners() {
        Integer num = this.corners;
        if (num != null && num.intValue() >= 0) {
            return this.corners;
        }
        return 0;
    }

    public Float getRatio() {
        Float f = this.ratio;
        if (f != null && f.floatValue() > 0.0f) {
            return this.ratio;
        }
        return Float.valueOf(1.0f);
    }

    public Integer getTextColor() {
        Integer num = this.textColor;
        if (num == null) {
            return -1;
        }
        return num;
    }

    public Class getWidgetClass() {
        return this.widgetClass;
    }

    public boolean isSandbox() {
        return this.sandbox;
    }

    public void save() {
        try {
            if (!SharedPreferencesAPI.hasContext()) {
                SharedPreferencesAPI.setContext(this.context);
            }
            SharedPreferencesAPI.saveString("lastWidgetAppearance", JsonParser.getJson(this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setRatio(Float f) {
        this.ratio = f;
    }
}
