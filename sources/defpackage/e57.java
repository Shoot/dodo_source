package defpackage;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;
/* compiled from: ObjectKey.java */
/* renamed from: e57  reason: default package */
/* loaded from: classes.dex */
public final class e57 implements se5 {
    private final Object b;

    public e57(@NonNull Object obj) {
        this.b = eh8.d(obj);
    }

    @Override // defpackage.se5
    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(se5.a));
    }

    @Override // defpackage.se5
    public boolean equals(Object obj) {
        if (obj instanceof e57) {
            return this.b.equals(((e57) obj).b);
        }
        return false;
    }

    @Override // defpackage.se5
    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.b + CoreConstants.CURLY_RIGHT;
    }
}
