package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Locale.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u000bB\u0011\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016R\u001a\u0010\u000e\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0013"}, d2 = {"Lis5;", "", "", "b", "other", "", "equals", "", "hashCode", "toString", "Lec8;", "a", "Lec8;", "()Lec8;", "platformLocale", "<init>", "(Lec8;)V", "languageTag", "(Ljava/lang/String;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: is5  reason: default package */
/* loaded from: classes.dex */
public final class is5 {
    public static final a b = new a(null);
    private final ec8 a;

    /* compiled from: Locale.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lis5$a;", "", "Lis5;", "a", "()Lis5;", "current", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: is5$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final is5 a() {
            return gc8.a().b().g(0);
        }
    }

    public is5(ec8 ec8Var) {
        z65.h(ec8Var, "platformLocale");
        this.a = ec8Var;
    }

    public final ec8 a() {
        return this.a;
    }

    public final String b() {
        return this.a.a();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof is5)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return z65.c(b(), ((is5) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public is5(String str) {
        this(gc8.a().a(str));
        z65.h(str, "languageTag");
    }
}
