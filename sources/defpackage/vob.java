package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: FontFamilyResolver.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u00050\u0004R\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0015"}, d2 = {"Lvob;", "", "Luob;", "typefaceRequest", "Lkotlin/Function1;", "Lwob;", "", "resolveTypeface", "Lcua;", c.a, "Lw3b;", "a", "Lw3b;", "b", "()Lw3b;", "lock", "Lh36;", "Lh36;", "resultCache", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: vob  reason: default package */
/* loaded from: classes.dex */
public final class vob {
    private final w3b a = u3b.a();
    private final h36<uob, wob> b = new h36<>(16);

    /* compiled from: FontFamilyResolver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwob;", "finalResult", "", "a", "(Lwob;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: vob$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<wob, Unit> {
        final /* synthetic */ uob b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(uob uobVar) {
            super(1);
            this.b = uobVar;
        }

        public final void a(wob wobVar) {
            z65.h(wobVar, "finalResult");
            w3b b = vob.this.b();
            vob vobVar = vob.this;
            uob uobVar = this.b;
            synchronized (b) {
                try {
                    if (wobVar.c()) {
                        vobVar.b.e(uobVar, wobVar);
                    } else {
                        vobVar.b.f(uobVar);
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(wob wobVar) {
            a(wobVar);
            return Unit.a;
        }
    }

    public final w3b b() {
        return this.a;
    }

    public final cua<Object> c(uob uobVar, Function1<? super Function1<? super wob, Unit>, ? extends wob> function1) {
        z65.h(uobVar, "typefaceRequest");
        z65.h(function1, "resolveTypeface");
        synchronized (this.a) {
            wob d = this.b.d(uobVar);
            if (d != null) {
                if (d.c()) {
                    return d;
                }
                this.b.f(uobVar);
            }
            try {
                wob invoke = function1.invoke(new a(uobVar));
                synchronized (this.a) {
                    try {
                        if (this.b.d(uobVar) == null && invoke.c()) {
                            this.b.e(uobVar, invoke);
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return invoke;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }
}
