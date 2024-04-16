package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SizeGroup.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\rB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0004HÖ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Lfna;", "", "", "id", "", Action.NAME_ATTRIBUTE, "shortName", "b", "toString", "hashCode", "other", "", "equals", "a", "I", DateTokenConverter.CONVERTER_KEY, "()I", "Ljava/lang/String;", e.a, "()Ljava/lang/String;", c.a, "f", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: fna  reason: default package */
/* loaded from: classes.dex */
public final class fna {
    public static final a d = new a(null);
    private static final fna e = new fna(0, "", "");
    private final int a;
    private final String b;
    private final String c;

    /* compiled from: SizeGroup.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lfna$a;", "", "Lfna;", "EMPTY", "Lfna;", "a", "()Lfna;", "<init>", "()V", "common"}, k = 1, mv = {1, 9, 0})
    /* renamed from: fna$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final fna a() {
            return fna.e;
        }
    }

    public fna(int i, String str, String str2) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, "shortName");
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public static /* synthetic */ fna c(fna fnaVar, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fnaVar.a;
        }
        if ((i2 & 2) != 0) {
            str = fnaVar.b;
        }
        if ((i2 & 4) != 0) {
            str2 = fnaVar.c;
        }
        return fnaVar.b(i, str, str2);
    }

    public final fna b(int i, String str, String str2) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, "shortName");
        return new fna(i, str, str2);
    }

    public final int d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fna)) {
            return false;
        }
        fna fnaVar = (fna) obj;
        if (this.a == fnaVar.a && z65.c(this.b, fnaVar.b) && z65.c(this.c, fnaVar.c)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.c;
    }

    public int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        int i = this.a;
        String str = this.b;
        String str2 = this.c;
        return "SizeGroup(id=" + i + ", name=" + str + ", shortName=" + str2 + ")";
    }
}
