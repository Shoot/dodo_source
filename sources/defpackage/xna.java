package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B!\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0096\u0002R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0018"}, d2 = {"Lxna;", "Lgo1;", "", "", DateTokenConverter.CONVERTER_KEY, "", "iterator", "Lwna;", "a", "Lwna;", "getTable", "()Lwna;", "table", "", "b", "I", "getGroup", "()I", "group", c.a, "getVersion", "version", "<init>", "(Lwna;II)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: xna  reason: default package */
/* loaded from: classes.dex */
public final class xna implements go1, Iterable<go1>, be5 {
    private final wna a;
    private final int b;
    private final int c;

    public xna(wna wnaVar, int i, int i2) {
        z65.h(wnaVar, "table");
        this.a = wnaVar;
        this.b = i;
        this.c = i2;
    }

    private final void d() {
        if (this.a.A() == this.c) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.lang.Iterable
    public Iterator<go1> iterator() {
        int G;
        d();
        wna wnaVar = this.a;
        int i = this.b;
        G = yna.G(wnaVar.u(), this.b);
        return new pi4(wnaVar, i + 1, i + G);
    }
}
