package com.inappstory.sdk.stories.ui.widgets.readerscreen.generated;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
/* loaded from: classes3.dex */
public class GeneratedImageView extends AppCompatImageView implements GeneratedViewCallback {
    boolean isLoaded;

    public GeneratedImageView(@NonNull Context context) {
        super(context);
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.GeneratedViewCallback
    public boolean isLoaded() {
        return this.isLoaded;
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.GeneratedViewCallback
    public void onLoaded() {
        this.isLoaded = true;
    }

    public GeneratedImageView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GeneratedImageView(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
