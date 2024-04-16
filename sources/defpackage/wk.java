package defpackage;

import android.content.ContentResolver;
import android.provider.Settings;
import androidx.annotation.NonNull;
/* compiled from: AnimatorDurationScaleProvider.java */
/* renamed from: wk  reason: default package */
/* loaded from: classes2.dex */
public class wk {
    public float a(@NonNull ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
