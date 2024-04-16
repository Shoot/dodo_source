package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jspecify.nullness.NullMarked;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@NullMarked
/* renamed from: c2d  reason: default package */
/* loaded from: classes2.dex */
abstract class c2d implements Iterator {
    private Object a;
    private int b = 2;

    protected abstract Object a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object b() {
        this.b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.b;
        if (i != 4) {
            int i2 = i - 1;
            if (i != 0) {
                if (i2 == 0) {
                    return true;
                }
                if (i2 != 2) {
                    this.b = 4;
                    this.a = a();
                    if (this.b != 3) {
                        this.b = 1;
                        return true;
                    }
                }
                return false;
            }
            throw null;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.b = 2;
            Object obj = this.a;
            this.a = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
