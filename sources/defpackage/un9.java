package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.actions.SearchIntents;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.z2b;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RoomDatabase.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b&\u0018\u0000 _2\u00020\u0001:\u000628\u001e\u001f*)B\u0007¢\u0006\u0004\bk\u00105J-\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002J\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u0012H\u0017J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u000fH$J\b\u0010\u001a\u001a\u00020\u0019H$J\"\u0010\u001b\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00140\u0012H\u0015J\u0016\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00030\u001cH\u0017J\b\u0010\u001e\u001a\u00020\tH\u0017J\b\u0010\u001f\u001a\u00020\tH\u0017J\u001c\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"H\u0017J\u0010\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0016J\b\u0010*\u001a\u00020\tH\u0017J\b\u0010+\u001a\u00020\tH\u0017J\b\u0010,\u001a\u00020\tH\u0017J\u0010\u0010/\u001a\u00020\t2\u0006\u0010.\u001a\u00020-H\u0014J\b\u00101\u001a\u000200H\u0016R\u001e\u00106\u001a\u0004\u0018\u00010-8\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\b2\u00103\u0012\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u00109R\u0016\u0010=\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010<R\u001a\u0010A\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010>\u001a\u0004\b?\u0010@R\u0016\u0010C\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010BR\u0016\u0010D\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010BR$\u0010H\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010\u00148\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\b\u0018\u0010F\u0012\u0004\bG\u00105R6\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003\u0012\u0004\u0012\u00020\u00010I8\u0004@\u0004X\u0085\u000e¢\u0006\u0012\n\u0004\b+\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010PR\u0018\u0010U\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u001d\u0010[\u001a\b\u0012\u0004\u0012\u00020W0V8G¢\u0006\f\n\u0004\b\r\u0010X\u001a\u0004\bY\u0010ZR#\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00010I8G¢\u0006\f\n\u0004\b?\u0010J\u001a\u0004\bS\u0010LR$\u0010^\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010JR\u0014\u0010a\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0014\u0010c\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010`R\u0014\u0010\u0006\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010dR\u0017\u0010h\u001a\u0002008G¢\u0006\f\u0012\u0004\bg\u00105\u001a\u0004\be\u0010fR\u0014\u0010j\u001a\u0002008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bi\u0010f¨\u0006l"}, d2 = {"Lun9;", "", "T", "Ljava/lang/Class;", "clazz", "Lz2b;", "openHelper", "C", "(Ljava/lang/Class;Lz2b;)Ljava/lang/Object;", "", "u", "v", "Ljava/util/concurrent/locks/Lock;", "l", "()Ljava/util/concurrent/locks/Lock;", "Lyl2;", "configuration", "t", "", "autoMigrationSpecs", "", "Lbj6;", "j", "config", Image.TYPE_HIGH, "Ll75;", "g", "q", "", "p", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "Lb3b;", SearchIntents.EXTRA_QUERY, "Landroid/os/CancellationSignal;", "signal", "Landroid/database/Cursor;", "z", "", "sql", "Lc3b;", "f", com.huawei.hms.push.e.a, "i", "B", "Ly2b;", "db", "w", "", Image.TYPE_SMALL, "a", "Ly2b;", "getMDatabase$annotations", "()V", "mDatabase", "Ljava/util/concurrent/Executor;", "b", "Ljava/util/concurrent/Executor;", "internalQueryExecutor", "internalTransactionExecutor", "Lz2b;", "internalOpenHelper", "Ll75;", Image.TYPE_MEDIUM, "()Ll75;", "invalidationTracker", "Z", "allowMainThreadQueries", "writeAheadLoggingEnabled", "Lun9$b;", "Ljava/util/List;", "getMCallbacks$annotations", "mCallbacks", "", "Ljava/util/Map;", "getAutoMigrationSpecs", "()Ljava/util/Map;", "setAutoMigrationSpecs", "(Ljava/util/Map;)V", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "readWriteLock", "Lm00;", "k", "Lm00;", "autoCloser", "Ljava/lang/ThreadLocal;", "", "Ljava/lang/ThreadLocal;", "getSuspendingTransactionId", "()Ljava/lang/ThreadLocal;", "suspendingTransactionId", "backingFieldMap", "n", "typeConverters", "o", "()Ljava/util/concurrent/Executor;", "queryExecutor", "r", "transactionExecutor", "()Lz2b;", "y", "()Z", "isOpenInternal$annotations", "isOpenInternal", "x", "isMainThread", "<init>", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: un9  reason: default package */
/* loaded from: classes.dex */
public abstract class un9 {
    public static final c o = new c(null);
    protected volatile y2b a;
    private Executor b;
    private Executor c;
    private z2b d;
    private boolean f;
    private boolean g;
    protected List<? extends b> h;
    private m00 k;
    private final Map<String, Object> m;
    private final Map<Class<?>, Object> n;
    private final l75 e = g();
    private Map<Class<Object>, Object> i = new LinkedHashMap();
    private final ReentrantReadWriteLock j = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> l = new ThreadLocal<>();

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\b\u0000\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\bX\u0010YJ\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u000f\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010,R\u0016\u00109\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010,R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001c\u0010J\u001a\b\u0012\u0004\u0012\u00020G0F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001e\u0010L\u001a\n\u0012\u0004\u0012\u00020G\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010IR\u0018\u0010N\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010\u001dR\u0018\u0010R\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u001e\u0010W\u001a\n\u0012\u0004\u0012\u00020T\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006Z"}, d2 = {"Lun9$a;", "Lun9;", "T", "", "Lz2b$c;", "factory", "f", "", "Lbj6;", "migrations", "b", "([Lbj6;)Lun9$a;", com.huawei.hms.opendevice.c.a, "Ljava/util/concurrent/Executor;", "executor", "g", com.huawei.hms.push.e.a, "Lun9$b;", "callback", "a", DateTokenConverter.CONVERTER_KEY, "()Lun9;", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/lang/Class;", "Ljava/lang/Class;", "klass", "", "Ljava/lang/String;", Action.NAME_ATTRIBUTE, "", "Ljava/util/List;", "callbacks", "typeConverters", "autoMigrationSpecs", "Ljava/util/concurrent/Executor;", "queryExecutor", Image.TYPE_HIGH, "transactionExecutor", "i", "Lz2b$c;", "", "j", "Z", "allowMainThreadQueries", "Lun9$d;", "k", "Lun9$d;", "journalMode", "Landroid/content/Intent;", "l", "Landroid/content/Intent;", "multiInstanceInvalidationIntent", Image.TYPE_MEDIUM, "requireMigration", "n", "allowDestructiveMigrationOnDowngrade", "", "o", "J", "autoCloseTimeout", "Ljava/util/concurrent/TimeUnit;", "p", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "Lun9$e;", "q", "Lun9$e;", "migrationContainer", "", "", "r", "Ljava/util/Set;", "migrationsNotRequiredFrom", Image.TYPE_SMALL, "migrationStartAndEndVersions", "t", "copyFromAssetPath", "Ljava/io/File;", "u", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "v", "Ljava/util/concurrent/Callable;", "copyFromInputStream", "<init>", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: un9$a */
    /* loaded from: classes.dex */
    public static class a<T extends un9> {
        private final Context a;
        private final Class<T> b;
        private final String c;
        private final List<b> d;
        private final List<Object> e;
        private List<Object> f;
        private Executor g;
        private Executor h;
        private z2b.c i;
        private boolean j;
        private d k;
        private Intent l;
        private boolean m;
        private boolean n;
        private long o;
        private TimeUnit p;
        private final e q;
        private Set<Integer> r;
        private Set<Integer> s;
        private String t;
        private File u;
        private Callable<InputStream> v;

        public a(Context context, Class<T> cls, String str) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            z65.h(cls, "klass");
            this.a = context;
            this.b = cls;
            this.c = str;
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.f = new ArrayList();
            this.k = d.AUTOMATIC;
            this.m = true;
            this.o = -1L;
            this.q = new e();
            this.r = new LinkedHashSet();
        }

        public a<T> a(b bVar) {
            z65.h(bVar, "callback");
            this.d.add(bVar);
            return this;
        }

        public a<T> b(bj6... bj6VarArr) {
            z65.h(bj6VarArr, "migrations");
            if (this.s == null) {
                this.s = new HashSet();
            }
            for (bj6 bj6Var : bj6VarArr) {
                Set<Integer> set = this.s;
                z65.e(set);
                set.add(Integer.valueOf(bj6Var.a));
                Set<Integer> set2 = this.s;
                z65.e(set2);
                set2.add(Integer.valueOf(bj6Var.b));
            }
            this.q.b((bj6[]) Arrays.copyOf(bj6VarArr, bj6VarArr.length));
            return this;
        }

        public a<T> c() {
            this.j = true;
            return this;
        }

        public T d() {
            int i;
            int i2;
            Executor executor = this.g;
            if (executor == null && this.h == null) {
                Executor f = uq.f();
                this.h = f;
                this.g = f;
            } else if (executor != null && this.h == null) {
                this.h = executor;
            } else if (executor == null) {
                this.g = this.h;
            }
            Set<Integer> set = this.s;
            if (set != null) {
                z65.e(set);
                for (Integer num : set) {
                    int intValue = num.intValue();
                    if (!(!this.r.contains(Integer.valueOf(intValue)))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + intValue).toString());
                    }
                }
            }
            o00 o00Var = this.i;
            if (o00Var == null) {
                o00Var = new p74();
            }
            if (o00Var != null) {
                if (this.o > 0) {
                    if (this.c != null) {
                        long j = this.o;
                        TimeUnit timeUnit = this.p;
                        if (timeUnit != null) {
                            Executor executor2 = this.g;
                            if (executor2 != null) {
                                o00Var = new o00(o00Var, new m00(j, timeUnit, executor2));
                            } else {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
                    }
                }
                String str = this.t;
                if (str != null || this.u != null || this.v != null) {
                    if (this.c != null) {
                        int i3 = 0;
                        if (str == null) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        File file = this.u;
                        if (file == null) {
                            i2 = 0;
                        } else {
                            i2 = 1;
                        }
                        Callable<InputStream> callable = this.v;
                        if (callable != null) {
                            i3 = 1;
                        }
                        if (i + i2 + i3 == 1) {
                            o00Var = new er9(str, file, callable, o00Var);
                        } else {
                            throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.".toString());
                    }
                }
            } else {
                o00Var = null;
            }
            er9 er9Var = o00Var;
            if (er9Var != null) {
                Context context = this.a;
                String str2 = this.c;
                e eVar = this.q;
                List<b> list = this.d;
                boolean z = this.j;
                d k = this.k.k(context);
                Executor executor3 = this.g;
                if (executor3 != null) {
                    Executor executor4 = this.h;
                    if (executor4 != null) {
                        yl2 yl2Var = new yl2(context, str2, er9Var, eVar, list, z, k, executor3, executor4, this.l, this.m, this.n, this.r, this.t, this.u, this.v, null, this.e, this.f);
                        T t = (T) tn9.b(this.b, "_Impl");
                        t.t(yl2Var);
                        return t;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public a<T> e() {
            this.m = false;
            this.n = true;
            return this;
        }

        public a<T> f(z2b.c cVar) {
            this.i = cVar;
            return this;
        }

        public a<T> g(Executor executor) {
            z65.h(executor, "executor");
            this.g = executor;
            return this;
        }
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lun9$b;", "", "Ly2b;", "db", "", "a", com.huawei.hms.opendevice.c.a, "b", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: un9$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        public void a(y2b y2bVar) {
            z65.h(y2bVar, "db");
        }

        public void b(y2b y2bVar) {
            z65.h(y2bVar, "db");
        }

        public void c(y2b y2bVar) {
            z65.h(y2bVar, "db");
        }
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lun9$c;", "", "", "MAX_BIND_PARAMETER_CNT", "I", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: un9$c */
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lun9$d;", "", "Landroid/app/ActivityManager;", "activityManager", "", "i", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "k", "(Landroid/content/Context;)Lun9$d;", "<init>", "(Ljava/lang/String;I)V", "a", "b", com.huawei.hms.opendevice.c.a, "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: un9$d */
    /* loaded from: classes.dex */
    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean i(ActivityManager activityManager) {
            return u2b.b(activityManager);
        }

        public final d k(Context context) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            z65.f(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            if (!i((ActivityManager) systemService)) {
                return WRITE_AHEAD_LOGGING;
            }
            return TRUNCATE;
        }
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J6\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J#\u0010\u0011\u001a\u00020\u00042\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000f\"\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\u00130\u0013H\u0016J \u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0016\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nR,\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001b¨\u0006\u001e"}, d2 = {"Lun9$e;", "", "Lbj6;", "migration", "", "a", "", "result", "", "upgrade", "", "start", "end", "", com.huawei.hms.push.e.a, "", "migrations", "b", "([Lbj6;)V", "", "f", DateTokenConverter.CONVERTER_KEY, "startVersion", "endVersion", com.huawei.hms.opendevice.c.a, "", "Ljava/util/TreeMap;", "Ljava/util/Map;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: un9$e */
    /* loaded from: classes.dex */
    public static class e {
        private final Map<Integer, TreeMap<Integer, bj6>> a = new LinkedHashMap();

        private final void a(bj6 bj6Var) {
            int i = bj6Var.a;
            int i2 = bj6Var.b;
            Map<Integer, TreeMap<Integer, bj6>> map = this.a;
            Integer valueOf = Integer.valueOf(i);
            TreeMap<Integer, bj6> treeMap = map.get(valueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(valueOf, treeMap);
            }
            TreeMap<Integer, bj6> treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i2))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + bj6Var);
            }
            treeMap2.put(Integer.valueOf(i2), bj6Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final java.util.List<defpackage.bj6> e(java.util.List<defpackage.bj6> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L63
                goto L7
            L5:
                if (r9 <= r10) goto L63
            L7:
                java.util.Map<java.lang.Integer, java.util.TreeMap<java.lang.Integer, bj6>> r0 = r6.a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r8 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L5f
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                java.lang.String r4 = "targetVersion"
                if (r8 == 0) goto L44
                int r5 = r9 + 1
                defpackage.z65.g(r3, r4)
                int r4 = r3.intValue()
                if (r5 > r4) goto L26
                if (r4 > r10) goto L26
                goto L4f
            L44:
                defpackage.z65.g(r3, r4)
                int r4 = r3.intValue()
                if (r10 > r4) goto L26
                if (r4 >= r9) goto L26
            L4f:
                java.lang.Object r9 = r0.get(r3)
                defpackage.z65.e(r9)
                r7.add(r9)
                int r9 = r3.intValue()
                r0 = 1
                goto L60
            L5f:
                r0 = 0
            L60:
                if (r0 != 0) goto L0
                return r1
            L63:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.un9.e.e(java.util.List, boolean, int, int):java.util.List");
        }

        public void b(bj6... bj6VarArr) {
            z65.h(bj6VarArr, "migrations");
            for (bj6 bj6Var : bj6VarArr) {
                a(bj6Var);
            }
        }

        public final boolean c(int i, int i2) {
            Map<Integer, Map<Integer, bj6>> f = f();
            if (f.containsKey(Integer.valueOf(i))) {
                Map<Integer, bj6> map = f.get(Integer.valueOf(i));
                if (map == null) {
                    map = g86.h();
                }
                return map.containsKey(Integer.valueOf(i2));
            }
            return false;
        }

        public List<bj6> d(int i, int i2) {
            boolean z;
            List<bj6> l;
            if (i == i2) {
                l = kc1.l();
                return l;
            }
            if (i2 > i) {
                z = true;
            } else {
                z = false;
            }
            return e(new ArrayList(), z, i, i2);
        }

        public Map<Integer, Map<Integer, bj6>> f() {
            return this.a;
        }
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lun9$f;", "", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: un9$f */
    /* loaded from: classes.dex */
    public static abstract class f {
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly2b;", "it", "", "a", "(Ly2b;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: un9$g */
    /* loaded from: classes.dex */
    static final class g extends ej5 implements Function1<y2b, Object> {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Object invoke(y2b y2bVar) {
            z65.h(y2bVar, "it");
            un9.this.u();
            return null;
        }
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly2b;", "it", "", "a", "(Ly2b;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: un9$h */
    /* loaded from: classes.dex */
    static final class h extends ej5 implements Function1<y2b, Object> {
        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Object invoke(y2b y2bVar) {
            z65.h(y2bVar, "it");
            un9.this.v();
            return null;
        }
    }

    public un9() {
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        z65.g(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.m = synchronizedMap;
        this.n = new LinkedHashMap();
    }

    public static /* synthetic */ Cursor A(un9 un9Var, b3b b3bVar, CancellationSignal cancellationSignal, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                cancellationSignal = null;
            }
            return un9Var.z(b3bVar, cancellationSignal);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T C(Class<T> cls, z2b z2bVar) {
        if (cls.isInstance(z2bVar)) {
            return z2bVar;
        }
        if (z2bVar instanceof gu2) {
            return (T) C(cls, ((gu2) z2bVar).Z0());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        c();
        y2b l1 = n().l1();
        m().u(l1);
        if (l1.M1()) {
            l1.Z();
        } else {
            l1.beginTransaction();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        n().l1().g0();
        if (!s()) {
            m().m();
        }
    }

    public void B() {
        n().l1().X();
    }

    public void c() {
        if (this.f || (!x())) {
            return;
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
    }

    public void d() {
        if (!s() && this.l.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public void e() {
        c();
        m00 m00Var = this.k;
        if (m00Var == null) {
            u();
        } else {
            m00Var.g(new g());
        }
    }

    public c3b f(String str) {
        z65.h(str, "sql");
        c();
        d();
        return n().l1().R0(str);
    }

    protected abstract l75 g();

    protected abstract z2b h(yl2 yl2Var);

    public void i() {
        m00 m00Var = this.k;
        if (m00Var == null) {
            v();
        } else {
            m00Var.g(new h());
        }
    }

    public List<bj6> j(Map<Class<Object>, Object> map) {
        List<bj6> l;
        z65.h(map, "autoMigrationSpecs");
        l = kc1.l();
        return l;
    }

    public final Map<String, Object> k() {
        return this.m;
    }

    public final Lock l() {
        ReentrantReadWriteLock.ReadLock readLock = this.j.readLock();
        z65.g(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    public l75 m() {
        return this.e;
    }

    public z2b n() {
        z2b z2bVar = this.d;
        if (z2bVar == null) {
            z65.z("internalOpenHelper");
            return null;
        }
        return z2bVar;
    }

    public Executor o() {
        Executor executor = this.b;
        if (executor == null) {
            z65.z("internalQueryExecutor");
            return null;
        }
        return executor;
    }

    public Set<Class<Object>> p() {
        Set<Class<Object>> e2;
        e2 = sfa.e();
        return e2;
    }

    protected Map<Class<?>, List<Class<?>>> q() {
        Map<Class<?>, List<Class<?>>> h2;
        h2 = g86.h();
        return h2;
    }

    public Executor r() {
        Executor executor = this.c;
        if (executor == null) {
            z65.z("internalTransactionExecutor");
            return null;
        }
        return executor;
    }

    public boolean s() {
        return n().l1().h();
    }

    public void t(yl2 yl2Var) {
        boolean z;
        z65.h(yl2Var, "configuration");
        this.d = h(yl2Var);
        Set<Class<Object>> p = p();
        BitSet bitSet = new BitSet();
        Iterator<Class<Object>> it = p.iterator();
        while (true) {
            int i = -1;
            if (it.hasNext()) {
                Class<Object> next = it.next();
                int size = yl2Var.r.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        if (next.isAssignableFrom(yl2Var.r.get(size).getClass())) {
                            bitSet.set(size);
                            i = size;
                            break;
                        } else if (i2 < 0) {
                            break;
                        } else {
                            size = i2;
                        }
                    }
                }
                if (i >= 0) {
                    this.i.put(next, yl2Var.r.get(i));
                } else {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
            } else {
                int size2 = yl2Var.r.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i3 = size2 - 1;
                        if (bitSet.get(size2)) {
                            if (i3 < 0) {
                                break;
                            }
                            size2 = i3;
                        } else {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                        }
                    }
                }
                Iterator<bj6> it2 = j(this.i).iterator();
                while (true) {
                    z = false;
                    if (!it2.hasNext()) {
                        break;
                    }
                    bj6 next2 = it2.next();
                    if (!yl2Var.d.c(next2.a, next2.b)) {
                        yl2Var.d.b(next2);
                    }
                }
                dr9 dr9Var = (dr9) C(dr9.class, n());
                if (dr9Var != null) {
                    dr9Var.c(yl2Var);
                }
                n00 n00Var = (n00) C(n00.class, n());
                if (n00Var != null) {
                    this.k = n00Var.b;
                    m().p(n00Var.b);
                }
                if (yl2Var.g == d.WRITE_AHEAD_LOGGING) {
                    z = true;
                }
                n().setWriteAheadLoggingEnabled(z);
                this.h = yl2Var.e;
                this.b = yl2Var.h;
                this.c = new hkb(yl2Var.i);
                this.f = yl2Var.f;
                this.g = z;
                if (yl2Var.j != null) {
                    if (yl2Var.b != null) {
                        m().q(yl2Var.a, yl2Var.b, yl2Var.j);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                Map<Class<?>, List<Class<?>>> q = q();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : q.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = yl2Var.q.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i4 = size3 - 1;
                                if (cls.isAssignableFrom(yl2Var.q.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else if (i4 < 0) {
                                    break;
                                } else {
                                    size3 = i4;
                                }
                            }
                        }
                        size3 = -1;
                        if (size3 >= 0) {
                            this.n.put(cls, yl2Var.q.get(size3));
                        } else {
                            throw new IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                    }
                }
                int size4 = yl2Var.q.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i5 = size4 - 1;
                    if (bitSet2.get(size4)) {
                        if (i5 >= 0) {
                            size4 = i5;
                        } else {
                            return;
                        }
                    } else {
                        throw new IllegalArgumentException("Unexpected type converter " + yl2Var.q.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void w(y2b y2bVar) {
        z65.h(y2bVar, "db");
        m().j(y2bVar);
    }

    public final boolean x() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        y2b y2bVar = this.a;
        if (y2bVar == null || !y2bVar.isOpen()) {
            return false;
        }
        return true;
    }

    public Cursor z(b3b b3bVar, CancellationSignal cancellationSignal) {
        z65.h(b3bVar, SearchIntents.EXTRA_QUERY);
        c();
        d();
        if (cancellationSignal != null) {
            return n().l1().d1(b3bVar, cancellationSignal);
        }
        return n().l1().t(b3bVar);
    }
}
