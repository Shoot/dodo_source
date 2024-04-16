package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: CacheableService.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0013\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lxl0;", "", "T", "Lkotlin/Function0;", "loadFromStorage", "Lxl0$a;", "invalidateAction", "Lql0;", "cacheParams", "f", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lql0;)Ljava/lang/Object;", "Lml0;", "b", "Lml0;", "cacheInspector", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", c.a, "Lorg/slf4j/Logger;", "logger", "<init>", "(Lml0;)V", "a", "cache"}, k = 1, mv = {1, 9, 0})
/* renamed from: xl0  reason: default package */
/* loaded from: classes.dex */
public abstract class xl0 {
    private final ml0 b;
    private final Logger c;

    /* compiled from: CacheableService.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lxl0$a;", "", "<init>", "()V", "a", "Lxl0$a$a;", "cache"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xl0$a */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* compiled from: CacheableService.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxl0$a$a;", "Lxl0$a;", "<init>", "()V", "cache"}, k = 1, mv = {1, 9, 0})
        /* renamed from: xl0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0743a extends a {
            public static final C0743a a = new C0743a();

            private C0743a() {
                super(null);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public xl0(ml0 ml0Var) {
        z65.h(ml0Var, "cacheInspector");
        this.b = ml0Var;
        this.c = LoggerFactory.getLogger(xl0.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <T> T f(Function0<? extends T> function0, Function0<? extends a> function02, ql0 ql0Var) {
        z65.h(function0, "loadFromStorage");
        z65.h(function02, "invalidateAction");
        z65.h(ql0Var, "cacheParams");
        boolean a2 = this.b.a(ql0Var.b());
        if (ql0Var.c() || !a2) {
            if (!a2) {
                Logger logger = this.c;
                String b = ql0Var.b();
                logger.debug("Invalid cache [key = " + b + "]");
            }
            function02.invoke();
            long a3 = ql0Var.a();
            Logger logger2 = this.c;
            String b2 = ql0Var.b();
            logger2.debug("Update cache validity [key = " + b2 + ", duration = " + a3 + "]");
            this.b.b(ql0Var.b(), a3);
        }
        return function0.invoke();
    }
}
