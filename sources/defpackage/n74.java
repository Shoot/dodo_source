package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.n74;
import defpackage.z2b;
import java.io.File;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FrameworkSQLiteOpenHelper.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 -2\u00020\u0001:\u0003\b\f\u0010B7\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u001b\u0010#\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b\u001f\u0010 *\u0004\b!\u0010\"R\u0016\u0010&\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Ln74;", "Lz2b;", "", "enabled", "", "setWriteAheadLoggingEnabled", "close", "Landroid/content/Context;", "a", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "Ljava/lang/String;", Action.NAME_ATTRIBUTE, "Lz2b$a;", com.huawei.hms.opendevice.c.a, "Lz2b$a;", "callback", DateTokenConverter.CONVERTER_KEY, "Z", "useNoBackupDirectory", e.a, "allowDataLossOnRecovery", "Lrn5;", "Ln74$c;", "f", "Lrn5;", "lazyDelegate", "g", "writeAheadLoggingEnabled", "k", "()Ln74$c;", "getDelegate$delegate", "(Ln74;)Ljava/lang/Object;", "delegate", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Ly2b;", "l1", "()Ly2b;", "writableDatabase", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lz2b$a;ZZ)V", Image.TYPE_HIGH, "sqlite-framework_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: n74  reason: default package */
/* loaded from: classes.dex */
public final class n74 implements z2b {
    public static final a h = new a(null);
    private final Context a;
    private final String b;
    private final z2b.a c;
    private final boolean d;
    private final boolean e;
    private final rn5<c> f;
    private boolean g;

    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ln74$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: n74$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\u0007R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Ln74$b;", "", "Lm74;", "a", "Lm74;", "()Lm74;", "b", "(Lm74;)V", "db", "<init>", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: n74$b */
    /* loaded from: classes.dex */
    public static final class b {
        private m74 a;

        public b(m74 m74Var) {
            this.a = m74Var;
        }

        public final m74 a() {
            return this.a;
        }

