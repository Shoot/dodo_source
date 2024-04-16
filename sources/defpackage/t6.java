package defpackage;

import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.kl8;
import defpackage.qr0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: AddToCartQueueItemMerger.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0002H\u0002J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¨\u0006\u0018"}, d2 = {"Lt6;", "Lcv8;", "Lqr0$a;", "Llia;", "shoppingCart", "Lnq0;", "cartItem", "j", "sauce", "l", "gift", "k", "Lkotlin/Function1;", "i", "", Image.TYPE_MEDIUM, e.a, "f", "addToCartQueueItem", "g", "queueItem", Image.TYPE_HIGH, "<init>", "()V", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: t6  reason: default package */
/* loaded from: classes.dex */
public final class t6 extends cv8<qr0.a> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddToCartQueueItemMerger.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llia;", "cart", "a", "(Llia;)Llia;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: t6$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function1<lia, lia> {
        final /* synthetic */ nq0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(nq0 nq0Var) {
            super(1);
            this.a = nq0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final lia invoke(lia liaVar) {
            lia a;
            lia a2;
            z65.h(liaVar, "cart");
            int d = this.a.d();
            nq0 nq0Var = this.a;
            if (d <= 0) {
                a = liaVar.a((r28 & 1) != 0 ? liaVar.a : null, (r28 & 2) != 0 ? liaVar.b : null, (r28 & 4) != 0 ? liaVar.c : 0, (r28 & 8) != 0 ? liaVar.d : null, (r28 & 16) != 0 ? liaVar.e : null, (r28 & 32) != 0 ? liaVar.f : null, (r28 & 64) != 0 ? liaVar.g : null, (r28 & 128) != 0 ? liaVar.h : null, (r28 & 256) != 0 ? liaVar.i : 0.0d, (r28 & 512) != 0 ? liaVar.j : null, (r28 & 1024) != 0 ? liaVar.k : null, (r28 & 2048) != 0 ? liaVar.l : false);
                return a;
            }
            a2 = liaVar.a((r28 & 1) != 0 ? liaVar.a : null, (r28 & 2) != 0 ? liaVar.b : null, (r28 & 4) != 0 ? liaVar.c : 0, (r28 & 8) != 0 ? liaVar.d : rn6.f(liaVar.l(), rn6.g(nq0Var.h(), d)), (r28 & 16) != 0 ? liaVar.e : null, (r28 & 32) != 0 ? liaVar.f : null, (r28 & 64) != 0 ? liaVar.g : null, (r28 & 128) != 0 ? liaVar.h : null, (r28 & 256) != 0 ? liaVar.i : 0.0d, (r28 & 512) != 0 ? liaVar.j : null, (r28 & 1024) != 0 ? liaVar.k : null, (r28 & 2048) != 0 ? liaVar.l : false);
            return a2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddToCartQueueItemMerger.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llia;", "cart", "a", "(Llia;)Llia;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: t6$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function1<lia, lia> {
        final /* synthetic */ nq0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(nq0 nq0Var) {
            super(1);
            this.a = nq0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final lia invoke(lia liaVar) {
            lia a;
            z65.h(liaVar, "cart");
            a = liaVar.a((r28 & 1) != 0 ? liaVar.a : null, (r28 & 2) != 0 ? liaVar.b : null, (r28 & 4) != 0 ? liaVar.c : this.a.d() + liaVar.m(), (r28 & 8) != 0 ? liaVar.d : null, (r28 & 16) != 0 ? liaVar.e : null, (r28 & 32) != 0 ? liaVar.f : null, (r28 & 64) != 0 ? liaVar.g : null, (r28 & 128) != 0 ? liaVar.h : null, (r28 & 256) != 0 ? liaVar.i : 0.0d, (r28 & 512) != 0 ? liaVar.j : null, (r28 & 1024) != 0 ? liaVar.k : null, (r28 & 2048) != 0 ? liaVar.l : false);
            return a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddToCartQueueItemMerger.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lnq0;", "similarGift", "a", "(Lnq0;)Lnq0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: t6$c */
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function1<nq0, nq0> {
        final /* synthetic */ nq0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(nq0 nq0Var) {
            super(1);
            this.a = nq0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final nq0 invoke(nq0 nq0Var) {
            int d;
            int i;
            int c;
            nq0 a;
            z65.h(nq0Var, "similarGift");
            if (this.a.d() > nq0Var.c()) {
                d = this.a.c();
            } else {
                d = this.a.d();
            }
            int d2 = d + nq0Var.d();
            if (d2 < 0) {
                i = 0;
            } else {
                i = d2;
            }
            if (d2 < 0) {
                c = nq0Var.c();
            } else {
                c = nq0Var.c() - d2;
            }
            a = nq0Var.a((r44 & 1) != 0 ? nq0Var.a : null, (r44 & 2) != 0 ? nq0Var.b : 0, (r44 & 4) != 0 ? nq0Var.c : null, (r44 & 8) != 0 ? nq0Var.d : i, (r44 & 16) != 0 ? nq0Var.e : 0, (r44 & 32) != 0 ? nq0Var.f : null, (r44 & 64) != 0 ? nq0Var.g : null, (r44 & 128) != 0 ? nq0Var.h : 0, (r44 & 256) != 0 ? nq0Var.i : 0.0f, (r44 & 512) != 0 ? nq0Var.j : null, (r44 & 1024) != 0 ? nq0Var.k : null, (r44 & 2048) != 0 ? nq0Var.l : false, (r44 & 4096) != 0 ? nq0Var.m : c, (r44 & 8192) != 0 ? nq0Var.n : null, (r44 & 16384) != 0 ? nq0Var.o : 0, (r44 & 32768) != 0 ? nq0Var.p : null, (r44 & 65536) != 0 ? nq0Var.q : 0, (r44 & 131072) != 0 ? nq0Var.r : null, (r44 & 262144) != 0 ? nq0Var.s : null, (r44 & 524288) != 0 ? nq0Var.t : null, (r44 & 1048576) != 0 ? nq0Var.u : null, (r44 & 2097152) != 0 ? nq0Var.v : 0, (r44 & 4194304) != 0 ? nq0Var.w : null, (r44 & 8388608) != 0 ? nq0Var.x : null, (r44 & 16777216) != 0 ? nq0Var.y : null, (r44 & 33554432) != 0 ? nq0Var.z : false);
            return a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddToCartQueueItemMerger.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnq0;", "current", "", "a", "(Lnq0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: t6$d */
    /* loaded from: classes.dex */
    public static final class d extends ej5 implements Function1<nq0, Boolean> {
        final /* synthetic */ nq0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(nq0 nq0Var) {
            super(1);
            this.a = nq0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(nq0 nq0Var) {
            z65.h(nq0Var, "current");
            return Boolean.valueOf(wq0.a(nq0Var, this.a));
        }
    }

    private final Function1<lia, lia> e(nq0 nq0Var) {
        return new a(nq0Var);
    }

    private final Function1<lia, lia> f(nq0 nq0Var) {
        return new b(nq0Var);
    }

    private final nq0 g(qr0.a aVar) {
        return new nq0(aVar.a(), 1, kl8.a.a.b(aVar.n()), aVar.b(), 999, aVar.getName(), "", 0, 0.0f, aVar.m(), aVar.h(), aVar.v0(), aVar.b(), rn6.g(aVar.h(), aVar.b()), aVar.k(), aVar.l(), aVar.q(), aVar.o(), aVar.X(), "", aVar.j(), 0, aVar.I(), aVar.w0(), aVar.z(), false);
    }

    private final Function1<nq0, nq0> i(nq0 nq0Var) {
        return new c(nq0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    private final lia j(lia liaVar, nq0 nq0Var) {
        ?? r4;
        List e;
        List q0;
        lia a2;
        nq0 invoke;
        lia invoke2;
        Function1<nq0, Boolean> m = m(nq0Var);
        Iterator it = liaVar.f().iterator();
        while (true) {
            if (it.hasNext()) {
                r4 = it.next();
                if (m.invoke(r4).booleanValue()) {
                    break;
                }
            } else {
                r4 = 0;
                break;
            }
        }
        nq0 nq0Var2 = (nq0) r4;
        if (nq0Var2 == null || (invoke = c(nq0Var.d()).invoke(nq0Var2)) == null || (invoke2 = d(liaVar).invoke(invoke)) == null) {
            e = jc1.e(nq0Var);
            q0 = sc1.q0(e, liaVar.f());
            a2 = liaVar.a((r28 & 1) != 0 ? liaVar.a : null, (r28 & 2) != 0 ? liaVar.b : q0, (r28 & 4) != 0 ? liaVar.c : 0, (r28 & 8) != 0 ? liaVar.d : null, (r28 & 16) != 0 ? liaVar.e : null, (r28 & 32) != 0 ? liaVar.f : null, (r28 & 64) != 0 ? liaVar.g : null, (r28 & 128) != 0 ? liaVar.h : null, (r28 & 256) != 0 ? liaVar.i : 0.0d, (r28 & 512) != 0 ? liaVar.j : null, (r28 & 1024) != 0 ? liaVar.k : null, (r28 & 2048) != 0 ? liaVar.l : false);
            return a2;
        }
        return invoke2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    private final lia k(lia liaVar, nq0 nq0Var) {
        ?? r2;
        nq0 invoke;
        lia invoke2;
        Function1<nq0, Boolean> m = m(nq0Var);
        Iterator it = liaVar.f().iterator();
        while (true) {
            if (it.hasNext()) {
                r2 = it.next();
                if (m.invoke(r2).booleanValue()) {
                    break;
                }
            } else {
                r2 = 0;
                break;
            }
        }
        nq0 nq0Var2 = (nq0) r2;
        if (nq0Var2 != null && (invoke = i(nq0Var).invoke(nq0Var2)) != null && (invoke2 = d(liaVar).invoke(invoke)) != null) {
            return invoke2;
        }
        return liaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    private final lia l(lia liaVar, nq0 nq0Var) {
        ?? r2;
        nq0 invoke;
        lia invoke2;
        Function1<nq0, Boolean> m = m(nq0Var);
        Iterator it = liaVar.k().iterator();
        while (true) {
            if (it.hasNext()) {
                r2 = it.next();
                if (m.invoke(r2).booleanValue()) {
                    break;
                }
            } else {
                r2 = 0;
                break;
            }
        }
        nq0 nq0Var2 = (nq0) r2;
        if (nq0Var2 != null && (invoke = c(nq0Var.d()).invoke(nq0Var2)) != null && (invoke2 = d(liaVar).invoke(invoke)) != null) {
            liaVar = invoke2;
        }
        return e(nq0Var).invoke(f(nq0Var).invoke(liaVar));
    }

    private final Function1<nq0, Boolean> m(nq0 nq0Var) {
        return new d(nq0Var);
    }

    public lia h(lia liaVar, qr0.a aVar) {
        z65.h(liaVar, "shoppingCart");
        z65.h(aVar, "queueItem");
        nq0 g = g(aVar);
        if (g.v0()) {
            return k(liaVar, g);
        }
        if (g.H()) {
            return l(liaVar, g);
        }
        return j(liaVar, g);
    }
}
