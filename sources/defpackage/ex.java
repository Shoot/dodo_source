package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: AssistantWishesData.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0019\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u000b\u0010\u0018R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0011\u0010\u001e¨\u0006\""}, d2 = {"Lex;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lss;", "a", "Lss;", "C", "()Lss;", "environment", "Lsv;", "b", "Lsv;", c.a, "()Lsv;", "settings", "Lju;", "Lju;", "()Lju;", "selectedMood", "", "Lav;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Set;", "()Ljava/util/Set;", "selectedPreferences", "<init>", "(Lss;Lsv;Lju;Ljava/util/Set;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ex  reason: default package */
/* loaded from: classes2.dex */
public final class ex implements Serializable {
    private final ss a;
    private final sv b;
    private final ju c;
    private final Set<av> d;

    public ex(ss ssVar, sv svVar, ju juVar, Set<av> set) {
        z65.h(ssVar, "environment");
        z65.h(svVar, "settings");
        z65.h(juVar, "selectedMood");
        z65.h(set, "selectedPreferences");
        this.a = ssVar;
        this.b = svVar;
        this.c = juVar;
        this.d = set;
    }

    public final ss C() {
        return this.a;
    }

    public final ju a() {
        return this.c;
    }

    public final Set<av> b() {
        return this.d;
    }

    public final sv c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex)) {
            return false;
        }
        ex exVar = (ex) obj;
        if (z65.c(this.a, exVar.a) && z65.c(this.b, exVar.b) && z65.c(this.c, exVar.c) && z65.c(this.d, exVar.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        ss ssVar = this.a;
        sv svVar = this.b;
        ju juVar = this.c;
        Set<av> set = this.d;
        return "AssistantWishesData(environment=" + ssVar + ", settings=" + svVar + ", selectedMood=" + juVar + ", selectedPreferences=" + set + ")";
    }
}
