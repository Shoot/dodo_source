package com.dodopizza.activeorder.feature.activeorderwidget.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.activeorder.feature.activeorderwidget.presentation.e;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: ActiveOrderConverter.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010&\u001a\u00020$¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J \u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\u001a\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J(\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\fH\u0002J\u0012\u0010\u001d\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010%¨\u0006)"}, d2 = {"Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/a;", "Lb5;", "Lbc7;", BonusActionEntity.ORDER, "Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/e;", "b", "", "orderNumber", "", "timeRemaining", "Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/e$b;", "l", "", "timeTo", "k", Image.TYPE_HIGH, "i", "", "isDelivery", "Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/e$c;", com.huawei.hms.opendevice.c.a, "f", "j", "isDeliveryToTable", "Lcom/dodopizza/activeorder/feature/activeorderwidget/presentation/e$d;", "g", DateTokenConverter.CONVERTER_KEY, "timeFrom", com.huawei.hms.push.e.a, "a", "Ljgb;", "Ljgb;", "timeFormatter", "Lf5b;", "Lf5b;", "systemTimeProvider", "Lhq3;", "Lhq3;", "featureService", "<init>", "(Ljgb;Lf5b;Lhq3;)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class a implements b5 {
    private final jgb a;
    private final f5b b;
    private final hq3 c;

    /* compiled from: ActiveOrderConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.dodopizza.activeorder.feature.activeorderwidget.presentation.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0107a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[mi7.values().length];
            try {
                iArr[mi7.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mi7.m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mi7.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[mi7.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[mi7.g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[mi7.f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[mi7.h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[mi7.i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[mi7.j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[mi7.k.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[mi7.l.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[mi7.n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(jgb jgbVar, f5b f5bVar, hq3 hq3Var) {
        z65.h(jgbVar, "timeFormatter");
        z65.h(f5bVar, "systemTimeProvider");
        z65.h(hq3Var, "featureService");
        this.a = jgbVar;
        this.b = f5bVar;
        this.c = hq3Var;
    }

    private final e b(bc7 bc7Var) {
        boolean z;
        int e = bc7Var.e();
        String c = this.a.c(bc7Var.z());
        String c2 = this.a.c(bc7Var.w());
        boolean z2 = false;
        if (bc7Var.E() == jk7.e.i()) {
            z = true;
        } else {
            z = false;
        }
        if (bc7Var.C() != null) {
            z2 = true;
        }
        long x = bc7Var.x() - this.b.b();
        switch (C0107a.$EnumSwitchMapping$0[bc7Var.A().b().ordinal()]) {
            case 1:
                return e.a.d;
            case 2:
                return i(e, x);
            case 3:
                return h(e, x);
            case 4:
                return e(e, c2, x, c);
            case 5:
            case 6:
                return k(e, c2, x);
            case 7:
                return d(z, e, x);
            case 8:
                return l(e, x);
            case 9:
                return g(z2, e);
            case 10:
                return f(e, x);
            case 11:
                return c(z, e);
            case 12:
                return j(e);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final e.c c(boolean z, int i) {
        boolean a = this.c.a(bq3.i);
        if (z && a) {
            return new e.c(d19.order_num_title, d19.order_state_do_you_like, i, Integer.valueOf(d19.order_state_leave_tips));
        }
        return new e.c(d19.order_num_title, d19.order_state_do_you_like, i, Integer.valueOf(d19.order_state_leave_comment));
    }

    private final e.b d(boolean z, int i, long j) {
        if (z) {
            return new e.b(d19.order_num_title, d19.order_state_cooking, i, new String[0], j, false, null, 64, null);
        }
        if (j >= TimeUnit.MINUTES.toMillis(2L)) {
            return new e.b(d19.order_num_title, d19.order_state_cooking, i, new String[0], j, true, null, 64, null);
        }
        return new e.b(d19.order_num_title, d19.order_state_cooking, i, new String[0], j, true, Integer.valueOf(d19.sorry_for_late_in_restaurant));
    }

    private final e.b e(int i, String str, long j, String str2) {
        if (this.c.a(bq3.f)) {
            return new e.b(d19.order_num_title, d19.order_state_deliver_by, i, new String[]{str}, j, false, null, 64, null);
        }
        return new e.b(d19.order_num_title, d19.order_state_deliver_from_to, i, new String[]{str2, str}, j, false, null, 64, null);
    }

    private final e.b f(int i, long j) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        if (j <= timeUnit.toMillis(2L)) {
            return new e.b(d19.order_num_title, d19.order_state_courier_is_late, i, new String[0], timeUnit.toMillis(2L), true, Integer.valueOf(d19.sorry_for_late_on_delivery));
        }
        return new e.b(d19.order_num_title, d19.order_state_on_delivery, i, new String[0], j, true, null, 64, null);
    }

    private final e.d g(boolean z, int i) {
        if (z) {
            return new e.d(d19.order_num_title, d19.carry_the_order, i);
        }
        return new e.d(d19.order_num_title, d19.order_state_ready_for_carryout, i);
    }

    private final e.b h(int i, long j) {
        return new e.b(d19.order_num_title, d19.order_state_accepted, i, new String[0], j, false, null, 64, null);
    }

    private final e.b i(int i, long j) {
        return new e.b(d19.order_num_title, d19.order_state_was_cancelled, i, new String[0], j, false, null, 64, null);
    }

    private final e.b j(int i) {
        return new e.b(d19.order_num_title, d19.order_state_courier_is_late, i, new String[0], TimeUnit.MINUTES.toMillis(2L), true, Integer.valueOf(d19.sorry_for_late_on_delivery));
    }

    private final e.b k(int i, String str, long j) {
        return new e.b(d19.order_num_title, d19.order_state_will_be_ready_by, i, new String[]{str}, j, false, null, 64, null);
    }

    private final e.b l(int i, long j) {
        return new e.b(d19.order_num_title, d19.order_state_ready_for_delivery, i, new String[0], j, false, null, 64, null);
    }

    @Override // defpackage.b5
    public e a(bc7 bc7Var) {
        e b;
        if (bc7Var == null || (b = b(bc7Var)) == null) {
            return e.a.d;
        }
        return b;
    }
}
