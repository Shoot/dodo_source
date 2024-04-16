package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.i2;
import defpackage.sk9;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: AbstractSharedFlow.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b'\u0010\u0017J\u000f\u0010\u0005\u001a\u00028\u0000H$¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t2\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000f\u0010\u0010R>\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t2\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t8\u0004@BX\u0084\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00078\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070$8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010%¨\u0006("}, d2 = {"Lg2;", "Li2;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "i", "()Li2;", "", "size", "", "j", "(I)[Li2;", Image.TYPE_HIGH, "slot", "", "k", "(Li2;)V", "<set-?>", "a", "[Li2;", Image.TYPE_MEDIUM, "()[Li2;", "getSlots$annotations", "()V", "slots", "b", "I", "l", "()I", "nCollectors", c.a, "nextIndex", "Lm1b;", DateTokenConverter.CONVERTER_KEY, "Lm1b;", "_subscriptionCount", "Lkua;", "()Lkua;", "subscriptionCount", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: g2  reason: default package */
/* loaded from: classes3.dex */
public abstract class g2<S extends i2<?>> {
    private S[] a;
    private int b;
    private int c;
    private m1b d;

    public static final /* synthetic */ int e(g2 g2Var) {
        return g2Var.b;
    }

    public static final /* synthetic */ i2[] g(g2 g2Var) {
        return g2Var.a;
    }

    public final kua<Integer> c() {
        m1b m1bVar;
        synchronized (this) {
            m1bVar = this.d;
            if (m1bVar == null) {
                m1bVar = new m1b(this.b);
                this.d = m1bVar;
            }
        }
        return m1bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final S h() {
        S s;
        m1b m1bVar;
        synchronized (this) {
            try {
                S[] sArr = this.a;
                if (sArr == null) {
                    sArr = j(2);
                    this.a = sArr;
                } else if (this.b >= sArr.length) {
                    Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    z65.g(copyOf, "copyOf(this, newSize)");
                    this.a = (S[]) ((i2[]) copyOf);
                    sArr = (S[]) ((i2[]) copyOf);
                }
                int i = this.c;
                do {
                    s = sArr[i];
                    if (s == null) {
                        s = i();
                        sArr[i] = s;
                    }
                    i++;
                    if (i >= sArr.length) {
                        i = 0;
                    }
                } while (!s.a(this));
                this.c = i;
                this.b++;
                m1bVar = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (m1bVar != null) {
            m1bVar.Z(1);
        }
        return s;
    }

    protected abstract S i();

    protected abstract S[] j(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(S s) {
        m1b m1bVar;
        int i;
        cv1<Unit>[] b;
        synchronized (this) {
            try {
                int i2 = this.b - 1;
                this.b = i2;
                m1bVar = this.d;
                if (i2 == 0) {
                    this.c = 0;
                }
                b = s.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (cv1<Unit> cv1Var : b) {
            if (cv1Var != null) {
                sk9.a aVar = sk9.b;
                cv1Var.resumeWith(sk9.b(Unit.a));
            }
        }
        if (m1bVar != null) {
            m1bVar.Z(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int l() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final S[] m() {
        return this.a;
    }
}
