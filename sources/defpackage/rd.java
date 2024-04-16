package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\"\u0010\u000e\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lrd;", "", "Lwna;", "slots", "", DateTokenConverter.CONVERTER_KEY, "Lzna;", "writer", e.a, "a", "I", "()I", c.a, "(I)V", "location", "", "b", "()Z", "valid", "loc", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: rd  reason: default package */
/* loaded from: classes.dex */
public final class rd {
    private int a;

    public rd(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean b() {
        if (this.a != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final void c(int i) {
        this.a = i;
    }

    public final int d(wna wnaVar) {
        z65.h(wnaVar, "slots");
        return wnaVar.g(this);
    }

    public final int e(zna znaVar) {
        z65.h(znaVar, "writer");
        return znaVar.B(this);
    }
}
