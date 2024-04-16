package defpackage;

import com.dodopizza.persistence.entity.BonusActionEntity;
import com.huawei.hms.opendevice.c;
import defpackage.ti7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: OrderStateVOConverter.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lri7;", "Lqi7;", "Lbc7;", BonusActionEntity.ORDER, "Lpi7;", "a", "Ljgb;", "Ljgb;", "timeFormatter", "Lf5b;", "b", "Lf5b;", "systemTimeProvider", "Lhq3;", c.a, "Lhq3;", "featureService", "<init>", "(Ljgb;Lf5b;Lhq3;)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ri7  reason: default package */
/* loaded from: classes.dex */
public final class ri7 implements qi7 {
    private final jgb a;
    private final f5b b;
    private final hq3 c;

    /* compiled from: OrderStateVOConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ri7$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[mi7.values().length];
            try {
                iArr[mi7.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mi7.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mi7.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[mi7.f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[mi7.g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[mi7.h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[mi7.i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[mi7.j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[mi7.k.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[mi7.l.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[mi7.m.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[mi7.n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ri7(jgb jgbVar, f5b f5bVar, hq3 hq3Var) {
        z65.h(jgbVar, "timeFormatter");
        z65.h(f5bVar, "systemTimeProvider");
        z65.h(hq3Var, "featureService");
        this.a = jgbVar;
        this.b = f5bVar;
        this.c = hq3Var;
    }

    @Override // defpackage.qi7
    public pi7 a(bc7 bc7Var) {
        boolean z;
        boolean z2;
        boolean z3;
        z65.h(bc7Var, BonusActionEntity.ORDER);
        int a2 = bc7Var.A().a();
        int c = bc7Var.A().c();
        String c2 = this.a.c(bc7Var.z());
        String c3 = this.a.c(bc7Var.w());
        boolean z4 = false;
        if (bc7Var.x() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (bc7Var.E() == jk7.e.i()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bc7Var.C() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        switch (a.$EnumSwitchMapping$0[bc7Var.A().b().ordinal()]) {
            case 1:
                return new ti7.n(a2, c);
            case 2:
                if (z && !z2) {
                    z4 = true;
                }
                return new ti7.a(a2, c, z4, z2);
            case 3:
                if (this.c.a(bq3.f)) {
                    return new ti7.i(a2, c, c2);
                }
                return new ti7.h(a2, c, c2, c3);
            case 4:
                return new ti7.f(a2, c, c3);
            case 5:
                return new ti7.g(a2, c, c3);
            case 6:
                if (z && !z2) {
                    z4 = true;
                }
                return new ti7.d(a2, c, z4, z2);
            case 7:
                return new ti7.l(a2, c);
            case 8:
                if (z3) {
                    return new ti7.m(a2, c);
                }
                return new ti7.k(a2, c);
            case 9:
                if (bc7Var.x() - this.b.b() <= 0) {
                    return new ti7.e(a2, c, z);
                }
                return new ti7.j(a2, c, z);
            case 10:
                return new ti7.c(a2, c, z2);
            case 11:
                return new ti7.b(a2, c);
            case 12:
                return new ti7.e(a2, c, false, 4, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
