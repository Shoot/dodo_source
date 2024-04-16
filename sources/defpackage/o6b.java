package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import defpackage.s58;
/* compiled from: Target.java */
/* renamed from: o6b  reason: default package */
/* loaded from: classes3.dex */
public interface o6b {
    void onBitmapFailed(Exception exc, Drawable drawable);

    void onBitmapLoaded(Bitmap bitmap, s58.e eVar);

    void onPrepareLoad(Drawable drawable);
}
