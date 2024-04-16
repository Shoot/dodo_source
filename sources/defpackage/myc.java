package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: myc  reason: default package */
/* loaded from: classes2.dex */
public final class myc extends d0d {
    private final Context a;
    private final l2b<pb7<bzc>> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public myc(Context context, l2b<pb7<bzc>> l2bVar) {
        if (context != null) {
            this.a = context;
            this.b = l2bVar;
            return;
        }
        throw new NullPointerException("Null context");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.d0d
    public final Context a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.d0d
    public final l2b<pb7<bzc>> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        l2b<pb7<bzc>> l2bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0d) {
            d0d d0dVar = (d0d) obj;
            if (this.a.equals(d0dVar.a()) && ((l2bVar = this.b) != null ? l2bVar.equals(d0dVar.b()) : d0dVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        l2b<pb7<bzc>> l2bVar = this.b;
        if (l2bVar == null) {
            hashCode = 0;
        } else {
            hashCode = l2bVar.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return "FlagsContext{context=" + valueOf + ", hermeticFileOverrides=" + valueOf2 + "}";
    }
}
