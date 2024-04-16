package defpackage;

import android.widget.ListView;
import androidx.annotation.NonNull;
/* compiled from: ListViewCompat.java */
/* renamed from: jr5  reason: default package */
/* loaded from: classes.dex */
public final class jr5 {

    /* compiled from: ListViewCompat.java */
    /* renamed from: jr5$a */
    /* loaded from: classes.dex */
    static class a {
        static boolean a(ListView listView, int i) {
            return listView.canScrollList(i);
        }

        static void b(ListView listView, int i) {
            listView.scrollListBy(i);
        }
    }

    public static boolean a(@NonNull ListView listView, int i) {
        return a.a(listView, i);
    }

    public static void b(@NonNull ListView listView, int i) {
        a.b(listView, i);
    }
}
