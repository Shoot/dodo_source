package defpackage;

import defpackage.sk9;
import java.io.StringReader;
import javax.xml.parsers.SAXParserFactory;
import kotlin.Metadata;
import kotlin.Unit;
import org.xml.sax.InputSource;
/* compiled from: XmlValidator.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lybc;", "", "", "item", "", "a", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ybc  reason: default package */
/* loaded from: classes.dex */
public final class ybc {
    public boolean a(String str) {
        Object b;
        try {
            sk9.a aVar = sk9.b;
            SAXParserFactory.newInstance().newSAXParser().getXMLReader().parse(new InputSource(new StringReader(str)));
            b = sk9.b(Unit.a);
        } catch (Throwable th) {
            sk9.a aVar2 = sk9.b;
            b = sk9.b(vk9.a(th));
        }
        if (sk9.i(b)) {
            Unit unit = (Unit) b;
            return true;
        }
        sk9.d(b);
        return false;
    }
}
