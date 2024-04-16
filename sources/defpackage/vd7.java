package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: OrderGameAnalytics.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lvd7;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "orderUUID", "b", "gameSessionUuid", c.a, "Z", "rewardAvailable", DateTokenConverter.CONVERTER_KEY, "I", "tryCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vd7  reason: default package */
/* loaded from: classes4.dex */
public final class vd7 implements dc {
    private final String a;
    private final String b;
    private final boolean c;
    private final int d;

    public vd7(String str, String str2, boolean z, int i) {
        z65.h(str, "orderUUID");
        z65.h(str2, "gameSessionUuid");
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
    }

    @Override // defpackage.dc
    public qc a() {
        return bc.e(bc.e(bc.e(vc.t(new bc("active_order_game_start"), this.a), "gameSessionUUId", this.b, false, 4, null), "rewardAvailable", Boolean.valueOf(this.c), false, 4, null), "tryNumber", Integer.valueOf(this.d), false, 4, null).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd7)) {
            return false;
        }
        vd7 vd7Var = (vd7) obj;
        if (z65.c(this.a, vd7Var.a) && z65.c(this.b, vd7Var.b) && this.c == vd7Var.c && this.d == vd7Var.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a91.a(this.c)) * 31) + this.d;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        boolean z = this.c;
        int i = this.d;
        return "OrderGameStart(orderUUID=" + str + ", gameSessionUuid=" + str2 + ", rewardAvailable=" + z + ", tryCount=" + i + ")";
    }
}
