package com.inappstory.sdk.stories.callbacks;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.HashMap;
/* loaded from: classes3.dex */
public interface ShareCallback {
    @NonNull
    View getView(@NonNull Context context, @NonNull HashMap<String, Object> hashMap, @NonNull OverlappingContainerActions overlappingContainerActions);

    boolean onBackPress(@NonNull OverlappingContainerActions overlappingContainerActions);

    void viewIsVisible(View view);
}
