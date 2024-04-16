package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: SnapshotIntState.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0010B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\"\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u001c¨\u0006\u001f"}, d2 = {"Llpa;", "Lzua;", "Lnq6;", "Lmpa;", "", "Lbva;", "value", "", "g", "previous", "current", "applied", "j", "", "toString", "Llpa$a;", "a", "Llpa$a;", StatisticManager.NEXT, "i", "()Lbva;", "firstStateRecord", "b", "()I", e.a, "(I)V", "intValue", "Lppa;", "()Lppa;", "policy", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: lpa  reason: default package */
/* loaded from: classes.dex */
public class lpa implements zua, nq6, mpa<Integer> {
    private a a;

    /* compiled from: SnapshotIntState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0016J\b\u0010\u0005\u001a\u00020\u0001H\u0016R\"\u0010\u0002\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Llpa$a;", "Lbva;", "value", "", c.a, DateTokenConverter.CONVERTER_KEY, "", "I", "i", "()I", "j", "(I)V", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: lpa$a */
    /* loaded from: classes.dex */
    private static final class a extends bva {
        private int c;

        public a(int i) {
            this.c = i;
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

        public final int i() {
            return this.c;
        }

        public final void j(int i) {
            this.c = i;
        }
    }

    public lpa(int i) {
        this.a = new a(i);
    }

    @Override // defpackage.mpa
    public ppa<Integer> a() {
        return qpa.h();
    }

    @Override // defpackage.nq6, defpackage.a65
    public int b() {
        return ((a) fpa.V(this.a, this)).i();
    }

    @Override // defpackage.nq6
    public void e(int i) {
        yoa b;
        a aVar = (a) fpa.D(this.a);
        if (aVar.i() != i) {
            a aVar2 = this.a;
            fpa.H();
            synchronized (fpa.G()) {
                b = yoa.e.b();
                ((a) fpa.Q(aVar2, this, b, aVar)).j(i);
                Unit unit = Unit.a;
            }
            fpa.O(b, this);
        }
    }

    @Override // defpackage.nq6
    public /* synthetic */ void f(int i) {
        mq6.c(this, i);
    }

    @Override // defpackage.zua
    public void g(bva bvaVar) {
        z65.h(bvaVar, "value");
        this.a = (a) bvaVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.nq6, defpackage.cua
    public /* synthetic */ Integer getValue() {
        return mq6.a(this);
    }

    @Override // defpackage.zua
    public bva i() {
        return this.a;
    }

    @Override // defpackage.zua
    public bva j(bva bvaVar, bva bvaVar2, bva bvaVar3) {
        z65.h(bvaVar, "previous");
        z65.h(bvaVar2, "current");
        z65.h(bvaVar3, "applied");
        if (((a) bvaVar2).i() != ((a) bvaVar3).i()) {
            return null;
        }
        return bvaVar2;
    }

    @Override // defpackage.er6
    public /* bridge */ /* synthetic */ void setValue(Integer num) {
        f(num.intValue());
    }

    public String toString() {
        return "MutableIntState(value=" + ((a) fpa.D(this.a)).i() + ")@" + hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Integer] */
    @Override // defpackage.cua
    public /* bridge */ /* synthetic */ Integer getValue() {
        ?? value;
        value = getValue();
        return value;
    }
}
