package defpackage;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: RecyclerViewWithSwipeEnd.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0006H&¨\u0006\r"}, d2 = {"Lo3b;", "", "Landroid/view/View;", "view", "", "progress", "", c.a, DateTokenConverter.CONVERTER_KEY, "", "isCompleted", "a", "b", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: o3b  reason: default package */
/* loaded from: classes2.dex */
public interface o3b {

    /* compiled from: RecyclerViewWithSwipeEnd.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o3b$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(o3b o3bVar, View view) {
            z65.h(view, "view");
        }

        public static void b(o3b o3bVar, View view, float f) {
            z65.h(view, "view");
        }
    }

    void a(boolean z);

    void b();

    void c(View view, float f);

    void d(View view);
}
