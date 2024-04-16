package defpackage;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.internal.LifecycleCallback;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: kp5  reason: default package */
/* loaded from: classes2.dex */
public interface kp5 {
    void E1(@NonNull String str, @NonNull LifecycleCallback lifecycleCallback);

    <T extends LifecycleCallback> T d4(@NonNull String str, @NonNull Class<T> cls);

    Activity mc();

    void startActivityForResult(@NonNull Intent intent, int i);
}
