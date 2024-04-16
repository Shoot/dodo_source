package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.mv9;
import defpackage.qv9;
import kotlin.Metadata;
/* compiled from: ScheduleStatus.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lrv9;", "", "Lqv9$b;", c.a, "Lmv9$a;", "openFrom", DateTokenConverter.CONVERTER_KEY, "Lqv9$a;", "b", "openOn", "a", "", "toString", "", "hashCode", "other", "", "equals", "Lmv9$a;", "getCurrentDaySchedule", "()Lmv9$a;", "currentDaySchedule", "<init>", "(Lmv9$a;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: rv9  reason: default package */
/* loaded from: classes4.dex */
public final class rv9 {
    private final mv9.a a;

    public rv9(mv9.a aVar) {
        z65.h(aVar, "currentDaySchedule");
        this.a = aVar;
    }

    public final qv9.a a(mv9.a aVar) {
        z65.h(aVar, "openOn");
        return new qv9.a(this.a, aVar);
    }

    public final qv9.a b() {
        mv9.a aVar = this.a;
        return new qv9.a(aVar, aVar);
    }

    public final qv9.b c() {
        mv9.a aVar = this.a;
        return new qv9.b(aVar, aVar);
    }

    public final qv9.b d(mv9.a aVar) {
        z65.h(aVar, "openFrom");
        return new qv9.b(this.a, aVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof rv9) && z65.c(this.a, ((rv9) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        mv9.a aVar = this.a;
        return "ScheduleStatusBuilder(currentDaySchedule=" + aVar + ")";
    }
}
