package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000f¨\u0006\u0019"}, d2 = {"Lpi4;", "", "Lgo1;", "", c.a, "", "hasNext", "b", "Lwna;", "a", "Lwna;", "getTable", "()Lwna;", "table", "", "I", "getEnd", "()I", "end", "index", DateTokenConverter.CONVERTER_KEY, "version", "start", "<init>", "(Lwna;II)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: pi4  reason: default package */
/* loaded from: classes.dex */
final class pi4 implements Iterator<go1>, be5 {
    private final wna a;
    private final int b;
    private int c;
    private final int d;

    public pi4(wna wnaVar, int i, int i2) {
        z65.h(wnaVar, "table");
        this.a = wnaVar;
        this.b = i2;
        this.c = i;
        this.d = wnaVar.A();
        if (!wnaVar.B()) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    private final void c() {
        if (this.a.A() == this.d) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    /* renamed from: b */
    public go1 next() {
        int G;
        c();
        int i = this.c;
        G = yna.G(this.a.u(), i);
        this.c = G + i;
        return new xna(this.a, i, this.d);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.c < this.b) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
