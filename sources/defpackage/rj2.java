package defpackage;

import com.dodopizza.loyalty.stacksgame.StackGamePresenter;
import com.dodopizza.loyalty.stacksgame.di.StackGameDependencies;
import defpackage.tsa;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: DaggerStackGameComponent.java */
/* renamed from: rj2  reason: default package */
/* loaded from: classes2.dex */
public final class rj2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerStackGameComponent.java */
    /* renamed from: rj2$a */
    /* loaded from: classes2.dex */
    public static final class a implements tsa.b {
        private a() {
        }

        @Override // defpackage.tsa.b
        public tsa a(StackGameDependencies stackGameDependencies, String str) {
            jh8.b(stackGameDependencies);
            jh8.b(str);
            return new b(stackGameDependencies, str);
        }
    }

    /* compiled from: DaggerStackGameComponent.java */
    /* renamed from: rj2$b */
    /* loaded from: classes2.dex */
    private static final class b implements tsa {
        private final StackGameDependencies b;
        private final String c;
        private final b d;

        private ysa b() {
            return new ysa((dt5) jh8.d(this.b.F()), (mh0) jh8.d(this.b.i()), (s80) jh8.d(this.b.T()), (x26) jh8.d(this.b.y()), (CountryService) jh8.d(this.b.e()), (t52) jh8.d(this.b.m()), (hq3) jh8.d(this.b.c()), (kx1) jh8.d(this.b.d()));
        }

        @Override // defpackage.tsa
        public StackGamePresenter a() {
            return new StackGamePresenter(b(), (f63) jh8.d(this.b.b()), this.c, (gc) jh8.d(this.b.a()));
        }

        private b(StackGameDependencies stackGameDependencies, String str) {
            this.d = this;
            this.b = stackGameDependencies;
            this.c = str;
        }
    }

    public static tsa.b a() {
        return new a();
    }
}
