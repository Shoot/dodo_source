package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
/* compiled from: UnitTransformation.java */
/* renamed from: uqb  reason: default package */
/* loaded from: classes.dex */
public final class uqb<T> implements tkb<T> {
    private static final tkb<?> b = new uqb();

    private uqb() {
    }

    @NonNull
    public static <T> uqb<T> c() {
        return (uqb) b;
    }

    @Override // defpackage.se5
    public void b(@NonNull MessageDigest messageDigest) {
    }

    @Override // defpackage.tkb
    @NonNull
    public nj9<T> a(@NonNull Context context, @NonNull nj9<T> nj9Var, int i, int i2) {
        return nj9Var;
    }
}
