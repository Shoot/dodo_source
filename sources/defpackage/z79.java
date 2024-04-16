package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.inappstory.sdk.network.NetworkHandler;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.lk0;
import defpackage.w3c;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
/* compiled from: RealWebSocket.kt */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 p2\u00020\u00012\u00020\u0002:\u0005(\u001f$)#BA\u0012\u0006\u0010m\u001a\u00020l\u0012\u0006\u00107\u001a\u000205\u0012\u0006\u0010<\u001a\u000208\u0012\u0006\u0010?\u001a\u00020=\u0012\u0006\u0010A\u001a\u00020*\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010D\u001a\u00020*¢\u0006\u0004\bn\u0010oJ\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u000bH\u0016J\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eJ!\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u001d\u001a\u00020\u000bJ\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0017H\u0016J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0006H\u0016J\u0010\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0006H\u0016J\u0010\u0010$\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0006H\u0016J\u0018\u0010'\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u0017H\u0016J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0017H\u0016J\u001a\u0010)\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0017H\u0016J \u0010,\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u00172\u0006\u0010+\u001a\u00020*J\u000f\u0010-\u001a\u00020\u0004H\u0000¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000bH\u0000¢\u0006\u0004\b/\u00100J(\u00104\u001a\u00020\u000b2\n\u0010#\u001a\u000601j\u0002`22\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u00103\u001a\u00020\u0004R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00106R\u001a\u0010<\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u00109\u001a\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010>R\u0014\u0010A\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010@R\u0018\u0010C\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010BR\u0016\u0010D\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010@R\u0014\u0010F\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010R\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Y\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010XR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010ER\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010ZR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00060[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\\R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020^0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\\R\u0016\u0010a\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010@R\u0016\u0010c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010bR\u0016\u0010e\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010dR\u0018\u0010f\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010ER\u0016\u0010g\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010bR\u0016\u0010h\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010dR\u0016\u0010i\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010dR\u0016\u0010j\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010dR\u0016\u0010k\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010b¨\u0006q"}, d2 = {"Lz79;", "Lo3c;", "Lw3c$a;", "Lr3c;", "", "t", "Llk0;", "data", "", "formatOpcode", "w", "", "v", "l", "Lb77;", "client", "o", "Lik9;", "response", "Lwl3;", "exchange", Image.TYPE_MEDIUM, "(Lik9;Lwl3;)V", "", Action.NAME_ATTRIBUTE, "Lz79$d;", "streams", Image.TYPE_SMALL, "u", "r", "text", "b", "bytes", "g", "payload", com.huawei.hms.push.e.a, com.huawei.hms.opendevice.c.a, "code", "reason", "f", "a", DateTokenConverter.CONVERTER_KEY, "", "cancelAfterCloseMillis", "n", "x", "()Z", "y", "()V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "isWriter", "p", "Lhi9;", "Lhi9;", "originalRequest", "Lu3c;", "Lu3c;", "getListener$okhttp", "()Lu3c;", "listener", "Ljava/util/Random;", "Ljava/util/Random;", "random", "J", "pingIntervalMillis", "Lr3c;", "extensions", "minimumDeflateSize", "Ljava/lang/String;", Action.KEY_ATTRIBUTE, "Lcm0;", Image.TYPE_HIGH, "Lcm0;", "call", "Lx6b;", "i", "Lx6b;", "writerTask", "Lw3c;", "j", "Lw3c;", "reader", "Lx3c;", "k", "Lx3c;", "writer", "Lj7b;", "Lj7b;", "taskQueue", "Lz79$d;", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "pongQueue", "", "messageAndCloseQueue", "q", "queueSize", "Z", "enqueuedClose", "I", "receivedCloseCode", "receivedCloseReason", "failed", "sentPingCount", "receivedPingCount", "receivedPongCount", "awaitingPong", "Lk7b;", "taskRunner", "<init>", "(Lk7b;Lhi9;Lu3c;Ljava/util/Random;JLr3c;J)V", "z", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: z79  reason: default package */
/* loaded from: classes3.dex */
public final class z79 implements o3c, w3c.a {
    private static final List<vr8> A;
    public static final b z = new b(null);
    private final hi9 a;
    private final u3c b;
    private final Random c;
    private final long d;
    private r3c e;
    private long f;
    private final String g;
    private cm0 h;
    private x6b i;
    private w3c j;
    private x3c k;
    private j7b l;
    private String m;
    private d n;
    private final ArrayDeque<lk0> o;
    private final ArrayDeque<Object> p;
    private long q;
    private boolean r;
    private int s;
    private String t;
    private boolean u;
    private int v;
    private int w;
    private int x;
    private boolean y;

