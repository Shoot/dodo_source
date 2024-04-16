package defpackage;

import defpackage.mwa;
/* compiled from: AutoValue_StaticSessionData.java */
/* renamed from: i30  reason: default package */
/* loaded from: classes2.dex */
final class i30 extends mwa {
    private final mwa.a a;
    private final mwa.c b;
    private final mwa.b c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i30(mwa.a aVar, mwa.c cVar, mwa.b bVar) {
        if (aVar != null) {
            this.a = aVar;
            if (cVar != null) {
                this.b = cVar;
                if (bVar != null) {
                    this.c = bVar;
                    return;
                }
                throw new NullPointerException("Null deviceData");
            }
            throw new NullPointerException("Null osData");
        }
        throw new NullPointerException("Null appData");
    }

    @Override // defpackage.mwa
    public mwa.a a() {
        return this.a;
    }

    @Override // defpackage.mwa
    public mwa.b c() {
        return this.c;
    }

    @Override // defpackage.mwa
    public mwa.c d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mwa)) {
            return false;
        }
        mwa mwaVar = (mwa) obj;
        if (this.a.equals(mwaVar.a()) && this.b.equals(mwaVar.d()) && this.c.equals(mwaVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
