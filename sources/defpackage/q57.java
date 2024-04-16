package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
/* compiled from: ObjectsPool.java */
/* renamed from: q57  reason: default package */
/* loaded from: classes3.dex */
abstract class q57 {
    private static final Rect a = new Rect();
    private static final RectF b = new RectF();
    private static final Paint c = new Paint(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Paint a() {
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Rect b() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RectF c() {
        return b;
    }
}
