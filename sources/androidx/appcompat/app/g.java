package androidx.appcompat.app;

import android.util.AttributeSet;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: LayoutIncludeDetector.java */
/* loaded from: classes.dex */
class g {
    @NonNull
    private final Deque<WeakReference<XmlPullParser>> a = new ArrayDeque();

    private static boolean b(XmlPullParser xmlPullParser) {
        if (xmlPullParser == null) {
            return true;
        }
        try {
            if (xmlPullParser.getEventType() == 3) {
                return true;
            }
            if (xmlPullParser.getEventType() == 1) {
                return true;
            }
            return false;
        } catch (XmlPullParserException unused) {
            return true;
        }
    }

    private static XmlPullParser c(@NonNull Deque<WeakReference<XmlPullParser>> deque) {
        while (!deque.isEmpty()) {
            XmlPullParser xmlPullParser = deque.peek().get();
            if (b(xmlPullParser)) {
                deque.pop();
            } else {
                return xmlPullParser;
            }
        }
        return null;
    }

    private static boolean d(@NonNull XmlPullParser xmlPullParser, XmlPullParser xmlPullParser2) {
        if (xmlPullParser2 != null && xmlPullParser != xmlPullParser2) {
            try {
                if (xmlPullParser2.getEventType() == 2) {
                    return "include".equals(xmlPullParser2.getName());
                }
                return false;
            } catch (XmlPullParserException unused) {
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(@NonNull AttributeSet attributeSet) {
        if (attributeSet instanceof XmlPullParser) {
            XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
            if (xmlPullParser.getDepth() == 1) {
                XmlPullParser c = c(this.a);
                this.a.push(new WeakReference<>(xmlPullParser));
                if (d(xmlPullParser, c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
