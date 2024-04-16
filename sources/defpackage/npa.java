package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: SnapshotState.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u000fB\u001d\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b \u0010!J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\"\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R*\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lnpa;", "T", "Lzua;", "Lmpa;", "Lbva;", "value", "", "g", "previous", "current", "applied", "j", "", "toString", "Lppa;", "a", "Lppa;", "()Lppa;", "policy", "Lnpa$a;", "b", "Lnpa$a;", StatisticManager.NEXT, "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "()V", "i", "()Lbva;", "firstStateRecord", "<init>", "(Ljava/lang/Object;Lppa;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: npa  reason: default package */
/* loaded from: classes.dex */
public class npa<T> implements zua, mpa<T> {
    private final ppa<T> a;
    private a<T> b;

    /* compiled from: SnapshotState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00028\u0001¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\"\u0010\u0003\u001a\u00028\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lnpa$a;", "T", "Lbva;", "value", "", c.a, DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Object;", "i", "()Ljava/lang/Object;", "j", "(Ljava/lang/Object;)V", "myValue", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: npa$a */
    /* loaded from: classes.dex */
    private static final class a<T> extends bva {
        private T c;

        public a(T t) {
            this.c = t;
        }

        @Override // defpackage.bva
        public void c(bva bvaVar) {
            z65.h(bvaVar, "value");
            this.c = ((a) bvaVar).c;
        }

        @Override // defpackage.bva
        public bva d() {
            return new a(this.c);
        }

        public final T i() {
            return this.c;
        }

        public final void j(T t) {
            this.c = t;
        }
    }

    public npa(T t, ppa<T> ppaVar) {
        z65.h(ppaVar, "policy");
        this.a = ppaVar;
        this.b = new a<>(t);
    }

    @Override // defpackage.mpa
    public ppa<T> a() {
        return this.a;
    }

    @Override // defpackage.zua
    public void g(bva bvaVar) {
        z65.h(bvaVar, "value");
        this.b = (a) bvaVar;
    }

    @Override // defpackage.er6, defpackage.cua
    public T getValue() {
        return (T) ((a) fpa.V(this.b, this)).i();
    }

    @Override // defpackage.zua
    public bva i() {
        return this.b;
    }

    @Override // defpackage.zua
    public bva j(bva bvaVar, bva bvaVar2, bva bvaVar3) {
        z65.h(bvaVar, "previous");
        z65.h(bvaVar2, "current");
        z65.h(bvaVar3, "applied");
        a aVar = (a) bvaVar;
        a aVar2 = (a) bvaVar2;
        a aVar3 = (a) bvaVar3;
        if (!a().b((T) aVar2.i(), (T) aVar3.i())) {
            T a2 = a().a((T) aVar.i(), (T) aVar2.i(), (T) aVar3.i());
            if (a2 != null) {
                bva d = aVar3.d();
                z65.f(d, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.mergeRecords$lambda$2>");
                ((a) d).j(a2);
                return d;
            }
            return null;
        }
        return bvaVar2;
    }

    @Override // defpackage.er6
    public void setValue(T t) {
        yoa b;
        a aVar = (a) fpa.D(this.b);
        if (!a().b((T) aVar.i(), t)) {
            a<T> aVar2 = this.b;
            fpa.H();
            synchronized (fpa.G()) {
                b = yoa.e.b();
                ((a) fpa.Q(aVar2, this, b, aVar)).j(t);
                Unit unit = Unit.a;
            }
            fpa.O(b, this);
        }
    }

    public String toString() {
        return "MutableState(value=" + ((a) fpa.D(this.b)).i() + ")@" + hashCode();
    }
}
