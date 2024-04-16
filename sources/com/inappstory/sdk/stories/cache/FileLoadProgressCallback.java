package com.inappstory.sdk.stories.cache;

import com.inappstory.sdk.utils.ProgressCallback;
import java.io.File;
/* loaded from: classes3.dex */
public interface FileLoadProgressCallback extends ProgressCallback {
    void onError(String str);

    void onSuccess(File file);
}
