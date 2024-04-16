package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.network.NetworkHandler;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: InvalidationTracker.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0004,1\u001f\"BS\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020+\u0012\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b00\u0012\u0018\u00105\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0400\u0012\u0012\u0010b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000b¢\u0006\u0004\bc\u0010dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J'\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0017J\u0010\u0010 \u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0017J\u000f\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b\"\u0010#J\b\u0010$\u001a\u00020\u0002H\u0016J#\u0010&\u001a\u00020\u00022\u0012\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000bH\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b(\u0010\u0015J\u000f\u0010)\u001a\u00020\u0002H\u0000¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0013\u001a\u00020+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R \u00103\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R&\u00105\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b04008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00102R&\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u00102\u001a\u0004\b6\u00107R\"\u0010=\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010>R\u001a\u0010D\u001a\u00020?8GX\u0087\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0016\u0010F\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010ER$\u0010L\u001a\u0004\u0018\u00010G8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u0010H\u001a\u0004\b9\u0010I\"\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010NR\u0014\u0010R\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010QR&\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020T0S8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010U\u001a\u0004\b@\u0010VR\u0018\u0010Z\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010YR\u0014\u0010\\\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010[R\u0014\u0010]\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010[R\u001a\u0010a\u001a\u00020^8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010_\u0012\u0004\b`\u0010*¨\u0006e"}, d2 = {"Ll75;", "", "", "l", "Ly2b;", "db", "", "tableId", Image.TYPE_SMALL, "r", "", "", "names", "o", "([Ljava/lang/String;)[Ljava/lang/String;", "Lm00;", "autoCloser", "p", "(Lm00;)V", "database", "j", "(Ly2b;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, Action.NAME_ATTRIBUTE, "Landroid/content/Intent;", "serviceIntent", "q", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "Ll75$c;", "observer", com.huawei.hms.opendevice.c.a, "n", "", DateTokenConverter.CONVERTER_KEY, "()Z", Image.TYPE_MEDIUM, "tables", "k", "([Ljava/lang/String;)V", "u", "t", "()V", "Lun9;", "a", "Lun9;", "f", "()Lun9;", "", "b", "Ljava/util/Map;", "shadowTablesMap", "", "viewTables", "i", "()Ljava/util/Map;", "tableIdLookup", com.huawei.hms.push.e.a, "[Ljava/lang/String;", "getTablesNames$room_runtime_release", "()[Ljava/lang/String;", "tablesNames", "Lm00;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "g", "Ljava/util/concurrent/atomic/AtomicBoolean;", Image.TYPE_HIGH, "()Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingRefresh", "Z", "initialized", "Lc3b;", "Lc3b;", "()Lc3b;", "setCleanupStatement$room_runtime_release", "(Lc3b;)V", "cleanupStatement", "Ll75$b;", "Ll75$b;", "observedTableTracker", "Li75;", "Li75;", "invalidationLiveDataContainer", "Lvs9;", "Ll75$d;", "Lvs9;", "()Lvs9;", "observerMap", "Lnp6;", "Lnp6;", "multiInstanceInvalidationClient", "Ljava/lang/Object;", "syncTriggersLock", "trackerLock", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "getRefreshRunnable$annotations", "refreshRunnable", "tableNames", "<init>", "(Lun9;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: l75  reason: default package */
/* loaded from: classes.dex */
public class l75 {
    public static final a q = new a(null);
    private static final String[] r = {"UPDATE", NetworkHandler.DELETE, "INSERT"};
    private final un9 a;
    private final Map<String, String> b;
    private final Map<String, Set<String>> c;
    private final Map<String, Integer> d;
    private final String[] e;
    private m00 f;
    private final AtomicBoolean g;
    private volatile boolean h;
    private volatile c3b i;
    private final b j;
    private final i75 k;
    private final vs9<c, d> l;
    private np6 m;
    private final Object n;
    private final Object o;
    public final Runnable p;

    /* compiled from: InvalidationTracker.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u0011J\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001a\u0010\u000f\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u000f\u0010\r\u0012\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u0012\u0010\r\u0012\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\r¨\u0006\u001a"}, d2 = {"Ll75$a;", "", "", "tableName", "triggerType", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ly2b;", "database", "", "a", "(Ly2b;)V", "CREATE_TRACKING_TABLE_SQL", "Ljava/lang/String;", "INVALIDATED_COLUMN_NAME", "RESET_UPDATED_TABLES_SQL", "getRESET_UPDATED_TABLES_SQL$room_runtime_release$annotations", "()V", "SELECT_UPDATED_TABLES_SQL", "getSELECT_UPDATED_TABLES_SQL$room_runtime_release$annotations", "TABLE_ID_COLUMN_NAME", "", "TRIGGERS", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "<init>", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: l75$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(y2b y2bVar) {
            z65.h(y2bVar, "database");
            if (y2bVar.M1()) {
                y2bVar.Z();
            } else {
                y2bVar.beginTransaction();
            }
        }

        public final String b(String str, String str2) {
            z65.h(str, "tableName");
            z65.h(str2, "triggerType");
            return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
        }
    }

    /* compiled from: InvalidationTracker.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u000f\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003J\u0012\u0010\u0007\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003J\u0006\u0010\t\u001a\u00020\bJ\n\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0007R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Ll75$b;", "", "", "", "tableIds", "", "b", com.huawei.hms.opendevice.c.a, "", DateTokenConverter.CONVERTER_KEY, "a", "", "[J", "getTableObservers", "()[J", "tableObservers", "", "[Z", "triggerStates", "[I", "triggerStateChanges", "Z", "getNeedsSync", "()Z", "setNeedsSync", "(Z)V", "needsSync", "tableCount", "<init>", "(I)V", com.huawei.hms.push.e.a, "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: l75$b */
    /* loaded from: classes.dex */
    public static final class b {
        public static final a e = new a(null);
        private final long[] a;
        private final boolean[] b;
        private final int[] c;
        private boolean d;

        /* compiled from: InvalidationTracker.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Ll75$b$a;", "", "", "ADD", "I", "NO_OP", "REMOVE", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: l75$b$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public b(int i) {
            this.a = new long[i];
            this.b = new boolean[i];
            this.c = new int[i];
        }

        public final int[] a() {
            boolean z;
            synchronized (this) {
                try {
                    if (!this.d) {
                        return null;
                    }
                    long[] jArr = this.a;
                    int length = jArr.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        int i3 = i2 + 1;
                        int i4 = 1;
                        if (jArr[i] > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean[] zArr = this.b;
                        if (z != zArr[i2]) {
                            int[] iArr = this.c;
                            if (!z) {
                                i4 = 2;
                            }
                            iArr[i2] = i4;
                        } else {
                            this.c[i2] = 0;
                        }
                        zArr[i2] = z;
                        i++;
                        i2 = i3;
                    }
                    this.d = false;
                    return (int[]) this.c.clone();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final boolean b(int... iArr) {
            boolean z;
            z65.h(iArr, "tableIds");
            synchronized (this) {
                try {
                    z = false;
                    for (int i : iArr) {
                        long[] jArr = this.a;
                        long j = jArr[i];
                        jArr[i] = 1 + j;
                        if (j == 0) {
                            z = true;
                            this.d = true;
                        }
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z;
        }

        public final boolean c(int... iArr) {
            boolean z;
            z65.h(iArr, "tableIds");
            synchronized (this) {
                try {
                    z = false;
                    for (int i : iArr) {
                        long[] jArr = this.a;
                        long j = jArr[i];
                        jArr[i] = j - 1;
                        if (j == 1) {
                            z = true;
                            this.d = true;
                        }
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z;
        }

        public final void d() {
            synchronized (this) {
                Arrays.fill(this.b, false);
                this.d = true;
                Unit unit = Unit.a;
            }
        }
    }

    /* compiled from: InvalidationTracker.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&R\"\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Ll75$c;", "", "", "", "tables", "", com.huawei.hms.opendevice.c.a, "", "a", "[Ljava/lang/String;", "()[Ljava/lang/String;", "", "b", "()Z", "isRemote", "<init>", "([Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: l75$c */
    /* loaded from: classes.dex */
    public static abstract class c {
        private final String[] a;

        public c(String[] strArr) {
            z65.h(strArr, "tables");
            this.a = strArr;
        }

        public final String[] a() {
            return this.a;
        }

        public boolean b() {
            return false;
        }

        public abstract void c(Set<String> set);
    }

    /* compiled from: InvalidationTracker.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015R\u001c\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Ll75$d;", "", "", "", "invalidatedTablesIds", "", "b", "(Ljava/util/Set;)V", "", "", "tables", com.huawei.hms.opendevice.c.a, "([Ljava/lang/String;)V", "Ll75$c;", "a", "Ll75$c;", "getObserver$room_runtime_release", "()Ll75$c;", "observer", "", "[I", "()[I", "tableIds", "[Ljava/lang/String;", "tableNames", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Set;", "singleTableSet", "<init>", "(Ll75$c;[I[Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: l75$d */
    /* loaded from: classes.dex */
    public static final class d {
        private final c a;
        private final int[] b;
        private final String[] c;
        private final Set<String> d;

        public d(c cVar, int[] iArr, String[] strArr) {
            boolean z;
            z65.h(cVar, "observer");
            z65.h(iArr, "tableIds");
            z65.h(strArr, "tableNames");
            this.a = cVar;
            this.b = iArr;
            this.c = strArr;
            if (strArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            this.d = z ^ true ? rfa.d(strArr[0]) : sfa.e();
            if (iArr.length == strArr.length) {
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        public final int[] a() {
            return this.b;
        }

        public final void b(Set<Integer> set) {
            Set<String> e;
            Set b;
            z65.h(set, "invalidatedTablesIds");
            int[] iArr = this.b;
            int length = iArr.length;
            if (length == 0) {
                e = sfa.e();
            } else {
                int i = 0;
                if (length != 1) {
                    b = rfa.b();
                    int[] iArr2 = this.b;
                    int length2 = iArr2.length;
                    int i2 = 0;
                    while (i < length2) {
                        int i3 = i2 + 1;
                        if (set.contains(Integer.valueOf(iArr2[i]))) {
                            b.add(this.c[i2]);
                        }
                        i++;
                        i2 = i3;
                    }
                    e = rfa.a(b);
                } else {
                    e = set.contains(Integer.valueOf(iArr[0])) ? this.d : sfa.e();
                }
            }
            if (!e.isEmpty()) {
                this.a.c(e);
            }
        }

        public final void c(String[] strArr) {
            Set<String> e;
            boolean v;
            Set b;
            String[] strArr2;
            boolean v2;
            z65.h(strArr, "tables");
            int length = this.c.length;
            if (length == 0) {
                e = sfa.e();
            } else if (length != 1) {
                b = rfa.b();
                for (String str : strArr) {
                    for (String str2 : this.c) {
                        v2 = l0b.v(str2, str, true);
                        if (v2) {
                            b.add(str2);
                        }
                    }
                }
                e = rfa.a(b);
            } else {
                int length2 = strArr.length;
                int i = 0;
                while (true) {
                    if (i < length2) {
                        v = l0b.v(strArr[i], this.c[0], true);
                        if (v) {
                            e = this.d;
                            break;
                        }
                        i++;
                    } else {
                        e = sfa.e();
                        break;
                    }
                }
            }
            if (!e.isEmpty()) {
                this.a.c(e);
            }
        }
    }

    /* compiled from: InvalidationTracker.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"l75$e", "Ljava/lang/Runnable;", "", "", "a", "", "run", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: l75$e */
    /* loaded from: classes.dex */
    public static final class e implements Runnable {
        e() {
        }

        private final Set<Integer> a() {
            Set b;
            Set<Integer> a;
            l75 l75Var = l75.this;
            b = rfa.b();
            Cursor A = un9.A(l75Var.f(), new ula("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
            while (A.moveToNext()) {
                try {
                    b.add(Integer.valueOf(A.getInt(0)));
                } finally {
                }
            }
            Unit unit = Unit.a;
            aa1.a(A, null);
            a = rfa.a(b);
            if (!a.isEmpty()) {
                if (l75.this.e() != null) {
                    c3b e = l75.this.e();
                    if (e != null) {
                        e.I();
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            return a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
            if (r0 != null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
            r0.e();
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00a6, code lost:
            if (r0 == null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00bd, code lost:
            if (r0 == null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00c8, code lost:
            if ((!r3.isEmpty()) == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00ca, code lost:
            r0 = r5.a.g();
            r1 = r5.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00d2, code lost:
            monitor-enter(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:
            r1 = r1.g().iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00df, code lost:
            if (r1.hasNext() == false) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00e1, code lost:
            ((defpackage.l75.d) ((java.util.Map.Entry) r1.next()).getValue()).b(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00f1, code lost:
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00f3, code lost:
            r1 = kotlin.Unit.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00f5, code lost:
            monitor-exit(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00f8, code lost:
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00f9, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 265
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.l75.e.run():void");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l75(un9 un9Var, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        Object i;
        String str;
        z65.h(un9Var, "database");
        z65.h(map, "shadowTablesMap");
        z65.h(map2, "viewTables");
        z65.h(strArr, "tableNames");
        this.a = un9Var;
        this.b = map;
        this.c = map2;
        this.g = new AtomicBoolean(false);
        this.j = new b(strArr.length);
        this.k = new i75(un9Var);
        this.l = new vs9<>();
        this.n = new Object();
        this.o = new Object();
        this.d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str2 = strArr[i2];
            Locale locale = Locale.US;
            z65.g(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            z65.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.d.put(lowerCase, Integer.valueOf(i2));
            String str3 = this.b.get(strArr[i2]);
            if (str3 != null) {
                z65.g(locale, "US");
                str = str3.toLowerCase(locale);
                z65.g(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i2] = lowerCase;
        }
        this.e = strArr2;
        for (Map.Entry<String, String> entry : this.b.entrySet()) {
            Locale locale2 = Locale.US;
            z65.g(locale2, "US");
            String lowerCase2 = entry.getValue().toLowerCase(locale2);
            z65.g(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.d.containsKey(lowerCase2)) {
                z65.g(locale2, "US");
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                z65.g(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                Map<String, Integer> map3 = this.d;
                i = g86.i(map3, lowerCase2);
                map3.put(lowerCase3, i);
            }
        }
        this.p = new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        synchronized (this.o) {
            this.h = false;
            this.j.d();
            c3b c3bVar = this.i;
            if (c3bVar != null) {
                c3bVar.close();
                Unit unit = Unit.a;
            }
        }
    }

    private final String[] o(String[] strArr) {
        Set b2;
        Set a2;
        b2 = rfa.b();
        for (String str : strArr) {
            Map<String, Set<String>> map = this.c;
            Locale locale = Locale.US;
            z65.g(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            z65.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map<String, Set<String>> map2 = this.c;
                z65.g(locale, "US");
                String lowerCase2 = str.toLowerCase(locale);
                z65.g(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map2.get(lowerCase2);
                z65.e(set);
                b2.addAll(set);
            } else {
                b2.add(str);
            }
        }
        a2 = rfa.a(b2);
        Object[] array = a2.toArray(new String[0]);
        z65.f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    private final void r(y2b y2bVar, int i) {
        y2bVar.C("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.e[i];
        for (String str2 : r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + q.b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
            z65.g(str3, "StringBuilder().apply(builderAction).toString()");
            y2bVar.C(str3);
        }
    }

    private final void s(y2b y2bVar, int i) {
        String[] strArr;
        String str = this.e[i];
        for (String str2 : r) {
            String str3 = "DROP TRIGGER IF EXISTS " + q.b(str, str2);
            z65.g(str3, "StringBuilder().apply(builderAction).toString()");
            y2bVar.C(str3);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void c(c cVar) {
        int[] E0;
        d k;
        z65.h(cVar, "observer");
        String[] o = o(cVar.a());
        ArrayList arrayList = new ArrayList(o.length);
        for (String str : o) {
            Map<String, Integer> map = this.d;
            Locale locale = Locale.US;
            z65.g(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            z65.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = map.get(lowerCase);
            if (num != null) {
                arrayList.add(Integer.valueOf(num.intValue()));
            } else {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
        }
        E0 = sc1.E0(arrayList);
        d dVar = new d(cVar, E0, o);
        synchronized (this.l) {
            k = this.l.k(cVar, dVar);
        }
        if (k == null && this.j.b(Arrays.copyOf(E0, E0.length))) {
            t();
        }
    }

    public final boolean d() {
        if (!this.a.y()) {
            return false;
        }
        if (!this.h) {
            this.a.n().l1();
        }
        if (!this.h) {
            Log.e("ROOM", "database is not initialized even though it is open");
            return false;
        }
        return true;
    }

    public final c3b e() {
        return this.i;
    }

    public final un9 f() {
        return this.a;
    }

    public final vs9<c, d> g() {
        return this.l;
    }

    public final AtomicBoolean h() {
        return this.g;
    }

    public final Map<String, Integer> i() {
        return this.d;
    }

    public final void j(y2b y2bVar) {
        z65.h(y2bVar, "database");
        synchronized (this.o) {
            if (this.h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            y2bVar.C("PRAGMA temp_store = MEMORY;");
            y2bVar.C("PRAGMA recursive_triggers='ON';");
            y2bVar.C("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            u(y2bVar);
            this.i = y2bVar.R0("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.h = true;
            Unit unit = Unit.a;
        }
    }

    public final void k(String... strArr) {
        z65.h(strArr, "tables");
        synchronized (this.l) {
            try {
                Iterator<Map.Entry<K, V>> it = this.l.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    z65.g(entry, "(observer, wrapper)");
                    d dVar = (d) entry.getValue();
                    if (!((c) entry.getKey()).b()) {
                        dVar.c(strArr);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m() {
        if (this.g.compareAndSet(false, true)) {
            m00 m00Var = this.f;
            if (m00Var != null) {
                m00Var.j();
            }
            this.a.o().execute(this.p);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void n(c cVar) {
        d p;
        z65.h(cVar, "observer");
        synchronized (this.l) {
            p = this.l.p(cVar);
        }
        if (p != null) {
            b bVar = this.j;
            int[] a2 = p.a();
            if (bVar.c(Arrays.copyOf(a2, a2.length))) {
                t();
            }
        }
    }

    public final void p(m00 m00Var) {
        z65.h(m00Var, "autoCloser");
        this.f = m00Var;
        m00Var.l(new Runnable() { // from class: k75
            @Override // java.lang.Runnable
            public final void run() {
                l75.this.l();
            }
        });
    }

    public final void q(Context context, String str, Intent intent) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(intent, "serviceIntent");
        this.m = new np6(context, str, intent, this, this.a.o());
    }

    public final void t() {
        if (!this.a.y()) {
            return;
        }
        u(this.a.n().l1());
    }

    public final void u(y2b y2bVar) {
        z65.h(y2bVar, "database");
        if (y2bVar.h()) {
            return;
        }
        try {
            Lock l = this.a.l();
            l.lock();
            synchronized (this.n) {
                int[] a2 = this.j.a();
                if (a2 == null) {
                    l.unlock();
                    return;
                }
                q.a(y2bVar);
                try {
                    int length = a2.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        int i3 = a2[i];
                        int i4 = i2 + 1;
                        if (i3 != 1) {
                            if (i3 == 2) {
                                s(y2bVar, i2);
                            }
                        } else {
                            r(y2bVar, i2);
                        }
                        i++;
                        i2 = i4;
                    }
                    y2bVar.X();
                    y2bVar.g0();
                    Unit unit = Unit.a;
                    l.unlock();
                } catch (Throwable th) {
                    y2bVar.g0();
                    throw th;
                }
            }
        } catch (SQLiteException e2) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
        } catch (IllegalStateException e3) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e3);
        }
    }
}
