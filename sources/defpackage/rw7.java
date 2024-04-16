package defpackage;

import com.dodopizza.persistence.entity.payment.PaymentMethodEntity;
import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PaymentWayRepository.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012¨\u0006\u0016"}, d2 = {"Lrw7;", "Lqw7;", "", "Ljw7;", "b", "", "clear", "models", "", "a", "", "id", c.a, "Lgk2;", "Lcom/dodopizza/persistence/entity/payment/PaymentMethodEntity;", "Lgk2;", "dao", "Low7;", "Low7;", "paymentWayMapper", "<init>", "(Lgk2;Low7;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: rw7  reason: default package */
/* loaded from: classes2.dex */
public final class rw7 implements qw7 {
    private final gk2<PaymentMethodEntity> a;
    private final ow7 b;

    public rw7(gk2<PaymentMethodEntity> gk2Var, ow7 ow7Var) {
        z65.h(gk2Var, "dao");
        z65.h(ow7Var, "paymentWayMapper");
        this.a = gk2Var;
        this.b = ow7Var;
    }

    @Override // defpackage.qw7
    /* renamed from: a */
    public List<jw7> save(Collection<? extends jw7> collection) {
        List<jw7> l;
        int w;
        int w2;
        z65.h(collection, "models");
        ArrayList arrayList = null;
        if (collection.isEmpty()) {
            collection = null;
        }
        if (collection != null) {
            gk2<PaymentMethodEntity> gk2Var = this.a;
            Collection<? extends jw7> collection2 = collection;
            ow7 ow7Var = this.b;
            w = lc1.w(collection2, 10);
            ArrayList arrayList2 = new ArrayList(w);
            for (jw7 jw7Var : collection2) {
                arrayList2.add(ow7Var.b(jw7Var));
            }
            Collection<PaymentMethodEntity> save = gk2Var.save(arrayList2);
            ow7 ow7Var2 = this.b;
            w2 = lc1.w(save, 10);
            arrayList = new ArrayList(w2);
            for (PaymentMethodEntity paymentMethodEntity : save) {
                arrayList.add(ow7Var2.a(paymentMethodEntity));
            }
        }
        if (arrayList == null) {
            l = kc1.l();
            return l;
        }
        return arrayList;
    }

    @Override // defpackage.qw7
    public Collection<jw7> b() {
        int w;
        List<PaymentMethodEntity> b = this.a.b();
        ow7 ow7Var = this.b;
        w = lc1.w(b, 10);
        ArrayList arrayList = new ArrayList(w);
        for (PaymentMethodEntity paymentMethodEntity : b) {
            arrayList.add(ow7Var.a(paymentMethodEntity));
        }
        return arrayList;
    }

    @Override // defpackage.qw7
    public void c(String str) {
        z65.h(str, "id");
        this.a.c(str);
    }

    @Override // defpackage.qw7
    public void clear() {
        this.a.e();
    }
}
