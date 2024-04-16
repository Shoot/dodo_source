package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.gb;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RowColumnImpl.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \t2\u00020\u0001:\u0006\t\u000b\u000e\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H ¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0005\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lv22;", "", "", "size", "Lqm5;", "layoutDirection", "Lgb8;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILqm5;Lgb8;I)I", "b", "(Lgb8;)Ljava/lang/Integer;", "", com.huawei.hms.opendevice.c.a, "()Z", "isRelative", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "f", "Lv22$a;", "Lv22$c;", "Lv22$d;", "Lv22$e;", "Lv22$f;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: v22  reason: default package */
/* loaded from: classes.dex */
public abstract class v22 {
    public static final b a = new b(null);
    private static final v22 b = a.e;
    private static final v22 c = e.e;
    private static final v22 d = c.e;

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lv22$a;", "Lv22;", "", "size", "Lqm5;", "layoutDirection", "Lgb8;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILqm5;Lgb8;I)I", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: v22$a */
    /* loaded from: classes.dex */
    private static final class a extends v22 {
        public static final a e = new a();

        private a() {
            super(null);
        }

        @Override // defpackage.v22
        public int a(int i, qm5 qm5Var, gb8 gb8Var, int i2) {
            z65.h(qm5Var, "layoutDirection");
            z65.h(gb8Var, "placeable");
            return i / 2;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lv22$b;", "", "Lgb$c;", "vertical", "Lv22;", "b", "(Lgb$c;)Lv22;", "Lgb$b;", "horizontal", "a", "(Lgb$b;)Lv22;", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: v22$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v22 a(gb.b bVar) {
            z65.h(bVar, "horizontal");
            return new d(bVar);
        }

        public final v22 b(gb.c cVar) {
            z65.h(cVar, "vertical");
            return new f(cVar);
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lv22$c;", "Lv22;", "", "size", "Lqm5;", "layoutDirection", "Lgb8;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILqm5;Lgb8;I)I", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: v22$c */
    /* loaded from: classes.dex */
    private static final class c extends v22 {
        public static final c e = new c();

        private c() {
            super(null);
        }

        @Override // defpackage.v22
        public int a(int i, qm5 qm5Var, gb8 gb8Var, int i2) {
            z65.h(qm5Var, "layoutDirection");
            z65.h(gb8Var, "placeable");
            if (qm5Var != qm5.Ltr) {
                return 0;
            }
            return i;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lv22$d;", "Lv22;", "", "size", "Lqm5;", "layoutDirection", "Lgb8;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILqm5;Lgb8;I)I", "Lgb$b;", com.huawei.hms.push.e.a, "Lgb$b;", "getHorizontal", "()Lgb$b;", "horizontal", "<init>", "(Lgb$b;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: v22$d */
    /* loaded from: classes.dex */
    private static final class d extends v22 {
        private final gb.b e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(gb.b bVar) {
            super(null);
            z65.h(bVar, "horizontal");
            this.e = bVar;
        }

        @Override // defpackage.v22
        public int a(int i, qm5 qm5Var, gb8 gb8Var, int i2) {
            z65.h(qm5Var, "layoutDirection");
            z65.h(gb8Var, "placeable");
            return this.e.a(0, i, qm5Var);
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lv22$e;", "Lv22;", "", "size", "Lqm5;", "layoutDirection", "Lgb8;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILqm5;Lgb8;I)I", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: v22$e */
    /* loaded from: classes.dex */
    private static final class e extends v22 {
        public static final e e = new e();

        private e() {
            super(null);
        }

        @Override // defpackage.v22
        public int a(int i, qm5 qm5Var, gb8 gb8Var, int i2) {
            z65.h(qm5Var, "layoutDirection");
            z65.h(gb8Var, "placeable");
            if (qm5Var == qm5.Ltr) {
                return 0;
            }
            return i;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lv22$f;", "Lv22;", "", "size", "Lqm5;", "layoutDirection", "Lgb8;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILqm5;Lgb8;I)I", "Lgb$c;", com.huawei.hms.push.e.a, "Lgb$c;", "getVertical", "()Lgb$c;", "vertical", "<init>", "(Lgb$c;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: v22$f */
    /* loaded from: classes.dex */
    private static final class f extends v22 {
        private final gb.c e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(gb.c cVar) {
            super(null);
            z65.h(cVar, "vertical");
            this.e = cVar;
        }

        @Override // defpackage.v22
        public int a(int i, qm5 qm5Var, gb8 gb8Var, int i2) {
            z65.h(qm5Var, "layoutDirection");
            z65.h(gb8Var, "placeable");
            return this.e.a(0, i);
        }
    }

    public /* synthetic */ v22(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int a(int i, qm5 qm5Var, gb8 gb8Var, int i2);

    public Integer b(gb8 gb8Var) {
        z65.h(gb8Var, "placeable");
        return null;
    }

    public boolean c() {
        return false;
    }

    private v22() {
    }
}
