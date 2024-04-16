package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import defpackage.tq5;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: LinkifyCompat.java */
/* renamed from: tq5  reason: default package */
/* loaded from: classes.dex */
public final class tq5 {
    private static final String[] a = new String[0];
    private static final Comparator<b> b = new Comparator() { // from class: sq5
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int j;
            j = tq5.j((tq5.b) obj, (tq5.b) obj2);
            return j;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinkifyCompat.java */
    /* renamed from: tq5$a */
    /* loaded from: classes.dex */
    public static class a {
        static void a(TextView textView, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
        }

        static boolean b(Spannable spannable, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            return Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LinkifyCompat.java */
    /* renamed from: tq5$b */
    /* loaded from: classes.dex */
    public static class b {
        URLSpan a;
        String b;
        int c;
        int d;

        b() {
        }
    }

    public static boolean b(@NonNull Spannable spannable, int i) {
        if (m()) {
            return Linkify.addLinks(spannable, i);
        }
        if (i == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            h(arrayList, spannable, hs7.h, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, null);
        }
        if ((i & 2) != 0) {
            h(arrayList, spannable, hs7.i, new String[]{"mailto:"}, null, null);
        }
        if ((i & 8) != 0) {
            i(arrayList, spannable);
        }
        l(arrayList, spannable);
        if (arrayList.size() == 0) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.a == null) {
                f(bVar.b, bVar.c, bVar.d, spannable);
            }
        }
        return true;
    }

    public static boolean c(@NonNull Spannable spannable, @NonNull Pattern pattern, String str) {
        if (m()) {
            return Linkify.addLinks(spannable, pattern, str);
        }
        return e(spannable, pattern, str, null, null, null);
    }

    public static boolean d(@NonNull Spannable spannable, @NonNull Pattern pattern, String str, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        if (m()) {
            return Linkify.addLinks(spannable, pattern, str, matchFilter, transformFilter);
        }
        return e(spannable, pattern, str, null, matchFilter, transformFilter);
    }

    public static boolean e(@NonNull Spannable spannable, @NonNull Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        String lowerCase;
        if (m()) {
            return a.b(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
        if (str == null) {
            str = "";
        }
        if (strArr == null || strArr.length < 1) {
            strArr = a;
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = str.toLowerCase(Locale.ROOT);
        int i = 0;
        while (i < strArr.length) {
            String str2 = strArr[i];
            i++;
            if (str2 == null) {
                lowerCase = "";
            } else {
                lowerCase = str2.toLowerCase(Locale.ROOT);
            }
            strArr2[i] = lowerCase;
        }
        Matcher matcher = pattern.matcher(spannable);
        boolean z = false;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) {
                if (group != null) {
                    f(k(group, strArr2, matcher, transformFilter), start, end, spannable);
                    z = true;
                }
            }
        }
        return z;
    }

    private static void f(String str, int i, int i2, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i, i2, 33);
    }

    private static String g(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            return WebView.findAddress(str);
        }
        return ev3.c(str);
    }

    private static void h(ArrayList<b> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) {
                if (group != null) {
                    b bVar = new b();
                    bVar.b = k(group, strArr, matcher, transformFilter);
                    bVar.c = start;
                    bVar.d = end;
                    arrayList.add(bVar);
                }
            }
        }
    }

    private static void i(ArrayList<b> arrayList, Spannable spannable) {
        int indexOf;
        String obj = spannable.toString();
        int i = 0;
        while (true) {
            try {
                String g = g(obj);
                if (g != null && (indexOf = obj.indexOf(g)) >= 0) {
                    b bVar = new b();
                    int length = g.length() + indexOf;
                    bVar.c = indexOf + i;
                    i += length;
                    bVar.d = i;
                    obj = obj.substring(length);
                    try {
                        String encode = URLEncoder.encode(g, "UTF-8");
                        bVar.b = "geo:0,0?q=" + encode;
                        arrayList.add(bVar);
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                return;
            } catch (UnsupportedOperationException unused2) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int j(b bVar, b bVar2) {
        int i = bVar.c;
        int i2 = bVar2.c;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return Integer.compare(bVar2.d, bVar.d);
    }

    private static String k(@NonNull String str, @NonNull String[] strArr, Matcher matcher, Linkify.TransformFilter transformFilter) {
        boolean z;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                String str2 = strArr[i];
                if (str.regionMatches(true, 0, str2, 0, str2.length())) {
                    z = true;
                    if (!str.regionMatches(false, 0, str2, 0, str2.length())) {
                        str = str2 + str.substring(str2.length());
                    }
                } else {
                    i++;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z && strArr.length > 0) {
            return strArr[0] + str;
        }
        return str;
    }

    private static void l(ArrayList<b> arrayList, Spannable spannable) {
        URLSpan[] uRLSpanArr;
        int i;
        int i2;
        int i3 = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            b bVar = new b();
            bVar.a = uRLSpan;
            bVar.c = spannable.getSpanStart(uRLSpan);
            bVar.d = spannable.getSpanEnd(uRLSpan);
            arrayList.add(bVar);
        }
        Collections.sort(arrayList, b);
        int size = arrayList.size();
        while (i3 < size - 1) {
            b bVar2 = arrayList.get(i3);
            int i4 = i3 + 1;
            b bVar3 = arrayList.get(i4);
            int i5 = bVar2.c;
            int i6 = bVar3.c;
            if (i5 <= i6 && (i = bVar2.d) > i6) {
                int i7 = bVar3.d;
                if (i7 <= i || i - i5 > i7 - i6) {
                    i2 = i4;
                } else if (i - i5 < i7 - i6) {
                    i2 = i3;
                } else {
                    i2 = -1;
                }
                if (i2 != -1) {
                    Object obj = arrayList.get(i2).a;
                    if (obj != null) {
                        spannable.removeSpan(obj);
                    }
                    arrayList.remove(i2);
                    size--;
                }
            }
            i3 = i4;
        }
    }

    private static boolean m() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }
}
