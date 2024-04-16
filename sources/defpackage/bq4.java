package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.dq4;
import defpackage.qz3;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Http2Connection.kt */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 _2\u00020\u0001:\u0004NTZ\fB\u0015\b\u0000\u0012\b\u0010¾\u0001\u001a\u00030½\u0001¢\u0006\u0006\b¿\u0001\u0010À\u0001J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u0002J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0018\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007J-\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010 \u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u0014J\u001f\u0010#\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010%\u001a\u00020!H\u0000¢\u0006\u0004\b&\u0010$J\u001f\u0010(\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0014H\u0000¢\u0006\u0004\b(\u0010)J\u001e\u0010-\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0002J\u0006\u0010.\u001a\u00020\rJ\u000e\u0010/\u001a\u00020\r2\u0006\u0010%\u001a\u00020!J\b\u00100\u001a\u00020\rH\u0016J)\u00104\u001a\u00020\r2\u0006\u00101\u001a\u00020!2\u0006\u00102\u001a\u00020!2\b\u00103\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b4\u00105J\u0012\u00107\u001a\u00020\r2\b\b\u0002\u00106\u001a\u00020\u0007H\u0007J\u000e\u00109\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u0014J\u000f\u0010:\u001a\u00020\rH\u0000¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b<\u0010=J%\u0010>\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b>\u0010?J-\u0010A\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010@\u001a\u00020\u0007H\u0000¢\u0006\u0004\bA\u0010BJ/\u0010E\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010D\u001a\u00020C2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010@\u001a\u00020\u0007H\u0000¢\u0006\u0004\bE\u0010FJ\u001f\u0010G\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\bG\u0010$R\u001a\u0010L\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010R\u001a\u00020M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR&\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0S8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010^\u001a\u00020Y8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\"\u0010d\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010h\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\be\u0010_\u001a\u0004\bf\u0010a\"\u0004\bg\u0010cR\u0016\u0010j\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010IR\u0014\u0010n\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010r\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010t\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010qR\u0014\u0010v\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010qR\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010}\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010\u007f\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010|R\u0018\u0010\u0081\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010|R\u0018\u0010\u0083\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010|R\u0018\u0010\u0085\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010|R\u0018\u0010\u0087\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010|R \u0010\u008d\u0001\u001a\u00030\u0088\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001d\u0010\u0093\u0001\u001a\u00030\u008e\u00018\u0006¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R*\u0010\u0098\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0090\u0001\u001a\u0006\b\u0095\u0001\u0010\u0092\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001d\u0010\u009e\u0001\u001a\u00030\u0099\u00018\u0006¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R)\u0010£\u0001\u001a\u00020\u00142\u0007\u0010\u009f\u0001\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b \u0001\u0010|\u001a\u0006\b¡\u0001\u0010¢\u0001R)\u0010¦\u0001\u001a\u00020\u00142\u0007\u0010\u009f\u0001\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b¤\u0001\u0010|\u001a\u0006\b¥\u0001\u0010¢\u0001R \u0010¬\u0001\u001a\u00030§\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001R\u001d\u0010²\u0001\u001a\u00030\u00ad\u00018\u0006¢\u0006\u0010\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001R!\u0010¸\u0001\u001a\u00070³\u0001R\u00020\u00008\u0006¢\u0006\u0010\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R\u001e\u0010¼\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020¹\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001¨\u0006Á\u0001"}, d2 = {"Lbq4;", "Ljava/io/Closeable;", "", "associatedStreamId", "", "Ldn4;", "requestHeaders", "", "out", "Leq4;", "m0", "Ljava/io/IOException;", com.huawei.hms.push.e.a, "", "K", "id", "b0", "streamId", "z0", "(I)Leq4;", "", "read", "O0", "(J)V", "n0", "outFinished", "alternating", "S0", "(IZLjava/util/List;)V", "Lyg0;", "buffer", "byteCount", "Q0", "Lfk3;", "errorCode", "e1", "(ILfk3;)V", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "Z0", "unacknowledgedBytesRead", "f1", "(IJ)V", "reply", "payload1", "payload2", "Y0", "flush", "K0", "close", "connectionCode", "streamCode", "cause", "H", "(Lfk3;Lfk3;Ljava/io/IOException;)V", "sendConnectionPreface", "M0", "nowNs", "l0", "E0", "()V", "x0", "(I)Z", "q0", "(ILjava/util/List;)V", "inFinished", "p0", "(ILjava/util/List;Z)V", "Lfh0;", KustoStorage.KustoTable.COLUMN_SOURCE, "o0", "(ILfh0;IZ)V", "r0", "a", "Z", "L", "()Z", "client", "Lbq4$d;", "b", "Lbq4$d;", "Q", "()Lbq4$d;", "listener", "", com.huawei.hms.opendevice.c.a, "Ljava/util/Map;", "e0", "()Ljava/util/Map;", "streams", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "M", "()Ljava/lang/String;", "connectionName", "I", "P", "()I", "F0", "(I)V", "lastGoodStreamId", "f", "S", "setNextStreamId$okhttp", "nextStreamId", "g", "isShutdown", "Lk7b;", Image.TYPE_HIGH, "Lk7b;", "taskRunner", "Lj7b;", "i", "Lj7b;", "writerQueue", "j", "pushQueue", "k", "settingsListenerQueue", "Lot8;", "l", "Lot8;", "pushObserver", Image.TYPE_MEDIUM, "J", "intervalPingsSent", "n", "intervalPongsReceived", "o", "degradedPingsSent", "p", "degradedPongsReceived", "q", "awaitPongsReceived", "r", "degradedPongDeadlineNs", "Lqz3;", Image.TYPE_SMALL, "Lqz3;", "N", "()Lqz3;", "flowControlListener", "Lwfa;", "t", "Lwfa;", "T", "()Lwfa;", "okHttpSettings", "u", "W", "I0", "(Lwfa;)V", "peerSettings", "Lx4c;", "v", "Lx4c;", "getReadBytes", "()Lx4c;", "readBytes", "<set-?>", "w", "getWriteBytesTotal", "()J", "writeBytesTotal", "x", "f0", "writeBytesMaximum", "Ljava/net/Socket;", "y", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "socket", "Lfq4;", "z", "Lfq4;", "j0", "()Lfq4;", "writer", "Lbq4$e;", "A", "Lbq4$e;", "getReaderRunnable", "()Lbq4$e;", "readerRunnable", "", "B", "Ljava/util/Set;", "currentPushRequests", "Lbq4$b;", "builder", "<init>", "(Lbq4$b;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: bq4 */
/* loaded from: classes3.dex */
public final class bq4 implements Closeable {
    public static final c I = new c(null);
    private static final wfa X;
    private final e A;
    private final Set<Integer> B;
    private final boolean a;
    private final d b;
    private final Map<Integer, eq4> c;
    private final String d;
    private int e;
    private int f;
    private boolean g;
    private final k7b h;
    private final j7b i;
    private final j7b j;
    private final j7b k;
    private final ot8 l;
    private long m;
    private long n;
    private long o;
    private long p;
    private long q;
    private long r;
    private final qz3 s;
    private final wfa t;
    private wfa u;
    private final x4c v;
    private long w;
    private long x;
    private final Socket y;
    private final fq4 z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bq4$a */
    /* loaded from: classes3.dex */
    public static final class a extends ej5 implements Function0<Long> {
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j) {
            super(0);
            bq4.this = r1;
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            boolean z;
            bq4 bq4Var = bq4.this;
            synchronized (bq4Var) {
                if (bq4Var.n < bq4Var.m) {
                    z = true;
                } else {
                    bq4Var.m++;
                    z = false;
                }
            }
            if (z) {
                bq4.this.K(null);
                return -1L;
            }
            bq4.this.Y0(false, 1, 0);
            return Long.valueOf(this.b);
        }
    }

    /* compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0016\u0012\u0006\u0010!\u001a\u00020\u001d¢\u0006\u0004\bM\u0010NJ.\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0015\u001a\u00020\u0014R\"\u0010\u001c\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\u00020\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0018\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010,\u001a\u00020\u00048\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)\"\u0004\b*\u0010+R\"\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\f\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b3\u0010;\"\u0004\b<\u0010=R\"\u0010D\u001a\u00020>8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\b?\u0010A\"\u0004\bB\u0010CR\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u0010E\u001a\u0004\b9\u0010F\"\u0004\bG\u0010HR\"\u0010\u0012\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010I\u001a\u0004\b-\u0010J\"\u0004\bK\u0010L¨\u0006O"}, d2 = {"Lbq4$b;", "", "Ljava/net/Socket;", "socket", "", "peerName", "Lfh0;", KustoStorage.KustoTable.COLUMN_SOURCE, "Leh0;", "sink", Image.TYPE_SMALL, "Lbq4$d;", "listener", Image.TYPE_MEDIUM, "", "pingIntervalMillis", "n", "Lqz3;", "flowControlListener", "b", "Lbq4;", "a", "", "Z", com.huawei.hms.opendevice.c.a, "()Z", "setClient$okhttp", "(Z)V", "client", "Lk7b;", "Lk7b;", "l", "()Lk7b;", "taskRunner", "Ljava/net/Socket;", "j", "()Ljava/net/Socket;", "q", "(Ljava/net/Socket;)V", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "()Ljava/lang/String;", "o", "(Ljava/lang/String;)V", "connectionName", com.huawei.hms.push.e.a, "Lfh0;", "k", "()Lfh0;", "r", "(Lfh0;)V", "f", "Leh0;", "i", "()Leh0;", "p", "(Leh0;)V", "g", "Lbq4$d;", "()Lbq4$d;", "setListener$okhttp", "(Lbq4$d;)V", "Lot8;", Image.TYPE_HIGH, "Lot8;", "()Lot8;", "setPushObserver$okhttp", "(Lot8;)V", "pushObserver", "I", "()I", "setPingIntervalMillis$okhttp", "(I)V", "Lqz3;", "()Lqz3;", "setFlowControlListener$okhttp", "(Lqz3;)V", "<init>", "(ZLk7b;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: bq4$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private boolean a;
        private final k7b b;
        public Socket c;
        public String d;
        public fh0 e;
        public eh0 f;
        private d g;
        private ot8 h;
        private int i;
        private qz3 j;

        public b(boolean z, k7b k7bVar) {
            z65.h(k7bVar, "taskRunner");
            this.a = z;
            this.b = k7bVar;
            this.g = d.b;
            this.h = ot8.b;
            this.j = qz3.a.a;
        }

        public final bq4 a() {
            return new bq4(this);
        }

        public final b b(qz3 qz3Var) {
            z65.h(qz3Var, "flowControlListener");
            this.j = qz3Var;
            return this;
        }

        public final boolean c() {
            return this.a;
        }

        public final String d() {
            String str = this.d;
            if (str != null) {
                return str;
            }
            z65.z("connectionName");
            return null;
        }

        public final qz3 e() {
            return this.j;
        }

        public final d f() {
            return this.g;
        }

        public final int g() {
            return this.i;
        }

        public final ot8 h() {
            return this.h;
        }

        public final eh0 i() {
            eh0 eh0Var = this.f;
            if (eh0Var != null) {
                return eh0Var;
            }
            z65.z("sink");
            return null;
        }

        public final Socket j() {
            Socket socket = this.c;
            if (socket != null) {
                return socket;
            }
            z65.z("socket");
            return null;
        }

        public final fh0 k() {
            fh0 fh0Var = this.e;
            if (fh0Var != null) {
                return fh0Var;
            }
            z65.z(KustoStorage.KustoTable.COLUMN_SOURCE);
            return null;
        }

        public final k7b l() {
            return this.b;
        }

        public final b m(d dVar) {
            z65.h(dVar, "listener");
            this.g = dVar;
            return this;
        }

        public final b n(int i) {
            this.i = i;
            return this;
        }

        public final void o(String str) {
            z65.h(str, "<set-?>");
            this.d = str;
        }

        public final void p(eh0 eh0Var) {
            z65.h(eh0Var, "<set-?>");
            this.f = eh0Var;
        }

        public final void q(Socket socket) {
            z65.h(socket, "<set-?>");
            this.c = socket;
        }

        public final void r(fh0 fh0Var) {
            z65.h(fh0Var, "<set-?>");
            this.e = fh0Var;
        }

        public final b s(Socket socket, String str, fh0 fh0Var, eh0 eh0Var) throws IOException {
            String str2;
            z65.h(socket, "socket");
            z65.h(str, "peerName");
            z65.h(fh0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
            z65.h(eh0Var, "sink");
            q(socket);
            if (this.a) {
                str2 = cec.f + ' ' + str;
            } else {
                str2 = "MockWebServer " + str;
            }
            o(str2);
            r(fh0Var);
            p(eh0Var);
            return this;
        }
    }

    /* compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u0010"}, d2 = {"Lbq4$c;", "", "Lwfa;", "DEFAULT_SETTINGS", "Lwfa;", "a", "()Lwfa;", "", "AWAIT_PING", "I", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: bq4$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wfa a() {
            return bq4.X;
        }
    }

    /* compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000f"}, d2 = {"Lbq4$d;", "", "Leq4;", "stream", "", "f", "Lbq4;", "connection", "Lwfa;", "settings", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "a", "b", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: bq4$d */
    /* loaded from: classes3.dex */
    public static abstract class d {
        public static final b a = new b(null);
        public static final d b = new a();

        /* compiled from: Http2Connection.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"bq4$d$a", "Lbq4$d;", "Leq4;", "stream", "", "f", "okhttp"}, k = 1, mv = {1, 9, 0})
        /* renamed from: bq4$d$a */
        /* loaded from: classes3.dex */
        public static final class a extends d {
            a() {
            }

            @Override // defpackage.bq4.d
            public void f(eq4 eq4Var) throws IOException {
                z65.h(eq4Var, "stream");
                eq4Var.e(fk3.j, null);
            }
        }

        /* compiled from: Http2Connection.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lbq4$d$b;", "", "Lbq4$d;", "REFUSE_INCOMING_STREAMS", "Lbq4$d;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
        /* renamed from: bq4$d$b */
        /* loaded from: classes3.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public void d(bq4 bq4Var, wfa wfaVar) {
            z65.h(bq4Var, "connection");
            z65.h(wfaVar, "settings");
        }

        public abstract void f(eq4 eq4Var) throws IOException;
    }

    /* compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bq4$f */
    /* loaded from: classes3.dex */
    public static final class f extends ej5 implements Function0<Unit> {
        final /* synthetic */ int b;
        final /* synthetic */ yg0 c;
        final /* synthetic */ int d;
        final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i, yg0 yg0Var, int i2, boolean z) {
            super(0);
            bq4.this = r1;
            this.b = i;
            this.c = yg0Var;
            this.d = i2;
            this.e = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            bq4 bq4Var = bq4.this;
            int i = this.b;
            yg0 yg0Var = this.c;
            int i2 = this.d;
            boolean z = this.e;
            try {
                boolean d = bq4Var.l.d(i, yg0Var, i2, z);
                if (d) {
                    bq4Var.j0().o(i, fk3.k);
                }
                if (d || z) {
                    synchronized (bq4Var) {
                        bq4Var.B.remove(Integer.valueOf(i));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bq4$g */
    /* loaded from: classes3.dex */
    public static final class g extends ej5 implements Function0<Unit> {
        final /* synthetic */ int b;
        final /* synthetic */ List<dn4> c;
        final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i, List<dn4> list, boolean z) {
            super(0);
            bq4.this = r1;
            this.b = i;
            this.c = list;
            this.d = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            boolean c = bq4.this.l.c(this.b, this.c, this.d);
            bq4 bq4Var = bq4.this;
            int i = this.b;
            boolean z = this.d;
            if (c) {
                try {
                    bq4Var.j0().o(i, fk3.k);
                } catch (IOException unused) {
                    return;
                }
            }
            if (c || z) {
                synchronized (bq4Var) {
                    bq4Var.B.remove(Integer.valueOf(i));
                }
            }
        }
    }

    /* compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bq4$h */
    /* loaded from: classes3.dex */
    public static final class h extends ej5 implements Function0<Unit> {
        final /* synthetic */ int b;
        final /* synthetic */ List<dn4> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i, List<dn4> list) {
            super(0);
            bq4.this = r1;
            this.b = i;
            this.c = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            boolean b = bq4.this.l.b(this.b, this.c);
            bq4 bq4Var = bq4.this;
            int i = this.b;
            if (b) {
                try {
                    bq4Var.j0().o(i, fk3.k);
                    synchronized (bq4Var) {
                        bq4Var.B.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bq4$i */
    /* loaded from: classes3.dex */
    public static final class i extends ej5 implements Function0<Unit> {
        final /* synthetic */ int b;
        final /* synthetic */ fk3 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i, fk3 fk3Var) {
            super(0);
            bq4.this = r1;
            this.b = i;
            this.c = fk3Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            bq4.this.l.a(this.b, this.c);
            bq4 bq4Var = bq4.this;
            int i = this.b;
            synchronized (bq4Var) {
                bq4Var.B.remove(Integer.valueOf(i));
                Unit unit = Unit.a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bq4$j */
    /* loaded from: classes3.dex */
    public static final class j extends ej5 implements Function0<Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j() {
            super(0);
            bq4.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            bq4.this.Y0(false, 2, 0);
        }
    }

    /* compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bq4$k */
    /* loaded from: classes3.dex */
    public static final class k extends ej5 implements Function0<Unit> {
        final /* synthetic */ int b;
        final /* synthetic */ fk3 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(int i, fk3 fk3Var) {
            super(0);
            bq4.this = r1;
            this.b = i;
            this.c = fk3Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            try {
                bq4.this.Z0(this.b, this.c);
            } catch (IOException e) {
                bq4.this.K(e);
            }
        }
    }

    /* compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bq4$l */
    /* loaded from: classes3.dex */
    public static final class l extends ej5 implements Function0<Unit> {
        final /* synthetic */ int b;
        final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(int i, long j) {
            super(0);
            bq4.this = r1;
            this.b = i;
            this.c = j;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            try {
                bq4.this.j0().r(this.b, this.c);
            } catch (IOException e) {
                bq4.this.K(e);
            }
        }
    }

    static {
        wfa wfaVar = new wfa();
        wfaVar.h(7, 65535);
        wfaVar.h(5, 16384);
        X = wfaVar;
    }

    public bq4(b bVar) {
        int i2;
        z65.h(bVar, "builder");
        boolean c2 = bVar.c();
        this.a = c2;
        this.b = bVar.f();
        this.c = new LinkedHashMap();
        String d2 = bVar.d();
        this.d = d2;
        if (bVar.c()) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        this.f = i2;
        k7b l2 = bVar.l();
        this.h = l2;
        j7b k2 = l2.k();
        this.i = k2;
        this.j = l2.k();
        this.k = l2.k();
        this.l = bVar.h();
        this.s = bVar.e();
        wfa wfaVar = new wfa();
        if (bVar.c()) {
            wfaVar.h(7, 16777216);
        }
        this.t = wfaVar;
        this.u = X;
        this.v = new x4c(0);
        this.x = this.u.c();
        this.y = bVar.j();
        this.z = new fq4(bVar.i(), c2);
        this.A = new e(this, new dq4(bVar.k(), c2));
        this.B = new LinkedHashSet();
        if (bVar.g() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(bVar.g());
            k2.l(d2 + " ping", nanos, new a(nanos));
        }
    }

    public final void K(IOException iOException) {
        fk3 fk3Var = fk3.d;
        H(fk3Var, fk3Var, iOException);
    }

    public static /* synthetic */ void N0(bq4 bq4Var, boolean z, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            z = true;
        }
        bq4Var.M0(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x004c A[Catch: all -> 0x0014, TryCatch #2 {all -> 0x0060, blocks: (B:50:0x0006, B:71:0x0057, B:73:0x005a, B:76:0x0062, B:78:0x0067, B:83:0x0075, B:84:0x0080, B:51:0x0007, B:53:0x000e, B:56:0x0017, B:58:0x001b, B:60:0x002e, B:62:0x0036, B:67:0x0046, B:69:0x004c, B:70:0x0055, B:85:0x0081, B:86:0x0086), top: B:91:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.eq4 m0(int r11, java.util.List<defpackage.dn4> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            fq4 r7 = r10.z
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L60
            int r0 = r10.f     // Catch: java.lang.Throwable -> L14
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L17
            fk3 r0 = defpackage.fk3.j     // Catch: java.lang.Throwable -> L14
            r10.K0(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r11 = move-exception
            goto L87
        L17:
            boolean r0 = r10.g     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L81
            int r8 = r10.f     // Catch: java.lang.Throwable -> L14
            int r0 = r8 + 2
            r10.f = r0     // Catch: java.lang.Throwable -> L14
            eq4 r9 = new eq4     // Catch: java.lang.Throwable -> L14
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L14
            r0 = 1
            if (r13 == 0) goto L45
            long r1 = r10.w     // Catch: java.lang.Throwable -> L14
            long r3 = r10.x     // Catch: java.lang.Throwable -> L14
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L45
            long r1 = r9.s()     // Catch: java.lang.Throwable -> L14
            long r3 = r9.r()     // Catch: java.lang.Throwable -> L14
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L43
            goto L45
        L43:
            r13 = 0
            goto L46
        L45:
            r13 = 1
        L46:
            boolean r1 = r9.v()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L55
            java.util.Map<java.lang.Integer, eq4> r1 = r10.c     // Catch: java.lang.Throwable -> L14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L14
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> L14
        L55:
            kotlin.Unit r1 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L14
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L60
            if (r11 != 0) goto L62
            fq4 r11 = r10.z     // Catch: java.lang.Throwable -> L60
            r11.k(r6, r8, r12)     // Catch: java.lang.Throwable -> L60
            goto L6c
        L60:
            r11 = move-exception
            goto L89
        L62:
            boolean r1 = r10.a     // Catch: java.lang.Throwable -> L60
            r0 = r0 ^ r1
            if (r0 == 0) goto L75
            fq4 r0 = r10.z     // Catch: java.lang.Throwable -> L60
            r0.n(r11, r8, r12)     // Catch: java.lang.Throwable -> L60
        L6c:
            monitor-exit(r7)
            if (r13 == 0) goto L74
            fq4 r11 = r10.z
            r11.flush()
        L74:
            return r9
        L75:
            java.lang.String r11 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L60
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L60
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L60
            throw r12     // Catch: java.lang.Throwable -> L60
        L81:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L14
            r11.<init>()     // Catch: java.lang.Throwable -> L14
            throw r11     // Catch: java.lang.Throwable -> L14
        L87:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L60
            throw r11     // Catch: java.lang.Throwable -> L60
        L89:
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bq4.m0(int, java.util.List, boolean):eq4");
    }

    public final void E0() {
        synchronized (this) {
            long j2 = this.p;
            long j3 = this.o;
            if (j2 < j3) {
                return;
            }
            this.o = j3 + 1;
            this.r = System.nanoTime() + 1000000000;
            Unit unit = Unit.a;
            j7b j7bVar = this.i;
            j7b.d(j7bVar, this.d + " ping", 0L, false, new j(), 6, null);
        }
    }

    public final void F0(int i2) {
        this.e = i2;
    }

    public final void H(fk3 fk3Var, fk3 fk3Var2, IOException iOException) {
        int i2;
        Object[] objArr;
        z65.h(fk3Var, "connectionCode");
        z65.h(fk3Var2, "streamCode");
        if (cec.e && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            K0(fk3Var);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (!this.c.isEmpty()) {
                    objArr = this.c.values().toArray(new eq4[0]);
                    this.c.clear();
                } else {
                    objArr = null;
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        eq4[] eq4VarArr = (eq4[]) objArr;
        if (eq4VarArr != null) {
            for (eq4 eq4Var : eq4VarArr) {
                try {
                    eq4Var.e(fk3Var2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.z.close();
        } catch (IOException unused3) {
        }
        try {
            this.y.close();
        } catch (IOException unused4) {
        }
        this.i.q();
        this.j.q();
        this.k.q();
    }

    public final void I0(wfa wfaVar) {
        z65.h(wfaVar, "<set-?>");
        this.u = wfaVar;
    }

    public final void K0(fk3 fk3Var) throws IOException {
        z65.h(fk3Var, HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
        synchronized (this.z) {
            ca9 ca9Var = new ca9();
            synchronized (this) {
                if (this.g) {
                    return;
                }
                this.g = true;
                int i2 = this.e;
                ca9Var.a = i2;
                Unit unit = Unit.a;
                this.z.j(i2, fk3Var, zdc.a);
            }
        }
    }

    public final boolean L() {
        return this.a;
    }

    public final String M() {
        return this.d;
    }

    public final void M0(boolean z) throws IOException {
        if (z) {
            this.z.b();
            this.z.q(this.t);
            int c2 = this.t.c();
            if (c2 != 65535) {
                this.z.r(0, c2 - 65535);
            }
        }
        j7b.d(this.h.k(), this.d, 0L, false, this.A, 6, null);
    }

    public final qz3 N() {
        return this.s;
    }

    public final synchronized void O0(long j2) {
        try {
            x4c.c(this.v, j2, 0L, 2, null);
            long a2 = this.v.a();
            if (a2 >= this.t.c() / 2) {
                f1(0, a2);
                x4c.c(this.v, 0L, a2, 1, null);
            }
            this.s.a(this.v);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final int P() {
        return this.e;
    }

    public final d Q() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0038, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x003a, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r5 - r3), r8.z.l());
        r6 = r3;
        r8.w += r6;
        r4 = kotlin.Unit.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q0(int r9, boolean r10, defpackage.yg0 r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            fq4 r12 = r8.z
            r12.c(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L71
            monitor-enter(r8)
        L12:
            long r3 = r8.w     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            long r5 = r8.x     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L39
            java.util.Map<java.lang.Integer, eq4> r3 = r8.c     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            if (r3 == 0) goto L31
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
            defpackage.z65.f(r8, r3)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            r8.wait()     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            goto L12
        L2f:
            r9 = move-exception
            goto L6f
        L31:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            throw r9     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
        L39:
            long r5 = r5 - r3
            long r3 = java.lang.Math.min(r12, r5)     // Catch: java.lang.Throwable -> L2f
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L2f
            fq4 r3 = r8.z     // Catch: java.lang.Throwable -> L2f
            int r3 = r3.l()     // Catch: java.lang.Throwable -> L2f
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L2f
            long r4 = r8.w     // Catch: java.lang.Throwable -> L2f
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L2f
            long r4 = r4 + r6
            r8.w = r4     // Catch: java.lang.Throwable -> L2f
            kotlin.Unit r4 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r8)
            long r12 = r12 - r6
            fq4 r4 = r8.z
            if (r10 == 0) goto L5d
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L5d
            r5 = 1
            goto L5e
        L5d:
            r5 = 0
        L5e:
            r4.c(r5, r9, r11, r3)
            goto Ld
        L62:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2f
            r9.interrupt()     // Catch: java.lang.Throwable -> L2f
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2f
            r9.<init>()     // Catch: java.lang.Throwable -> L2f
            throw r9     // Catch: java.lang.Throwable -> L2f
        L6f:
            monitor-exit(r8)
            throw r9
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bq4.Q0(int, boolean, yg0, long):void");
    }

    public final int S() {
        return this.f;
    }

    public final void S0(int i2, boolean z, List<dn4> list) throws IOException {
        z65.h(list, "alternating");
        this.z.k(z, i2, list);
    }

    public final wfa T() {
        return this.t;
    }

    public final wfa W() {
        return this.u;
    }

    public final void Y0(boolean z, int i2, int i3) {
        try {
            this.z.m(z, i2, i3);
        } catch (IOException e2) {
            K(e2);
        }
    }

    public final void Z0(int i2, fk3 fk3Var) throws IOException {
        z65.h(fk3Var, HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
        this.z.o(i2, fk3Var);
    }

    public final synchronized eq4 b0(int i2) {
        return this.c.get(Integer.valueOf(i2));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        H(fk3.c, fk3.k, null);
    }

    public final Map<Integer, eq4> e0() {
        return this.c;
    }

    public final void e1(int i2, fk3 fk3Var) {
        z65.h(fk3Var, "errorCode");
        j7b j7bVar = this.i;
        j7b.d(j7bVar, this.d + '[' + i2 + "] writeSynReset", 0L, false, new k(i2, fk3Var), 6, null);
    }

    public final long f0() {
        return this.x;
    }

    public final void f1(int i2, long j2) {
        j7b j7bVar = this.i;
        j7b.d(j7bVar, this.d + '[' + i2 + "] windowUpdate", 0L, false, new l(i2, j2), 6, null);
    }

    public final void flush() throws IOException {
        this.z.flush();
    }

    public final fq4 j0() {
        return this.z;
    }

    public final synchronized boolean l0(long j2) {
        if (this.g) {
            return false;
        }
        if (this.p < this.o) {
            if (j2 >= this.r) {
                return false;
            }
        }
        return true;
    }

    public final eq4 n0(List<dn4> list, boolean z) throws IOException {
        z65.h(list, "requestHeaders");
        return m0(0, list, z);
    }

    public final void o0(int i2, fh0 fh0Var, int i3, boolean z) throws IOException {
        z65.h(fh0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        yg0 yg0Var = new yg0();
        long j2 = i3;
        fh0Var.B0(j2);
        fh0Var.read(yg0Var, j2);
        j7b.d(this.j, this.d + '[' + i2 + "] onData", 0L, false, new f(i2, yg0Var, i3, z), 6, null);
    }

    public final void p0(int i2, List<dn4> list, boolean z) {
        z65.h(list, "requestHeaders");
        j7b j7bVar = this.j;
        j7b.d(j7bVar, this.d + '[' + i2 + "] onHeaders", 0L, false, new g(i2, list, z), 6, null);
    }

    public final void q0(int i2, List<dn4> list) {
        z65.h(list, "requestHeaders");
        synchronized (this) {
            if (this.B.contains(Integer.valueOf(i2))) {
                e1(i2, fk3.d);
                return;
            }
            this.B.add(Integer.valueOf(i2));
            j7b j7bVar = this.j;
            j7b.d(j7bVar, this.d + '[' + i2 + "] onRequest", 0L, false, new h(i2, list), 6, null);
        }
    }

    public final void r0(int i2, fk3 fk3Var) {
        z65.h(fk3Var, "errorCode");
        j7b j7bVar = this.j;
        j7b.d(j7bVar, this.d + '[' + i2 + "] onReset", 0L, false, new i(i2, fk3Var), 6, null);
    }

    public final boolean x0(int i2) {
        if (i2 != 0 && (i2 & 1) == 0) {
            return true;
        }
        return false;
    }

    public final synchronized eq4 z0(int i2) {
        eq4 remove;
        remove = this.c.remove(Integer.valueOf(i2));
        z65.f(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return remove;
    }

    /* compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u00101\u001a\u00020-¢\u0006\u0004\b2\u00103J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J.\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0016\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016J \u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J \u0010\"\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 H\u0016J\u0018\u0010%\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#H\u0016J(\u0010)\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0005H\u0016J&\u0010,\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016R\u001a\u00101\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b/\u00100¨\u00064"}, d2 = {"Lbq4$e;", "Ldq4$c;", "Lkotlin/Function0;", "", "l", "", "inFinished", "", "streamId", "Lfh0;", KustoStorage.KustoTable.COLUMN_SOURCE, "length", Image.TYPE_HIGH, "associatedStreamId", "", "Ldn4;", "headerBlock", "a", "Lfk3;", "errorCode", "g", "clearPrevious", "Lwfa;", "settings", DateTokenConverter.CONVERTER_KEY, "k", "f", "ack", "payload1", "payload2", "i", "lastGoodStreamId", "Llk0;", "debugData", com.huawei.hms.push.e.a, "", "windowSizeIncrement", "b", "streamDependency", "weight", "exclusive", "j", "promisedStreamId", "requestHeaders", com.huawei.hms.opendevice.c.a, "Ldq4;", "Ldq4;", "getReader$okhttp", "()Ldq4;", "reader", "<init>", "(Lbq4;Ldq4;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: bq4$e */
    /* loaded from: classes3.dex */
    public final class e implements dq4.c, Function0<Unit> {
        private final dq4 a;
        final /* synthetic */ bq4 b;

        /* compiled from: Http2Connection.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: bq4$e$a */
        /* loaded from: classes3.dex */
        public static final class a extends ej5 implements Function0<Unit> {
            final /* synthetic */ bq4 a;
            final /* synthetic */ ea9<wfa> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(bq4 bq4Var, ea9<wfa> ea9Var) {
                super(0);
                this.a = bq4Var;
                this.b = ea9Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                this.a.Q().d(this.a, this.b.a);
            }
        }

        /* compiled from: Http2Connection.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: bq4$e$b */
        /* loaded from: classes3.dex */
        static final class b extends ej5 implements Function0<Unit> {
            final /* synthetic */ bq4 a;
            final /* synthetic */ eq4 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(bq4 bq4Var, eq4 eq4Var) {
                super(0);
                this.a = bq4Var;
                this.b = eq4Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                try {
                    this.a.Q().f(this.b);
                } catch (IOException e) {
                    xb8 g = xb8.a.g();
                    g.k("Http2Connection.Listener failure for " + this.a.M(), 4, e);
                    try {
                        this.b.e(fk3.d, e);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* compiled from: Http2Connection.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: bq4$e$c */
        /* loaded from: classes3.dex */
        static final class c extends ej5 implements Function0<Unit> {
            final /* synthetic */ bq4 a;
            final /* synthetic */ int b;
            final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(bq4 bq4Var, int i, int i2) {
                super(0);
                this.a = bq4Var;
                this.b = i;
                this.c = i2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                this.a.Y0(true, this.b, this.c);
            }
        }

        /* compiled from: Http2Connection.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: bq4$e$d */
        /* loaded from: classes3.dex */
        static final class d extends ej5 implements Function0<Unit> {
            final /* synthetic */ boolean b;
            final /* synthetic */ wfa c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(boolean z, wfa wfaVar) {
                super(0);
                e.this = r1;
                this.b = z;
                this.c = wfaVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                e.this.k(this.b, this.c);
            }
        }

        public e(bq4 bq4Var, dq4 dq4Var) {
            z65.h(dq4Var, "reader");
            this.b = bq4Var;
            this.a = dq4Var;
        }

        @Override // defpackage.dq4.c
        public void a(boolean z, int i, int i2, List<dn4> list) {
            z65.h(list, "headerBlock");
            if (this.b.x0(i)) {
                this.b.p0(i, list, z);
                return;
            }
            bq4 bq4Var = this.b;
            synchronized (bq4Var) {
                eq4 b0 = bq4Var.b0(i);
                if (b0 == null) {
                    if (bq4Var.g) {
                        return;
                    }
                    if (i <= bq4Var.P()) {
                        return;
                    }
                    if (i % 2 == bq4Var.S() % 2) {
                        return;
                    }
                    eq4 eq4Var = new eq4(i, bq4Var, false, z, cec.t(list));
                    bq4Var.F0(i);
                    bq4Var.e0().put(Integer.valueOf(i), eq4Var);
                    j7b k = bq4Var.h.k();
                    j7b.d(k, bq4Var.M() + '[' + i + "] onStream", 0L, false, new b(bq4Var, eq4Var), 6, null);
                    return;
                }
                Unit unit = Unit.a;
                b0.y(cec.t(list), z);
            }
        }

        @Override // defpackage.dq4.c
        public void b(int i, long j) {
            if (i == 0) {
                bq4 bq4Var = this.b;
                synchronized (bq4Var) {
                    bq4Var.x = bq4Var.f0() + j;
                    z65.f(bq4Var, "null cannot be cast to non-null type java.lang.Object");
                    bq4Var.notifyAll();
                    Unit unit = Unit.a;
                }
                return;
            }
            eq4 b0 = this.b.b0(i);
            if (b0 != null) {
                synchronized (b0) {
                    b0.b(j);
                    Unit unit2 = Unit.a;
                }
            }
        }

        @Override // defpackage.dq4.c
        public void c(int i, int i2, List<dn4> list) {
            z65.h(list, "requestHeaders");
            this.b.q0(i2, list);
        }

        @Override // defpackage.dq4.c
        public void d(boolean z, wfa wfaVar) {
            z65.h(wfaVar, "settings");
            j7b j7bVar = this.b.i;
            j7b.d(j7bVar, this.b.M() + " applyAndAckSettings", 0L, false, new d(z, wfaVar), 6, null);
        }

        @Override // defpackage.dq4.c
        public void e(int i, fk3 fk3Var, lk0 lk0Var) {
            int i2;
            Object[] array;
            eq4[] eq4VarArr;
            z65.h(fk3Var, "errorCode");
            z65.h(lk0Var, "debugData");
            lk0Var.n0();
            bq4 bq4Var = this.b;
            synchronized (bq4Var) {
                array = bq4Var.e0().values().toArray(new eq4[0]);
                bq4Var.g = true;
                Unit unit = Unit.a;
            }
            for (eq4 eq4Var : (eq4[]) array) {
                if (eq4Var.l() > i && eq4Var.u()) {
                    eq4Var.z(fk3.j);
                    this.b.z0(eq4Var.l());
                }
            }
        }

        @Override // defpackage.dq4.c
        public void g(int i, fk3 fk3Var) {
            z65.h(fk3Var, "errorCode");
            if (this.b.x0(i)) {
                this.b.r0(i, fk3Var);
                return;
            }
            eq4 z0 = this.b.z0(i);
            if (z0 != null) {
                z0.z(fk3Var);
            }
        }

        @Override // defpackage.dq4.c
        public void h(boolean z, int i, fh0 fh0Var, int i2) throws IOException {
            z65.h(fh0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
            if (this.b.x0(i)) {
                this.b.o0(i, fh0Var, i2, z);
                return;
            }
            eq4 b0 = this.b.b0(i);
            if (b0 == null) {
                this.b.e1(i, fk3.d);
                long j = i2;
                this.b.O0(j);
                fh0Var.skip(j);
                return;
            }
            b0.x(fh0Var, i2);
            if (z) {
                b0.y(cec.a, true);
            }
        }

        @Override // defpackage.dq4.c
        public void i(boolean z, int i, int i2) {
            if (!z) {
                j7b.d(this.b.i, this.b.M() + " ping", 0L, false, new c(this.b, i, i2), 6, null);
                return;
            }
            bq4 bq4Var = this.b;
            synchronized (bq4Var) {
                try {
                    if (i == 1) {
                        bq4Var.n++;
                    } else if (i == 2) {
                        bq4Var.p++;
                    } else {
                        if (i == 3) {
                            bq4Var.q++;
                            z65.f(bq4Var, "null cannot be cast to non-null type java.lang.Object");
                            bq4Var.notifyAll();
                        }
                        Unit unit = Unit.a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            l();
            return Unit.a;
        }

        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v24 */
        /* JADX WARN: Type inference failed for: r0v3, types: [wfa, T] */
        public final void k(boolean z, wfa wfaVar) {
            ?? r0;
            long c2;
            int i;
            eq4[] eq4VarArr;
            eq4[] eq4VarArr2;
            wfa wfaVar2 = wfaVar;
            z65.h(wfaVar2, "settings");
            ea9 ea9Var = new ea9();
            fq4 j0 = this.b.j0();
            bq4 bq4Var = this.b;
            synchronized (j0) {
                synchronized (bq4Var) {
                    wfa W = bq4Var.W();
                    if (z) {
                        r0 = wfaVar2;
                    } else {
                        wfa wfaVar3 = new wfa();
                        wfaVar3.g(W);
                        wfaVar3.g(wfaVar2);
                        r0 = wfaVar3;
                    }
                    ea9Var.a = r0;
                    c2 = r0.c() - W.c();
                    if (c2 != 0 && !bq4Var.e0().isEmpty()) {
                        eq4VarArr = (eq4[]) bq4Var.e0().values().toArray(new eq4[0]);
                        eq4VarArr2 = eq4VarArr;
                        bq4Var.I0((wfa) ea9Var.a);
                        j7b.d(bq4Var.k, bq4Var.M() + " onSettings", 0L, false, new a(bq4Var, ea9Var), 6, null);
                        Unit unit = Unit.a;
                    }
                    eq4VarArr = null;
                    eq4VarArr2 = eq4VarArr;
                    bq4Var.I0((wfa) ea9Var.a);
                    j7b.d(bq4Var.k, bq4Var.M() + " onSettings", 0L, false, new a(bq4Var, ea9Var), 6, null);
                    Unit unit2 = Unit.a;
                }
                try {
                    bq4Var.j0().a((wfa) ea9Var.a);
                } catch (IOException e) {
                    bq4Var.K(e);
                }
                Unit unit3 = Unit.a;
            }
            if (eq4VarArr2 != null) {
                for (eq4 eq4Var : eq4VarArr2) {
                    synchronized (eq4Var) {
                        eq4Var.b(c2);
                        Unit unit4 = Unit.a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [fk3] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [dq4, java.io.Closeable] */
        public void l() {
            fk3 fk3Var;
            fk3 fk3Var2 = fk3.e;
            IOException e = null;
            try {
                try {
                    this.a.c(this);
                    do {
                    } while (this.a.b(false, this));
                    fk3 fk3Var3 = fk3.c;
                    try {
                        this.b.H(fk3Var3, fk3.k, null);
                        fk3Var = fk3Var3;
                    } catch (IOException e2) {
                        e = e2;
                        fk3 fk3Var4 = fk3.d;
                        bq4 bq4Var = this.b;
                        bq4Var.H(fk3Var4, fk3Var4, e);
                        fk3Var = bq4Var;
                        fk3Var2 = this.a;
                        zdc.f(fk3Var2);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.b.H(fk3Var, fk3Var2, e);
                    zdc.f(this.a);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                fk3Var = fk3Var2;
                this.b.H(fk3Var, fk3Var2, e);
                zdc.f(this.a);
                throw th;
            }
            fk3Var2 = this.a;
            zdc.f(fk3Var2);
        }

        @Override // defpackage.dq4.c
        public void f() {
        }

        @Override // defpackage.dq4.c
        public void j(int i, int i2, int i3, boolean z) {
        }
    }
}
