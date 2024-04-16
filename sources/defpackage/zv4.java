package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: VectorResources.android.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\u0005B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0019\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0086\u0002J\u0006\u0010\f\u001a\u00020\bR<\u0010\u0011\u001a*\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0\rj\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lzv4;", "", "Lzv4$b;", Action.KEY_ATTRIBUTE, "Lzv4$a;", "b", "", "configChanges", "", c.a, "imageVectorEntry", DateTokenConverter.CONVERTER_KEY, "a", "Ljava/util/HashMap;", "Ljava/lang/ref/WeakReference;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "map", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: zv4  reason: default package */
/* loaded from: classes.dex */
public final class zv4 {
    private final HashMap<b, WeakReference<a>> a = new HashMap<>();

    /* compiled from: VectorResources.android.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Lzv4$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lyv4;", "a", "Lyv4;", "b", "()Lyv4;", "imageVector", "I", "()I", "configFlags", "<init>", "(Lyv4;I)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zv4$a */
    /* loaded from: classes.dex */
    public static final class a {
        private final yv4 a;
        private final int b;

        public a(yv4 yv4Var, int i) {
            z65.h(yv4Var, "imageVector");
            this.a = yv4Var;
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final yv4 b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.a, aVar.a) && this.b == aVar.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b;
        }

        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.a + ", configFlags=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: VectorResources.android.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u000f\u001a\u00060\tR\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u000f\u001a\u00060\tR\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lzv4$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "a", "Landroid/content/res/Resources$Theme;", "getTheme", "()Landroid/content/res/Resources$Theme;", "theme", "b", "I", "getId", "()I", "id", "<init>", "(Landroid/content/res/Resources$Theme;I)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zv4$b */
    /* loaded from: classes.dex */
    public static final class b {
        private final Resources.Theme a;
        private final int b;

        public b(Resources.Theme theme, int i) {
            z65.h(theme, "theme");
            this.a = theme;
            this.b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (z65.c(this.a, bVar.a) && this.b == bVar.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b;
        }

        public String toString() {
            return "Key(theme=" + this.a + ", id=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public final void a() {
        this.a.clear();
    }

    public final a b(b bVar) {
        z65.h(bVar, Action.KEY_ATTRIBUTE);
        WeakReference<a> weakReference = this.a.get(bVar);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void c(int i) {
        Iterator<Map.Entry<b, WeakReference<a>>> it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<b, WeakReference<a>> next = it.next();
            z65.g(next, "it.next()");
            a aVar = next.getValue().get();
            if (aVar == null || Configuration.needNewResources(i, aVar.a())) {
                it.remove();
            }
        }
    }

    public final void d(b bVar, a aVar) {
        z65.h(bVar, Action.KEY_ATTRIBUTE);
        z65.h(aVar, "imageVectorEntry");
        this.a.put(bVar, new WeakReference<>(aVar));
    }
}
