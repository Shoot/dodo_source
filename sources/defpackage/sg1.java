package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: ComboAnalytics.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lsg1;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "templateId", "b", "templateName", c.a, "slotAction", DateTokenConverter.CONVERTER_KEY, "I", "slotPosition", "Lfl8;", e.a, "Lfl8;", "product", "f", "productPosition", "g", "previousProductPosition", "Lqd;", Image.TYPE_HIGH, "Lqd;", "sender", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfl8;IILqd;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: sg1  reason: default package */
/* loaded from: classes4.dex */
public final class sg1 implements dc {
    private final String a;
    private final String b;
    private final String c;
    private final int d;
    private final fl8 e;
    private final int f;
    private final int g;
    private final qd h;

    public sg1(String str, String str2, String str3, int i, fl8 fl8Var, int i2, int i3, qd qdVar) {
        z65.h(str, "templateId");
        z65.h(str2, "templateName");
        z65.h(str3, "slotAction");
        z65.h(qdVar, "sender");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = fl8Var;
        this.f = i2;
        this.g = i3;
        this.h = qdVar;
    }

    @Override // defpackage.dc
    public qc a() {
        String str;
        String str2;
        String str3;
        bc e = bc.e(bc.e(bc.e(bc.e(new bc("combo_builder"), "templateId", this.a, false, 4, null), "templateName", this.b, false, 4, null), "slotAction", this.c, false, 4, null), "slotPosition", Integer.valueOf(this.d), false, 4, null);
        fl8 fl8Var = this.e;
        String str4 = null;
        if (fl8Var != null) {
            str = fl8Var.getId();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        bc e2 = bc.e(e, ShoppingInfoEntity.FIELD_PRODUCT_ID, str, false, 4, null);
        fl8 fl8Var2 = this.e;
        if (fl8Var2 != null) {
            str2 = fl8Var2.getName();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        bc e3 = bc.e(e2, "productName", str3, false, 4, null);
        fl8 fl8Var3 = this.e;
        if (fl8Var3 != null) {
            str4 = fl8Var3.e();
        }
        return vc.z(bc.e(bc.e(bc.e(vc.j(e3, str4), "variant", uc.a.e(this.e), false, 4, null), "productPosition", Integer.valueOf(this.f), false, 4, null), "previousProductPosition", Integer.valueOf(this.g), false, 4, null), this.h).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg1)) {
            return false;
        }
        sg1 sg1Var = (sg1) obj;
        if (z65.c(this.a, sg1Var.a) && z65.c(this.b, sg1Var.b) && z65.c(this.c, sg1Var.c) && this.d == sg1Var.d && z65.c(this.e, sg1Var.e) && this.f == sg1Var.f && this.g == sg1Var.g && z65.c(this.h, sg1Var.h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31;
        fl8 fl8Var = this.e;
        if (fl8Var == null) {
            hashCode = 0;
        } else {
            hashCode = fl8Var.hashCode();
        }
        return ((((((hashCode2 + hashCode) * 31) + this.f) * 31) + this.g) * 31) + this.h.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        int i = this.d;
        fl8 fl8Var = this.e;
        int i2 = this.f;
        int i3 = this.g;
        qd qdVar = this.h;
        return "ComboBuilder(templateId=" + str + ", templateName=" + str2 + ", slotAction=" + str3 + ", slotPosition=" + i + ", product=" + fl8Var + ", productPosition=" + i2 + ", previousProductPosition=" + i3 + ", sender=" + qdVar + ")";
    }
}
