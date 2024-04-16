package cloud.mindbox.mobile_sdk.repository;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MindboxDatabase.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\n"}, d2 = {"Lcloud/mindbox/mobile_sdk/repository/MindboxDatabase;", "Lun9;", "Lfq1;", "F", "Lml3;", "G", "<init>", "()V", "p", "b", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class MindboxDatabase extends un9 {
    public static final b p = new b(null);
    private static final a q = new a();
    private static boolean r;

    /* compiled from: MindboxDatabase.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"cloud/mindbox/mobile_sdk/repository/MindboxDatabase$a", "Lbj6;", "Ly2b;", "database", "", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a extends bj6 {
        a() {
            super(1, 2);
        }

        @Override // defpackage.bj6
        public void a(y2b y2bVar) {
            z65.h(y2bVar, "database");
            y2bVar.C("ALTER TABLE mindbox_configuration_table ADD COLUMN shouldCreateCustomer INTEGER NOT NULL DEFAULT 1");
        }
    }

    /* compiled from: MindboxDatabase.kt */
    @Metadata(d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0006*\u0001\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcloud/mindbox/mobile_sdk/repository/MindboxDatabase$b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcloud/mindbox/mobile_sdk/repository/MindboxDatabase;", "a", "(Landroid/content/Context;)Lcloud/mindbox/mobile_sdk/repository/MindboxDatabase;", "", "isTestMode", "Z", "b", "()Z", "setTestMode$sdk_release", "(Z)V", "", "DATABASE_NAME", "Ljava/lang/String;", "cloud/mindbox/mobile_sdk/repository/MindboxDatabase$a", "MIGRATION_1_2", "Lcloud/mindbox/mobile_sdk/repository/MindboxDatabase$a;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MindboxDatabase a(Context context) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            if (!b()) {
                Context applicationContext = context.getApplicationContext();
                z65.g(applicationContext, "context.applicationContext");
                return (MindboxDatabase) tn9.a(applicationContext, MindboxDatabase.class, "mindbox_db").b(MindboxDatabase.q).d();
            }
            Context applicationContext2 = context.getApplicationContext();
            z65.g(applicationContext2, "context.applicationContext");
            return (MindboxDatabase) tn9.c(applicationContext2, MindboxDatabase.class).c().d();
        }

        public final boolean b() {
            return MindboxDatabase.r;
        }
    }

    public abstract fq1 F();

    public abstract ml3 G();
}
