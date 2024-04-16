package defpackage;

import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Iterator;
import kotlin.Metadata;
/* compiled from: PersistentHashMapContentIterators.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00020\u0004B\u0007¢\u0006\u0004\b$\u0010%J-\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u000b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0011\u001a\u00020\u0010J\r\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u000bJ\u0006\u0010\u0015\u001a\u00020\u0010J\u0016\u0010\u0017\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0016J\u0006\u0010\u0018\u001a\u00020\u000bJ\t\u0010\u0019\u001a\u00020\u0010H\u0096\u0002R4\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\"\u0010\n\u001a\u00020\b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lvmb;", "K", "V", "T", "", "", "", "buffer", "", "dataSize", "index", "", Image.TYPE_MEDIUM, "([Ljava/lang/Object;II)V", "l", "([Ljava/lang/Object;I)V", "", Image.TYPE_HIGH, "b", "()Ljava/lang/Object;", "j", "i", "Lumb;", c.a, "k", "hasNext", "<set-?>", "a", "[Ljava/lang/Object;", e.a, "()[Ljava/lang/Object;", "I", "g", "()I", "n", "(I)V", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: vmb  reason: default package */
/* loaded from: classes.dex */
public abstract class vmb<K, V, T> implements Iterator<T>, be5 {
    private Object[] a = umb.e.a().p();
    private int b;
    private int c;

    public final K b() {
        uj1.a(h());
        return (K) this.a[this.c];
    }

    public final umb<? extends K, ? extends V> c() {
        uj1.a(i());
        Object obj = this.a[this.c];
        z65.f(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (umb) obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object[] e() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int g() {
        return this.c;
    }

    public final boolean h() {
        if (this.c < this.b) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return h();
    }

    public final boolean i() {
        boolean z;
        if (this.c >= this.b) {
            z = true;
        } else {
            z = false;
        }
        uj1.a(z);
        if (this.c >= this.a.length) {
            return false;
        }
        return true;
    }

    public final void j() {
        uj1.a(h());
        this.c += 2;
    }

    public final void k() {
        uj1.a(i());
        this.c++;
    }

    public final void l(Object[] objArr, int i) {
        z65.h(objArr, "buffer");
        m(objArr, i, 0);
    }

    public final void m(Object[] objArr, int i, int i2) {
        z65.h(objArr, "buffer");
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(int i) {
        this.c = i;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
