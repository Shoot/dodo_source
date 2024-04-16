package com.inappstory.sdk.stories.ui.widgets.readerscreen.generated;

import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes3.dex */
public class GeneratedView {
    String type;
    View view;
    ViewGroup viewContainer;

    public GeneratedView(String str, View view, ViewGroup viewGroup) {
        this.type = str;
        this.view = view;
        this.viewContainer = viewGroup;
    }

    public void addView(ViewGroup viewGroup) {
        View view;
        if (viewGroup != null && (view = this.view) != null) {
            viewGroup.addView(view);
        }
    }

    public String getType() {
        return this.type;
    }

    public View getView() {
        return this.view;
    }

    public ViewGroup getViewContainer() {
        return this.viewContainer;
    }

    public GeneratedView(String str, View view) {
        this.type = str;
        this.view = view;
    }
}
