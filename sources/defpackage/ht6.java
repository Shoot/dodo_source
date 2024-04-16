package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import im.threads.ui.core.ThreadsLib;
import kotlin.Metadata;
/* compiled from: NativeChatDomainModule.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lht6;", "", "Las8;", "Lim/threads/ui/core/ThreadsLib;", "threadsLibProvider", "Lst6;", "a", "(Las8;)Lst6;", "Ljfb;", "count", "Lzt6;", "b", "(Ljfb;)Lzt6;", "Lmh0;", "buildInfo", "Ljeb;", DateTokenConverter.CONVERTER_KEY, "(Lmh0;)Ljeb;", "Lmfb;", "threadsLibUserInfoBuilder", "Lut8;", "pushTokenProvider", "Lhfb;", "threadsLibPushService", "Lbu6;", c.a, "(Lmfb;Las8;Lut8;Lhfb;)Lbu6;", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ht6  reason: default package */
/* loaded from: classes.dex */
public final class ht6 {
    public static final ht6 a = new ht6();

    private ht6() {
    }

    public final st6 a(as8<ThreadsLib> as8Var) {
        z65.h(as8Var, "threadsLibProvider");
        return new dfb(as8Var);
    }

    public final zt6 b(jfb jfbVar) {
        z65.h(jfbVar, "count");
        return jfbVar;
    }

    public final bu6 c(mfb mfbVar, as8<ThreadsLib> as8Var, ut8 ut8Var, hfb hfbVar) {
        z65.h(mfbVar, "threadsLibUserInfoBuilder");
        z65.h(as8Var, "threadsLibProvider");
        z65.h(ut8Var, "pushTokenProvider");
        z65.h(hfbVar, "threadsLibPushService");
        return new ofb(mfbVar, as8Var, ut8Var, hfbVar, null, 16, null);
    }

    public final jeb d(mh0 mh0Var) {
        z65.h(mh0Var, "buildInfo");
        return new jeb(mh0Var);
    }
}
