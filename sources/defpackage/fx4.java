package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: InAppConfig.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0015\u0012\u0006\u0010\u001e\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\t\u0010\u001d¨\u0006!"}, d2 = {"Lfx4;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "id", "Ljava/lang/Integer;", "getMinVersion", "()Ljava/lang/Integer;", "minVersion", c.a, "getMaxVersion", "maxVersion", "Lsmb;", DateTokenConverter.CONVERTER_KEY, "Lsmb;", "()Lsmb;", "targeting", "Lf54;", e.a, "Lf54;", "()Lf54;", "form", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lsmb;Lf54;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: fx4  reason: default package */
/* loaded from: classes.dex */
public final class fx4 {
    private final String a;
    private final Integer b;
    private final Integer c;
    private final smb d;
    private final f54 e;

    public fx4(String str, Integer num, Integer num2, smb smbVar, f54 f54Var) {
        z65.h(str, "id");
        z65.h(smbVar, "targeting");
        z65.h(f54Var, "form");
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = smbVar;
        this.e = f54Var;
    }

    public final f54 a() {
        return this.e;
    }

    public final String b() {
        return this.a;
    }

    public final smb c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx4)) {
            return false;
        }
        fx4 fx4Var = (fx4) obj;
        if (z65.c(this.a, fx4Var.a) && z65.c(this.b, fx4Var.b) && z65.c(this.c, fx4Var.c) && z65.c(this.d, fx4Var.d) && z65.c(this.e, fx4Var.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Integer num = this.b;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Integer num2 = this.c;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return ((((i2 + i) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "InApp(id=" + this.a + ", minVersion=" + this.b + ", maxVersion=" + this.c + ", targeting=" + this.d + ", form=" + this.e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
