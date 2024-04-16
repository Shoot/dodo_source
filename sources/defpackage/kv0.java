package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.opendevice.c;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: ChangeTopping.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lkv0;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", ShoppingInfoEntity.FIELD_PRODUCT_ID, "Ljjb;", "b", "Ljjb;", "toppingVO", "Lijb;", c.a, "Lijb;", "toppingType", "Lqd;", DateTokenConverter.CONVERTER_KEY, "Lqd;", "sender", "<init>", "(Ljava/lang/String;Ljjb;Lijb;Lqd;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: kv0  reason: default package */
/* loaded from: classes4.dex */
public final class kv0 implements dc {
    private final String a;
    private final jjb b;
    private final ijb c;
    private final qd d;

    public kv0(String str, jjb jjbVar, ijb ijbVar, qd qdVar) {
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(jjbVar, "toppingVO");
        z65.h(ijbVar, "toppingType");
        z65.h(qdVar, "sender");
        this.a = str;
        this.b = jjbVar;
        this.c = ijbVar;
        this.d = qdVar;
    }

    @Override // defpackage.dc
    public qc a() {
        return vc.z(bc.e(bc.e(bc.e(bc.e(bc.e(new bc("change_ingredient"), Action.NAME_ATTRIBUTE, this.b.c(), false, 4, null), "price", Double.valueOf(this.b.e().a()), false, 4, null), ShoppingInfoEntity.FIELD_PRODUCT_ID, this.a, false, 4, null), "toppingId", this.b.d(), false, 4, null), MessageAttributes.TYPE, this.c.a(), false, 4, null), this.d).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv0)) {
            return false;
        }
        kv0 kv0Var = (kv0) obj;
        if (z65.c(this.a, kv0Var.a) && z65.c(this.b, kv0Var.b) && z65.c(this.c, kv0Var.c) && z65.c(this.d, kv0Var.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.a;
        jjb jjbVar = this.b;
        ijb ijbVar = this.c;
        qd qdVar = this.d;
        return "ChangeTopping(productId=" + str + ", toppingVO=" + jjbVar + ", toppingType=" + ijbVar + ", sender=" + qdVar + ")";
    }
}
