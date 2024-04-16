package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0001¢\u0006\u0004\b%\u0010&J\u001e\u0010\u0006\u001a\u00020\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016J\u000f\u0010\u0007\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0004H\u0016J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\"\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001a¨\u0006'"}, d2 = {"Ljv6;", "Lyoa;", "Lkotlin/Function1;", "", "", "readObserver", "D", "o", "()V", DateTokenConverter.CONVERTER_KEY, "Lzua;", "state", "", "C", "(Lzua;)Ljava/lang/Void;", "snapshot", "B", "(Lyoa;)Ljava/lang/Void;", "A", "g", "Lyoa;", "getParent", "()Lyoa;", "parent", Image.TYPE_HIGH, "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "", "i", "()Z", "readOnly", "k", "writeObserver", "", "id", "Lbpa;", "invalid", "<init>", "(ILbpa;Lkotlin/jvm/functions/Function1;Lyoa;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: jv6  reason: default package */
/* loaded from: classes.dex */
public final class jv6 extends yoa {
    private final yoa g;
    private final Function1<Object, Unit> h;

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "state", "", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: jv6$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<Object, Unit> {
        final /* synthetic */ Function1<Object, Unit> a;
        final /* synthetic */ Function1<Object, Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
            super(1);
            this.a = function1;
            this.b = function12;
        }

        public final void a(Object obj) {
            z65.h(obj, "state");
            this.a.invoke(obj);
            this.b.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            a(obj);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv6(int i, bpa bpaVar, Function1<Object, Unit> function1, yoa yoaVar) {
        super(i, bpaVar, null);
        z65.h(bpaVar, "invalid");
        z65.h(yoaVar, "parent");
        this.g = yoaVar;
        yoaVar.m(this);
        if (function1 != null) {
            Function1<Object, Unit> h = yoaVar.h();
            if (h != null) {
                function1 = new a(function1, h);
            }
        } else {
            function1 = yoaVar.h();
        }
        this.h = function1;
    }

    @Override // defpackage.yoa
    /* renamed from: A */
    public Void m(yoa yoaVar) {
        z65.h(yoaVar, "snapshot");
        vpa.b();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.yoa
    /* renamed from: B */
    public Void n(yoa yoaVar) {
        z65.h(yoaVar, "snapshot");
        vpa.b();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.yoa
    /* renamed from: C */
    public Void p(zua zuaVar) {
        z65.h(zuaVar, "state");
        fpa.X();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.yoa
    /* renamed from: D */
    public jv6 x(Function1<Object, Unit> function1) {
        return new jv6(f(), g(), function1, this.g);
    }

    @Override // defpackage.yoa
    public void d() {
        if (!e()) {
            if (f() != this.g.f()) {
                b();
            }
            this.g.n(this);
            super.d();
        }
    }

    @Override // defpackage.yoa
    public Function1<Object, Unit> h() {
        return this.h;
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
    public void o() {
    }
}
