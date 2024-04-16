package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.nio.charset.Charset;
import kotlin.Metadata;
/* compiled from: Charsets.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0011\u0010\u0015\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001a"}, d2 = {"Lrw0;", "", "Ljava/nio/charset/Charset;", "b", "Ljava/nio/charset/Charset;", "UTF_8", c.a, "UTF_16", DateTokenConverter.CONVERTER_KEY, "UTF_16BE", e.a, "UTF_16LE", "f", "US_ASCII", "g", "ISO_8859_1", Image.TYPE_HIGH, "utf_32le", "i", "utf_32be", "()Ljava/nio/charset/Charset;", "UTF_32LE", "a", "UTF_32BE", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: rw0  reason: default package */
/* loaded from: classes3.dex */
public final class rw0 {
    public static final rw0 a = new rw0();
    public static final Charset b;
    public static final Charset c;
    public static final Charset d;
    public static final Charset e;
    public static final Charset f;
    public static final Charset g;
    private static volatile Charset h;
    private static volatile Charset i;

    static {
        Charset forName = Charset.forName("UTF-8");
        z65.g(forName, "forName(...)");
        b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        z65.g(forName2, "forName(...)");
        c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        z65.g(forName3, "forName(...)");
        d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        z65.g(forName4, "forName(...)");
        e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        z65.g(forName5, "forName(...)");
        f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        z65.g(forName6, "forName(...)");
        g = forName6;
    }

    private rw0() {
    }

    public final Charset a() {
        Charset charset = i;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32BE");
            z65.g(forName, "forName(...)");
            i = forName;
            return forName;
        }
        return charset;
    }

    public final Charset b() {
        Charset charset = h;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32LE");
            z65.g(forName, "forName(...)");
            h = forName;
            return forName;
        }
        return charset;
    }
}
