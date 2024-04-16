package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: AssistantGeneratorResultData.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010$\u001a\u00020 ¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\n\u0010\u001aR\u0017\u0010\u001f\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u000f\u0010\u001eR\u0017\u0010$\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0013\u0010#¨\u0006'"}, d2 = {"Lst;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "isConfiguredByUser", "b", e.a, "isRegeneration", "Lss;", c.a, "Lss;", "C", "()Lss;", "environment", "Lsv;", "Lsv;", "()Lsv;", "assistantSettings", "Lgu;", "Lgu;", "()Lgu;", "generatorSettings", "Lnt;", "f", "Lnt;", "()Lnt;", "result", "<init>", "(ZZLss;Lsv;Lgu;Lnt;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: st  reason: default package */
/* loaded from: classes2.dex */
public final class st implements Serializable {
    private final boolean a;
    private final boolean b;
    private final ss c;
    private final sv d;
    private final gu e;
    private final nt f;

    public st(boolean z, boolean z2, ss ssVar, sv svVar, gu guVar, nt ntVar) {
        z65.h(ssVar, "environment");
        z65.h(svVar, "assistantSettings");
        z65.h(guVar, "generatorSettings");
        z65.h(ntVar, "result");
        this.a = z;
        this.b = z2;
        this.c = ssVar;
        this.d = svVar;
        this.e = guVar;
        this.f = ntVar;
    }

    public final ss C() {
        return this.c;
    }

    public final sv a() {
        return this.d;
    }

    public final gu b() {
        return this.e;
    }

    public final nt c() {
        return this.f;
    }

    public final boolean d() {
        return this.a;
    }

    public final boolean e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st)) {
            return false;
        }
        st stVar = (st) obj;
        if (this.a == stVar.a && this.b == stVar.b && z65.c(this.c, stVar.c) && z65.c(this.d, stVar.d) && z65.c(this.e, stVar.e) && z65.c(this.f, stVar.f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((a91.a(this.a) * 31) + a91.a(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        ss ssVar = this.c;
        sv svVar = this.d;
        gu guVar = this.e;
        nt ntVar = this.f;
        return "AssistantGeneratorResultData(isConfiguredByUser=" + z + ", isRegeneration=" + z2 + ", environment=" + ssVar + ", assistantSettings=" + svVar + ", generatorSettings=" + guVar + ", result=" + ntVar + ")";
    }
}
