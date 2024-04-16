package defpackage;

import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: AssistantPreferencesData.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u000b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lfv;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lss;", "a", "Lss;", "C", "()Lss;", "environment", "Lsv;", "b", "Lsv;", "()Lsv;", "settings", "Lju;", c.a, "Lju;", "()Lju;", "selectedMood", "<init>", "(Lss;Lsv;Lju;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fv  reason: default package */
/* loaded from: classes2.dex */
public final class fv implements Serializable {
    private final ss a;
    private final sv b;
    private final ju c;

    public fv(ss ssVar, sv svVar, ju juVar) {
        z65.h(ssVar, "environment");
        z65.h(svVar, "settings");
        z65.h(juVar, "selectedMood");
        this.a = ssVar;
        this.b = svVar;
        this.c = juVar;
    }

    public final ss C() {
        return this.a;
    }

    public final ju a() {
        return this.c;
    }

    public final sv b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv)) {
            return false;
        }
        fv fvVar = (fv) obj;
        if (z65.c(this.a, fvVar.a) && z65.c(this.b, fvVar.b) && z65.c(this.c, fvVar.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        ss ssVar = this.a;
        sv svVar = this.b;
        ju juVar = this.c;
        return "AssistantPreferencesData(environment=" + ssVar + ", settings=" + svVar + ", selectedMood=" + juVar + ")";
    }
}
