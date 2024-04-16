package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.qr0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: QueueItemMerger.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\t\u001a\u00020\bH\u0004J\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\fH\u0004¨\u0006\u0011"}, d2 = {"Lcv8;", "Lqr0;", "T", "", "Lnq0;", "cartItem", "", "b", "", "count", "Lkotlin/Function1;", c.a, "Llia;", "shoppingCart", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: cv8  reason: default package */
/* loaded from: classes.dex */
public abstract class cv8<T extends qr0> {

    /* compiled from: QueueItemMerger.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqr0;", "T", "Lnq0;", "cartItem", "a", "(Lnq0;)Lnq0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: cv8$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<nq0, nq0> {
        final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i) {
            super(1);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final nq0 invoke(nq0 nq0Var) {
            int i;
            nq0 a;
            z65.h(nq0Var, "cartItem");
            Integer valueOf = Integer.valueOf(nq0Var.d() + this.a);
            if (valueOf.intValue() <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                i = valueOf.intValue();
            } else {
                i = 0;
            }
            hn6 f = rn6.f(nq0Var.w(), rn6.g(nq0Var.h(), this.a));
            if (!f.e()) {
                f = null;
            }
            if (f == null) {
                f = kn6.f();
            }
            a = nq0Var.a((r44 & 1) != 0 ? nq0Var.a : null, (r44 & 2) != 0 ? nq0Var.b : 0, (r44 & 4) != 0 ? nq0Var.c : null, (r44 & 8) != 0 ? nq0Var.d : i, (r44 & 16) != 0 ? nq0Var.e : 0, (r44 & 32) != 0 ? nq0Var.f : null, (r44 & 64) != 0 ? nq0Var.g : null, (r44 & 128) != 0 ? nq0Var.h : 0, (r44 & 256) != 0 ? nq0Var.i : 0.0f, (r44 & 512) != 0 ? nq0Var.j : null, (r44 & 1024) != 0 ? nq0Var.k : null, (r44 & 2048) != 0 ? nq0Var.l : false, (r44 & 4096) != 0 ? nq0Var.m : 0, (r44 & 8192) != 0 ? nq0Var.n : f, (r44 & 16384) != 0 ? nq0Var.o : 0, (r44 & 32768) != 0 ? nq0Var.p : null, (r44 & 65536) != 0 ? nq0Var.q : 0, (r44 & 131072) != 0 ? nq0Var.r : null, (r44 & 262144) != 0 ? nq0Var.s : null, (r44 & 524288) != 0 ? nq0Var.t : null, (r44 & 1048576) != 0 ? nq0Var.u : null, (r44 & 2097152) != 0 ? nq0Var.v : 0, (r44 & 4194304) != 0 ? nq0Var.w : null, (r44 & 8388608) != 0 ? nq0Var.x : null, (r44 & 16777216) != 0 ? nq0Var.y : null, (r44 & 33554432) != 0 ? nq0Var.z : false);
            return a;
        }
    }

    /* compiled from: QueueItemMerger.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqr0;", "T", "Lnq0;", "changedCartItem", "Llia;", "a", "(Lnq0;)Llia;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: cv8$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<nq0, lia> {
        final /* synthetic */ cv8<T> a;
        final /* synthetic */ lia b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(cv8<T> cv8Var, lia liaVar) {
            super(1);
            this.a = cv8Var;
            this.b = liaVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final lia invoke(nq0 nq0Var) {
            List r0;
            lia a;
            lia a2;
            z65.h(nq0Var, "changedCartItem");
            if (this.a.b(nq0Var)) {
                lia liaVar = this.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : liaVar.f()) {
                    if (!wq0.a((nq0) obj, nq0Var)) {
                        arrayList.add(obj);
                    }
                }
                a2 = liaVar.a((r28 & 1) != 0 ? liaVar.a : null, (r28 & 2) != 0 ? liaVar.b : arrayList, (r28 & 4) != 0 ? liaVar.c : 0, (r28 & 8) != 0 ? liaVar.d : null, (r28 & 16) != 0 ? liaVar.e : null, (r28 & 32) != 0 ? liaVar.f : null, (r28 & 64) != 0 ? liaVar.g : null, (r28 & 128) != 0 ? liaVar.h : null, (r28 & 256) != 0 ? liaVar.i : 0.0d, (r28 & 512) != 0 ? liaVar.j : null, (r28 & 1024) != 0 ? liaVar.k : null, (r28 & 2048) != 0 ? liaVar.l : false);
                return a2;
            }
            lia liaVar2 = this.b;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : liaVar2.f()) {
                if (!wq0.a((nq0) obj2, nq0Var)) {
                    arrayList2.add(obj2);
                }
            }
            r0 = sc1.r0(arrayList2, nq0Var);
            a = liaVar2.a((r28 & 1) != 0 ? liaVar2.a : null, (r28 & 2) != 0 ? liaVar2.b : r0, (r28 & 4) != 0 ? liaVar2.c : 0, (r28 & 8) != 0 ? liaVar2.d : null, (r28 & 16) != 0 ? liaVar2.e : null, (r28 & 32) != 0 ? liaVar2.f : null, (r28 & 64) != 0 ? liaVar2.g : null, (r28 & 128) != 0 ? liaVar2.h : null, (r28 & 256) != 0 ? liaVar2.i : 0.0d, (r28 & 512) != 0 ? liaVar2.j : null, (r28 & 1024) != 0 ? liaVar2.k : null, (r28 & 2048) != 0 ? liaVar2.l : false);
            return a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b(nq0 nq0Var) {
        if (!nq0Var.v0() && !nq0Var.H() && nq0Var.d() < 1) {
            return true;
        }
        if (nq0Var.v0() && nq0Var.y() && nq0Var.d() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Function1<nq0, nq0> c(int i) {
        return new a(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Function1<nq0, lia> d(lia liaVar) {
        z65.h(liaVar, "shoppingCart");
        return new b(this, liaVar);
    }
}
