package defpackage;

import androidx.annotation.NonNull;
import defpackage.fr5;
/* compiled from: FixedPreloadSizeProvider.java */
/* renamed from: uy3  reason: default package */
/* loaded from: classes.dex */
public class uy3<T> implements fr5.b<T> {
    private final int[] a;

    public uy3(int i, int i2) {
        this.a = new int[]{i, i2};
    }

    @Override // defpackage.fr5.b
    public int[] a(@NonNull T t, int i, int i2) {
        return this.a;
    }
}
