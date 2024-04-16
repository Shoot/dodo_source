package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.un9;
import defpackage.z2b;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Metadata;
/* compiled from: DatabaseConfiguration.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001BÏ\u0001\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010'\u001a\u00020\"\u0012\b\u0010+\u001a\u0004\u0018\u00010(\u0012\u0006\u0010-\u001a\u00020\u0005\u0012\u0006\u0010/\u001a\u00020\u0005\u0012\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000100\u0012\b\u00105\u001a\u0004\u0018\u00010\n\u0012\b\u00109\u001a\u0004\u0018\u000106\u0012\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010:\u0012\b\u0010F\u001a\u0004\u0018\u00010E\u0012\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016\u0012\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0004\bG\u0010HJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010+\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001cR\u0014\u0010/\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010\u001cR\u001c\u00103\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010\fR\u0016\u00109\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010>\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0019R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0019R\u0014\u0010D\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010\u001c¨\u0006I"}, d2 = {"Lyl2;", "", "", "fromVersion", "toVersion", "", "a", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "Ljava/lang/String;", Action.NAME_ATTRIBUTE, "Lz2b$c;", c.a, "Lz2b$c;", "sqliteOpenHelperFactory", "Lun9$e;", DateTokenConverter.CONVERTER_KEY, "Lun9$e;", "migrationContainer", "", "Lun9$b;", e.a, "Ljava/util/List;", "callbacks", "f", "Z", "allowMainThreadQueries", "Lun9$d;", "g", "Lun9$d;", "journalMode", "Ljava/util/concurrent/Executor;", Image.TYPE_HIGH, "Ljava/util/concurrent/Executor;", "queryExecutor", "i", "transactionExecutor", "Landroid/content/Intent;", "j", "Landroid/content/Intent;", "multiInstanceInvalidationServiceIntent", "k", "requireMigration", "l", "allowDestructiveMigrationOnDowngrade", "", Image.TYPE_MEDIUM, "Ljava/util/Set;", "migrationNotRequiredFrom", "n", "copyFromAssetPath", "Ljava/io/File;", "o", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "p", "Ljava/util/concurrent/Callable;", "copyFromInputStream", "q", "typeConverters", "r", "autoMigrationSpecs", Image.TYPE_SMALL, "multiInstanceInvalidation", "Lun9$f;", "prepackagedDatabaseCallback", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lz2b$c;Lun9$e;Ljava/util/List;ZLun9$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Lun9$f;Ljava/util/List;Ljava/util/List;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: yl2  reason: default package */
/* loaded from: classes.dex */
public class yl2 {
    public final Context a;
    public final String b;
    public final z2b.c c;
    public final un9.e d;
    public final List<un9.b> e;
    public final boolean f;
    public final un9.d g;
    public final Executor h;
    public final Executor i;
    public final Intent j;
    public final boolean k;
    public final boolean l;
    private final Set<Integer> m;
    public final String n;
    public final File o;
    public final Callable<InputStream> p;
    public final List<Object> q;
    public final List<Object> r;
    public final boolean s;

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"LambdaLast"})
    public yl2(Context context, String str, z2b.c cVar, un9.e eVar, List<? extends un9.b> list, boolean z, un9.d dVar, Executor executor, Executor executor2, Intent intent, boolean z2, boolean z3, Set<Integer> set, String str2, File file, Callable<InputStream> callable, un9.f fVar, List<? extends Object> list2, List<Object> list3) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(cVar, "sqliteOpenHelperFactory");
        z65.h(eVar, "migrationContainer");
        z65.h(dVar, "journalMode");
        z65.h(executor, "queryExecutor");
        z65.h(executor2, "transactionExecutor");
        z65.h(list2, "typeConverters");
        z65.h(list3, "autoMigrationSpecs");
        this.a = context;
        this.b = str;
        this.c = cVar;
        this.d = eVar;
        this.e = list;
        this.f = z;
        this.g = dVar;
        this.h = executor;
        this.i = executor2;
        this.j = intent;
        this.k = z2;
        this.l = z3;
        this.m = set;
        this.n = str2;
        this.o = file;
        this.p = callable;
        this.q = list2;
        this.r = list3;
        this.s = intent != null;
    }

    public boolean a(int i, int i2) {
        if ((i > i2 && this.l) || !this.k) {
            return false;
        }
        Set<Integer> set = this.m;
        if (set != null && set.contains(Integer.valueOf(i))) {
            return false;
        }
        return true;
    }
}
