package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoValue_CreationContext.java */
/* renamed from: m20  reason: default package */
/* loaded from: classes2.dex */
public final class m20 extends k22 {
    private final Context a;
    private final x91 b;
    private final x91 c;
    private final String d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m20(Context context, x91 x91Var, x91 x91Var2, String str) {
        if (context != null) {
            this.a = context;
            if (x91Var != null) {
                this.b = x91Var;
                if (x91Var2 != null) {
                    this.c = x91Var2;
                    if (str != null) {
                        this.d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    @Override // defpackage.k22
    public Context b() {
        return this.a;
    }

    @Override // defpackage.k22
    @NonNull
    public String c() {
        return this.d;
    }

    @Override // defpackage.k22
    public x91 d() {
        return this.c;
    }

    @Override // defpackage.k22
    public x91 e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k22)) {
            return false;
        }
        k22 k22Var = (k22) obj;
        if (this.a.equals(k22Var.b()) && this.b.equals(k22Var.e()) && this.c.equals(k22Var.d()) && this.d.equals(k22Var.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.a + ", wallClock=" + this.b + ", monotonicClock=" + this.c + ", backendName=" + this.d + "}";
    }
}
