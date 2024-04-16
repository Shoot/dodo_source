package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TextDecoration.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\nB\u0011\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\u0007\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lkab;", "", "other", "", DateTokenConverter.CONVERTER_KEY, "", "toString", "equals", "", "hashCode", "a", "I", e.a, "()I", "mask", "<init>", "(I)V", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: kab  reason: default package */
/* loaded from: classes.dex */
public final class kab {
    public static final a b = new a(null);
    private static final kab c = new kab(0);
    private static final kab d = new kab(1);
    private static final kab e = new kab(2);
    private final int a;

    /* compiled from: TextDecoration.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006¨\u0006\u0010"}, d2 = {"Lkab$a;", "", "Lkab;", "None", "Lkab;", "b", "()Lkab;", "getNone$annotations", "()V", "Underline", c.a, "getUnderline$annotations", "LineThrough", "a", "getLineThrough$annotations", "<init>", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: kab$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kab a() {
            return kab.e;
        }

        public final kab b() {
            return kab.c;
        }

        public final kab c() {
            return kab.d;
        }
    }

    public kab(int i) {
        this.a = i;
    }

    public final boolean d(kab kabVar) {
        z65.h(kabVar, "other");
        int i = this.a;
        if ((kabVar.a | i) == i) {
            return true;
        }
        return false;
    }

    public final int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof kab) && this.a == ((kab) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        if (this.a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.a & d.a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.a & e.a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + n8b.d(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