    /* compiled from: RealWebSocket.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0003\u0010\u000f¨\u0006\u0013"}, d2 = {"Lz79$a;", "", "", "a", "I", "b", "()I", "code", "Llk0;", "Llk0;", com.huawei.hms.opendevice.c.a, "()Llk0;", "reason", "", "J", "()J", "cancelAfterCloseMillis", "<init>", "(ILlk0;J)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: z79$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final int a;
        private final lk0 b;
        private final long c;

        public a(int i, lk0 lk0Var, long j) {
            this.a = i;
            this.b = lk0Var;
            this.c = j;
        }

        public final long a() {
            return this.c;
        }

        public final int b() {
            return this.a;
        }

        public final lk0 c() {
            return this.b;
        }
    }

    /* compiled from: RealWebSocket.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lz79$b;", "", "", "CANCEL_AFTER_CLOSE_MILLIS", "J", "DEFAULT_MINIMUM_DEFLATE_SIZE", "MAX_QUEUE_SIZE", "", "Lvr8;", "ONLY_HTTP1", "Ljava/util/List;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: z79$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: RealWebSocket.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000e"}, d2 = {"Lz79$c;", "", "", "a", "I", "b", "()I", "formatOpcode", "Llk0;", "Llk0;", "()Llk0;", "data", "<init>", "(ILlk0;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: z79$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final int a;
        private final lk0 b;

        public c(int i, lk0 lk0Var) {
            z65.h(lk0Var, "data");
            this.a = i;
            this.b = lk0Var;
        }

        public final lk0 a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }
    }

    /* compiled from: RealWebSocket.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H&R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lz79$d;", "Ljava/io/Closeable;", "", "a", "", "Z", "b", "()Z", "client", "Lfh0;", "Lfh0;", com.huawei.hms.push.e.a, "()Lfh0;", KustoStorage.KustoTable.COLUMN_SOURCE, "Leh0;", com.huawei.hms.opendevice.c.a, "Leh0;", "()Leh0;", "sink", "<init>", "(ZLfh0;Leh0;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: z79$d */
    /* loaded from: classes3.dex */
    public static abstract class d implements Closeable {
        private final boolean a;
        private final fh0 b;
        private final eh0 c;

