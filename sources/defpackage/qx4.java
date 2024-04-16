package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: InAppConfigResponse.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lqx4;", "", "", "component1", "Lyx9;", "component2", "Ltmb;", "component3", "Lk54;", "component4", "id", "sdkVersion", "targeting", "form", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lyx9;", "getSdkVersion", "()Lyx9;", "Ltmb;", "getTargeting", "()Ltmb;", "Lk54;", "getForm", "()Lk54;", "<init>", "(Ljava/lang/String;Lyx9;Ltmb;Lk54;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: qx4  reason: default package */
/* loaded from: classes.dex */
public final class qx4 {
    @uca("form")
    private final k54 form;
    @uca("id")
    private final String id;
    @uca("sdkVersion")
    private final yx9 sdkVersion;
    @uca("targeting")
    private final tmb targeting;

    public qx4(String str, yx9 yx9Var, tmb tmbVar, k54 k54Var) {
        z65.h(str, "id");
        this.id = str;
        this.sdkVersion = yx9Var;
        this.targeting = tmbVar;
        this.form = k54Var;
    }

    public static /* synthetic */ qx4 copy$default(qx4 qx4Var, String str, yx9 yx9Var, tmb tmbVar, k54 k54Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qx4Var.id;
        }
        if ((i & 2) != 0) {
            yx9Var = qx4Var.sdkVersion;
        }
        if ((i & 4) != 0) {
            tmbVar = qx4Var.targeting;
        }
        if ((i & 8) != 0) {
            k54Var = qx4Var.form;
        }
        return qx4Var.copy(str, yx9Var, tmbVar, k54Var);
    }

    public final String component1() {
        return this.id;
    }

    public final yx9 component2() {
        return this.sdkVersion;
    }

    public final tmb component3() {
        return this.targeting;
    }

    public final k54 component4() {
        return this.form;
    }

    public final qx4 copy(String str, yx9 yx9Var, tmb tmbVar, k54 k54Var) {
        z65.h(str, "id");
        return new qx4(str, yx9Var, tmbVar, k54Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx4)) {
            return false;
        }
        qx4 qx4Var = (qx4) obj;
        if (z65.c(this.id, qx4Var.id) && z65.c(this.sdkVersion, qx4Var.sdkVersion) && z65.c(this.targeting, qx4Var.targeting) && z65.c(this.form, qx4Var.form)) {
            return true;
        }
        return false;
    }

    public final k54 getForm() {
        return this.form;
    }

    public final String getId() {
        return this.id;
    }

    public final yx9 getSdkVersion() {
        return this.sdkVersion;
    }

    public final tmb getTargeting() {
        return this.targeting;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.id.hashCode() * 31;
        yx9 yx9Var = this.sdkVersion;
        int i = 0;
        if (yx9Var == null) {
            hashCode = 0;
        } else {
            hashCode = yx9Var.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        tmb tmbVar = this.targeting;
        if (tmbVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = tmbVar.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        k54 k54Var = this.form;
        if (k54Var != null) {
            i = k54Var.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        return "InAppDto(id=" + this.id + ", sdkVersion=" + this.sdkVersion + ", targeting=" + this.targeting + ", form=" + this.form + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
