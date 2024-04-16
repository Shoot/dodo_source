package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Arrays;
import kotlin.Metadata;
/* compiled from: TrieNode.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001aG\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aC\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u000e\u0010\u000f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001aO\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\r\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"", "index", "shift", "f", "K", "V", "", "", "keyIndex", Action.KEY_ATTRIBUTE, "value", "g", "([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "nodeIndex", "Lumb;", "newNode", "j", "([Ljava/lang/Object;IILumb;)[Ljava/lang/Object;", "k", "([Ljava/lang/Object;IILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", Image.TYPE_HIGH, "([Ljava/lang/Object;I)[Ljava/lang/Object;", "i", "runtime_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: ymb */
/* loaded from: classes.dex */
public final class ymb {
    public static final /* synthetic */ Object[] a(Object[] objArr, int i, Object obj, Object obj2) {
        return g(objArr, i, obj, obj2);
    }

    public static final /* synthetic */ Object[] b(Object[] objArr, int i) {
        return h(objArr, i);
    }

    public static final /* synthetic */ Object[] c(Object[] objArr, int i) {
        return i(objArr, i);
    }

    public static final /* synthetic */ Object[] d(Object[] objArr, int i, int i2, umb umbVar) {
        return j(objArr, i, i2, umbVar);
    }

    public static final /* synthetic */ Object[] e(Object[] objArr, int i, int i2, Object obj, Object obj2) {
        return k(objArr, i, i2, obj, obj2);
    }

    public static final int f(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final <K, V> Object[] g(Object[] objArr, int i, K k, V v) {
        Object[] objArr2 = new Object[objArr.length + 2];
        xr.l(objArr, objArr2, 0, 0, i, 6, null);
        xr.h(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = k;
        objArr2[i + 1] = v;
        return objArr2;
    }

    public static final Object[] h(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 2];
        xr.l(objArr, objArr2, 0, 0, i, 6, null);
        xr.h(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] i(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 1];
        xr.l(objArr, objArr2, 0, 0, i, 6, null);
        xr.h(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    public static final Object[] j(Object[] objArr, int i, int i2, umb<?, ?> umbVar) {
        Object[] objArr2 = new Object[objArr.length - 1];
        xr.l(objArr, objArr2, 0, 0, i, 6, null);
        xr.h(objArr, objArr2, i, i + 2, i2);
        objArr2[i2 - 2] = umbVar;
        xr.h(objArr, objArr2, i2 - 1, i2, objArr.length);
        return objArr2;
    }

    public static final <K, V> Object[] k(Object[] objArr, int i, int i2, K k, V v) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        z65.g(copyOf, "copyOf(this, newSize)");
        xr.h(copyOf, copyOf, i + 2, i + 1, objArr.length);
        xr.h(copyOf, copyOf, i2 + 2, i2, i);
        copyOf[i2] = k;
        copyOf[i2 + 1] = v;
        return copyOf;
    }
}
