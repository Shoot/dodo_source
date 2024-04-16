package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* compiled from: AndroidResourceSignature.java */
/* renamed from: qi  reason: default package */
/* loaded from: classes.dex */
public final class qi implements se5 {
    private final int b;
    private final se5 c;

    private qi(int i, se5 se5Var) {
        this.b = i;
        this.c = se5Var;
    }

    @NonNull
    public static se5 c(@NonNull Context context) {
        return new qi(context.getResources().getConfiguration().uiMode & 48, up.c(context));
    }

    @Override // defpackage.se5
    public void b(@NonNull MessageDigest messageDigest) {
        this.c.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // defpackage.se5
    public boolean equals(Object obj) {
        if (!(obj instanceof qi)) {
            return false;
        }
        qi qiVar = (qi) obj;
        if (this.b != qiVar.b || !this.c.equals(qiVar.c)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.se5
    public int hashCode() {
        return vub.q(this.c, this.b);
    }
}
