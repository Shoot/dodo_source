package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SupportSQLiteOpenHelper.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\b\u0010\u0006\u001a\u00020\u0004H&R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lz2b;", "Ljava/io/Closeable;", "", "enabled", "", "setWriteAheadLoggingEnabled", "close", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Ly2b;", "l1", "()Ly2b;", "writableDatabase", "a", "b", com.huawei.hms.opendevice.c.a, "sqlite_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: z2b  reason: default package */
/* loaded from: classes.dex */
public interface z2b extends Closeable {

    /* compiled from: SupportSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b&\u0018\u0000 \b2\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J \u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u0012\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0015"}, d2 = {"Lz2b$a;", "", "", "fileName", "", "a", "Ly2b;", "db", "b", DateTokenConverter.CONVERTER_KEY, "", "oldVersion", "newVersion", "g", e.a, "f", com.huawei.hms.opendevice.c.a, "I", "version", "<init>", "(I)V", "sqlite_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: z2b$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public static final C0756a b = new C0756a(null);
        public final int a;

        /* compiled from: SupportSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lz2b$a$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "sqlite_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: z2b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0756a {
            private C0756a() {
            }

            public /* synthetic */ C0756a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public a(int i) {
            this.a = i;
        }

        private final void a(String str) {
            boolean v;
            int i;
            boolean z;
            v = l0b.v(str, ":memory:", true);
            if (!v) {
                int length = str.length() - 1;
                int i2 = 0;
                boolean z2 = false;
                while (i2 <= length) {
                    if (!z2) {
                        i = i2;
                    } else {
                        i = length;
                    }
                    if (z65.j(str.charAt(i), 32) <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z2) {
                        if (!z) {
                            z2 = true;
                        } else {
                            i2++;
                        }
                    } else if (!z) {
                        break;
                    } else {
                        length--;
                    }
                }
                if (str.subSequence(i2, length + 1).toString().length() != 0) {
                    Log.w("SupportSQLite", "deleting the database file: " + str);
                    try {
                        t2b.c(new File(str));
                    } catch (Exception e) {
                        Log.w("SupportSQLite", "delete failed: ", e);
                    }
                }
            }
        }

        public void b(y2b y2bVar) {
            z65.h(y2bVar, "db");
        }

        public void c(y2b y2bVar) {
            z65.h(y2bVar, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + y2bVar + ".path");
            if (!y2bVar.isOpen()) {
                String path = y2bVar.getPath();
                if (path != null) {
                    a(path);
                    return;
                }
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = y2bVar.A();
                } catch (SQLiteException unused) {
                }
                try {
                    y2bVar.close();
                } catch (IOException unused2) {
                }
            } finally {
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        z65.g(obj, "p.second");
                        a((String) obj);
                    }
                } else {
                    String path2 = y2bVar.getPath();
                    if (path2 != null) {
                        a(path2);
                    }
                }
            }
        }

        public abstract void d(y2b y2bVar);

        public abstract void e(y2b y2bVar, int i, int i2);

        public void f(y2b y2bVar) {
            z65.h(y2bVar, "db");
        }

        public abstract void g(y2b y2bVar, int i, int i2);
    }

    /* compiled from: SupportSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00162\u00020\u0001:\u0002\u0003\u0007B5\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0017"}, d2 = {"Lz2b$b;", "", "Landroid/content/Context;", "a", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "Ljava/lang/String;", Action.NAME_ATTRIBUTE, "Lz2b$a;", com.huawei.hms.opendevice.c.a, "Lz2b$a;", "callback", "", DateTokenConverter.CONVERTER_KEY, "Z", "useNoBackupDirectory", e.a, "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lz2b$a;ZZ)V", "f", "sqlite_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: z2b$b */
    /* loaded from: classes.dex */
    public static final class b {
        public static final C0757b f = new C0757b(null);
        public final Context a;
        public final String b;
        public final a c;
        public final boolean d;
        public final boolean e;

        /* compiled from: SupportSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0017"}, d2 = {"Lz2b$b$a;", "", "Lz2b$b;", "a", "", Action.NAME_ATTRIBUTE, com.huawei.hms.opendevice.c.a, "Lz2b$a;", "callback", "b", "", "useNoBackupDirectory", DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/lang/String;", "Lz2b$a;", "Z", e.a, "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;)V", "sqlite_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: z2b$b$a */
        /* loaded from: classes.dex */
        public static class a {
            private final Context a;
            private String b;
            private a c;
            private boolean d;
            private boolean e;

            public a(Context context) {
                z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
                this.a = context;
            }

            public b a() {
                String str;
                a aVar = this.c;
                if (aVar != null) {
                    if (this.d && ((str = this.b) == null || str.length() == 0)) {
                        throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
                    }
                    return new b(this.a, this.b, aVar, this.d, this.e);
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
            }

            public a b(a aVar) {
                z65.h(aVar, "callback");
                this.c = aVar;
                return this;
            }

            public a c(String str) {
                this.b = str;
                return this;
            }

            public a d(boolean z) {
                this.d = z;
                return this;
            }
        }

        /* compiled from: SupportSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lz2b$b$b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lz2b$b$a;", "a", "<init>", "()V", "sqlite_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: z2b$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0757b {
            private C0757b() {
            }

            public /* synthetic */ C0757b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Context context) {
                z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
                return new a(context);
            }
        }

        public b(Context context, String str, a aVar, boolean z, boolean z2) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            z65.h(aVar, "callback");
            this.a = context;
            this.b = str;
            this.c = aVar;
            this.d = z;
            this.e = z2;
        }

        public static final a a(Context context) {
            return f.a(context);
        }
    }

    /* compiled from: SupportSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lz2b$c;", "", "Lz2b$b;", "configuration", "Lz2b;", "a", "sqlite_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: z2b$c */
    /* loaded from: classes.dex */
    public interface c {
        z2b a(b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    y2b l1();

    void setWriteAheadLoggingEnabled(boolean z);
}
