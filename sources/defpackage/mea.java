package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.dfa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SessionLifecycleClient.kt */
@Metadata(d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\b*\u0001%\b\u0000\u0018\u0000 +2\u00020\u0001:\u0002\u0016\u001aB\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0003J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0002J \u0010\u0011\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0006\u0010\u0012\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\u0004R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006,"}, d2 = {"Lmea;", "", "", "messageCode", "", "n", "", "Landroid/os/Message;", "messages", "Ll95;", "o", RemoteMessageConst.MessageBody.MSG, "p", Image.TYPE_MEDIUM, "", "j", "msgCode", "l", "i", "k", Image.TYPE_HIGH, "Lkotlin/coroutines/CoroutineContext;", "a", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "Landroid/os/Messenger;", "b", "Landroid/os/Messenger;", "service", "", com.huawei.hms.opendevice.c.a, "Z", "serviceBound", "Ljava/util/concurrent/LinkedBlockingDeque;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/LinkedBlockingDeque;", "queuedMessages", "mea$d", e.a, "Lmea$d;", "serviceConnection", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "f", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* renamed from: mea  reason: default package */
/* loaded from: classes2.dex */
public final class mea {
    public static final b f = new b(null);
    private final CoroutineContext a;
    private Messenger b;
    private boolean c;
    private final LinkedBlockingDeque<Message> d;
    private final d e;

    /* compiled from: SessionLifecycleClient.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\u000e"}, d2 = {"Lmea$a;", "Landroid/os/Handler;", "", "sessionId", "", "a", "Landroid/os/Message;", RemoteMessageConst.MessageBody.MSG, "handleMessage", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* renamed from: mea$a */
    /* loaded from: classes2.dex */
    public static final class a extends Handler {
        private final CoroutineContext a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SessionLifecycleClient.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @nn2(c = "com.google.firebase.sessions.SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1", f = "SessionLifecycleClient.kt", l = {74}, m = "invokeSuspend")
        /* renamed from: mea$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0438a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            int a;
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0438a(String str, cv1<? super C0438a> cv1Var) {
                super(2, cv1Var);
                this.b = str;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new C0438a(this.b, cv1Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                return ((C0438a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                Object d;
                d = c75.d();
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        vk9.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    vk9.b(obj);
                    zx3 zx3Var = zx3.a;
                    this.a = 1;
                    obj = zx3Var.c(this);
                    if (obj == d) {
                        return d;
                    }
                }
                String str = this.b;
                for (dfa dfaVar : ((Map) obj).values()) {
                    dfaVar.b(new dfa.b(str));
                    Log.d("SessionLifecycleClient", "Notified " + dfaVar.c() + " of new session " + str);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineContext coroutineContext) {
            super(Looper.getMainLooper());
            z65.h(coroutineContext, "backgroundDispatcher");
            this.a = coroutineContext;
        }

        private final void a(String str) {
            Log.d("SessionLifecycleClient", "Session update received: " + str);
            sh0.d(rx1.a(this.a), null, null, new C0438a(str, null), 3, null);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            z65.h(message, RemoteMessageConst.MessageBody.MSG);
            if (message.what == 3) {
                Bundle data = message.getData();
                a((data == null || (r3 = data.getString("SessionUpdateExtra")) == null) ? "" : "");
                return;
            }
            Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + message);
            super.handleMessage(message);
        }
    }

    /* compiled from: SessionLifecycleClient.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lmea$b;", "", "", "MAX_QUEUED_MESSAGES", "I", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* renamed from: mea$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SessionLifecycleClient.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @nn2(c = "com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1", f = "SessionLifecycleClient.kt", l = {151}, m = "invokeSuspend")
    /* renamed from: mea$c */
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ List<Message> c;

        /* compiled from: Comparisons.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* renamed from: mea$c$a */
        /* loaded from: classes2.dex */
        public static final class a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int d;
                d = mk1.d(Long.valueOf(((Message) t).getWhen()), Long.valueOf(((Message) t2).getWhen()));
                return d;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<Message> list, cv1<? super c> cv1Var) {
            super(2, cv1Var);
            this.c = list;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new c(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((c) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            List r;
            List W;
            List<Message> y0;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                zx3 zx3Var = zx3.a;
                this.a = 1;
                obj = zx3Var.c(this);
                if (obj == d) {
                    return d;
                }
            }
            Map map = (Map) obj;
            if (map.isEmpty()) {
                Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
            } else {
                Collection<dfa> values = map.values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    for (dfa dfaVar : values) {
                        if (dfaVar.a()) {
                            r = kc1.r(mea.this.l(this.c, 2), mea.this.l(this.c, 1));
                            W = sc1.W(r);
                            y0 = sc1.y0(W, new a());
                            mea meaVar = mea.this;
                            for (Message message : y0) {
                                meaVar.p(message);
                            }
                        }
                    }
                }
                Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
            }
            return Unit.a;
        }
    }

    /* compiled from: SessionLifecycleClient.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"mea$d", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "className", "Landroid/os/IBinder;", "serviceBinder", "", "onServiceConnected", "onServiceDisconnected", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* renamed from: mea$d */
    /* loaded from: classes2.dex */
    public static final class d implements ServiceConnection {
        d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d("SessionLifecycleClient", "Connected to SessionLifecycleService. Queue size " + mea.this.d.size());
            mea.this.b = new Messenger(iBinder);
            mea.this.c = true;
            mea meaVar = mea.this;
            meaVar.o(meaVar.j());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
            mea.this.b = null;
            mea.this.c = false;
        }
    }

    public mea(CoroutineContext coroutineContext) {
        z65.h(coroutineContext, "backgroundDispatcher");
        this.a = coroutineContext;
        this.d = new LinkedBlockingDeque<>(20);
        this.e = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Message> j() {
        ArrayList arrayList = new ArrayList();
        this.d.drainTo(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Message l(List<Message> list, int i) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (!it.hasNext()) {
                obj = next;
            } else {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
                obj = next;
            }
        }
        return (Message) obj;
    }

    private final void m(Message message) {
        if (this.d.offer(message)) {
            Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + this.d.size());
            return;
        }
        Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
    }

    private final void n(int i) {
        List<Message> j = j();
        Message obtain = Message.obtain(null, i, 0, 0);
        z65.g(obtain, "obtain(null, messageCode, 0, 0)");
        j.add(obtain);
        o(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l95 o(List<Message> list) {
        l95 d2;
        d2 = sh0.d(rx1.a(this.a), null, null, new c(list, null), 3, null);
        return d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(Message message) {
        if (this.b != null) {
            try {
                Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                Messenger messenger = this.b;
                if (messenger != null) {
                    messenger.send(message);
                    return;
                }
                return;
            } catch (RemoteException e) {
                Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e);
                m(message);
                return;
            }
        }
        m(message);
    }

    public final void h() {
        n(2);
    }

    public final void i() {
        oea.a.a().a(new Messenger(new a(this.a)), this.e);
    }

    public final void k() {
        n(1);
    }
}
