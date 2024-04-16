package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: TransactionManagerImpl.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016R\u001c\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0013"}, d2 = {"Ljkb;", "Likb;", "T", "Lkotlin/Function0;", "function", "a", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", DateTokenConverter.CONVERTER_KEY, "", "b", c.a, e.a, "Ldm2;", "Lzl2;", "Ldm2;", "databaseConnector", "<init>", "(Ldm2;)V", "persistence_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: jkb  reason: default package */
/* loaded from: classes2.dex */
public final class jkb implements ikb {
    private final dm2<? extends zl2> a;

    public jkb(dm2<? extends zl2> dm2Var) {
        z65.h(dm2Var, "databaseConnector");
        this.a = dm2Var;
    }

    @Override // defpackage.ikb
    public <T> T a(Function0<? extends T> function0) {
        z65.h(function0, "function");
        if (d()) {
            return function0.invoke();
        }
        b();
        try {
            T invoke = function0.invoke();
            c();
            return invoke;
        } catch (Throwable th) {
            e();
            throw th;
        }
    }

    public void b() {
        if (!d()) {
            if (!this.a.isConnected()) {
                this.a.b();
            }
            this.a.a().beginTransaction();
        }
    }

    public void c() {
        if (this.a.isConnected()) {
            this.a.a().p();
        }
    }

    public boolean d() {
        if (this.a.isConnected()) {
            return this.a.a().h();
        }
        return false;
    }

    public void e() {
        if (this.a.isConnected()) {
            this.a.a().o();
        }
    }
}
