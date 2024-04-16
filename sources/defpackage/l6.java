package defpackage;

import androidx.recyclerview.widget.e;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: AdapterList.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0004B\u0017\u0012\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b0\u00101J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\nJ\u0016\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016J\u001e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016J\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H\u0014J\u0017\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001e\u0010\u0016J\u001c\u0010!\u001a\u00020\u00122\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\u001fH\u0016J\b\u0010\"\u001a\u00020\nH\u0016J6\u0010$\u001a\u00020\n2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\u001f2\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u001fH\u0016J*\u0010%\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u001fH\u0016J\"\u0010&\u001a\u00020\n2\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u001fH\u0016J:\u0010+\u001a\u00020\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072$\u0010*\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020)0(J\u0014\u0010\u0001\u001a\u00020\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007R\u0018\u0010.\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00062"}, d2 = {"Ll6;", "T", "Lcl2;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "", "index", "", "", "changes", "", "P", "Lm6;", "adapterDelegate", DateTokenConverter.CONVERTER_KEY, "G", "", "elements", "", "addAll", "element", CartQueueItemEntity.OPERATION_ADD, "(Ljava/lang/Object;)Z", "(ILjava/lang/Object;)V", "removeAll", "fromIndex", "toIndex", "removeRange", "Q", "(I)Ljava/lang/Object;", CartQueueItemEntity.OPERATION_REMOVE, "Lkotlin/Function1;", "predicate", "z0", "r", "modification", "S", "e0", "w1", "newItems", "Lkotlin/Function2;", "Landroidx/recyclerview/widget/e$e;", "diffUtilResultProvider", "Z", "a", "Lm6;", "adapterNotifier", "collection", "<init>", "(Ljava/util/Collection;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: l6  reason: default package */
/* loaded from: classes.dex */
public class l6<T> extends ArrayList<T> implements cl2<T> {
    private m6 a;

    public l6() {
        this(null, 1, null);
    }

    private final void P(int i, List<String> list) {
        if (!list.isEmpty()) {
            if (list.contains("change_full")) {
                m6 m6Var = this.a;
                if (m6Var != null) {
                    m6Var.e(i);
                    return;
                }
                return;
            }
            for (String str : list) {
                m6 m6Var2 = this.a;
                if (m6Var2 != null) {
                    m6Var2.c(i, str);
                }
            }
        }
    }

    public final void G() {
        this.a = null;
    }

    public /* bridge */ int H() {
        return super.size();
    }

    public T Q(int i) {
        T t = (T) super.remove(i);
        m6 m6Var = this.a;
        if (m6Var != null) {
            m6Var.f(i, 1);
        }
        return t;
    }

    @Override // defpackage.cl2
    public void S(Function1<? super T, Boolean> function1, Function1<? super T, ? extends List<String>> function12) {
        int w;
        z65.h(function1, "predicate");
        z65.h(function12, "modification");
        ArrayList<Object> arrayList = new ArrayList();
        for (Object obj : this) {
            if (function1.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        w = lc1.w(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(w);
        for (Object obj2 : arrayList) {
            P(indexOf(obj2), function12.invoke(obj2));
            arrayList2.add(Unit.a);
        }
    }

    public final void T(List<? extends T> list) {
        z65.h(list, "newItems");
        super.clear();
        super.addAll(list);
        m6 m6Var = this.a;
        if (m6Var != null) {
            m6Var.a();
        }
    }

    public final void Z(List<? extends T> list, Function2<? super List<? extends T>, ? super List<? extends T>, ? extends e.C0047e> function2) {
        z65.h(list, "newItems");
        z65.h(function2, "diffUtilResultProvider");
        e.C0047e invoke = function2.invoke(new ArrayList(this), list);
        super.clear();
        super.addAll(list);
        m6 m6Var = this.a;
        if (m6Var != null) {
            m6Var.h(invoke);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, defpackage.cl2
    public boolean add(T t) {
        boolean add = super.add(t);
        m6 m6Var = this.a;
        if (m6Var != null) {
            m6Var.b(size(), 1);
        }
        return add;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List, defpackage.cl2
    public boolean addAll(Collection<? extends T> collection) {
        z65.h(collection, "elements");
        boolean addAll = super.addAll(collection);
        m6 m6Var = this.a;
        if (m6Var != null) {
            m6Var.b(size(), collection.size());
        }
        return addAll;
    }

    public final void d(m6 m6Var) {
        z65.h(m6Var, "adapterDelegate");
        m6Var.a();
        this.a = m6Var;
    }

    public void e0(int i, Function1<? super T, ? extends List<String>> function1) {
        z65.h(function1, "modification");
        P(i, function1.invoke((T) get(i)));
    }

    @Override // defpackage.cl2
    public void r() {
        super.clear();
        Unit unit = Unit.a;
        m6 m6Var = this.a;
        if (m6Var != null) {
            m6Var.a();
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i) {
        return Q(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        z65.h(collection, "elements");
        boolean removeAll = super.removeAll(collection);
        m6 m6Var = this.a;
        if (m6Var != null) {
            m6Var.a();
        }
        return removeAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    protected void removeRange(int i, int i2) {
        super.removeRange(i, i2);
        Unit unit = Unit.a;
        int i3 = (i - i2) + 1;
        m6 m6Var = this.a;
        if (m6Var != null) {
            m6Var.f(i, i3);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return H();
    }

    @Override // defpackage.cl2
    public void w1(Function1<? super T, ? extends List<String>> function1) {
        int w;
        z65.h(function1, "modification");
        w = lc1.w(this, 10);
        ArrayList arrayList = new ArrayList(w);
        for (T t : this) {
            P(indexOf(t), function1.invoke(t));
            arrayList.add(Unit.a);
        }
    }

    @Override // defpackage.cl2
    public boolean z0(Function1<? super T, Boolean> function1) {
        boolean I;
        m6 m6Var;
        z65.h(function1, "predicate");
        I = pc1.I(this, function1);
        if (I && (m6Var = this.a) != null) {
            m6Var.a();
        }
        return I;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ l6(java.util.Collection r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto La
            java.util.List r1 = defpackage.ic1.l()
            java.util.Collection r1 = (java.util.Collection) r1
        La:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l6.<init>(java.util.Collection, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m6 m6Var;
        int indexOf = indexOf(obj);
        boolean remove = super.remove(obj);
        if (remove && (m6Var = this.a) != null) {
            m6Var.f(indexOf, 1);
        }
        return remove;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(Collection<? extends T> collection) {
        super(collection);
        z65.h(collection, "collection");
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i, T t) {
        super.add(i, t);
        Unit unit = Unit.a;
        m6 m6Var = this.a;
        if (m6Var != null) {
            m6Var.b(i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends T> collection) {
        z65.h(collection, "elements");
        boolean addAll = super.addAll(i, collection);
        m6 m6Var = this.a;
        if (m6Var != null) {
            m6Var.b(i, collection.size());
        }
        return addAll;
    }
}
