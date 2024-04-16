package defpackage;

import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.huawei.hms.opendevice.c;
import defpackage.kp7;
import defpackage.li7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: WaitForPaidOrderService.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lv2c;", "Lu2c;", "Ljp7;", "Lkp7;", "b", "", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "a", "Lli7;", "Lli7;", "orderService", "Lx51;", "Lx51;", "checkoutService", "Lf8c;", c.a, "Lf8c;", "workflowIdProvider", "<init>", "(Lli7;Lx51;Lf8c;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: v2c  reason: default package */
/* loaded from: classes4.dex */
public final class v2c implements u2c {
    private final li7 a;
    private final x51 b;
    private final f8c c;

    /* compiled from: WaitForPaidOrderService.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: v2c$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[lp7.values().length];
            try {
                iArr[lp7.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lp7.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lp7.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[lp7.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public v2c(li7 li7Var, x51 x51Var, f8c f8cVar) {
        z65.h(li7Var, "orderService");
        z65.h(x51Var, "checkoutService");
        z65.h(f8cVar, "workflowIdProvider");
        this.a = li7Var;
        this.b = x51Var;
        this.c = f8cVar;
    }

    private final kp7 b(jp7 jp7Var) {
        int i = a.$EnumSwitchMapping$0[jp7Var.c().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return kp7.b.a;
        }
        return new kp7.a(jp7Var.b());
    }

    @Override // defpackage.u2c
    public kp7 a(String str) {
        z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        String b = this.c.b();
        if (z65.c(str, b)) {
            kp7 b2 = b(li7.a.a(this.a, b, 0, 2, null));
            if (b2 instanceof kp7.a) {
                this.b.b();
                return b2;
            }
            return b2;
        }
        return kp7.d.a;
    }
}
