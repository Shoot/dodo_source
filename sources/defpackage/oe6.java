package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.MenuItemEntity;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.qd6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
/* compiled from: MenuItemRepository.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\n\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\"\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\b8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R&\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010#¨\u0006("}, d2 = {"Loe6;", "Lne6;", "", "id", "Lqd6;", "a", "", "b", "", "models", "save", ShoppingInfoEntity.FIELD_SHOPPING_ID, DateTokenConverter.CONVERTER_KEY, "getAll", "Lqd6$d;", c.a, "Lgk2;", "Lcom/dodopizza/persistence/entity/menu/MenuItemEntity;", "Lgk2;", "dao", "Lmxa;", "Lmxa;", "stopRepository", "Lme6;", "Lme6;", "menuItemPersonalizerProvider", "Ljava/util/Collection;", "f", "()Ljava/util/Collection;", "cache", "Lkotlin/Function1;", e.a, "Lkotlin/jvm/functions/Function1;", "toEntity", "g", "()Lkotlin/jvm/functions/Function1;", "toModel", "applyPersonalPrice", "<init>", "(Lgk2;Lmxa;Lme6;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: oe6  reason: default package */
/* loaded from: classes4.dex */
public final class oe6 implements ne6 {
    private final gk2<MenuItemEntity> a;
    private final mxa b;
    private final me6 c;
    private Collection<? extends qd6> d;
    private final Function1<qd6, MenuItemEntity> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MenuItemRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oe6$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a extends m94 implements Function1<qd6, Collection<? extends qd6>> {
        a(Object obj) {
            super(1, obj, je6.class, "createPersonalizedItems", "createPersonalizedItems(Lru/dodopizza/app/domain/menu/item/MenuItem;)Ljava/util/Collection;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final Collection<qd6> invoke(qd6 qd6Var) {
            z65.h(qd6Var, "p0");
            return ((je6) this.receiver).a(qd6Var);
        }
    }

    public oe6(gk2<MenuItemEntity> gk2Var, mxa mxaVar, me6 me6Var) {
        Set e;
        z65.h(gk2Var, "dao");
        z65.h(mxaVar, "stopRepository");
        z65.h(me6Var, "menuItemPersonalizerProvider");
        this.a = gk2Var;
        this.b = mxaVar;
        this.c = me6Var;
        e = sfa.e();
        this.d = e;
        this.e = qh6.l();
    }

    private final Function1<qd6, Collection<qd6>> e() {
        return new a(this.c.a());
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    private final Collection<qd6> f() {
        int w;
        if (this.d.isEmpty()) {
            List<MenuItemEntity> b = this.a.b();
            Function1<MenuItemEntity, qd6> g = g();
            w = lc1.w(b, 10);
            ArrayList<??> arrayList = new ArrayList(w);
            Iterator<T> it = b.iterator();
            while (it.hasNext()) {
                arrayList.add(g.invoke(it.next()));
            }
            Function1<qd6, Collection<qd6>> e = e();
            ArrayList arrayList2 = new ArrayList();
            for (?? r3 : arrayList) {
                pc1.C(arrayList2, e.invoke(r3));
            }
            this.d = arrayList2;
            return arrayList2;
        }
        return this.d;
    }

    private final Function1<MenuItemEntity, qd6> g() {
        return qh6.k(this.b.b());
    }

    @Override // defpackage.ne6
    public synchronized qd6 a(String str) {
        Object obj;
        try {
            z65.h(str, "id");
            Iterator<T> it = f().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (z65.c(((qd6) obj).f(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (qd6) obj;
    }

    @Override // defpackage.ne6
    public synchronized void b() {
        List l;
        l = kc1.l();
        this.d = l;
    }

    @Override // defpackage.ne6
    public synchronized qd6.d c() {
        Object u0;
        try {
            ArrayList arrayList = new ArrayList();
            for (Object obj : f()) {
                if (obj instanceof qd6.d) {
                    arrayList.add(obj);
                }
            }
            u0 = sc1.u0(arrayList);
        } catch (Throwable th) {
            throw th;
        }
        return (qd6.d) u0;
    }

    @Override // defpackage.ne6
    public synchronized Collection<qd6> d(String str) {
        ArrayList arrayList;
        boolean c;
        try {
            z65.h(str, ShoppingInfoEntity.FIELD_SHOPPING_ID);
            arrayList = new ArrayList();
            for (Object obj : f()) {
                qd6 qd6Var = (qd6) obj;
                if (qd6Var instanceof qd6.c) {
                    c = z65.c(((qd6.c) qd6Var).u().getId(), str);
                } else if (qd6Var instanceof qd6.d) {
                    Collection<qja> v = ((qd6.d) qd6Var).v();
                    if (!(v instanceof Collection) || !v.isEmpty()) {
                        for (qja qjaVar : v) {
                            if (z65.c(qjaVar.getId(), str)) {
                                arrayList.add(obj);
                                break;
                            }
                        }
                    }
                } else if (qd6Var instanceof qd6.e) {
                    c = z65.c(((qd6.e) qd6Var).t().getId(), str);
                } else if (qd6Var instanceof qd6.f) {
                    Collection<qja> t = ((qd6.f) qd6Var).t();
                    if (!(t instanceof Collection) || !t.isEmpty()) {
                        for (qja qjaVar2 : t) {
                            if (z65.c(qjaVar2.getId(), str)) {
                                arrayList.add(obj);
                                break;
                                break;
                            }
                        }
                    }
                } else if (qd6Var instanceof qd6.b) {
                    c = z65.c(((qd6.b) qd6Var).u().getId(), str);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                if (c) {
                    arrayList.add(obj);
                    break;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    @Override // defpackage.ne6
    public synchronized Collection<qd6> getAll() {
        return f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ne6
    public synchronized void save(Collection<? extends qd6> collection) {
        List l;
        int w;
        try {
            z65.h(collection, "models");
            l = kc1.l();
            this.d = l;
            this.a.e();
            gk2<MenuItemEntity> gk2Var = this.a;
            Collection<? extends qd6> collection2 = collection;
            Function1<qd6, MenuItemEntity> function1 = this.e;
            w = lc1.w(collection2, 10);
            ArrayList arrayList = new ArrayList(w);
            for (Object obj : collection2) {
                arrayList.add(function1.invoke(obj));
            }
            gk2Var.save(arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }
}
