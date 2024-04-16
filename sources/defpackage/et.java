package defpackage;

import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AssistantGeneratorData.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u001a"}, d2 = {"Let;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lsv;", "a", "Lsv;", "()Lsv;", "assistantSettings", "Lgu;", "b", "Lgu;", "()Lgu;", "generatorSettings", c.a, "Z", "()Z", "isRegeneration", "<init>", "(Lsv;Lgu;Z)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: et  reason: default package */
/* loaded from: classes2.dex */
public final class et implements Serializable {
    private final sv a;
    private final gu b;
    private final boolean c;

    public et(sv svVar, gu guVar, boolean z) {
        z65.h(svVar, "assistantSettings");
        z65.h(guVar, "generatorSettings");
        this.a = svVar;
        this.b = guVar;
        this.c = z;
    }

    public final sv a() {
        return this.a;
    }

    public final gu b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et)) {
            return false;
        }
        et etVar = (et) obj;
        if (z65.c(this.a, etVar.a) && z65.c(this.b, etVar.b) && this.c == etVar.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a91.a(this.c);
    }

    public String toString() {
        sv svVar = this.a;
        gu guVar = this.b;
        boolean z = this.c;
        return "AssistantGeneratorData(assistantSettings=" + svVar + ", generatorSettings=" + guVar + ", isRegeneration=" + z + ")";
    }

    public /* synthetic */ et(sv svVar, gu guVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(svVar, guVar, (i & 4) != 0 ? false : z);
    }
}
