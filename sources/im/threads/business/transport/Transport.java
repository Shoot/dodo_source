package im.threads.business.transport;

import androidx.lifecycle.d;
import im.threads.business.chatUpdates.ChatUpdateProcessor;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.models.ConsultInfo;
import im.threads.business.models.Survey;
import im.threads.business.models.UserPhrase;
import im.threads.business.rest.queries.BackendApi;
import im.threads.business.rest.queries.ThreadsApi;
import im.threads.business.transport.Transport;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import retrofit2.Call;
/* compiled from: Transport.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b7\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006J\b\u0010\u000b\u001a\u00020\tH&J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0004H&J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0007H&J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0004H&J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0004H&J\b\u0010\u0017\u001a\u00020\tH&J\u000f\u0010\u001a\u001a\u00020\tH ¢\u0006\u0004\b\u0018\u0010\u0019J.\u0010!\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00072\b\u0010 \u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0007H&J\u001e\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0$H&J\u0018\u0010)\u001a\u00020\t2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H&J\b\u0010*\u001a\u00020\u0007H&J\u0012\u0010-\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010+H&R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00068"}, d2 = {"Lim/threads/business/transport/Transport;", "", "Lz33;", "event", "", "subscribe", "", "", "uuidList", "", "markMessagesAsRead", "buildTransport", "Lim/threads/business/models/Survey;", "survey", "sendRatingDone", "approveResolve", "sendResolveThread", "input", "sendUserTying", "forceRegistration", "sendRegisterDevice", "isPreregister", "sendInitMessages", "closeWebSocket", "updatePushToken$threads_release", "()V", "updatePushToken", "Lim/threads/business/models/UserPhrase;", "userPhrase", "Lim/threads/business/models/ConsultInfo;", "consultInfo", "filePath", "quoteFilePath", "sendMessage", MessageAttributes.CLIENT_ID, "sendClientOffline", "Lkotlin/Function0;", "callBack", "", "latitude", "longitude", "updateLocation", "getToken", "Landroidx/lifecycle/d;", "lifecycle", "setLifecycle", "Lim/threads/business/chatUpdates/ChatUpdateProcessor;", "chatUpdateProcessor$delegate", "Lrn5;", "getChatUpdateProcessor", "()Lim/threads/business/chatUpdates/ChatUpdateProcessor;", "chatUpdateProcessor", "Lwn1;", "compositeDisposable", "Lwn1;", "<init>", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public abstract class Transport {
    private final rn5 chatUpdateProcessor$delegate;
    private wn1 compositeDisposable;

    public Transport() {
        rn5 b;
        b = yn5.b(Transport$special$$inlined$inject$1.INSTANCE);
        this.chatUpdateProcessor$delegate = b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChatUpdateProcessor getChatUpdateProcessor() {
        return (ChatUpdateProcessor) this.chatUpdateProcessor$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void markMessagesAsRead$lambda$0(List list) {
        z65.h(list, "$uuidList");
        Call<Void> markMessageAsRead = BackendApi.Companion.get().markMessageAsRead(list);
        if (markMessageAsRead != null) {
            markMessageAsRead.execute();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void markMessagesAsRead$lambda$1(List list, Transport transport) {
        z65.h(list, "$uuidList");
        z65.h(transport, "this$0");
        LoggerEdna.info(ThreadsApi.REST_TAG, "messagesAreRead : " + list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null) {
                transport.getChatUpdateProcessor().postIncomingMessageWasRead(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void markMessagesAsRead$lambda$2(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final boolean subscribe(z33 z33Var) {
        wn1 wn1Var = this.compositeDisposable;
        if (wn1Var == null || (wn1Var != null && wn1Var.i())) {
            this.compositeDisposable = new wn1();
        }
        wn1 wn1Var2 = this.compositeDisposable;
        if (wn1Var2 != null && wn1Var2.b(z33Var)) {
            return true;
        }
        return false;
    }

    public abstract void buildTransport();

    public abstract void closeWebSocket();

    public abstract String getToken();

    public final void markMessagesAsRead(final List<String> list) {
        z65.h(list, "uuidList");
        LoggerEdna.info(ThreadsApi.REST_TAG, "markMessagesAsRead : " + list);
        sk1 g = sk1.b(new t4() { // from class: rlb
            @Override // defpackage.t4
            public final void run() {
                Transport.markMessagesAsRead$lambda$0(list);
            }
        }).g(dw9.b());
        t4 t4Var = new t4() { // from class: slb
            @Override // defpackage.t4
            public final void run() {
                Transport.markMessagesAsRead$lambda$1(list, this);
            }
        };
        final Transport$markMessagesAsRead$3 transport$markMessagesAsRead$3 = new Transport$markMessagesAsRead$3(list, this);
        z33 e = g.e(t4Var, new wr1() { // from class: tlb
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                Transport.markMessagesAsRead$lambda$2(Function1.this, obj);
            }
        });
        z65.g(e, "fun markMessagesAsRead(u…        }\n        )\n    }");
        subscribe(e);
    }

    public abstract void sendClientOffline(String str);

    public abstract void sendClientOffline(String str, Function0<Unit> function0);

    public abstract void sendInitMessages(boolean z);

    public abstract boolean sendMessage(UserPhrase userPhrase, ConsultInfo consultInfo, String str, String str2);

    public abstract void sendRatingDone(Survey survey);

    public abstract void sendRegisterDevice(boolean z);

    public abstract void sendResolveThread(boolean z);

    public abstract void sendUserTying(String str);

    public abstract void setLifecycle(d dVar);

    public abstract void updateLocation(double d, double d2);

    public abstract void updatePushToken$threads_release();
}
