package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
/* compiled from: ImageViewTargetFactory.java */
/* renamed from: ew4  reason: default package */
/* loaded from: classes.dex */
public class ew4 {
    @NonNull
    public <Z> r0c<ImageView, Z> a(@NonNull ImageView imageView, @NonNull Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new dc0(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new k83(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
