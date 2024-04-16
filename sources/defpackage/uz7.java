package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PersistentOrderedSet.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000 \"*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001#B/\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b \u0010!J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0002R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001e¨\u0006$"}, d2 = {"Luz7;", "E", "Lf2;", "Lwz7;", "element", "", "contains", "(Ljava/lang/Object;)Z", CartQueueItemEntity.OPERATION_ADD, "(Ljava/lang/Object;)Lwz7;", CartQueueItemEntity.OPERATION_REMOVE, "", "iterator", "", "b", "Ljava/lang/Object;", "getFirstElement$runtime_release", "()Ljava/lang/Object;", "firstElement", c.a, "getLastElement$runtime_release", "lastElement", "Ldz7;", "Luq5;", DateTokenConverter.CONVERTER_KEY, "Ldz7;", "getHashMap$runtime_release", "()Ldz7;", "hashMap", "", "()I", "size", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ldz7;)V", e.a, "a", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: uz7  reason: default package */
/* loaded from: classes.dex */
public final class uz7<E> extends f2<E> implements wz7<E> {
    public static final a e = new a(null);
    private static final uz7 f;
    private final Object b;
    private final Object c;
    private final dz7<E, uq5> d;

    /* compiled from: PersistentOrderedSet.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0001\u0010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Luz7$a;", "", "E", "Lwz7;", "a", "()Lwz7;", "Luz7;", "", "EMPTY", "Luz7;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: uz7$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <E> wz7<E> a() {
            return uz7.f;
        }
    }

    static {
        vh3 vh3Var = vh3.a;
        f = new uz7(vh3Var, vh3Var, dz7.f.a());
    }

    public uz7(Object obj, Object obj2, dz7<E, uq5> dz7Var) {
        z65.h(dz7Var, "hashMap");
        this.b = obj;
        this.c = obj2;
        this.d = dz7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, defpackage.wz7
    public wz7<E> add(E e2) {
        if (this.d.containsKey(e2)) {
            return this;
        }
        if (isEmpty()) {
            return new uz7(e2, e2, this.d.t(e2, new uq5()));
        }
        Object obj = this.c;
        Object obj2 = ((dz7<E, uq5>) this.d).get(obj);
        z65.e(obj2);
        return new uz7(this.b, e2, this.d.t(obj, ((uq5) obj2).e(e2)).t(e2, new uq5(obj)));
    }

    @Override // defpackage.c1, java.util.Collection
    public boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // defpackage.c1
    public int d() {
        return this.d.size();
    }

    @Override // defpackage.f2, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new vz7(this.b, this.d);
    }

    @Override // java.util.Collection, java.util.Set, defpackage.wz7
    public wz7<E> remove(E e2) {
        Object obj;
        Object obj2;
        uq5 uq5Var = this.d.get(e2);
        if (uq5Var == null) {
            return this;
        }
        dz7<E, uq5> u = this.d.u(e2);
        if (uq5Var.b()) {
            uq5 uq5Var2 = u.get(uq5Var.d());
            z65.e(uq5Var2);
            u = u.t(uq5Var.d(), uq5Var2.e(uq5Var.c()));
        }
        if (uq5Var.a()) {
            uq5 uq5Var3 = u.get(uq5Var.c());
            z65.e(uq5Var3);
            u = u.t(uq5Var.c(), uq5Var3.f(uq5Var.d()));
        }
        if (!uq5Var.b()) {
            obj = uq5Var.c();
        } else {
            obj = this.b;
        }
        if (!uq5Var.a()) {
            obj2 = uq5Var.d();
        } else {
            obj2 = this.c;
        }
        return new uz7(obj, obj2, u);
    }
}
