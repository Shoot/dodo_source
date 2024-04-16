package defpackage;

import com.huawei.hms.push.e;
import defpackage.qr0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: RemoveFromCartQueueItemMerger.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lrd9;", "Lcv8;", "Lqr0$d;", "Luq0;", "cartItemId", "Lkotlin/Function1;", "Lnq0;", "", "f", "Llia;", "shoppingCart", "queueItem", e.a, "<init>", "()V", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: rd9  reason: default package */
/* loaded from: classes.dex */
public final class rd9 extends cv8<qr0.d> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RemoveFromCartQueueItemMerger.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnq0;", "current", "", "a", "(Lnq0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: rd9$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function1<nq0, Boolean> {
        final /* synthetic */ uq0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(uq0 uq0Var) {
            super(1);
            this.a = uq0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(nq0 nq0Var) {
            z65.h(nq0Var, "current");
            return Boolean.valueOf(z65.c(nq0Var.j(), this.a));
        }
    }

    private final Function1<nq0, Boolean> f(uq0 uq0Var) {
        return new a(uq0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public lia e(lia liaVar, qr0.d dVar) {
        ?? r2;
        nq0 invoke;
        lia invoke2;
        z65.h(liaVar, "shoppingCart");
        z65.h(dVar, "queueItem");
        Function1<nq0, Boolean> f = f(dVar.a());
        Iterator it = liaVar.f().iterator();
        while (true) {
            if (it.hasNext()) {
                r2 = it.next();
                if (f.invoke(r2).booleanValue()) {
                    break;
                }
            } else {
                r2 = 0;
                break;
            }
        }
        nq0 nq0Var = (nq0) r2;
        if (nq0Var != null && (invoke = c(dVar.b() * (-1)).invoke(nq0Var)) != null && (invoke2 = d(liaVar).invoke(invoke)) != null) {
            return invoke2;
        }
        return liaVar;
    }
}
