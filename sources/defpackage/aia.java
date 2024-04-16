package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: SharedSQLiteStatement.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0007H$J\b\u0010\n\u001a\u00020\tH\u0014J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Laia;", "", "Lc3b;", DateTokenConverter.CONVERTER_KEY, "", "canUseCached", "g", "", e.a, "", c.a, "b", "statement", Image.TYPE_HIGH, "Lun9;", "a", "Lun9;", "database", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lock", "Lrn5;", "f", "()Lc3b;", "stmt", "<init>", "(Lun9;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: aia  reason: default package */
/* loaded from: classes.dex */
public abstract class aia {
    private final un9 a;
    private final AtomicBoolean b;
    private final rn5 c;

    /* compiled from: SharedSQLiteStatement.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc3b;", "a", "()Lc3b;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: aia$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<c3b> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final c3b invoke() {
            return aia.this.d();
        }
    }

    public aia(un9 un9Var) {
        rn5 b;
        z65.h(un9Var, "database");
        this.a = un9Var;
        this.b = new AtomicBoolean(false);
        b = yn5.b(new a());
        this.c = b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c3b d() {
        return this.a.f(e());
    }

    private final c3b f() {
        return (c3b) this.c.getValue();
    }

    private final c3b g(boolean z) {
        if (z) {
            return f();
        }
        return d();
    }

    public c3b b() {
        c();
        return g(this.b.compareAndSet(false, true));
    }

    protected void c() {
        this.a.c();
    }

    protected abstract String e();

    public void h(c3b c3bVar) {
        z65.h(c3bVar, "statement");
        if (c3bVar == f()) {
            this.b.set(false);
        }
    }
}