        public d(boolean z, fh0 fh0Var, eh0 eh0Var) {
            z65.h(fh0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
            z65.h(eh0Var, "sink");
            this.a = z;
            this.b = fh0Var;
            this.c = eh0Var;
        }

        public abstract void a();

        public final boolean b() {
            return this.a;
        }

        public final eh0 c() {
            return this.c;
        }

        public final fh0 e() {
            return this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RealWebSocket.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lz79$e;", "Lx6b;", "", "f", "<init>", "(Lz79;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: z79$e */
    /* loaded from: classes3.dex */
    public final class e extends x6b {
        public e() {
            super(z79.this.m + " writer", false, 2, null);
        }

        @Override // defpackage.x6b
        public long f() {
            try {
                if (z79.this.x()) {
                    return 0L;
                }
                return -1L;
            } catch (IOException e) {
                z79.q(z79.this, e, null, true, 2, null);
                return -1L;
            }
        }
    }

    /* compiled from: RealWebSocket.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"z79$f", "Lfm0;", "Lcm0;", "call", "Lik9;", "response", "", "onResponse", "Ljava/io/IOException;", com.huawei.hms.push.e.a, "onFailure", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: z79$f */
    /* loaded from: classes3.dex */
    public static final class f implements fm0 {
        final /* synthetic */ hi9 b;

        f(hi9 hi9Var) {
            this.b = hi9Var;
        }

        @Override // defpackage.fm0
        public void onFailure(cm0 cm0Var, IOException iOException) {
            z65.h(cm0Var, "call");
            z65.h(iOException, com.huawei.hms.push.e.a);
            z79.q(z79.this, iOException, null, false, 6, null);
        }

        @Override // defpackage.fm0
        public void onResponse(cm0 cm0Var, ik9 ik9Var) {
            z65.h(cm0Var, "call");
            z65.h(ik9Var, "response");
            wl3 k = ik9Var.k();
            try {
                z79.this.m(ik9Var, k);
                z65.e(k);
                d n = k.n();
                r3c a = r3c.g.a(ik9Var.q());
                z79.this.e = a;
                if (!z79.this.t(a)) {
                    z79 z79Var = z79.this;
                    synchronized (z79Var) {
                        z79Var.p.clear();
                        z79Var.d(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                z79.this.s(cec.f + " WebSocket " + this.b.l().u(), n);
                z79.this.u(ik9Var);
            } catch (IOException e) {
                z79.q(z79.this, e, ik9Var, false, 4, null);
                zdc.f(ik9Var);
                if (k != null) {
                    k.w();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealWebSocket.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z79$g */
    /* loaded from: classes3.dex */
    public static final class g extends ej5 implements Function0<Unit> {
        final /* synthetic */ ea9<x3c> a;
        final /* synthetic */ ea9<d> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ea9<x3c> ea9Var, ea9<d> ea9Var2) {
            super(0);
            this.a = ea9Var;
            this.b = ea9Var2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            zdc.f(this.a.a);
            d dVar = this.b.a;
            if (dVar != null) {
                zdc.f(dVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealWebSocket.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z79$h */
    /* loaded from: classes3.dex */
    public static final class h extends ej5 implements Function0<Unit> {
        final /* synthetic */ x3c a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(x3c x3cVar) {
            super(0);
            this.a = x3cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            zdc.f(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealWebSocket.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z79$i */
    /* loaded from: classes3.dex */
    public static final class i extends ej5 implements Function0<Long> {
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(long j) {
            super(0);
            this.b = j;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            z79.this.y();
            return Long.valueOf(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealWebSocket.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z79$j */
    /* loaded from: classes3.dex */
    public static final class j extends ej5 implements Function0<Unit> {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            z79.this.l();
        }
    }

    static {
        List<vr8> e2;
        e2 = jc1.e(vr8.d);
        A = e2;
    }

    public z79(k7b k7bVar, hi9 hi9Var, u3c u3cVar, Random random, long j2, r3c r3cVar, long j3) {
        z65.h(k7bVar, "taskRunner");
        z65.h(hi9Var, "originalRequest");
        z65.h(u3cVar, "listener");
        z65.h(random, "random");
        this.a = hi9Var;
        this.b = u3cVar;
        this.c = random;
        this.d = j2;
        this.e = r3cVar;
        this.f = j3;
        this.l = k7bVar.k();
        this.o = new ArrayDeque<>();
        this.p = new ArrayDeque<>();
        this.s = -1;
        if (z65.c(NetworkHandler.GET, hi9Var.h())) {
            lk0.a aVar = lk0.d;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            Unit unit = Unit.a;
            this.g = lk0.a.f(aVar, bArr, 0, 0, 3, null).a();
            return;
        }
        throw new IllegalArgumentException(("Request must be GET: " + hi9Var.h()).toString());
    }

    public static /* synthetic */ void q(z79 z79Var, Exception exc, ik9 ik9Var, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            ik9Var = null;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        z79Var.p(exc, ik9Var, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean t(r3c r3cVar) {
        if (r3cVar.f || r3cVar.b != null) {
            return false;
        }
        if (r3cVar.d != null && !new IntRange(8, 15).v(r3cVar.d.intValue())) {
            return false;
        }
        return true;
    }

    private final void v() {
        if (cec.e && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        x6b x6bVar = this.i;
        if (x6bVar != null) {
            j7b.m(this.l, x6bVar, 0L, 2, null);
        }
    }

    private final synchronized boolean w(lk0 lk0Var, int i2) {
        if (!this.u && !this.r) {
            if (this.q + lk0Var.n0() > 16777216) {
                d(1001, null);
                return false;
            }
            this.q += lk0Var.n0();
            this.p.add(new c(i2, lk0Var));
            v();
            return true;
        }
        return false;
    }

    @Override // defpackage.o3c
    public boolean a(String str) {
        z65.h(str, "text");
        return w(lk0.d.d(str), 1);
    }

    @Override // defpackage.w3c.a
    public void b(String str) throws IOException {
        z65.h(str, "text");
        this.b.onMessage(this, str);
    }

    @Override // defpackage.w3c.a
    public synchronized void c(lk0 lk0Var) {
        z65.h(lk0Var, "payload");
        this.x++;
        this.y = false;
    }

    @Override // defpackage.o3c
    public boolean d(int i2, String str) {
        return n(i2, str, 60000L);
    }

    @Override // defpackage.w3c.a
    public synchronized void e(lk0 lk0Var) {
        try {
            z65.h(lk0Var, "payload");
            if (!this.u && (!this.r || !this.p.isEmpty())) {
                this.o.add(lk0Var);
                v();
                this.w++;
            }
        } finally {
        }
    }

    @Override // defpackage.w3c.a
    public void f(int i2, String str) {
        z65.h(str, "reason");
        if (i2 != -1) {
            synchronized (this) {
                if (this.s == -1) {
                    this.s = i2;
                    this.t = str;
                    Unit unit = Unit.a;
                } else {
                    throw new IllegalStateException("already closed".toString());
                }
            }
            this.b.onClosing(this, i2, str);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // defpackage.w3c.a
    public void g(lk0 lk0Var) throws IOException {
        z65.h(lk0Var, "bytes");
        this.b.onMessage(this, lk0Var);
    }

    public void l() {
        cm0 cm0Var = this.h;
        z65.e(cm0Var);
        cm0Var.cancel();
    }

    public final void m(ik9 ik9Var, wl3 wl3Var) throws IOException {
        boolean v;
        boolean v2;
        z65.h(ik9Var, "response");
        if (ik9Var.j() == 101) {
            String o = ik9.o(ik9Var, "Connection", null, 2, null);
            v = l0b.v("Upgrade", o, true);
            if (v) {
                String o2 = ik9.o(ik9Var, "Upgrade", null, 2, null);
                v2 = l0b.v("websocket", o2, true);
                if (v2) {
                    String o3 = ik9.o(ik9Var, "Sec-WebSocket-Accept", null, 2, null);
                    lk0.a aVar = lk0.d;
                    String a2 = aVar.d(this.g + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").l0().a();
                    if (z65.c(a2, o3)) {
                        if (wl3Var != null) {
                            return;
                        }
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                    throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + a2 + "' but was '" + o3 + CoreConstants.SINGLE_QUOTE_CHAR);
                }
                throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + o2 + CoreConstants.SINGLE_QUOTE_CHAR);
            }
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + o + CoreConstants.SINGLE_QUOTE_CHAR);
        }
        throw new ProtocolException("Expected HTTP 101 response but was '" + ik9Var.j() + ' ' + ik9Var.r() + CoreConstants.SINGLE_QUOTE_CHAR);
    }

    public final synchronized boolean n(int i2, String str, long j2) {
        lk0 lk0Var;
        try {
            v3c.a.c(i2);
            if (str != null) {
                lk0Var = lk0.d.d(str);
                if (lk0Var.n0() > 123) {
                    throw new IllegalArgumentException(("reason.size() > 123: " + str).toString());
                }
            } else {
                lk0Var = null;
            }
            if (!this.u && !this.r) {
                this.r = true;
                this.p.add(new a(i2, lk0Var, j2));
                v();
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void o(b77 b77Var) {
        z65.h(b77Var, "client");
        if (this.a.d("Sec-WebSocket-Extensions") != null) {
            q(this, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, false, 6, null);
            return;
        }
        b77 c2 = b77Var.z().g(xk3.b).Q(A).c();
        hi9 b2 = this.a.i().j("Upgrade", "websocket").j("Connection", "Upgrade").j("Sec-WebSocket-Key", this.g).j("Sec-WebSocket-Version", "13").j("Sec-WebSocket-Extensions", "permessage-deflate").b();
        t79 t79Var = new t79(c2, b2, true);
        this.h = t79Var;
        z65.e(t79Var);
        t79Var.I0(new f(b2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, x3c] */
    public final void p(Exception exc, ik9 ik9Var, boolean z2) {
        z65.h(exc, com.huawei.hms.push.e.a);
        ea9 ea9Var = new ea9();
        ea9 ea9Var2 = new ea9();
        synchronized (this) {
            try {
                if (this.u) {
                    return;
                }
                this.u = true;
                d dVar = this.n;
                ?? r3 = this.k;
                ea9Var2.a = r3;
                T t = 0;
                t = 0;
                this.k = null;
                if (r3 != 0 && this.j == null) {
                    t = dVar;
                }
                ea9Var.a = t;
                if (!z2 && ea9Var2.a != 0) {
                    j7b j7bVar = this.l;
                    j7b.d(j7bVar, this.m + " writer close", 0L, false, new g(ea9Var2, ea9Var), 2, null);
                }
                this.l.q();
                Unit unit = Unit.a;
                try {
                    this.b.onFailure(this, exc, ik9Var);
                } finally {
                    if (dVar != null) {
                        dVar.a();
                    }
                    if (z2) {
                        x3c x3cVar = (x3c) ea9Var2.a;
                        if (x3cVar != null) {
                            zdc.f(x3cVar);
                        }
                        d dVar2 = (d) ea9Var.a;
                        if (dVar2 != null) {
                            zdc.f(dVar2);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        boolean z2;
        int i2;
        String str;
        w3c w3cVar;
        d dVar;
        synchronized (this) {
            try {
                z2 = this.u;
                i2 = this.s;
                str = this.t;
                w3cVar = this.j;
                dVar = null;
                this.j = null;
                if (this.r && this.p.isEmpty()) {
                    x3c x3cVar = this.k;
                    if (x3cVar != null) {
                        this.k = null;
                        j7b j7bVar = this.l;
                        j7b.d(j7bVar, this.m + " writer close", 0L, false, new h(x3cVar), 2, null);
                    }
                    this.l.q();
                }
                if (this.k == null) {
                    dVar = this.n;
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2 && dVar != null && this.s != -1) {
            u3c u3cVar = this.b;
            z65.e(str);
            u3cVar.onClosed(this, i2, str);
        }
        if (w3cVar != null) {
            zdc.f(w3cVar);
        }
        if (dVar != null) {
            zdc.f(dVar);
        }
    }

    public final void s(String str, d dVar) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(dVar, "streams");
        r3c r3cVar = this.e;
        z65.e(r3cVar);
        synchronized (this) {
            try {
                this.m = str;
                this.n = dVar;
                this.k = new x3c(dVar.b(), dVar.c(), this.c, r3cVar.a, r3cVar.a(dVar.b()), this.f);
                this.i = new e();
                long j2 = this.d;
                if (j2 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j2);
                    j7b j7bVar = this.l;
                    j7bVar.l(str + " ping", nanos, new i(nanos));
                }
                if (!this.p.isEmpty()) {
                    v();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.j = new w3c(dVar.b(), dVar.e(), this, r3cVar.a, r3cVar.a(!dVar.b()));
    }

    public final void u(ik9 ik9Var) throws IOException {
        z65.h(ik9Var, "response");
        try {
            try {
                this.b.onOpen(this, ik9Var);
                while (this.s == -1) {
                    w3c w3cVar = this.j;
                    z65.e(w3cVar);
                    w3cVar.a();
                }
            } catch (Exception e2) {
                q(this, e2, null, false, 6, null);
            }
        } finally {
            r();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0089 A[Catch: all -> 0x0092, TRY_ENTER, TryCatch #3 {all -> 0x0092, blocks: (B:34:0x0089, B:37:0x0094, B:39:0x0098, B:40:0x00a8, B:42:0x00b7, B:47:0x00bc, B:49:0x00c0, B:51:0x00d2, B:58:0x00e6, B:59:0x00eb, B:41:0x00a9), top: B:69:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094 A[Catch: all -> 0x0092, TryCatch #3 {all -> 0x0092, blocks: (B:34:0x0089, B:37:0x0094, B:39:0x0098, B:40:0x00a8, B:42:0x00b7, B:47:0x00bc, B:49:0x00c0, B:51:0x00d2, B:58:0x00e6, B:59:0x00eb, B:41:0x00a9), top: B:69:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e1 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z79.x():boolean");
    }

    public final void y() {
        int i2;
        synchronized (this) {
            try {
                if (this.u) {
                    return;
                }
                x3c x3cVar = this.k;
                if (x3cVar == null) {
                    return;
                }
                if (this.y) {
                    i2 = this.v;
                } else {
                    i2 = -1;
                }
                this.v++;
                this.y = true;
                Unit unit = Unit.a;
                if (i2 != -1) {
                    q(this, new SocketTimeoutException("sent ping but didn't receive pong within " + this.d + "ms (after " + (i2 - 1) + " successful ping/pongs)"), null, true, 2, null);
                    return;
                }
                try {
                    x3cVar.e(lk0.e);
                } catch (IOException e2) {
                    q(this, e2, null, true, 2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
