package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
/* compiled from: Atomic.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u0006R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Luy;", "T", "Lea7;", "", "decision", e.a, "(Ljava/lang/Object;)Ljava/lang/Object;", "affected", "i", "failure", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;Ljava/lang/Object;)V", c.a, "f", "()Ljava/lang/Object;", "consensus", "", Image.TYPE_HIGH, "()Z", "isDecided", "", "g", "()J", "opSequence", "a", "()Luy;", "atomicOp", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: uy  reason: default package */
/* loaded from: classes3.dex */
public abstract class uy<T> extends ea7 {
    private static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(uy.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = ty.a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ea7
    public final Object c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == ty.a) {
            obj2 = e(i(obj));
        }
        d(obj, obj2);
        return obj2;
    }

    public abstract void d(T t, Object obj);

    public final Object e(Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = ty.a;
        if (obj2 != obj3) {
            return obj2;
        }
        if (d2.a(a, this, obj3, obj)) {
            return obj;
        }
        return this._consensus;
    }

    public final Object f() {
        return this._consensus;
    }

    public long g() {
        return 0L;
    }

    public final boolean h() {
        if (this._consensus != ty.a) {
            return true;
        }
        return false;
    }

    public abstract Object i(T t);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ea7
    public uy<?> a() {
        return this;
    }
}
