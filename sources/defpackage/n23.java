package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
/* compiled from: Dip.java */
/* renamed from: n23  reason: default package */
/* loaded from: classes3.dex */
public class n23 {
    private final float a;

    public n23(float f) {
        this.a = f;
    }

    @NonNull
    public static n23 a(@NonNull Context context) {
        return new n23(context.getResources().getDisplayMetrics().density);
    }

    public int b(int i) {
        return (int) ((i * this.a) + 0.5f);
    }
}
