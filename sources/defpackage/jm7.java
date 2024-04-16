package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Outline.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Ljm7;", "", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, "Ljm7$a;", "Ljm7$b;", "Ljm7$c;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: jm7  reason: default package */
/* loaded from: classes.dex */
public abstract class jm7 {

    /* compiled from: Outline.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Ljm7$a;", "Ljm7;", "", "other", "", "equals", "", "hashCode", "Lor7;", "a", "Lor7;", "()Lor7;", "path", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: jm7$a */
    /* loaded from: classes.dex */
    public static final class a extends jm7 {
        private final or7 a;

        public final or7 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && z65.c(this.a, ((a) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* compiled from: Outline.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"Ljm7$b;", "Ljm7;", "", "other", "", "equals", "", "hashCode", "Lk99;", "a", "Lk99;", "()Lk99;", "rect", "<init>", "(Lk99;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: jm7$b */
    /* loaded from: classes.dex */
    public static final class b extends jm7 {
        private final k99 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k99 k99Var) {
            super(null);
            z65.h(k99Var, "rect");
            this.a = k99Var;
        }

        public final k99 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && z65.c(this.a, ((b) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* compiled from: Outline.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Ljm7$c;", "Ljm7;", "", "other", "", "equals", "", "hashCode", "Lgo9;", "a", "Lgo9;", "()Lgo9;", "roundRect", "Lor7;", "b", "Lor7;", "()Lor7;", "roundRectPath", "<init>", "(Lgo9;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: jm7$c */
    /* loaded from: classes.dex */
    public static final class c extends jm7 {
        private final go9 a;
        private final or7 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(go9 go9Var) {
            super(null);
            z65.h(go9Var, "roundRect");
            or7 or7Var = null;
            this.a = go9Var;
            if (!km7.a(go9Var)) {
                or7Var = ji.a();
                or7Var.h(go9Var);
            }
            this.b = or7Var;
        }

        public final go9 a() {
            return this.a;
        }

        public final or7 b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && z65.c(this.a, ((c) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    private jm7() {
    }

    public /* synthetic */ jm7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
