package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Autofill.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\tJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR$\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R%\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001c"}, d2 = {"Lk40;", "", "other", "", "equals", "", "hashCode", "", "Lm40;", "a", "Ljava/util/List;", "()Ljava/util/List;", "autofillTypes", "Lk99;", "b", "Lk99;", "()Lk99;", "setBoundingBox", "(Lk99;)V", "boundingBox", "Lkotlin/Function1;", "", "", c.a, "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "onFill", DateTokenConverter.CONVERTER_KEY, "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: k40  reason: default package */
/* loaded from: classes.dex */
public final class k40 {
    public static final a d = new a(null);
    public static final int e = 8;
    private final List<m40> a;
    private k99 b;
    private final Function1<String, Unit> c;

    /* compiled from: Autofill.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lk40$a;", "", "", "previousId", "I", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: k40$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final List<m40> a() {
        return this.a;
    }

    public final k99 b() {
        return this.b;
    }

    public final Function1<String, Unit> c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k40)) {
            return false;
        }
        k40 k40Var = (k40) obj;
        if (z65.c(this.a, k40Var.a) && z65.c(this.b, k40Var.b) && z65.c(this.c, k40Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        k99 k99Var = this.b;
        int i2 = 0;
        if (k99Var != null) {
            i = k99Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        Function1<String, Unit> function1 = this.c;
        if (function1 != null) {
            i2 = function1.hashCode();
        }
        return i3 + i2;
    }
}
