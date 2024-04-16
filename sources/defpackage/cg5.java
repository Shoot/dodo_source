package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: KeyboardCapitalization.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0014\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0088\u0001\b\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcg5;", "", "", Image.TYPE_HIGH, "(I)Ljava/lang/String;", "", "g", "(I)I", "value", e.a, "a", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: cg5  reason: default package */
/* loaded from: classes.dex */
public final class cg5 {
    public static final a a = new a(null);
    private static final int b = e(0);
    private static final int c = e(1);
    private static final int d = e(2);
    private static final int e = e(3);

    /* compiled from: KeyboardCapitalization.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\bR)\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R)\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R)\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006R)\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u0012\u0004\b\u0011\u0010\b\u001a\u0004\b\u0010\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Lcg5$a;", "", "Lcg5;", "None", "I", "b", "()I", "getNone-IUNYP9k$annotations", "()V", "Characters", "a", "getCharacters-IUNYP9k$annotations", "Words", DateTokenConverter.CONVERTER_KEY, "getWords-IUNYP9k$annotations", "Sentences", c.a, "getSentences-IUNYP9k$annotations", "<init>", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: cg5$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return cg5.c;
        }

        public final int b() {
            return cg5.b;
        }

        public final int c() {
            return cg5.e;
        }

        public final int d() {
            return cg5.d;
        }
    }

    public static final boolean f(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    public static String h(int i) {
        if (f(i, b)) {
            return "None";
        }
        if (f(i, c)) {
            return "Characters";
        }
        if (f(i, d)) {
            return "Words";
        }
        if (f(i, e)) {
            return "Sentences";
        }
        return "Invalid";
    }

    public static int e(int i) {
        return i;
    }

    public static int g(int i) {
        return i;
    }
}
