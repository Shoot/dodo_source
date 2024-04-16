package ru.dodopizza.app;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: DodoPizzaApp.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"Lsj3;", "a", "Lsj3;", "DEFAULT_ENVIRONMENT_CONFIG", "app_prodRelease"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class a {
    private static final sj3 a;

    /* compiled from: DodoPizzaApp.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.dodopizza.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0506a implements tj3, i94 {
        private final /* synthetic */ Function0 a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0506a(Function0 function0) {
            z65.h(function0, "function");
            this.a = function0;
        }

        @Override // defpackage.i94
        public final b94<?> b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof tj3) || !(obj instanceof i94)) {
                return false;
            }
            return z65.c(b(), ((i94) obj).b());
        }

        @Override // defpackage.tj3
        public final /* synthetic */ sj3 get() {
            return (sj3) this.a.invoke();
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    static {
        Map<String, String> map = hh0.a;
        z65.g(map, "ENVIRONMENTS");
        a = new sj3("prod1", "prod2", map);
    }
}
