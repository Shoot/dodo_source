package defpackage;

import com.huawei.hms.push.e;
import defpackage.qr0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: EditInCartQueueItemMerger.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\"\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¨\u0006\u0013"}, d2 = {"Lvd3;", "Lcv8;", "Lqr0$c;", "Luq0;", "cartItemId", "Lkotlin/Function1;", "Lnq0;", "", "g", "", "Ldq0;", "comboProducts", "f", "Llia;", "shoppingCart", "queueItem", e.a, "<init>", "()V", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: vd3  reason: default package */
/* loaded from: classes.dex */
public final class vd3 extends cv8<qr0.c> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditInCartQueueItemMerger.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lnq0;", "cartItem", "a", "(Lnq0;)Lnq0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: vd3$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function1<nq0, nq0> {
        final /* synthetic */ List<dq0> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<dq0> list) {
            super(1);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final nq0 invoke(nq0 nq0Var) {
            nq0 a;
            z65.h(nq0Var, "cartItem");
            a = nq0Var.a((r44 & 1) != 0 ? nq0Var.a : null, (r44 & 2) != 0 ? nq0Var.b : 0, (r44 & 4) != 0 ? nq0Var.c : null, (r44 & 8) != 0 ? nq0Var.d : 0, (r44 & 16) != 0 ? nq0Var.e : 0, (r44 & 32) != 0 ? nq0Var.f : null, (r44 & 64) != 0 ? nq0Var.g : null, (r44 & 128) != 0 ? nq0Var.h : 0, (r44 & 256) != 0 ? nq0Var.i : 0.0f, (r44 & 512) != 0 ? nq0Var.j : null, (r44 & 1024) != 0 ? nq0Var.k : null, (r44 & 2048) != 0 ? nq0Var.l : false, (r44 & 4096) != 0 ? nq0Var.m : 0, (r44 & 8192) != 0 ? nq0Var.n : null, (r44 & 16384) != 0 ? nq0Var.o : 0, (r44 & 32768) != 0 ? nq0Var.p : null, (r44 & 65536) != 0 ? nq0Var.q : 0, (r44 & 131072) != 0 ? nq0Var.r : null, (r44 & 262144) != 0 ? nq0Var.s : null, (r44 & 524288) != 0 ? nq0Var.t : null, (r44 & 1048576) != 0 ? nq0Var.u : null, (r44 & 2097152) != 0 ? nq0Var.v : 0, (r44 & 4194304) != 0 ? nq0Var.w : null, (r44 & 8388608) != 0 ? nq0Var.x : this.a, (r44 & 16777216) != 0 ? nq0Var.y : null, (r44 & 33554432) != 0 ? nq0Var.z : false);
            return a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditInCartQueueItemMerger.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnq0;", "current", "", "a", "(Lnq0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: vd3$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function1<nq0, Boolean> {
        final /* synthetic */ uq0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(uq0 uq0Var) {
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

    private final Function1<nq0, nq0> f(List<dq0> list) {
        return new a(list);
    }

    private final Function1<nq0, Boolean> g(uq0 uq0Var) {
        return new b(uq0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    public lia e(lia liaVar, qr0.c cVar) {
        ?? r4;
        nq0 invoke;
        List r0;
        lia a2;
        z65.h(liaVar, "shoppingCart");
        z65.h(cVar, "queueItem");
        Function1<nq0, Boolean> g = g(cVar.a());
        Iterator it = liaVar.f().iterator();
        while (true) {
            if (it.hasNext()) {
                r4 = it.next();
                if (g.invoke(r4).booleanValue()) {
                    break;
                }
            } else {
                r4 = 0;
                break;
            }
        }
        nq0 nq0Var = (nq0) r4;
        if (nq0Var != null && (invoke = f(cVar.w0()).invoke(nq0Var)) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : liaVar.f()) {
                if (!z65.c(((nq0) obj).j(), invoke.j())) {
                    arrayList.add(obj);
                }
            }
            r0 = sc1.r0(arrayList, invoke);
            a2 = liaVar.a((r28 & 1) != 0 ? liaVar.a : null, (r28 & 2) != 0 ? liaVar.b : r0, (r28 & 4) != 0 ? liaVar.c : 0, (r28 & 8) != 0 ? liaVar.d : null, (r28 & 16) != 0 ? liaVar.e : null, (r28 & 32) != 0 ? liaVar.f : null, (r28 & 64) != 0 ? liaVar.g : null, (r28 & 128) != 0 ? liaVar.h : null, (r28 & 256) != 0 ? liaVar.i : 0.0d, (r28 & 512) != 0 ? liaVar.j : null, (r28 & 1024) != 0 ? liaVar.k : null, (r28 & 2048) != 0 ? liaVar.l : false);
            if (a2 != null) {
                return a2;
            }
        }
        return liaVar;
    }
}
