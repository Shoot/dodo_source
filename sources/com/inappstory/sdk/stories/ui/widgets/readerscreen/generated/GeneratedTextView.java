package com.inappstory.sdk.stories.ui.widgets.readerscreen.generated;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
/* loaded from: classes3.dex */
public class GeneratedTextView extends AppCompatTextView implements GeneratedViewCallback {
    boolean isLoaded;

    public GeneratedTextView(@NonNull Context context) {
        super(context);
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.GeneratedViewCallback
    public boolean isLoaded() {
        return true;
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.GeneratedViewCallback
    public void onLoaded() {
        this.isLoaded = true;
    }

    public GeneratedTextView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GeneratedTextView(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
