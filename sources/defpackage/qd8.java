package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PointerIcon;
import androidx.annotation.NonNull;
/* compiled from: PointerIconCompat.java */
/* renamed from: qd8  reason: default package */
/* loaded from: classes.dex */
public final class qd8 {
    private final PointerIcon a;

    /* compiled from: PointerIconCompat.java */
    /* renamed from: qd8$a */
    /* loaded from: classes.dex */
    static class a {
        static PointerIcon a(Bitmap bitmap, float f, float f2) {
            return PointerIcon.create(bitmap, f, f2);
        }

        static PointerIcon b(Context context, int i) {
            return PointerIcon.getSystemIcon(context, i);
        }

        static PointerIcon c(Resources resources, int i) {
            return PointerIcon.load(resources, i);
        }
    }

    private qd8(PointerIcon pointerIcon) {
        this.a = pointerIcon;
    }

    @NonNull
    public static qd8 b(@NonNull Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new qd8(a.b(context, i));
        }
        return new qd8(null);
    }

    public Object a() {
        return this.a;
    }
}
