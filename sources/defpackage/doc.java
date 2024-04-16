package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: doc  reason: default package */
/* loaded from: classes2.dex */
public final class doc implements bpc {
    private final bpc a;
    private final String b;

    public doc() {
        this.a = bpc.K4;
        this.b = "return";
    }

    public final bpc a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    @Override // defpackage.bpc
    public final bpc c() {
        return new doc(this.b, this.a.c());
    }

    @Override // defpackage.bpc
    public final Boolean d() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof doc)) {
            return false;
        }
        doc docVar = (doc) obj;
        if (this.b.equals(docVar.b) && this.a.equals(docVar.a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.bpc
    public final Double f() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // defpackage.bpc
    public final String g() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // defpackage.bpc
    public final Iterator<bpc> h() {
        return null;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.bpc
    public final bpc t(String str, xzc xzcVar, List<bpc> list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public doc(String str) {
        this.a = bpc.K4;
        this.b = str;
    }

    public doc(String str, bpc bpcVar) {
        this.a = bpcVar;
        this.b = str;
    }
}
