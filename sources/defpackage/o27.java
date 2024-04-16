package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import defpackage.efb;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: NotificationFactory.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lo27;", "Ln27;", "Lu27;", "notificationMessage", "Lb37;", "b", "Lvw1;", "a", "Lgc;", "Lgc;", "analytics", "Ly27;", "Ly27;", "filter", "Lefb$b;", c.a, "Lefb$b;", "threadsLibNotificationFactory", "Lgk7;", DateTokenConverter.CONVERTER_KEY, "Lgk7;", "orderTrackingNotificationFactory", "<init>", "(Lgc;Ly27;Lefb$b;Lgk7;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: o27  reason: default package */
/* loaded from: classes3.dex */
public final class o27 implements n27 {
    private final gc a;
    private final y27 b;
    private final efb.b c;
    private final gk7 d;

    /* compiled from: NotificationFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o27$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b37.values().length];
            try {
                iArr[b37.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b37.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b37.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b37.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o27(gc gcVar, y27 y27Var, efb.b bVar, gk7 gk7Var) {
        z65.h(gcVar, "analytics");
        z65.h(y27Var, "filter");
        z65.h(bVar, "threadsLibNotificationFactory");
        z65.h(gk7Var, "orderTrackingNotificationFactory");
        this.a = gcVar;
        this.b = y27Var;
        this.c = bVar;
        this.d = gk7Var;
    }

    private final b37 b(u27 u27Var) {
        Map<String, String> a2 = u27Var.a();
        if (z65.c(a2.get(KustoStorage.KustoTable.COLUMN_SOURCE), x27.b.i())) {
            return b37.d;
        }
        if (z65.c(a2.get(KustoStorage.KustoTable.COLUMN_SOURCE), x27.c.i())) {
            return b37.f;
        }
        if (a2.containsKey("uniqueKey")) {
            return b37.b;
        }
        if (efb.g.a(u27Var)) {
            return b37.e;
        }
        return null;
    }

    @Override // defpackage.n27
    public vw1 a(u27 u27Var) {
        int i;
        vw1 lk6Var;
        z65.h(u27Var, "notificationMessage");
        b37 b = b(u27Var);
        if (b == null) {
            i = -1;
        } else {
            i = a.$EnumSwitchMapping$0[b.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return this.c.a(u27Var);
                }
                lk6Var = new gk1(u27Var, this.a);
            } else {
                return this.d.a(u27Var, this.a, this.b);
            }
        } else {
            lk6Var = new lk6(u27Var, this.a);
        }
        return lk6Var;
    }
}
