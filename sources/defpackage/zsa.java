package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: StackGameParamsVO.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001\u0017BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b/\u00100J[\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b\"\u0010*R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u0018\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010,\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lzsa;", "", "", "gameUrl", "Lh81;", "claimedReward", "Lyd7;", "rules", "Lpc4;", "settings", "Lnc4;", "environmentSettings", "Lssa;", "animations", "gameSessionUuid", "", "isCounterVisible", "b", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", Image.TYPE_HIGH, "()Ljava/lang/String;", "Lh81;", e.a, "()Lh81;", c.a, "Lyd7;", "i", "()Lyd7;", DateTokenConverter.CONVERTER_KEY, "Lpc4;", "j", "()Lpc4;", "Lnc4;", "f", "()Lnc4;", "Lssa;", "()Lssa;", "g", "Z", "k", "()Z", "<init>", "(Ljava/lang/String;Lh81;Lyd7;Lpc4;Lnc4;Lssa;Ljava/lang/String;Z)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zsa  reason: default package */
/* loaded from: classes2.dex */
public final class zsa {
    public static final a i = new a(null);
    private static final zsa j = new zsa("", null, new yd7(0.0d, 0.0f, 0, 0), new pc4("", "", false, null, new bta(0.0d, 0.0f, 0, 0), null), new nc4(1, "", "", "", ""), new ssa("", ""), "", true);
    private final String a;
    private final h81 b;
    private final yd7 c;
    private final pc4 d;
    private final nc4 e;
    private final ssa f;
    private final String g;
    private final boolean h;

    /* compiled from: StackGameParamsVO.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lzsa$a;", "", "Lzsa;", "DEFAULT", "Lzsa;", "a", "()Lzsa;", "<init>", "()V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zsa$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final zsa a() {
            return zsa.j;
        }
    }

    public zsa(String str, h81 h81Var, yd7 yd7Var, pc4 pc4Var, nc4 nc4Var, ssa ssaVar, String str2, boolean z) {
        z65.h(str, "gameUrl");
        z65.h(yd7Var, "rules");
        z65.h(pc4Var, "settings");
        z65.h(nc4Var, "environmentSettings");
        z65.h(ssaVar, "animations");
        z65.h(str2, "gameSessionUuid");
        this.a = str;
        this.b = h81Var;
        this.c = yd7Var;
        this.d = pc4Var;
        this.e = nc4Var;
        this.f = ssaVar;
        this.g = str2;
        this.h = z;
    }

    public static /* synthetic */ zsa c(zsa zsaVar, String str, h81 h81Var, yd7 yd7Var, pc4 pc4Var, nc4 nc4Var, ssa ssaVar, String str2, boolean z, int i2, Object obj) {
        String str3;
        h81 h81Var2;
        yd7 yd7Var2;
        pc4 pc4Var2;
        nc4 nc4Var2;
        ssa ssaVar2;
        String str4;
        boolean z2;
        if ((i2 & 1) != 0) {
            str3 = zsaVar.a;
        } else {
            str3 = str;
        }
        if ((i2 & 2) != 0) {
            h81Var2 = zsaVar.b;
        } else {
            h81Var2 = h81Var;
        }
        if ((i2 & 4) != 0) {
            yd7Var2 = zsaVar.c;
        } else {
            yd7Var2 = yd7Var;
        }
        if ((i2 & 8) != 0) {
            pc4Var2 = zsaVar.d;
        } else {
            pc4Var2 = pc4Var;
        }
        if ((i2 & 16) != 0) {
            nc4Var2 = zsaVar.e;
        } else {
            nc4Var2 = nc4Var;
        }
        if ((i2 & 32) != 0) {
            ssaVar2 = zsaVar.f;
        } else {
            ssaVar2 = ssaVar;
        }
        if ((i2 & 64) != 0) {
            str4 = zsaVar.g;
        } else {
            str4 = str2;
        }
        if ((i2 & 128) != 0) {
            z2 = zsaVar.h;
        } else {
            z2 = z;
        }
        return zsaVar.b(str3, h81Var2, yd7Var2, pc4Var2, nc4Var2, ssaVar2, str4, z2);
    }

    public final zsa b(String str, h81 h81Var, yd7 yd7Var, pc4 pc4Var, nc4 nc4Var, ssa ssaVar, String str2, boolean z) {
        z65.h(str, "gameUrl");
        z65.h(yd7Var, "rules");
        z65.h(pc4Var, "settings");
        z65.h(nc4Var, "environmentSettings");
        z65.h(ssaVar, "animations");
        z65.h(str2, "gameSessionUuid");
        return new zsa(str, h81Var, yd7Var, pc4Var, nc4Var, ssaVar, str2, z);
    }

    public final ssa d() {
        return this.f;
    }

    public final h81 e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsa)) {
            return false;
        }
        zsa zsaVar = (zsa) obj;
        if (z65.c(this.a, zsaVar.a) && z65.c(this.b, zsaVar.b) && z65.c(this.c, zsaVar.c) && z65.c(this.d, zsaVar.d) && z65.c(this.e, zsaVar.e) && z65.c(this.f, zsaVar.f) && z65.c(this.g, zsaVar.g) && this.h == zsaVar.h) {
            return true;
        }
        return false;
    }

    public final nc4 f() {
        return this.e;
    }

    public final String g() {
        return this.g;
    }

    public final String h() {
        return this.a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        h81 h81Var = this.b;
        if (h81Var == null) {
            hashCode = 0;
        } else {
            hashCode = h81Var.hashCode();
        }
        return ((((((((((((hashCode2 + hashCode) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + a91.a(this.h);
    }

    public final yd7 i() {
        return this.c;
    }

    public final pc4 j() {
        return this.d;
    }

    public final boolean k() {
        return this.h;
    }

    public String toString() {
        String str = this.a;
        h81 h81Var = this.b;
        yd7 yd7Var = this.c;
        pc4 pc4Var = this.d;
        nc4 nc4Var = this.e;
        ssa ssaVar = this.f;
        String str2 = this.g;
        boolean z = this.h;
        return "StackGameParamsVO(gameUrl=" + str + ", claimedReward=" + h81Var + ", rules=" + yd7Var + ", settings=" + pc4Var + ", environmentSettings=" + nc4Var + ", animations=" + ssaVar + ", gameSessionUuid=" + str2 + ", isCounterVisible=" + z + ")";
    }
}
