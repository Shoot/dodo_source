package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.ConfigBuilder;
import im.threads.ui.core.ThreadsLib;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: ThreadsLibInitializer.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B3\b\u0001\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007R#\u0010\u0013\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0006\u0010\u0012¨\u0006\u0016"}, d2 = {"Lbfb;", "", "", "b", "Las8;", "Lim/threads/ui/config/ConfigBuilder;", "a", "Las8;", "configProvider", "Lim/threads/ui/ChatStyle;", "chatStyleProvider", "Lim/threads/ui/core/ThreadsLib;", c.a, "threadsLibProvider", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lrn5;", "()Lorg/slf4j/Logger;", "logger", "<init>", "(Las8;Las8;Las8;)V", "chat_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bfb  reason: default package */
/* loaded from: classes.dex */
public final class bfb {
    private final as8<ConfigBuilder> a;
    private final as8<ChatStyle> b;
    private final as8<ThreadsLib> c;
    private final rn5 d;

    /* compiled from: ThreadsLibInitializer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: bfb$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<Logger> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("ThreadsLibInitializer");
        }
    }

    public bfb(as8<ConfigBuilder> as8Var, as8<ChatStyle> as8Var2, as8<ThreadsLib> as8Var3) {
        rn5 b;
        z65.h(as8Var, "configProvider");
        z65.h(as8Var2, "chatStyleProvider");
        z65.h(as8Var3, "threadsLibProvider");
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        b = yn5.b(a.a);
        this.d = b;
    }

    private final Logger a() {
        return (Logger) this.d.getValue();
    }

    public final void b() {
        synchronized (this) {
            ThreadsLib.Companion companion = ThreadsLib.Companion;
            if (companion.isInitialized()) {
                return;
            }
            try {
                ConfigBuilder configBuilder = this.a.get();
                z65.g(configBuilder, "get(...)");
                companion.init(configBuilder);
                this.c.get().applyLightTheme(this.b.get());
            } catch (Exception e) {
                a().error("Failed to init ThreadsLib", (Throwable) e);
            }
            Unit unit = Unit.a;
        }
    }
}