        public final void b(m74 m74Var) {
            this.a = m74Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000 82\u00020\u0001:\u0003\u0018\u001e\bB1\u0012\u0006\u0010\u001c\u001a\u00020\u0017\u0012\b\u00105\u001a\u0004\u0018\u000104\u0012\u0006\u0010\"\u001a\u00020\u001d\u0012\u0006\u0010'\u001a\u00020#\u0012\u0006\u0010,\u001a\u00020\u0002¢\u0006\u0004\b6\u00107J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0004H\u0016J \u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0004H\u0016J \u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\fH\u0016R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010'\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010,\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010)¨\u00069"}, d2 = {"Ln74$c;", "Landroid/database/sqlite/SQLiteOpenHelper;", "", "writable", "Landroid/database/sqlite/SQLiteDatabase;", "j", "i", "Ly2b;", com.huawei.hms.opendevice.c.a, "sqLiteDatabase", "Lm74;", e.a, "", "onCreate", "", "oldVersion", "newVersion", "onUpgrade", "db", "onConfigure", "onDowngrade", "onOpen", "close", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ln74$b;", "b", "Ln74$b;", "getDbRef", "()Ln74$b;", "dbRef", "Lz2b$a;", "Lz2b$a;", "getCallback", "()Lz2b$a;", "callback", DateTokenConverter.CONVERTER_KEY, "Z", "getAllowDataLossOnRecovery", "()Z", "allowDataLossOnRecovery", "migrated", "Luk8;", "f", "Luk8;", "lock", "g", "opened", "", Action.NAME_ATTRIBUTE, "<init>", "(Landroid/content/Context;Ljava/lang/String;Ln74$b;Lz2b$a;Z)V", Image.TYPE_HIGH, "sqlite-framework_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: n74$c */
    /* loaded from: classes.dex */
    public static final class c extends SQLiteOpenHelper {
        public static final C0453c h = new C0453c(null);
        private final Context a;
        private final b b;
        private final z2b.a c;
        private final boolean d;
        private boolean e;
        private final uk8 f;
        private boolean g;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\b\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Ln74$c$a;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ln74$c$b;", "a", "Ln74$c$b;", "()Ln74$c$b;", "callbackName", "", "b", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "cause", "<init>", "(Ln74$c$b;Ljava/lang/Throwable;)V", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: n74$c$a */
        /* loaded from: classes.dex */
        public static final class a extends RuntimeException {
            private final b a;
            private final Throwable b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, Throwable th) {
                super(th);
                z65.h(bVar, "callbackName");
                z65.h(th, "cause");
                this.a = bVar;
                this.b = th;
            }

            public final b a() {
                return this.a;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.b;
            }
        }

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Ln74$c$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, e.a, "sqlite-framework_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: n74$c$b */
        /* loaded from: classes.dex */
        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Ln74$c$c;", "", "Ln74$b;", "refHolder", "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", "Lm74;", "a", "<init>", "()V", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: n74$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0453c {
            private C0453c() {
            }

            public /* synthetic */ C0453c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final m74 a(b bVar, SQLiteDatabase sQLiteDatabase) {
                z65.h(bVar, "refHolder");
                z65.h(sQLiteDatabase, "sqLiteDatabase");
                m74 a = bVar.a();
                if (a == null || !a.c(sQLiteDatabase)) {
                    m74 m74Var = new m74(sQLiteDatabase);
                    bVar.b(m74Var);
                    return m74Var;
                }
                return a;
            }
        }

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: n74$c$d */
        /* loaded from: classes.dex */
        public /* synthetic */ class d {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, final b bVar, final z2b.a aVar, boolean z) {
            super(context, str, null, aVar.a, new DatabaseErrorHandler() { // from class: o74
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    n74.c.b(z2b.a.this, bVar, sQLiteDatabase);
                }
            });
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            z65.h(bVar, "dbRef");
            z65.h(aVar, "callback");
            this.a = context;
            this.b = bVar;
            this.c = aVar;
            this.d = z;
            if (str == null) {
                str = UUID.randomUUID().toString();
                z65.g(str, "randomUUID().toString()");
            }
            this.f = new uk8(str, context.getCacheDir(), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(z2b.a aVar, b bVar, SQLiteDatabase sQLiteDatabase) {
            z65.h(aVar, "$callback");
            z65.h(bVar, "$dbRef");
            C0453c c0453c = h;
            z65.g(sQLiteDatabase, "dbObj");
            aVar.c(c0453c.a(bVar, sQLiteDatabase));
        }

        private final SQLiteDatabase i(boolean z) {
            if (z) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                z65.g(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            z65.g(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        private final SQLiteDatabase j(boolean z) {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z2 = this.g;
            if (databaseName != null && !z2 && (parentFile = this.a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return i(z);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return i(z);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof a) {
                        a aVar = th;
                        Throwable cause = aVar.getCause();
                        int i = d.$EnumSwitchMapping$0[aVar.a().ordinal()];
                        if (i != 1 && i != 2 && i != 3 && i != 4) {
                            if (!(cause instanceof SQLiteException)) {
                                throw cause;
                            }
                        } else {
                            throw cause;
                        }
                    } else if (th instanceof SQLiteException) {
                        if (databaseName == null || !this.d) {
                            throw th;
                        }
                    } else {
                        throw th;
                    }
                    this.a.deleteDatabase(databaseName);
                    try {
                        return i(z);
                    } catch (a e) {
                        throw e.getCause();
                    }
                }
            }
        }

        public final y2b c(boolean z) {
            boolean z2;
            try {
                uk8 uk8Var = this.f;
                if (!this.g && getDatabaseName() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                uk8Var.b(z2);
                this.e = false;
                SQLiteDatabase j = j(z);
                if (this.e) {
                    close();
                    y2b c = c(z);
                    this.f.d();
                    return c;
                }
                m74 e = e(j);
                this.f.d();
                return e;
            } catch (Throwable th) {
                this.f.d();
                throw th;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                uk8.c(this.f, false, 1, null);
                super.close();
                this.b.b(null);
                this.g = false;
            } finally {
                this.f.d();
            }
        }

        public final m74 e(SQLiteDatabase sQLiteDatabase) {
            z65.h(sQLiteDatabase, "sqLiteDatabase");
            return h.a(this.b, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            z65.h(sQLiteDatabase, "db");
            if (!this.e && this.c.a != sQLiteDatabase.getVersion()) {
                sQLiteDatabase.setMaxSqlCacheSize(1);
            }
            try {
                this.c.b(e(sQLiteDatabase));
            } catch (Throwable th) {
                throw new a(b.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            z65.h(sQLiteDatabase, "sqLiteDatabase");
            try {
                this.c.d(e(sQLiteDatabase));
            } catch (Throwable th) {
                throw new a(b.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            z65.h(sQLiteDatabase, "db");
            this.e = true;
            try {
                this.c.e(e(sQLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new a(b.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            z65.h(sQLiteDatabase, "db");
            if (!this.e) {
                try {
                    this.c.f(e(sQLiteDatabase));
                } catch (Throwable th) {
                    throw new a(b.ON_OPEN, th);
                }
            }
            this.g = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            z65.h(sQLiteDatabase, "sqLiteDatabase");
            this.e = true;
            try {
                this.c.g(e(sQLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new a(b.ON_UPGRADE, th);
            }
        }
    }

    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ln74$c;", "a", "()Ln74$c;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: n74$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function0<c> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final c invoke() {
            c cVar;
            if (Build.VERSION.SDK_INT >= 23 && n74.this.b != null && n74.this.d) {
                cVar = new c(n74.this.a, new File(v2b.a(n74.this.a), n74.this.b).getAbsolutePath(), new b(null), n74.this.c, n74.this.e);
            } else {
                cVar = new c(n74.this.a, n74.this.b, new b(null), n74.this.c, n74.this.e);
            }
            t2b.f(cVar, n74.this.g);
            return cVar;
        }
    }

    public n74(Context context, String str, z2b.a aVar, boolean z, boolean z2) {
        rn5<c> b2;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(aVar, "callback");
        this.a = context;
        this.b = str;
        this.c = aVar;
        this.d = z;
        this.e = z2;
        b2 = yn5.b(new d());
        this.f = b2;
    }

    private final c k() {
        return this.f.getValue();
    }

    @Override // defpackage.z2b, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f.isInitialized()) {
            k().close();
        }
    }

    @Override // defpackage.z2b
    public String getDatabaseName() {
        return this.b;
    }

    @Override // defpackage.z2b
    public y2b l1() {
        return k().c(true);
    }

    @Override // defpackage.z2b
    public void setWriteAheadLoggingEnabled(boolean z) {
        if (this.f.isInitialized()) {
            t2b.f(k(), z);
        }
        this.g = z;
    }
}
