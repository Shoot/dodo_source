package defpackage;

import com.huawei.hms.push.e;
import defpackage.mk2;
import defpackage.yi3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: CommonRepository.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0001B1\u0012\u0006\u0010-\u001a\u00020,\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010.\u0012\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0004\b0\u00101J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0002J\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002J\u0013\u0010\u0007\u001a\u00028\u0000*\u00028\u0001H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00028\u0001*\u00028\u0000H\u0004¢\u0006\u0004\b\t\u0010\nJ,\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u001e\u0010\r\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u000bJ\u0017\u0010\u0011\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0013\u001a\u0004\u0018\u00018\u00002\u001e\u0010\r\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\u001c\u001a\u00020\u00192\u001e\u0010\r\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u000bJ\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016J\u000e\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000fJ4\u0010\"\u001a\u00020\u00192\u001e\u0010 \u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u000b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005R \u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010'8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b)\u0010*¨\u00062"}, d2 = {"Lbk1;", "", "T", "Lyi3;", "E", "", "G", "F", "(Lyi3;)Ljava/lang/Object;", "D", "(Ljava/lang/Object;)Lyi3;", "Lkotlin/Function1;", "Lvu8;", "queryBuilder", "v", "", "id", "w", "(Ljava/lang/String;)Ljava/lang/Object;", "x", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "b", "model", "C", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "y", "(Ljava/lang/Object;)V", "z", "models", e.a, "B", "queryBuilderForRemove", "modelsForInsert", "A", "Lsg9;", "a", "Lsg9;", "repositoryConverter", "Lgk2;", "Lgk2;", "getDao", "()Lgk2;", "dao", "Ljk2;", "daoFactory", "Lod5;", "entityClass", "<init>", "(Ljk2;Lod5;Lsg9;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bk1  reason: default package */
/* loaded from: classes2.dex */
public class bk1<T, E extends yi3> {
    private final sg9<T, E> a;
    private final gk2<E> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CommonRepository.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "T", "Lyi3;", "E", "Lzl2;", "connection", "Lcj3;", "entityInformation", "", "a", "(Lzl2;Lcj3;)Ljava/util/Collection;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: bk1$a */
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements Function2<zl2, cj3, Collection<? extends E>> {
        final /* synthetic */ Function1<vu8<E>, vu8<E>> a;
        final /* synthetic */ bk1<T, E> b;
        final /* synthetic */ Collection<T> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super vu8<E>, ? extends vu8<E>> function1, bk1<T, E> bk1Var, Collection<? extends T> collection) {
            super(2);
            this.a = function1;
            this.b = bk1Var;
            this.c = collection;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Collection<E> invoke(zl2 zl2Var, cj3 cj3Var) {
            z65.h(zl2Var, "connection");
            z65.h(cj3Var, "entityInformation");
            zl2Var.l(zl2Var.n(cj3Var, this.a));
            return zl2Var.m(cj3Var, this.b.E(this.c));
        }
    }

    /* compiled from: CommonRepository.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "T", "Lyi3;", "E", "Lzl2;", "connection", "Lcj3;", "entityInformation", "", "a", "(Lzl2;Lcj3;)Ljava/util/Collection;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: bk1$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function2<zl2, cj3, Collection<? extends E>> {
        final /* synthetic */ bk1<T, E> a;
        final /* synthetic */ Collection<T> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(bk1<T, E> bk1Var, Collection<? extends T> collection) {
            super(2);
            this.a = bk1Var;
            this.b = collection;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Collection<E> invoke(zl2 zl2Var, cj3 cj3Var) {
            z65.h(zl2Var, "connection");
            z65.h(cj3Var, "entityInformation");
            zl2Var.k(cj3Var);
            return zl2Var.m(cj3Var, this.a.E(this.b));
        }
    }

    public bk1(jk2 jk2Var, od5<E> od5Var, sg9<T, E> sg9Var) {
        z65.h(jk2Var, "daoFactory");
        z65.h(od5Var, "entityClass");
        z65.h(sg9Var, "repositoryConverter");
        this.a = sg9Var;
        this.b = jk2Var.a(od5Var, mk2.b.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<E> E(Collection<? extends T> collection) {
        int w;
        Collection<? extends T> collection2 = collection;
        w = lc1.w(collection2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (T t : collection2) {
            arrayList.add(D(t));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Collection<T> G(Collection<? extends E> collection) {
        int w;
        Collection<? extends E> collection2 = collection;
        w = lc1.w(collection2, 10);
        ArrayList arrayList = new ArrayList(w);
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(F((yi3) it.next()));
        }
        return arrayList;
    }

    public final void A(Function1<? super vu8<E>, ? extends vu8<E>> function1, Collection<? extends T> collection) {
        z65.h(function1, "queryBuilderForRemove");
        z65.h(collection, "modelsForInsert");
        this.b.f(new a(function1, this, collection));
    }

    public final void B(String str) {
        z65.h(str, "id");
        this.b.c(str);
    }

    public T C(T t) {
        z65.h(t, "model");
        return F(this.b.h(D(t)));
    }

    protected final E D(T t) {
        z65.h(t, "<this>");
        return this.a.a(t);
    }

    protected final T F(E e) {
        z65.h(e, "<this>");
        return this.a.b(e);
    }

    public final Collection<T> b() {
        return G(this.b.b());
    }

    public Collection<T> e(Collection<? extends T> collection) {
        z65.h(collection, "models");
        return G((Collection) this.b.f(new b(this, collection)));
    }

    public final Collection<T> v(Function1<? super vu8<E>, ? extends vu8<E>> function1) {
        z65.h(function1, "queryBuilder");
        return G(this.b.j(function1));
    }

    public final T w(String str) {
        z65.h(str, "id");
        E a2 = this.b.a(str);
        if (a2 != null) {
            return F(a2);
        }
        return null;
    }

    public final T x(Function1<? super vu8<E>, ? extends vu8<E>> function1) {
        z65.h(function1, "queryBuilder");
        E d = this.b.d(function1);
        if (d != null) {
            return F(d);
        }
        return null;
    }

    public final void y(T t) {
        z65.h(t, "model");
        this.b.g(D(t));
    }

    public final void z(Function1<? super vu8<E>, ? extends vu8<E>> function1) {
        z65.h(function1, "queryBuilder");
        this.b.i(function1);
    }
}
