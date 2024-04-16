package defpackage;

import android.app.Application;
import com.dodopizza.chat.feature.initializer.NativeChatInitializerDependencies;
import com.dodopizza.chat.feature.initializer.presentation.NativeChatInitializer;
import defpackage.ot6;
/* compiled from: DaggerNativeChatInitializerComponent.java */
/* renamed from: cg2  reason: default package */
/* loaded from: classes.dex */
public final class cg2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerNativeChatInitializerComponent.java */
    /* renamed from: cg2$a */
    /* loaded from: classes.dex */
    public static final class a implements ot6.b {
        private a() {
        }

        @Override // defpackage.ot6.b
        public ot6 a(NativeChatInitializerDependencies nativeChatInitializerDependencies) {
            jh8.b(nativeChatInitializerDependencies);
            return new b(nativeChatInitializerDependencies);
        }
    }

    /* compiled from: DaggerNativeChatInitializerComponent.java */
    /* renamed from: cg2$b */
    /* loaded from: classes.dex */
    private static final class b implements ot6 {
        private final b b;
        private as8<Application> c;
        private as8<bfb> d;
        private as8<ih> e;
        private as8<heb> f;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerNativeChatInitializerComponent.java */
        /* renamed from: cg2$b$a */
        /* loaded from: classes.dex */
        public static final class a implements as8<ih> {
            private final NativeChatInitializerDependencies a;

            a(NativeChatInitializerDependencies nativeChatInitializerDependencies) {
                this.a = nativeChatInitializerDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ih get() {
                return (ih) jh8.d(this.a.x0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerNativeChatInitializerComponent.java */
        /* renamed from: cg2$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0085b implements as8<Application> {
            private final NativeChatInitializerDependencies a;

            C0085b(NativeChatInitializerDependencies nativeChatInitializerDependencies) {
                this.a = nativeChatInitializerDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public Application get() {
                return (Application) jh8.d(this.a.o0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerNativeChatInitializerComponent.java */
        /* renamed from: cg2$b$c */
        /* loaded from: classes.dex */
        public static final class c implements as8<bfb> {
            private final NativeChatInitializerDependencies a;

            c(NativeChatInitializerDependencies nativeChatInitializerDependencies) {
                this.a = nativeChatInitializerDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public bfb get() {
                return (bfb) jh8.d(this.a.X());
            }
        }

        private void b(NativeChatInitializerDependencies nativeChatInitializerDependencies) {
            this.c = new C0085b(nativeChatInitializerDependencies);
            this.d = new c(nativeChatInitializerDependencies);
            a aVar = new a(nativeChatInitializerDependencies);
            this.e = aVar;
            this.f = p63.a(ieb.a(this.c, this.d, aVar));
        }

        private NativeChatInitializer c(NativeChatInitializer nativeChatInitializer) {
            pt6.a(nativeChatInitializer, this.f.get());
            return nativeChatInitializer;
        }

        @Override // defpackage.ot6
        public void a(NativeChatInitializer nativeChatInitializer) {
            c(nativeChatInitializer);
        }

        private b(NativeChatInitializerDependencies nativeChatInitializerDependencies) {
            this.b = this;
            b(nativeChatInitializerDependencies);
        }
    }

    public static ot6.b a() {
        return new a();
    }
}
