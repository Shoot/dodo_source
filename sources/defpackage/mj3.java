package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EnumEntries.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\t\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006B\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lmj3;", "", "T", "Lkj3;", "Ln1;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "index", "u", "(I)Ljava/lang/Enum;", "element", "", "k", "(Ljava/lang/Enum;)Z", "x", "(Ljava/lang/Enum;)I", "E", "", "b", "[Ljava/lang/Enum;", "entries", DateTokenConverter.CONVERTER_KEY, "()I", "size", "<init>", "([Ljava/lang/Enum;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: mj3  reason: default package */
/* loaded from: classes3.dex */
public final class mj3<T extends Enum<T>> extends n1<T> implements kj3<T>, Serializable {
    private final T[] b;

    public mj3(T[] tArr) {
        z65.h(tArr, "entries");
        this.b = tArr;
    }

    private final Object writeReplace() {
        return new nj3(this.b);
    }

    public int E(T t) {
        z65.h(t, "element");
        return indexOf(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c1, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        return k((Enum) obj);
    }

    @Override // defpackage.c1
    public int d() {
        return this.b.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.n1, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return x((Enum) obj);
    }

    public boolean k(T t) {
        Object G;
        z65.h(t, "element");
        G = yr.G(this.b, t.ordinal());
        if (((Enum) G) == t) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.n1, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return E((Enum) obj);
    }

    @Override // defpackage.n1, java.util.List
    /* renamed from: u */
    public T get(int i) {
        n1.a.b(i, this.b.length);
        return this.b[i];
    }

    public int x(T t) {
        Object G;
        z65.h(t, "element");
        int ordinal = t.ordinal();
        G = yr.G(this.b, ordinal);
        if (((Enum) G) != t) {
            return -1;
        }
        return ordinal;
    }
}
