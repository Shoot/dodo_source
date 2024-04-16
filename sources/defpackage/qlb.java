package defpackage;

import androidx.compose.runtime.snapshots.a;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u00105\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b6\u00107J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000b\u001a\u00020\u00012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bH\u0016J\u000f\u0010\f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0017\u0010\u001eR(\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u001a\u0010$\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R$\u0010-\u001a\u00020'2\u0006\u0010(\u001a\u00020'8V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00102\u001a\u00020.2\u0006\u0010(\u001a\u00020.8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010/\"\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u00103¨\u00068"}, d2 = {"Lqlb;", "Lyoa;", "", DateTokenConverter.CONVERTER_KEY, "Lzua;", "state", "p", "(Lzua;)V", "Lkotlin/Function1;", "", "readObserver", "x", "o", "()V", "snapshot", "", "B", "(Lyoa;)Ljava/lang/Void;", "C", "g", "Lyoa;", "previousSnapshot", "", Image.TYPE_HIGH, "Z", "mergeParentObservers", "i", "ownsPreviousSnapshot", "j", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "k", "writeObserver", "l", "getRoot", "()Lyoa;", "root", "A", "currentSnapshot", "", "value", "f", "()I", "setId$runtime_release", "(I)V", "id", "Lbpa;", "()Lbpa;", "setInvalid$runtime_release", "(Lbpa;)V", "invalid", "()Z", "readOnly", "specifiedReadObserver", "<init>", "(Lyoa;Lkotlin/jvm/functions/Function1;ZZ)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: qlb  reason: default package */
/* loaded from: classes.dex */
public final class qlb extends yoa {
    private final yoa g;
    private final boolean h;
    private final boolean i;
    private final Function1<Object, Unit> j;
    private final Function1<Object, Unit> k;
    private final yoa l;

    public qlb(yoa yoaVar, Function1<Object, Unit> function1, boolean z, boolean z2) {
        super(0, bpa.e.a(), null);
        AtomicReference atomicReference;
        Function1<Object, Unit> h;
        Function1<Object, Unit> I;
        this.g = yoaVar;
        this.h = z;
        this.i = z2;
        if (yoaVar == null || (h = yoaVar.h()) == null) {
            atomicReference = fpa.j;
            h = ((a) atomicReference.get()).h();
        }
        I = fpa.I(function1, h, z);
        this.j = I;
        this.l = this;
    }

    private final yoa A() {
        AtomicReference atomicReference;
        yoa yoaVar = this.g;
        if (yoaVar == null) {
            atomicReference = fpa.j;
            Object obj = atomicReference.get();
            z65.g(obj, "currentGlobalSnapshot.get()");
            return (yoa) obj;
        }
        return yoaVar;
    }

    @Override // defpackage.yoa
    /* renamed from: B */
    public Void m(yoa yoaVar) {
        z65.h(yoaVar, "snapshot");
        vpa.b();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.yoa
    /* renamed from: C */
    public Void n(yoa yoaVar) {
        z65.h(yoaVar, "snapshot");
        vpa.b();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.yoa
    public void d() {
        yoa yoaVar;
        t(true);
        if (this.i && (yoaVar = this.g) != null) {
            yoaVar.d();
        }
    }

    @Override // defpackage.yoa
    public int f() {
        return A().f();
    }

    @Override // defpackage.yoa
    public bpa g() {
        return A().g();
    }

    @Override // defpackage.yoa
    public Function1<Object, Unit> h() {
        return this.j;
    }

    @Override // defpackage.yoa
    public boolean i() {
        return A().i();
    }

    @Override // defpackage.yoa
    public Function1<Object, Unit> k() {
        return this.k;
    }

    @Override // defpackage.yoa
    public void o() {
        A().o();
    }

    @Override // defpackage.yoa
    public void p(zua zuaVar) {
        z65.h(zuaVar, "state");
        A().p(zuaVar);
    }

    @Override // defpackage.yoa
    public yoa x(Function1<Object, Unit> function1) {
        yoa B;
        Function1<Object, Unit> J = fpa.J(function1, h(), false, 4, null);
        if (!this.h) {
            B = fpa.B(A().x(null), J, true);
            return B;
        }
        return A().x(J);
    }
}
