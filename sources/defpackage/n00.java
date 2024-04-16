package defpackage;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: AutoClosingRoomOpenHelper.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\b\u000e\u0012B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\b\u0010\u0007\u001a\u00020\u0005H\u0016R\u001a\u0010\f\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Ln00;", "Lz2b;", "Lgu2;", "", "enabled", "", "setWriteAheadLoggingEnabled", "close", "a", "Lz2b;", "Z0", "()Lz2b;", "delegate", "Lm00;", "b", "Lm00;", "autoCloser", "Ln00$a;", com.huawei.hms.opendevice.c.a, "Ln00$a;", "autoClosingDb", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Ly2b;", "l1", "()Ly2b;", "writableDatabase", "<init>", "(Lz2b;Lm00;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: n00  reason: default package */
/* loaded from: classes.dex */
public final class n00 implements z2b, gu2 {
    private final z2b a;
    public final m00 b;
    private final a c;

    /* compiled from: AutoClosingRoomOpenHelper.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020\u001f¢\u0006\u0004\b.\u0010/J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J)\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00042\u0010\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0016H\u0016J\u001a\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0017J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J)\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00120\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0002H\u0016R\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\"\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010&\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010#R(\u0010-\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040*\u0018\u00010)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Ln00$a;", "Ly2b;", "", "a", "", "sql", "Lc3b;", "R0", "beginTransaction", "Z", "g0", "X", "", Image.TYPE_HIGH, SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "m1", "", "", "bindArgs", "H0", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Lb3b;", "t", "Landroid/os/CancellationSignal;", "cancellationSignal", "d1", "C", "Y", "(Ljava/lang/String;[Ljava/lang/Object;)V", "close", "Lm00;", "Lm00;", "autoCloser", "isOpen", "()Z", "getPath", "()Ljava/lang/String;", "path", "M1", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "A", "()Ljava/util/List;", "attachedDbs", "<init>", "(Lm00;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: n00$a */
    /* loaded from: classes.dex */
    public static final class a implements y2b {
        private final m00 a;

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0005\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly2b;", "obj", "", "Landroid/util/Pair;", "", "a", "(Ly2b;)Ljava/util/List;"}, k = 3, mv = {1, 7, 1})
        /* renamed from: n00$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0448a extends ej5 implements Function1<y2b, List<? extends Pair<String, String>>> {
            public static final C0448a a = new C0448a();

            C0448a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<Pair<String, String>> invoke(y2b y2bVar) {
                z65.h(y2bVar, "obj");
                return y2bVar.A();
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly2b;", "db", "", "a", "(Ly2b;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
        /* renamed from: n00$a$b */
        /* loaded from: classes.dex */
        static final class b extends ej5 implements Function1<y2b, Object> {
            final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(1);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Object invoke(y2b y2bVar) {
                z65.h(y2bVar, "db");
                y2bVar.C(this.a);
                return null;
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly2b;", "db", "", "a", "(Ly2b;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
        /* renamed from: n00$a$c */
        /* loaded from: classes.dex */
        static final class c extends ej5 implements Function1<y2b, Object> {
            final /* synthetic */ String a;
            final /* synthetic */ Object[] b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str, Object[] objArr) {
                super(1);
                this.a = str;
                this.b = objArr;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Object invoke(y2b y2bVar) {
                z65.h(y2bVar, "db");
                y2bVar.Y(this.a, this.b);
                return null;
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: n00$a$d */
        /* loaded from: classes.dex */
        /* synthetic */ class d extends m94 implements Function1<y2b, Boolean> {
            public static final d a = new d();

            d() {
                super(1, y2b.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final Boolean invoke(y2b y2bVar) {
                z65.h(y2bVar, "p0");
                return Boolean.valueOf(y2bVar.h());
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly2b;", "db", "", "a", "(Ly2b;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
        /* renamed from: n00$a$e */
        /* loaded from: classes.dex */
        static final class e extends ej5 implements Function1<y2b, Boolean> {
            public static final e a = new e();

            e() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(y2b y2bVar) {
                z65.h(y2bVar, "db");
                return Boolean.valueOf(y2bVar.M1());
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly2b;", "obj", "", "a", "(Ly2b;)Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
        /* renamed from: n00$a$f */
        /* loaded from: classes.dex */
        static final class f extends ej5 implements Function1<y2b, String> {
            public static final f a = new f();

            f() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final String invoke(y2b y2bVar) {
                z65.h(y2bVar, "obj");
                return y2bVar.getPath();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly2b;", "it", "", "a", "(Ly2b;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
        /* renamed from: n00$a$g */
        /* loaded from: classes.dex */
        public static final class g extends ej5 implements Function1<y2b, Object> {
            public static final g a = new g();

            g() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Object invoke(y2b y2bVar) {
                z65.h(y2bVar, "it");
                return null;
            }
        }

        public a(m00 m00Var) {
            z65.h(m00Var, "autoCloser");
            this.a = m00Var;
        }

        @Override // defpackage.y2b
        public List<Pair<String, String>> A() {
            return (List) this.a.g(C0448a.a);
        }

        @Override // defpackage.y2b
        public void C(String str) throws SQLException {
            z65.h(str, "sql");
            this.a.g(new b(str));
        }

        @Override // defpackage.y2b
        public Cursor H0(String str, Object[] objArr) {
            z65.h(str, SearchIntents.EXTRA_QUERY);
            z65.h(objArr, "bindArgs");
            try {
                return new c(this.a.j().H0(str, objArr), this.a);
            } catch (Throwable th) {
                this.a.e();
                throw th;
            }
        }

        @Override // defpackage.y2b
        public boolean M1() {
            return ((Boolean) this.a.g(e.a)).booleanValue();
        }

        @Override // defpackage.y2b
        public c3b R0(String str) {
            z65.h(str, "sql");
            return new b(str, this.a);
        }

        @Override // defpackage.y2b
        public void X() {
            Unit unit;
            y2b h = this.a.h();
            if (h != null) {
                h.X();
                unit = Unit.a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
            throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null".toString());
        }

        @Override // defpackage.y2b
        public void Y(String str, Object[] objArr) throws SQLException {
            z65.h(str, "sql");
            z65.h(objArr, "bindArgs");
            this.a.g(new c(str, objArr));
        }

        @Override // defpackage.y2b
        public void Z() {
            try {
                this.a.j().Z();
            } catch (Throwable th) {
                this.a.e();
                throw th;
            }
        }

        public final void a() {
            this.a.g(g.a);
        }

        @Override // defpackage.y2b
        public void beginTransaction() {
            try {
                this.a.j().beginTransaction();
            } catch (Throwable th) {
                this.a.e();
                throw th;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.a.d();
        }

        @Override // defpackage.y2b
        public Cursor d1(b3b b3bVar, CancellationSignal cancellationSignal) {
            z65.h(b3bVar, SearchIntents.EXTRA_QUERY);
            try {
                return new c(this.a.j().d1(b3bVar, cancellationSignal), this.a);
            } catch (Throwable th) {
                this.a.e();
                throw th;
            }
        }

        @Override // defpackage.y2b
        public void g0() {
            if (this.a.h() != null) {
                try {
                    y2b h = this.a.h();
                    z65.e(h);
                    h.g0();
                    return;
                } finally {
                    this.a.e();
                }
            }
            throw new IllegalStateException("End transaction called but delegateDb is null".toString());
        }

        @Override // defpackage.y2b
        public String getPath() {
            return (String) this.a.g(f.a);
        }

        @Override // defpackage.y2b
        public boolean h() {
            if (this.a.h() == null) {
                return false;
            }
            return ((Boolean) this.a.g(d.a)).booleanValue();
        }

        @Override // defpackage.y2b
        public boolean isOpen() {
            y2b h = this.a.h();
            if (h == null) {
                return false;
            }
            return h.isOpen();
        }

        @Override // defpackage.y2b
        public Cursor m1(String str) {
            z65.h(str, SearchIntents.EXTRA_QUERY);
            try {
                return new c(this.a.j().m1(str), this.a);
            } catch (Throwable th) {
                this.a.e();
                throw th;
            }
        }

        @Override // defpackage.y2b
        public Cursor t(b3b b3bVar) {
            z65.h(b3bVar, SearchIntents.EXTRA_QUERY);
            try {
                return new c(this.a.j().t(b3bVar), this.a);
            } catch (Throwable th) {
                this.a.e();
                throw th;
            }
        }
    }

    /* compiled from: AutoClosingRoomOpenHelper.kt */
    @Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010G\u001a\u00020\u0001\u0012\u0006\u0010K\u001a\u00020H¢\u0006\u0004\bL\u0010MJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\u0096\u0001J\t\u0010\t\u001a\u00020\u0007H\u0097\u0001J\u0019\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\n0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\t\u0010\f\u001a\u00020\u0002H\u0096\u0001J\u0019\u0010\u000e\u001a\u00020\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\r0\rH\u0096\u0001J\u0019\u0010\u000f\u001a\u00020\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\r0\rH\u0096\u0001J\u0019\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\r0\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J6\u0010\u0012\u001a(\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\r0\r \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\r0\r\u0018\u00010\u00110\u0011H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\u0018\u001a\n \u0005*\u0004\u0018\u00010\u00170\u0017H\u0096\u0001J\u0011\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\t\u0010\u001e\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0019\u0010!\u001a\n \u0005*\u0004\u0018\u00010\r0\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\"\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\t\u0010$\u001a\u00020#H\u0096\u0001J\t\u0010%\u001a\u00020#H\u0096\u0001J\t\u0010&\u001a\u00020#H\u0096\u0001J\t\u0010'\u001a\u00020#H\u0096\u0001J\t\u0010(\u001a\u00020#H\u0096\u0001J\t\u0010)\u001a\u00020#H\u0096\u0001J\u0011\u0010*\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010+\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\t\u0010,\u001a\u00020#H\u0096\u0001J\t\u0010-\u001a\u00020#H\u0096\u0001J\t\u0010.\u001a\u00020#H\u0096\u0001J\u0011\u0010/\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\t\u00100\u001a\u00020#H\u0096\u0001J\u0019\u00102\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010101H\u0096\u0001J\u0019\u00104\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010303H\u0096\u0001J\t\u00105\u001a\u00020#H\u0097\u0001J!\u00106\u001a\n \u0005*\u0004\u0018\u00010\u00170\u00172\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00170\u0017H\u0096\u0001J)\u00109\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u000107072\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010808H\u0096\u0001J\u0019\u0010:\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010101H\u0096\u0001J\u0019\u0010;\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010303H\u0096\u0001J\b\u0010<\u001a\u00020\u0007H\u0016J\u001e\u0010@\u001a\u00020\u00072\u0006\u0010=\u001a\u0002072\f\u0010?\u001a\b\u0012\u0004\u0012\u0002080>H\u0017J\b\u0010A\u001a\u000208H\u0017J\u000e\u0010B\u001a\b\u0012\u0004\u0012\u0002080>H\u0017J\u0010\u0010D\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u0017H\u0017R\u0014\u0010G\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006N"}, d2 = {"Ln00$c;", "Landroid/database/Cursor;", "", "p0", "Landroid/database/CharArrayBuffer;", "kotlin.jvm.PlatformType", "p1", "", "copyStringToBuffer", "deactivate", "", "getBlob", "getColumnCount", "", "getColumnIndex", "getColumnIndexOrThrow", "getColumnName", "", "getColumnNames", "()[Ljava/lang/String;", "getCount", "", "getDouble", "Landroid/os/Bundle;", "getExtras", "", "getFloat", "getInt", "", "getLong", "getPosition", "", "getShort", "getString", "getType", "", "getWantsAllOnMoveCalls", "isAfterLast", "isBeforeFirst", "isClosed", "isFirst", "isLast", "isNull", "move", "moveToFirst", "moveToLast", "moveToNext", "moveToPosition", "moveToPrevious", "Landroid/database/ContentObserver;", "registerContentObserver", "Landroid/database/DataSetObserver;", "registerDataSetObserver", "requery", "respond", "Landroid/content/ContentResolver;", "Landroid/net/Uri;", "setNotificationUri", "unregisterContentObserver", "unregisterDataSetObserver", "close", "cr", "", "uris", "setNotificationUris", "getNotificationUri", "getNotificationUris", "extras", "setExtras", "a", "Landroid/database/Cursor;", "delegate", "Lm00;", "b", "Lm00;", "autoCloser", "<init>", "(Landroid/database/Cursor;Lm00;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: n00$c */
    /* loaded from: classes.dex */
    private static final class c implements Cursor {
        private final Cursor a;
        private final m00 b;

        public c(Cursor cursor, m00 m00Var) {
            z65.h(cursor, "delegate");
            z65.h(m00Var, "autoCloser");
            this.a = cursor;
            this.b = m00Var;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.a.close();
            this.b.e();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
            this.a.copyStringToBuffer(i, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.a.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i) {
            return this.a.getBlob(i);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.a.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.a.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.a.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i) {
            return this.a.getColumnName(i);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.a.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.a.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i) {
            return this.a.getDouble(i);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.a.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i) {
            return this.a.getFloat(i);
        }

        @Override // android.database.Cursor
        public int getInt(int i) {
            return this.a.getInt(i);
        }

        @Override // android.database.Cursor
        public long getLong(int i) {
            return this.a.getLong(i);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return u2b.a(this.a);
        }

        @Override // android.database.Cursor
        public List<Uri> getNotificationUris() {
            return x2b.a(this.a);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.a.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i) {
            return this.a.getShort(i);
        }

        @Override // android.database.Cursor
        public String getString(int i) {
            return this.a.getString(i);
        }

        @Override // android.database.Cursor
        public int getType(int i) {
            return this.a.getType(i);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.a.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.a.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.a.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.a.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.a.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.a.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i) {
            return this.a.isNull(i);
        }

        @Override // android.database.Cursor
        public boolean move(int i) {
            return this.a.move(i);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.a.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.a.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.a.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i) {
            return this.a.moveToPosition(i);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.a.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.a.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.a.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.a.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.a.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle bundle) {
            z65.h(bundle, "extras");
            w2b.a(this.a, bundle);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.a.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver contentResolver, List<? extends Uri> list) {
            z65.h(contentResolver, "cr");
            z65.h(list, "uris");
            x2b.b(this.a, contentResolver, list);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.a.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public n00(z2b z2bVar, m00 m00Var) {
        z65.h(z2bVar, "delegate");
        z65.h(m00Var, "autoCloser");
        this.a = z2bVar;
        this.b = m00Var;
        m00Var.k(Z0());
        this.c = new a(m00Var);
    }

    @Override // defpackage.gu2
    public z2b Z0() {
        return this.a;
    }

    @Override // defpackage.z2b, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.c.close();
    }

    @Override // defpackage.z2b
    public String getDatabaseName() {
        return this.a.getDatabaseName();
    }

    @Override // defpackage.z2b
    public y2b l1() {
        this.c.a();
        return this.c;
    }

    @Override // defpackage.z2b
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.a.setWriteAheadLoggingEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AutoClosingRoomOpenHelper.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0018\u0012\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b'\u0010(J)\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0001H\u0002J\u001a\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0011H\u0016J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0016H\u0016J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0018H\u0016J\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u001aH\u0016R\u0014\u0010\u001e\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R(\u0010&\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f0#j\n\u0012\u0006\u0012\u0004\u0018\u00010\f`$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%¨\u0006)"}, d2 = {"Ln00$b;", "Lc3b;", "T", "Lkotlin/Function1;", "block", e.a, "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "supportSQLiteStatement", "", com.huawei.hms.opendevice.c.a, "", "bindIndex", "", "value", "i", "close", "I", "", "D0", "index", "z1", "c1", "", "O", "", "L0", "", "h1", "a", "Ljava/lang/String;", "sql", "Lm00;", "b", "Lm00;", "autoCloser", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "binds", "<init>", "(Ljava/lang/String;Lm00;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: n00$b */
    /* loaded from: classes.dex */
    public static final class b implements c3b {
        private final String a;
        private final m00 b;
        private final ArrayList<Object> c;

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc3b;", "obj", "", "a", "(Lc3b;)Ljava/lang/Long;"}, k = 3, mv = {1, 7, 1})
        /* renamed from: n00$b$a */
        /* loaded from: classes.dex */
        static final class a extends ej5 implements Function1<c3b, Long> {
            public static final a a = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Long invoke(c3b c3bVar) {
                z65.h(c3bVar, "obj");
                return Long.valueOf(c3bVar.D0());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ly2b;", "db", "a", "(Ly2b;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
        /* renamed from: n00$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0449b<T> extends ej5 implements Function1<y2b, T> {
            final /* synthetic */ Function1<c3b, T> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0449b(Function1<? super c3b, ? extends T> function1) {
                super(1);
                this.b = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final T invoke(y2b y2bVar) {
                z65.h(y2bVar, "db");
                c3b R0 = y2bVar.R0(b.this.a);
                b.this.c(R0);
                return this.b.invoke(R0);
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc3b;", "obj", "", "a", "(Lc3b;)Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1})
        /* renamed from: n00$b$c */
        /* loaded from: classes.dex */
        static final class c extends ej5 implements Function1<c3b, Integer> {
            public static final c a = new c();

            c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Integer invoke(c3b c3bVar) {
                z65.h(c3bVar, "obj");
                return Integer.valueOf(c3bVar.I());
            }
        }

        public b(String str, m00 m00Var) {
            z65.h(str, "sql");
            z65.h(m00Var, "autoCloser");
            this.a = str;
            this.b = m00Var;
            this.c = new ArrayList<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(c3b c3bVar) {
            Iterator<T> it = this.c.iterator();
            int i = 0;
            while (it.hasNext()) {
                it.next();
                int i2 = i + 1;
                if (i < 0) {
                    kc1.v();
                }
                Object obj = this.c.get(i);
                if (obj == null) {
                    c3bVar.z1(i2);
                } else if (obj instanceof Long) {
                    c3bVar.c1(i2, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    c3bVar.O(i2, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    c3bVar.L0(i2, (String) obj);
                } else if (obj instanceof byte[]) {
                    c3bVar.h1(i2, (byte[]) obj);
                }
                i = i2;
            }
        }

        private final <T> T e(Function1<? super c3b, ? extends T> function1) {
            return (T) this.b.g(new C0449b(function1));
        }

        private final void i(int i, Object obj) {
            int size;
            int i2 = i - 1;
            if (i2 >= this.c.size() && (size = this.c.size()) <= i2) {
                while (true) {
                    this.c.add(null);
                    if (size == i2) {
                        break;
                    }
                    size++;
                }
            }
            this.c.set(i2, obj);
        }

        @Override // defpackage.c3b
        public long D0() {
            return ((Number) e(a.a)).longValue();
        }

        @Override // defpackage.c3b
        public int I() {
            return ((Number) e(c.a)).intValue();
        }

        @Override // defpackage.a3b
        public void L0(int i, String str) {
            z65.h(str, "value");
            i(i, str);
        }

        @Override // defpackage.a3b
        public void O(int i, double d) {
            i(i, Double.valueOf(d));
        }

        @Override // defpackage.a3b
        public void c1(int i, long j) {
            i(i, Long.valueOf(j));
        }

        @Override // defpackage.a3b
        public void h1(int i, byte[] bArr) {
            z65.h(bArr, "value");
            i(i, bArr);
        }

        @Override // defpackage.a3b
        public void z1(int i) {
            i(i, null);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }
}
