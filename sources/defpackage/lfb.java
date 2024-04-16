package defpackage;

import im.threads.business.controllers.UnreadMessagesController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: ThreadsLibUnreadMessagesCounterImpl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R#\u0010\f\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"Llfb;", "Lkfb;", "", "a", "Lim/threads/business/controllers/UnreadMessagesController;", "Lim/threads/business/controllers/UnreadMessagesController;", "unreadMessagesController", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "b", "Lrn5;", "()Lorg/slf4j/Logger;", "logger", "<init>", "(Lim/threads/business/controllers/UnreadMessagesController;)V", "chat_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lfb  reason: default package */
/* loaded from: classes.dex */
public final class lfb implements kfb {
    private final UnreadMessagesController a;
    private final rn5 b;

    /* compiled from: ThreadsLibUnreadMessagesCounterImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: lfb$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<Logger> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("ThreadsLibUnreadMessagesCounter");
        }
    }

    public lfb(UnreadMessagesController unreadMessagesController) {
        rn5 b;
        z65.h(unreadMessagesController, "unreadMessagesController");
        this.a = unreadMessagesController;
        b = yn5.b(a.a);
        this.b = b;
    }

    private final Logger b() {
        return (Logger) this.b.getValue();
    }

    @Override // defpackage.kfb
    public synchronized void a() {
        try {
            this.a.incrementUnreadPush();
        } catch (Exception e) {
            b().error("Failed to increment the unread messages counter", (Throwable) e);
        }
    }
}
