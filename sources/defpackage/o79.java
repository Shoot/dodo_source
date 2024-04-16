package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u001f\u001a\u00020\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\"\u0010#J\u001e\u0010\u0006\u001a\u00020\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016J\u000f\u0010\u0007\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0004H\u0016J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015¨\u0006$"}, d2 = {"Lo79;", "Lyoa;", "Lkotlin/Function1;", "", "", "readObserver", "x", "o", "()V", DateTokenConverter.CONVERTER_KEY, "snapshot", Image.TYPE_MEDIUM, "(Lyoa;)V", "n", "Lzua;", "state", "p", "(Lzua;)V", "g", "Lkotlin/jvm/functions/Function1;", Image.TYPE_HIGH, "()Lkotlin/jvm/functions/Function1;", "", "I", "snapshots", "", "i", "()Z", "readOnly", "k", "writeObserver", "id", "Lbpa;", "invalid", "<init>", "(ILbpa;Lkotlin/jvm/functions/Function1;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: o79  reason: default package */
/* loaded from: classes.dex */
public final class o79 extends yoa {
    private final Function1<Object, Unit> g;
    private int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o79(int i, bpa bpaVar, Function1<Object, Unit> function1) {
        super(i, bpaVar, null);
        z65.h(bpaVar, "invalid");
        this.g = function1;
        this.h = 1;
    }

    @Override // defpackage.yoa
    public void d() {
        if (!e()) {
            n(this);
            super.d();
        }
    }

    @Override // defpackage.yoa
    public Function1<Object, Unit> h() {
        return this.g;
    }

    @Override // defpackage.yoa
    public boolean i() {
        return true;
    }

    @Override // defpackage.yoa
    public Function1<Object, Unit> k() {
        return null;
    }

    @Override // defpackage.yoa
    public void m(yoa yoaVar) {
        z65.h(yoaVar, "snapshot");
        this.h++;
    }

    @Override // defpackage.yoa
    public void n(yoa yoaVar) {
        z65.h(yoaVar, "snapshot");
        int i = this.h - 1;
        this.h = i;
        if (i == 0) {
            b();
        }
    }

    @Override // defpackage.yoa
    public void p(zua zuaVar) {
        z65.h(zuaVar, "state");
        fpa.X();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.yoa
    public yoa x(Function1<Object, Unit> function1) {
        fpa.e0(this);
        return new jv6(f(), g(), function1, this);
    }

    @Override // defpackage.yoa
    public void o() {
    }
}
