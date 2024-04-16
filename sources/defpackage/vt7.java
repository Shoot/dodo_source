package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.et7;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PaymentMethodListVO.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"JA\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b \u0010\u001c¨\u0006#"}, d2 = {"Lvt7;", "", "", "Let7$c;", "paymentWays", "Let7$b;", "email", "", "emailCheckEnabled", "Let7$d;", "taxPayerIdVO", "taxPayerEnabled", "a", "", "toString", "", "hashCode", "other", "equals", "Ljava/util/List;", e.a, "()Ljava/util/List;", "b", "Let7$b;", c.a, "()Let7$b;", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "Let7$d;", "g", "()Let7$d;", "f", "<init>", "(Ljava/util/List;Let7$b;ZLet7$d;Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: vt7  reason: default package */
/* loaded from: classes4.dex */
public final class vt7 {
    private final List<et7.c> a;
    private final et7.b b;
    private final boolean c;
    private final et7.d d;
    private final boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public vt7(List<? extends et7.c> list, et7.b bVar, boolean z, et7.d dVar, boolean z2) {
        z65.h(list, "paymentWays");
        z65.h(bVar, "email");
        z65.h(dVar, "taxPayerIdVO");
        this.a = list;
        this.b = bVar;
        this.c = z;
        this.d = dVar;
        this.e = z2;
    }

    public static /* synthetic */ vt7 b(vt7 vt7Var, List list, et7.b bVar, boolean z, et7.d dVar, boolean z2, int i, Object obj) {
        List<et7.c> list2 = list;
        if ((i & 1) != 0) {
            list2 = vt7Var.a;
        }
        if ((i & 2) != 0) {
            bVar = vt7Var.b;
        }
        et7.b bVar2 = bVar;
        if ((i & 4) != 0) {
            z = vt7Var.c;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            dVar = vt7Var.d;
        }
        et7.d dVar2 = dVar;
        if ((i & 16) != 0) {
            z2 = vt7Var.e;
        }
        return vt7Var.a(list2, bVar2, z3, dVar2, z2);
    }

    public final vt7 a(List<? extends et7.c> list, et7.b bVar, boolean z, et7.d dVar, boolean z2) {
        z65.h(list, "paymentWays");
        z65.h(bVar, "email");
        z65.h(dVar, "taxPayerIdVO");
        return new vt7(list, bVar, z, dVar, z2);
    }

    public final et7.b c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    public final List<et7.c> e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt7)) {
            return false;
        }
        vt7 vt7Var = (vt7) obj;
        if (z65.c(this.a, vt7Var.a) && z65.c(this.b, vt7Var.b) && this.c == vt7Var.c && z65.c(this.d, vt7Var.d) && this.e == vt7Var.e) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.e;
    }

    public final et7.d g() {
        return this.d;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a91.a(this.c)) * 31) + this.d.hashCode()) * 31) + a91.a(this.e);
    }

    public String toString() {
        List<et7.c> list = this.a;
        et7.b bVar = this.b;
        boolean z = this.c;
        et7.d dVar = this.d;
        boolean z2 = this.e;
        return "PaymentMethodListVO(paymentWays=" + list + ", email=" + bVar + ", emailCheckEnabled=" + z + ", taxPayerIdVO=" + dVar + ", taxPayerEnabled=" + z2 + ")";
    }
}
