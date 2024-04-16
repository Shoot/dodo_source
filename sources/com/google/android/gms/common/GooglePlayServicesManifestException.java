package com.google.android.gms.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepName
/* loaded from: classes2.dex */
public class GooglePlayServicesManifestException extends IllegalStateException {
    private final int a;

    public GooglePlayServicesManifestException(int i, @NonNull String str) {
        super(str);
        this.a = i;
    }
}
