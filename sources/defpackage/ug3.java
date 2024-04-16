package defpackage;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
/* compiled from: EmptySignature.java */
/* renamed from: ug3  reason: default package */
/* loaded from: classes.dex */
public final class ug3 implements se5 {
    private static final ug3 b = new ug3();

    private ug3() {
    }

    @NonNull
    public static ug3 c() {
        return b;
    }

    public String toString() {
        return "EmptySignature";
    }

    @Override // defpackage.se5
    public void b(@NonNull MessageDigest messageDigest) {
    }
}
