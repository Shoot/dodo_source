package defpackage;

import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.security.MessageDigest;
/* compiled from: Key.java */
/* renamed from: se5  reason: default package */
/* loaded from: classes.dex */
public interface se5 {
    public static final Charset a = Charset.forName("UTF-8");

    void b(@NonNull MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
