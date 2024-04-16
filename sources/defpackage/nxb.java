package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ImageVector.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002By\b\u0000\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0011\u0012\b\b\u0002\u0010\"\u001a\u00020\u0011\u0012\b\b\u0002\u0010%\u001a\u00020\u0011\u0012\b\b\u0002\u0010'\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020)0(\u0012\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0004\b0\u00101J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0096\u0002J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u001c\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u0017\u0010\u001f\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\"\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015R\u0017\u0010%\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b#\u0010\u0013\u001a\u0004\b$\u0010\u0015R\u0017\u0010'\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b&\u0010\u0015R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020)0(8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b#\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010+¨\u00062"}, d2 = {"Lnxb;", "Lpxb;", "", "", "iterator", "", "other", "", "equals", "", "hashCode", "", "a", "Ljava/lang/String;", Image.TYPE_HIGH, "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "", "b", "F", "t", "()F", "rotation", c.a, "k", "pivotX", DateTokenConverter.CONVERTER_KEY, "p", "pivotY", e.a, "u", "scaleX", "f", "v", "scaleY", "g", "x", "translationX", "z", "translationY", "", "Lzr7;", "i", "Ljava/util/List;", "()Ljava/util/List;", "clipPathData", "j", "children", "<init>", "(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: nxb  reason: default package */
/* loaded from: classes.dex */
public final class nxb extends pxb implements Iterable<pxb>, be5 {
    private final String a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final List<zr7> i;
    private final List<pxb> j;

    /* compiled from: ImageVector.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"nxb$a", "", "Lpxb;", "", "hasNext", "b", "a", "Ljava/util/Iterator;", "getIt", "()Ljava/util/Iterator;", "it", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: nxb$a */
    /* loaded from: classes.dex */
    public static final class a implements Iterator<pxb>, be5 {
        private final Iterator<pxb> a;

        a(nxb nxbVar) {
            this.a = nxbVar.j.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public pxb next() {
            return this.a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public nxb() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof nxb)) {
            nxb nxbVar = (nxb) obj;
            if (z65.c(this.a, nxbVar.a) && this.b == nxbVar.b && this.c == nxbVar.c && this.d == nxbVar.d && this.e == nxbVar.e && this.f == nxbVar.f && this.g == nxbVar.g && this.h == nxbVar.h && z65.c(this.i, nxbVar.i) && z65.c(this.j, nxbVar.j)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final List<zr7> g() {
        return this.i;
    }

    public final String h() {
        return this.a;
    }

    public int hashCode() {
        return (((((((((((((((((this.a.hashCode() * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h)) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<pxb> iterator() {
        return new a(this);
    }

    public final float k() {
        return this.c;
    }

    public final float p() {
        return this.d;
    }

    public final float t() {
        return this.b;
    }

    public final float u() {
        return this.e;
    }

    public final float v() {
        return this.f;
    }

    public final float x() {
        return this.g;
    }

    public final float z() {
        return this.h;
    }

    public /* synthetic */ nxb(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? 1.0f : f4, (i & 32) == 0 ? f5 : 1.0f, (i & 64) != 0 ? 0.0f : f6, (i & 128) == 0 ? f7 : 0.0f, (i & 256) != 0 ? oxb.e() : list, (i & 512) != 0 ? kc1.l() : list2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nxb(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends zr7> list, List<? extends pxb> list2) {
        super(null);
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(list, "clipPathData");
        z65.h(list2, "children");
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = list;
        this.j = list2;
    }
}
